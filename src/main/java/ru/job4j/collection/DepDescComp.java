package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String s1 = o1.split("/")[0];
        String s2 = o2.split("/")[0];
        int rsl = s2.compareTo(s1);
        return rsl == 0 ? o1.compareTo(o2) : rsl;
    }
}
