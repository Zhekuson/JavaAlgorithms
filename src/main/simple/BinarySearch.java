package main.simple;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print("i = " + arr[i]+" ");
        }
    }
    public static void generateArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
    }
    public static void main(String[] args) {
        int[] array = new int[100];

        print(array);
        Scanner scanner = new Scanner(System.in);
        int find = scanner.nextInt();


    }

    /**
     *  O(n log(n) )
     * @param find
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int BinarySearch(int find,int[] arr, int left, int right){
        int middle = (left + right) / 2;

        if(find == arr[middle] ){
            return middle;
        }
        if(middle < 0 || middle == right || middle == left){
            return -1;
        }
        else if(find > arr[middle]){

            return BinarySearch(find,arr, middle + 1, right);
        }
        else {
            return BinarySearch(find, arr, left,  middle);
        }
    }
}
