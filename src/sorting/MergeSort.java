package sorting;

import java.util.Arrays;

public class MergeSort {
    //merger
    public static void sort(int[] arr, int left, int mid, int right){
        int n1 = mid+1;
        int n2 = right-mid;
        int [] aryLeft = new int[n1];
        int [] aryRight = new int[n2];
        int i=0;
        int j=0;
       while(left<=mid){
           aryLeft[i]=arr[left];
           left++;
       }
        while(mid+1<right){
            aryRight[j]=arr[mid+1];
            mid++;
        }
        System.out.println(Arrays.toString(aryLeft));
        System.out.println(Arrays.toString(aryRight));
    }
    //sort
    public static void mergeSort(int arr[], int start , int end){
        if(start<end) {
            int mid = (start+end) / 2;
            System.out.print(arr[mid]+" ");
            sort(arr,start, mid, end);
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

        }
    }
    //main
    public static void main(String[] args) {
        int[] arr={ 6, 5, 12, 10, 9, 1 };
        int start =0;
        int end =arr.length;
        mergeSort(arr,start, end);
    }
}
