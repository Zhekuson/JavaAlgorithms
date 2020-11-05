package main.simple;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new  int[]{3,42,4,1,4,3,5,1,4};
        qsort(arr,0,8);
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void qsort(int[] array, int left, int right){
        if(left >= right){
            return;
        }
        int pivot = array[left + (right - left) / 2];
        int i = left;
        int j = right;
        while (i < j){
            while (array[i] < pivot){
                i++;
            }
            while (array[j] > pivot){
                j--;
            }
            if(i <= j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        qsort(array,left, j);
        qsort(array, i,right);
    }
}
