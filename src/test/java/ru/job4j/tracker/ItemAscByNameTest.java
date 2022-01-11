package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItemAscByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item(1, "Something wrong"),
                new Item(2, "Identified error"),
                new Item(3, "Bug")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "Bug"),
                new Item(2, "Identified error"),
                new Item(1, "Something wrong")
        );
        assertEquals(items, expected);
    }
}