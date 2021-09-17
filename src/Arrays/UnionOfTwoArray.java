package Arrays;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UnionOfTwoArray {
    /*.Union of two arrays
Basic Accuracy: 52.81% Submissions: 75048 Points: 1
Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

Example 1:

Input:
5 3
1 2 3 4 5
1 2 3
Output:
5
Explanation:
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:

Input:
6 2
85 25 1 32 54 6
85 2
Output:
7
Explanation:
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
Your Task:
Complete doUnion funciton that takes a, n, b, m as parameters and returns the count of union elements of the two arrays. The printing is done by the driver code.

Constraints:
1 ≤ n, m ≤ 105
0 ≤ a[i], b[i] < 105

Expected Time Complexity : O((n+m)log(n+m))
Expected Auxiliary Space : O(n+m).*/
    public static void getSizeOfUnion(int set1[], int set2[]) {
       Set<Integer> union = new  HashSet();
       for(int i: set1) union.add(i);
       for (int i: set2) union.add(i);
       int size = union.size() ;
        System.out.println(size);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] set1 = new int[n];
        int[] set2 = new int[m];
        for (int i = 0; i < set1.length; i++) {
            set1[i] = input.nextInt();
        }
        for (int j = 0; j < set2.length; j++) {
            set2[j] = input.nextInt();
        }
        getSizeOfUnion(set1,set2);
    }

}
