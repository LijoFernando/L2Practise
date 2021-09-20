package BinarySearchTree;

import javax.xml.soap.Node;

public class InsertNode {
    /*.Insert a node in a BST
Easy Accuracy: 32.7% Submissions: 66522 Points: 2
Given a BST and a key K. If K is not present in the BST, Insert a new Node with a value equal to K into the BST.
Note: If K is already present in the BST, don't modify the BST.

Example 1:

Input:
     2
   /   \
  1     3
K = 4
Output: 1 2 3 4
Explanation: After inserting the node 4
Inorder traversal will be 1 2 3 4.
Example 2:

Input:
        2
      /   \
     1     3
             \
              6
K = 4
Output: 1 2 3 4 6
Explanation: After inserting the node 4
Inorder traversal of the above tree
will be 1 2 3 4 6..*/
    //refer BinarySearchTree.java file

//    Node insert(Node node, int key) {
//        // your code here
//        if (node == null) {
//            node = new Node(key);
//            return node;
//        } else {
//            if (key > node.data) {
//                node.right = insert(node.right, key);
//            } else if (key < node.data) {
//                node.left = insert(node.left, key);
//            }
//        }
//        return node;
//    }
}
