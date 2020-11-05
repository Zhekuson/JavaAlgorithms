package main.simple;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void binarySearch() {
        int[] arr = new int[103];
        BinarySearch.generateArray(arr);
        for (int i = 0; i < arr.length; i++) {
            Assertions.assertEquals(BinarySearch.BinarySearch(i, arr, 0, arr.length-1), i);
        }
        Assertions.assertEquals(BinarySearch.BinarySearch(103, arr, 0, arr.length -1), -1);
    }
}