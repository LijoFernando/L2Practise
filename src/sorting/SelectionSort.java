package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void checkIterate(int arr[], int length) {
        int i = 0;
        //check
       while(i<length){
          int  m=i+1;
          int n=m;
            while(n<length){
                if(arr[m]>arr[n] && arr[i]>arr[n]){
                    m=n;
                    swap(arr,i,m);
                }
                n++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
    //swap
    public static void swap(int[] arr,int front, int back){
        int temp =arr[front];
        arr[front] = arr[back];
        arr[back] = temp;
    }
    public static void main(String[] args) {
        int[] arr ={7,6,5,4,3,2,1};
        int length = arr.length;
        checkIterate(arr,length);
    }

}
