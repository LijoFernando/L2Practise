package Arrays;

import java.util.Arrays;

public class PrintUniqueELement {
    /*.Given a non-empty array of integers nums, every element appears twice except
for one. Find that single one.
You must implement a solution with a linear run time complexity and use only
constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [1,4,2,5,4,1,2]
Output: 4
Example 3:
Input: nums = [1]
Output: 1.*/
    public static void getUniqueElement(int [] arr, int length){
//        int sum =0;
//        int value =0;
//        int twice=0;
//        for (int i = 0; i <length; i++) {
//            sum+=arr[i];
//        }
//        for (int i = 0; i <length ; i++) {
//            value=sum-arr[i];
//            twice=sum-twice;
//            if(twice ==)
//            if(value%2==0){
//                System.out.println(arr[i]);
//            }
//        }
      //  [1,4,2,5,4,1,2]
//            Boolean ismeets = false;
//            int i=0;
//            int j=length-1;
//            while(i<=j){
//                if(ismeets)if(arr[i]==0 && i<j)i++;
//                if(ismeets)if(arr[j]==0 && j>i)j--;
//                if(i==length-1 && j== length-1) break;
//                if(i==j && j<length-1){
//                    ismeets =true;
//                    j=length-1;
//                }
//                if(arr[i]==arr[j]){
//                    arr[i]=0;
//                    arr[j]=0;
//                    i++;
//                    j--;
//                }
//                else if(arr[i]!=arr[j])j--;
//
//            }
//            return arr;
        int sum =0;
        int value=0;
        int twice =0;
        for(int i: arr) sum+=arr[i]*2;
        for (int i = 0; i <length ; i++) {
            value=sum-arr[i]+arr[i];
            twice=sum-value;
            System.out.print(twice+" ");
            System.out.print(arr[i]+" ");
            System.out.println(value);

        }
      System.out.println(sum);

    }

    public static void main(String[] args) {
        int arr[] ={4,1,3,3,4,5,2,1,2,7,11,11,7};
       getUniqueElement(arr,arr.length);

    }
}
