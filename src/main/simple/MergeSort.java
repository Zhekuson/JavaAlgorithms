package main.simple;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.lang.Math.min;

public class MergeSort {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void generateArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }
    }
    public static void main(String[] args) {
        int length = 100;
        int[] array = new int[length];
        generateArray(array);
        print(array);
        mergeSort(array,0, length - 1);

    }
    public static int[] mergeSort(int[] arr, int left, int right){
        return null;
    }
}
