package main.simple;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HeapsortTest {
    static int[] unsorted = new int[]{10,2,3,5,17,234,4,17,44,17,10,18};
    static int[] sorted = new int[]{2,3,4,5,10,10,17,17,17,18,44,234};
    @Test
    public void heapsortTest(){
        Heapsort.heapsort(unsorted);
        Arrays.stream(unsorted).forEach(System.out::println);
        assertArrayEquals(unsorted,sorted);
    }
}