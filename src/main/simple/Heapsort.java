package main.simple;

public class Heapsort {
    public static void main(String[] args) {
        int[] arr = new  int[]{3,42,4,1,4,3,5,1,4};
        heapsort(arr);
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void heapsort(int[] arr){
        for (int i = lastParent(arr.length); i >= 0; i--){
            buildHeap(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i >= 0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            buildHeap(arr,0, i);
        }
    }
    public static void buildHeap(int[] arr, int root, int limit){
        int largest = root;
        int left = leftChild(root);
        int right = rightChild(root);

        if(left < limit && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < limit && arr[right] > arr[largest]){
            largest = right;
        }
        if(root != largest){
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;
            buildHeap(arr,largest,limit);
        }
    }
    public static int parent(int i){
        return i / 2 - 1;
    }
    public static int leftChild(int i){
        return 2 * i + 1;
    }
    public static int rightChild(int i){
        return 2 * i + 2;
    }
    public static int lastParent(int length){
        return length / 2 - 1;
    }
}
