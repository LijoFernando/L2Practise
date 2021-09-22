package BinarySearchTree;

import java.util.*;

public class PostTraversal {

    static int idx = 0;

    static void preToPost(int input[], int n, int mn, int mx) {
        System.out.print("initial rec: " + mn + ",  "+mx+" next ????? \n");

        // base case
        if (idx == n)
            return;
        // if current element does not belong to current subtree
        if (input[idx] < mn || input[idx] > mx) {
            System.out.println();
            System.out.println(input[idx]+ "<"+ mn +"||"+ input[idx]+">"+ mx+ "-->@@@Broked@@@ ");
            return;
        }
        // System.out.println(mn+" "+mx);
        // store the value of root ro print after printing its subtrees

        int root = input[idx];

        idx++;
        System.out.print("i:" + idx +":::::"+root + " am Root --->>");
        // recursively solve for left and right subtree
        System.out.print("Reached first rec: " + mn + ", " + root + ", "+mx+" next ????? \n");

        preToPost(input, n, mn, root);

        System.out.print("Reached sec rec: " + root + ", " + mx + " next @@@@ \n");

        preToPost(input, n, root, mx);

        // print root

        System.out.println("Result: " + root + " ");
    }

    public static void main(String[] args) {
        int input[] = {5, 2, 1, 3, 4, 7, 6, 8, 9};
        int n = input.length;
        preToPost(input, n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}
