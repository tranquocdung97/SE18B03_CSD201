package Slot5;

import java.util.Scanner;

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }
    public void insert (int data) {
        root = insertRec(root, data);
    }

    public TreeNode getRoot() {
        return root;
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data <= root.getData()) {
            TreeNode leftChild = root.getLeft();
            TreeNode newLeftChild = insertRec(leftChild, data);
            root.setLeft(newLeftChild);
            newLeftChild.setParent(root);
        } else if (data >= root.getData()) {
            TreeNode rightChild = root.getRight();
            TreeNode newRightChild = insertRec(rightChild,data);
            root.setRight(newRightChild);
            newRightChild.setParent(root);
        }
        return root;
    }
    public void printTree (TreeNode root) {
        if (root != null) { // check if root node is empty
            printTree(root.getLeft());
            System.out.print(root.getData() + " ");
            printTree(root.getRight());
        }
    }

    public void inputElement(Scanner sc, int n) {
        for (int i = 0; i < n; i ++) {
            int data = sc.nextInt();
            sc.nextLine();
            insert(data);
        }
    }
}
