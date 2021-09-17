package Arrays;

public class SearchInsertionPosition {
    //    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//    You must write an algorithm with O(log n) runtime complexity.
//
//
//
//    Example 1:
//
//    Input: nums = [1,3,5,6], target = 5
//    Output: 2
//    Example 2:
//
//    Input: nums = [1,3,5,6], target = 2
//    Output: 1
//    Example 3:
//
//    Input: nums = [1,3,5,6], target = 7
//    Output: 4
//    Example 4:
//
//    Input: nums = [1,3,5,6], target = 0
//    Output: 0
//    Example 5:
//
//    Input: nums = [1], target = 0
//    Output: 0
    public static int getInsertionPosition(int arr[], int target) {
        int begin =0;
        int end = arr.length-1;
        while(begin<=end){
           // [1,3,5,6]
            int mid = end-begin;
            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                end = mid-1;
            }
            else{
                begin =mid+1;
            }
            if(target>arr.length-1){
                int outerIndex =target-arr[arr.length-1];
                return arr.length+outerIndex-1;
            }
        }
        return begin;
    }

    public static void main(String[] args) {
        int arr[] ={1,3,5,6};
        int target =20;
        System.out.println(getInsertionPosition(arr,target));
    }
}
