package org.zegai.algorithms.graph.binarytree;

public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void add(Node newNode, Node rootExplore) {
        if (rootExplore == null)
            return;

        if (newNode.getValue() > rootExplore.getValue()) {
            if (rootExplore.getRight() == null)
                rootExplore.setRight(newNode);
            else {
                add(newNode, rootExplore.getRight());
            }
        } else {
            if (rootExplore.getLeft() == null)
                rootExplore.setLeft(newNode);
            else {
                add(newNode, rootExplore.getLeft());
            }
        }
    }

    public boolean search(int value, Node rootExplore) {
        if (rootExplore == null)
            return false;
        if (rootExplore.getValue() == value)
            return true;
        if (value > rootExplore.getValue())
            return search(value, rootExplore.getRight());
        else
            return search(value, rootExplore.getLeft());

    }
}
