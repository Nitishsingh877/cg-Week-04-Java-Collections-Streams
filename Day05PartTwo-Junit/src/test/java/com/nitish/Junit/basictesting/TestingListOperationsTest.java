package com.nitish.Junit.basictesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestingListOperationsTest {
    TestingListOperations testingListOperations = new TestingListOperations();
    List<Integer> list;

    @BeforeEach
    public  void setup() {
        list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);

    }

    @Test
    void add() {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4));
        List<Integer> expected = Arrays.asList(2, 3, 4, 5);
        List<Integer> actual = TestingListOperations.add(list, 5);

        assertEquals(expected, actual);
        // or
        assertIterableEquals(expected, actual);
    }

    @Test
    void remove() {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        List<Integer> expected = Arrays.asList(2, 3, 4);
        List<Integer> actual = TestingListOperations.remove(list, 5);

        assertEquals(expected, actual);
        // or
        assertIterableEquals(expected, actual);
    }

    @Test
    void size() {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4));
        int expectedSize = 3;
        int actualSize = TestingListOperations.size(list);

        assertEquals(expectedSize, actualSize);
    }
}