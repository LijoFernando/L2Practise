package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
//    Rotate Array
//    Basic Accuracy: 59.87% Submissions: 100k+ Points: 1
//    Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).
//
//    Input:
//    The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.
//
//    Output:
//    For each testcase, in a new line, output the rotated array.
//
//    Constraints:
//            1 <= T <= 200
//            1 <= N <= 107
//            1 <= D <= N
//0 <= arr[i] <= 105
//
//    Example:
//    Input:
//            2
//            5 2
//            1 2 3 4 5
//            10 3
//            2 4 6 8 10 12 14 16 18 20
//
//    Output:
//            3 4 5 1 2
//            8 10 12 14 16 18 20 2 4 6
//
//    Explanation :
//    Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2

        public static int[]  getRotatedArray(int[] arr, int length, int rotate) {
           // 1 2 3 4 5 Rotation : 2.
           // 3 4 5 1 2
            int[] arr2 = new int[length];
            int j=0;
            for (int i = 0; i < length; i++) {
                if(i<rotate){
                    arr2[(length-rotate)+i]=arr[i];
                }
                else {
                    arr2[j] = arr[i];
                    j++;
                }

            }
            return arr2;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of Case");
        int n = input.nextInt();
        while (n-->0){
            System.out.println("Enter Length");
            int length = input.nextInt();
            System.out.println("Enter rotation");
            int rotate = input.nextInt();
            System.out.println("Enter Array Element");
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println(Arrays.toString(getRotatedArray(arr,length,rotate)));

        }
       // int arr[] ={ 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

    }
}
