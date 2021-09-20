package BinarySearchTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class searchNode {
    class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int item) {
            val = item;
            right = left = null;
        }
    }

    TreeNode node;

    searchNode() {
        node = null;
    }
    public TreeNode searchBST(TreeNode root, int val) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode currnode = null;
        while (!queue.isEmpty()) {
            currnode = queue.remove();
            if (currnode.val > val && currnode.left != null) {
                queue.add(currnode.left);
            } else if (currnode.val < val && currnode.right != null) {
                queue.add(currnode.right);
            } else {
                break;
            }
        }
        if (currnode.val == val) {
            return currnode;
        } else {
            return null;
        }
    }
}
