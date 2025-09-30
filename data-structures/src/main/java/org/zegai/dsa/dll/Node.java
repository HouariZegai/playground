package org.zegai.dsa.dll;

public class Node {
    int value;
    Node next;
    Node prev ;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
//                "prev=" + prev + ", " +
                "value=" + value +
//                ", next=" + next +
                '}';
    }
}
