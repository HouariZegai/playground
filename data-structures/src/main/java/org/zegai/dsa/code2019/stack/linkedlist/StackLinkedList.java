package org.zegai.dsa.code2019.stack.linkedlist;

public class StackLinkedList<T> {
    private Node<T> head;

    public StackLinkedList() {
    }

    public int size() {
        Node<T> currentNode = head;
        if(currentNode == null)
            return 0;

        int size = 1;
        while(currentNode.getNext() != null) {
            size++;
            currentNode = currentNode.getNext();
        }

        return size;
    }

    public void push(T element) {
        Node newNode = new Node(element, head);
        head = newNode;
    }

    public T pop() {
        if(head == null) // If stack is empty
            return null;

        Node<T> removedElement = head;
        head = head.getNext();

        return removedElement.getValue();
    }
}
