package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalMinima {
    /*.Local Minima Given an array of size n, find all local minima in the array Hint: A
local minimum of an array is an element which is less than or equal to both of its
neighbours
Sample Case 1:
Input:
Enter the array size: 7
Enter the elements: 9 6 2 14 5 7 4
Output:
Local Minima: 2 5 4
Explanation: 2 is less than 6 & 14 & so on
Sample Case 2:
Input:
Enter the array size: 9
Enter the elements: -1 3 -7 8 2 3 4 0 12
Output:
Local Minima: 1 -7 2 0
Sample Case 3:
Input:
Enter the array size: 4
Enter the elements: 7 1 1 4
Output:
Local Minima: 1 1.*/
    public static List<Integer> getLocalMinima(int[] arr , int length) {
        List<Integer> minimaList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if(i>0) if(arr[i]>arr[i-1]) continue;
            if(i<length-1)if(arr[i]<=arr[i+1]) minimaList.add(arr[i]);
            if(i==length-1) minimaList.add(arr[i]);
        }
        return minimaList;
    }

    public static void main(String[] args) {
        //{-1, 3, -7, 8, 2, 3, 4, 0, 12}
        int arr[] ={7,1,1,4};
        System.out.println("Local Minima :"+Arrays.deepToString(getLocalMinima(arr, arr.length).toArray()));
    }
}
