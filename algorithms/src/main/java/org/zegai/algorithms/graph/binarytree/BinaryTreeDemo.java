package org.zegai.algorithms.graph.binarytree;

public class BinaryTreeDemo {

    public static void main(String[] args) {
        // Create root node
        Node root = new Node(10, null, null);
        // Create binary tree
        BinaryTree binaryTree = new BinaryTree(root);

        /* Adding Nodes to binary tree */
        binaryTree.add(new Node(5, null, null), binaryTree.getRoot());
        binaryTree.add(new Node(12, null, null), binaryTree.getRoot());
        binaryTree.add(new Node(9, null, null), binaryTree.getRoot());

        boolean isFounded = binaryTree.search(10, root);
        System.out.println(isFounded);
    }
}
