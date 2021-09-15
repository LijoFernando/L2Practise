package Array2D;

import java.util.Arrays;

public class RotateMatrix {
    /*.Rotate by 90 degree
Medium Accuracy: 53.41% Submissions: 15904 Points: 4
Given a square matrix[][] of size N x N. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

Example 1:

Input:
N = 3
matrix[][] = [[1 2 3],
              [4 5 6],
              [7 8 9]]
Output:
3 6 9
2 5 8
1 4 7
Your Task:
You only need to implement the given function rotate(). Do not read input, instead use the arguments given in the function.

Expected Time Complexity: O(N*N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 50
1 <= matrix[][] <= 100.*/
    public static void rotateMatrix(int [][] matrix, int n) {
     //  int j = length-1;
//        for (int i = 0; i <length ; i++) {
//            System.out.print( arr[i][j]+" ");
//            if(i==length-1) {
//                if(j==0) break;
//                j--;
//                i=-1;
//                System.out.println();
//            }
//        }
        for (int i = 0; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

//            int i=0;
//            for (int j = 0; j <=n; j++) {
//                int sum = i+j;
//                if(sum==2) break;
//                int k = n-j;
//                int l = n-j;
//                int temp=arr[k][l];
//                arr[k][l]=arr[i][j];
//                arr[i][j]= temp;
//                if(j==n){
//                    j=-1;
//                    i++;
//                }
//            }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        int arr[][]={{1 ,2 ,3}, {4 ,5 ,6}, {7 ,8 ,9}};
        rotateMatrix(arr, arr.length-1);
    }
}
