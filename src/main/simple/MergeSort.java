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
        array = mergeSort(array,0, length - 1);
        print(array);
    }
    public static int[] mergeSort(int[] arr, int left, int right){
        if (right == left){
            return new int[]{arr[left]};
        }else{
            int middle = (left + right) / 2;

            int[] leftPart = mergeSort(arr, left, middle);
            int[] rightPart = mergeSort(arr, middle + 1, right);
            int[] result = new int[right-left+1];
            int leftIndex = 0;
            int rightIndex = 0;
            int i = 0;
            for (; i <= right-left; i++){
                if (leftIndex < leftPart.length && rightIndex < rightPart.length) {
                    if (leftPart[leftIndex] < rightPart[rightIndex]) {
                        result[i] = leftPart[leftIndex];
                        leftIndex++;
                    } else {
                        result[i] = rightPart[rightIndex];
                        rightIndex++;
                    }
                }else{
                    break;
                }
            }
            if(leftIndex >= leftPart.length) {
                for (; i <= right-left; i++) {
                    result[i] = rightPart[rightIndex];
                    rightIndex++;
                }
            }else{
                for (; i <= right-left; i++) {
                    result[i] = leftPart[leftIndex];
                    leftIndex++;
                }
            }
            return result;
        }
    }
}
