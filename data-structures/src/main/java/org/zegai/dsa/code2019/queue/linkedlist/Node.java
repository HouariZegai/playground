package org.zegai.dsa.code2019.queue.linkedlist;

public class Node<T> {
    private T value;
    private Node previous;
    private Node next;

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node previous, Node next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
