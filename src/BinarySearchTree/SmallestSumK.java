package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class SmallestSumK {
    /*.Sum of k smallest elements in BST
Easy Accuracy: 66.01% Submissions: 1349 Points: 2
Given a Binary Search Tree. Find sum of all elements smaller than and equal to Kth smallest element.

Example 1:

Input:
          20
        /    \
       8     22
     /    \
    4     12
         /    \
        10    14   , K=3

Output: 22
Explanation:
Sum of 3 smallest elements are:
4 + 8 + 10 = 22
Example 2:
Input:
     10
    /  \
   5    11
  / \
 4   7
      \
       8 , K=2

Output: 9
Explanation:
The sum of two smallest elements
is 4+5=9.

Your task:
You don't need to read input or print anything. Your task is to complete the function sum() which takes the root node and an integer K as input parameters and returns the sum of all elements smaller than and equal to kth smallest element.

Expected Time Complexity: O(K)
Expected Auxiliary Space: O(1)

Constraints:
1<=Number of nodes in BST<=100
1<=K<=N.*/
    class Node{
        int root;
        Node left,right;
        Node(int key){
            root = key;
            left = right = null;
        }
    }

    int sum(Node root, int k) {
        List<Integer> sortedList = new ArrayList<>();
        int add = 0;
        getSorted(root, sortedList);
        for (int i = 0; i <k; i++) {
            add+=sortedList.get(i);
        }
        return add;
    }
    public static void getSorted(Node root, List<Integer> list){
        if(root == null) {
            return;
        }
        //  System.out.print(root.left);
        getSorted(root.left, list);
        list.add(root.root);
        getSorted(root.right, list);
    }
}
