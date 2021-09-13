package Searching;

public class SearchMatrix {

//    Search in a row-column sorted Matrix
//    Medium Accuracy: 52.29% Submissions: 25707 Points: 4
//    Given a matrix of size n x m, where every row and column is sorted in increasing order, and a number x. Find whether element x is present in the matrix or not.
//
//            Example 1:
//
//    Input:
//    n = 3, m = 3, x = 62
//    matrix[][] = {{ 3, 30, 38},
//        {36, 43, 60},
//        {40, 51, 69}}
//    Output: 0
//    Explanation:
//            62 is not present in the matrix,
//    so output is 0.
//    Example 2:
//
//    Input:
//    n = 1, m = 6, x = 55
//    matrix[][] = {{18, 21, 27, 38, 55, 67}}
//    Output: 1
//    Explanation: 55 is present in the matrix.
//
//    Your Task:
//    You don't need to read input or print anything. Complete the function search() that takes n, m, x, and matrix[][] as input parameters and returns a boolean value. True if x is present in the matrix and false if it is not present.
//
//    Expected Time Complexity: O(N + M)
//    Expected Auxiliary Space: O(1)
//
//    Constraints:
//            1 <= N, M <= 1000
//            1 <= mat[][] <= 105
//            1 <= X <= 1000
        public static int isValuePresent(int [][] arr, int n, int x) {
                int i = 0;
                int j = 0;
                for (; j <n; j++) {
                        if (arr[i][j] == x ) return 1;
                        if(i==n-1 && j == arr.length-1) break;
                        if(j == n-1) {
                                i++;
                                j=-1;
                        }
                }
                return 0;
        }

        public static void main(String[] args) {
                int [][] arr ={{ 3, 30, 38}, {36, 43, 60}, {40, 51, 69}};
                int n = arr[0].length;
                int x = 52;
                System.out.println(isValuePresent(arr,n,x));
        }



}
