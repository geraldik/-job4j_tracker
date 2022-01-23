package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {

        Predicate<Person> compareName = (persons) -> (persons.getName().contains(key));
        Predicate<Person> compareSurname = (persons) -> (persons.getSurname().contains(key));
        Predicate<Person> comparePhone = (persons) -> (persons.getPhone().contains(key));
        Predicate<Person> compareAddress = (persons) -> (persons.getAddress().contains(key));
        Predicate<Person> combine = compareName.or(compareSurname).or(comparePhone).or(compareAddress);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

}