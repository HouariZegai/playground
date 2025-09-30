package org.zegai.dsa.stack;

public class Stack {

    private Node top;
    private int height;

    public Stack(int value) {
        Node node = new Node(value);
        top = node;
        height = 1;
    }

    public void push(int value) {
        Node node = new Node(value);

        if (height == 0) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }

        height++;
    }

    public Node pop() {
        if (height == 0) {
            return null;
        }

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }

    public void print() {
        Node temp = top;
        System.out.print("Items: ");
        while (temp != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println();
    }
}
