package Array2D;

public class SumMatrix {
//    Sum of elements in a matrix
//    School Accuracy: 76.18% Submissions: 8329 Points: 0
//    Given a non null integer matrix Grid of dimensions NxM.Calculate the sum of its elements.
//
//    Example 1:
//
//    Input:
//    N=2,M=3
//    Grid=
//            [[1,0,1],
//            [-8,9,-2]]
//    Output:
//            1
//    Explanation:
//    The sum of all elements of the matrix is
//            (1+0+1-8+9-2)=1.
//    Example 2:
//
//    Input:
//    N=3,M=5
//    Grid=
//            [[1,0,1,0,1],
//            [0,1,0,1,0],
//            [-1,-1,-1,-1,-1]]
//    Output:
//            0
//    Explanation:
//    The sum of all elements of the matrix are
//            (1+0+1+0+1+0+1+0+1+0-1-1-1-1-1)=0.
//
//
//    Your Task:
//    You don't need to read input or print anything.Your task is to complete the function sumOfMatrix() which takes two integers N ,M and a 2D array Grid as input parameters and returns the sum of all the elements of the Grid.
//
//
//    Expected Time Complexity:O(N*M)
//    Expected Auxillary Space:O(1)
//
//
//    Constraints:
//            1<=N,M<=1000
//            -1000<=Grid[i][j]<=1000
    public static void getSumMatrix(int [][] arr , int n , int m) {
//            [[1,0,1,0,1],  [0,1,0,1,0],  [-1,-1,-1,-1,-1]]
            int i=0;
            int sum =0;
          //  int count=0;
        for (int j = 0; j <m; j++) {
           // count++;
            sum+=arr[i][j];

            if (j==m-1){
                i++;
                j=-1;
            }
            if(i==n){
                break;
            }

        }
        System.out.println(sum);
       // System.out.println(count);
    }

    public static void main(String[] args) {
        //TestCase1{{1,0,1,0,1},  {0,1,0,1,0},  {-1,-1,-1,-1,-1}}
        //Testcase2{{1,0,1},{-8,9,-2}}

        int arr[][] = {{1,0,1,0,1},  {0,1,0,1,0},  {-1,-1,-1,-1,-1}};
        int m = arr[0].length;
        int n= arr.length;
        getSumMatrix(arr,n,m);
    }
}
