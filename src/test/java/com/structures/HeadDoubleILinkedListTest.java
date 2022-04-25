package com.structures;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeadDoubleILinkedListTest {

    @Test
    public void should_add_to_tail() {
        String[] letters = {"A", "B", "C", "D", "Z", "E", "F"};
        HeadDoubleILinkedList<String> list = new HeadDoubleILinkedList<>(letters);
        list.add("M");
        assertEquals(list.tail.data,"M");
    }
}