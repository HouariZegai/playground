package org.zegai.dsa.queue;

public class Queue { // enqueue at end, dequeue at first

    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node node = new Node(value);
        first = node;
        last = node;
        length = 1;
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (length == 0) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }

        length++;
    }

    public Node dequeue() {
        if (length == 0) {
            return null;
        }

        Node temp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }

        length--;

        return temp;
    }

    public void print() {
        Node temp = first;
        System.out.print("Items: ");
        while (temp != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println();
    }
}
