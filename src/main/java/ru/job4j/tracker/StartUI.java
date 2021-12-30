package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item(1, "Some name");
        System.out.println(item);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String  currentDateTimeFormat  = item.getCreated().format(formatter);
        System.out.println("Текущая дата и время: " + currentDateTimeFormat);

    }
}
