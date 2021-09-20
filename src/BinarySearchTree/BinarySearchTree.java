package BinarySearchTree;

public class BinarySearchTree {


    class Node {
        int root;
        Node left, right;
        Node(int item) {
            root = item;
            right = left = null;
        }
    }

    Node node;

    BinarySearchTree() {
        node = null;
    }

    void insert(int key) {
        node = insRecord(node, key);
    }

    Node insRecord(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        } else {
            if (key > node.root) {
                node.right = insRecord(node.right, key);
            } else if (key < node.root) {
                node.left = insRecord(node.left, key);
            }
        }
        return node;
    }

    void inOrder() {
        inOrderRec(node);
    }

    void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.println(node.root);
            inOrderRec(node.right);
        }

    }
    void isValidBST(){
        System.out.println(isBST(node));
    }
    boolean isBST(Node root)
    {
        // code here.
        if(root == null) {
            return true;
        }
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        if (root.root < min || root.root > max)
            return false;
        if(root.left!=null && root.left.root>=root.root){
            return false;
        }
        if(root.right!=null && root.right.root<=root.root){
            return false;
        }
        if(!isBST(root.left) || !isBST(root.right)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        BinarySearchTree bstTree = new BinarySearchTree();
        int[] bst = {7,4,6,8,12,1,10};
       for (int i: bst){
           bstTree.insert(i);
       }
        bstTree.inOrder();
        bstTree.isValidBST();

    }
}
