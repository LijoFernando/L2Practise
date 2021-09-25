package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quicksort(int[] arr, int i, int j) {
        //{10, 80, 30, 90, 40, 50, 70}
        int length = arr.length - 1;
        int pvt = arr[length];
        if(i==length){
            return;
        }
        while(j<=length) {
            if (i != j && arr[j] <= pvt) {
                i++;
                swap(arr, i, j);
                System.out.println(Arrays.toString(arr));
            }
            j++;
        }
        quicksort(arr,i,i);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int [] arr={10, 80, 30, 90, 40, 50, 70,20};
        int i=0;
        int j=0;
        System.out.println(Arrays.toString(arr));
        quicksort(arr,i,j);
       // System.out.println(Arrays.toString(arr));
    }
}
