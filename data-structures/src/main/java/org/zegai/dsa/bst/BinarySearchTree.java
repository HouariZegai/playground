package org.zegai.dsa.bst;

public class BinarySearchTree {

    private Node root;

    public boolean insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return true;
        }

        Node temp = root;
        while (true) {
            if (node.value == temp.value) {
                return false;
            }

            if (node.value < temp.value) {
                if (temp.left == null) {
                    temp.left = node;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = node;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if(root == null) {
            return false;
        }

        Node temp = root;
        while(temp != null) {
            if (value == temp.value) {
                return true;
            }

            if (value > temp.value) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Binary Search Tree: " + root;
    }
}
