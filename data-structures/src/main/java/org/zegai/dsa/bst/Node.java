package org.zegai.dsa.bst;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left + ", " +
                "value=" + value +
                ", right=" + right +
                '}';
    }
}
