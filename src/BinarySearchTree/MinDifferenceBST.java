package BinarySearchTree;


public class MinDifferenceBST {
    /*. Minimum Distance Between BST Nodes - 1288:
    Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.
    Example 1:
    Input: root = [4,2,6,1,3]
    Output: 1
    Example 2:

    Input: root = [1,0,48,null,null,12,49]
    Output: 1.*/
    class TreeNode {
        int val;
        TreeNode left,right;
        TreeNode(int key){
            val =key;
            left = right = null;
        }

    }

    int diff = Integer.MAX_VALUE;
    int sum = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        calDff(root);
        return diff;

    }

    void calDff(TreeNode root) {
        if (root == null) {
            return;
        }
        calDff(root.left);
        if (sum != Integer.MAX_VALUE && diff > root.val - sum) {
            diff = Math.abs(root.val - sum);
        }
        sum = root.val;
        calDff(root.right);
    }


}
