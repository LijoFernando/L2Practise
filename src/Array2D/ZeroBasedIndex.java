package Array2D;


public class ZeroBasedIndex {
    /*.Given a 2D array of n x m dimensions where each row is sorted. Find the
0-based index of the first row that has the maximum number of 1's.and
replace the rows with 0's
Input:
N = 4 , M = 4
 Arr[ ][ ] = { {0, 1, 1, 1},
 {0, 0, 1, 1},
 {1, 1, 1, 1},
 {0, 0, 0, 0} }
output:
{ { 0, 1, 1, 1}
 { 0, 0, 1, 1}
 { 0, 0, 0, 0}
 { 0, 0, 0, 0} }.*/
    public static int getIndex(int[][] matrix, int  n, int m) {
//          { {0, 1, 1, 1},
//            {0, 0, 1, 1},
//            {1, 1, 1, 1},
//            {0, 0, 0, 0} }
        int index = 0;
        int calc =0;
        int sum =Integer.MIN_VALUE;
        int diff =Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                 calc += matrix[i][j];
                if(j==m-1){
                    sum = m-calc;
                    calc=0;
                    if(sum<diff){
                        diff=sum;
                        index=i;
                        sum =0;
                    }
                    if(diff<=0){
                        return index;
                    }
                }
            }
        }
        return index;
    }
    public static void replaceOne(int[][] matrix,int n, int m){
        int index=getIndex(matrix,n,m);
        for (int i = 0; i <m; i++) {
            matrix[index][i]=0;
        }
    }

    public static void main(String[] args) {
       int matrix[][]= { {0, 1, 1, 1}, {0, 0, 0, 1}, {0, 0, 1, 1} };
       int n = matrix.length;
       int m =matrix[0].length;
       replaceOne(matrix,n,m);
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
