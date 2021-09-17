package Arrays;

public class SumOfPair {
//    Count pairs with given sum
//    Difficulty Level : Medium
//    Last Updated : 06 Sep, 2021
//    Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.
//
//    Examples:
//
//    Input  :  arr[] = {1, 5, 7, -1},
//    sum = 6
//    Output :  2
//    Pairs with sum 6 are (1, 5) and (7, -1)
//
//    Input  :  arr[] = {1, 5, 7, -1, 5},
//    sum = 6
//    Output :  3
//    Pairs with sum 6 are (1, 5), (7, -1) &
//            (1, 5)
//
//    Input  :  arr[] = {1, 1, 1, 1},
//    sum = 2
//    Output :  6
//    There are 3! pairs with sum 2.
//
//    Input  :  arr[] = {10, 12, 10, 15, -1, 7, 6,
//            5, 4, 2, 1, 1, 1},
//    sum = 11
//    Output :  9
//    Expected time complexity O(n)
    public static void getPairCount(int arr[], int n,int x) {
        int i=0;
        int count=0;
        // int cnt=0;
        for (int j = 1; j <n ; j++) {
        //  cnt++;
            int rem = x-arr[i];
            if(arr[j]==rem){
                count++;
            }
            if(j == arr.length-1){
                i++;
                j=i;
            }
        }
        System.out.println(count);
      //  System.out.println(cnt);
    }

    public static void main(String[] args) {
        // {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1}
        int arr[] ={1,5,7,-1,5};
        getPairCount(arr, arr.length, 6);
    }
}
