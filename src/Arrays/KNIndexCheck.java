package Arrays;

import java.util.Arrays;
import java.util.List;

public class KNIndexCheck {
    /*.Given an array arr[] and an integer K and integer N where K&N are smaller than
the size of the array, the task is to find the Kth smallest element and Nth largest
element in the given array. and find sum of that two values...N = 6
Input : arr[ ] = 7 10 4 3 20 15 K = 3 N = 2
Output : 7+15=22.*/
    public static int getResult(int[] arr, int length, int k, int n) {
        int result =0;
        if(k >length || n>length) return result;
        Arrays.sort(arr);
        result+=arr[k-1];
        result+=arr[length-(n-1)];
        return result;
    }

    public static void main(String[] args) {
        int arr[] ={7, 10, 4, 3, 20, 15};
        int k=3,n=2;
        System.out.println(getResult(arr,arr.length-1,k,n));
    }
}
