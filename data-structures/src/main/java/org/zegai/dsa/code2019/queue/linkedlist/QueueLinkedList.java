package org.zegai.dsa.code2019.queue.linkedlist;

public class QueueLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T element) {
        Node newNode = new Node(element, tail, null);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public T remove() {
        if(isEmpty())
            throw new NullPointerException("Queue is empty");

        T itemDeleted = head.getValue();

        head = head.getNext();
        if(!isEmpty()) {
            head.setPrevious(null);
        }

        return itemDeleted;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void diplay() {
        Node<T> node = head;
        System.out.print("Data: [ ");
        while(node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
        System.out.println("]");
    }
}
