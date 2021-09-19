package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr, int length) {
        //{56,18,12,17,19,10}; temp =18
        //18,56,12......temp =12
        //18,?,56.......
        //?,18,56.....
        //12,18,56,17.....temp=17
        for (int i = 0; i <=length; i++) {
            int temp = arr[i];
            int j = i-1;
            while( j>=0 && arr[j]> temp) {
                arr[j + 1] = arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,10,6,1,2};
        int length = arr.length-1;
        insertionSort(arr,length);
        System.out.println(Arrays.toString(arr));
    }
}
