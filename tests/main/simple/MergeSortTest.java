package main.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSort() {
        int[] arr = {
                2, 23, 5, 4, 4, 3, 2, 6, 2, 4
        };
        MergeSort.print(arr);
        arr = MergeSort.mergeSort(arr,0,arr.length-1);
        MergeSort.print(arr);
    }
}