package sorting;

import java.util.Arrays;

public class BubbleSort {
    //checkAdjacent
    public static void checkAdjacent(int[] arr, int length) {
        int start =0;
        int end = length-1;
        Boolean sorted = true;
        while(start<end){
            if(arr[start]>arr[start+1]) {
                sorted = false;
                swap(arr, start, start+1);
            }
            if(start == end-1) {
                if(sorted == true) break;
                start=0;
                sorted = true;
                continue;
            }
            start++;
        }
        System.out.println(Arrays.toString(arr));
    }
    //swap
    public static void swap(int[] arr,int current , int next){
        int temp = arr[current];
        arr[current] =arr[next];
        arr[next]=temp;
    }
    public static void main(String[] args){
        int arr[]={5,2,1,3,4};
        //2,5,1,3,6
        //
        int length = arr.length;
        checkAdjacent(arr,length);
    }
}
