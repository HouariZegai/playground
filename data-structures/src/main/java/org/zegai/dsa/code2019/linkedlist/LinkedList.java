package org.zegai.dsa.code2019.linkedlist;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
    }

    public int size() {
        Node currentNode = head;
        if(currentNode == null)
            return 0;

        int size = 1;
        while(currentNode.getNext() != null) {
            size++;
            currentNode = currentNode.getNext();
        }

        return size;
    }

    public T getFirst() {
        return head.getValue();
    }

    public T get(int position) {
        Node<T> currentNode = head;
        while(currentNode.getNext() != null && position > 0) {
            currentNode = currentNode.getNext();
            position--;
        }

        return currentNode.getValue();
    }

    public void addToFirst(T element) {
        Node newNode = new Node(element, head);
        head = newNode;
    }

    public void add(T element) {
        addToFirst(element);
    }

    public void add(T element, int position) {
        if(position == 0) { // add to first
            addToFirst(element);
            return;
        }

        Node currentNode = getNodeAtPosition(position);

        // add element
        Node newNode = new Node(element, currentNode.getNext());
        currentNode.setNext(newNode);
    }

    public void deleteFirst() {
        if(head.getNext() == null) // there is only one item in the list
            head = null;
        else
            head = head.getNext();
    }

    public void delete() {
        deleteFirst();
    }

    public void delete(int position) {
        if(position == 0) {
            deleteFirst();
            return;
        }

        Node preDeletedNode = getNodeAtPosition(position - 1);
        preDeletedNode.setNext(preDeletedNode.getNext().getNext());
    }

    public void diplay() {
        Node<T> node = head;
        while(node != null) {
            System.out.print(node.getValue() + "\t");
            node = node.getNext();
        }
        System.out.println();
    }

    private Node getNodeAtPosition(int position) {
        Node currentNode = head;

        while(currentNode != null && position > 1) {
            currentNode = currentNode.getNext();
            position--;
        }

        return currentNode;
    }
}
