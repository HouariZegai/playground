package org.zegai.dsa.dll;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        System.out.println("Remove: "+ doublyLinkedList.remove(0));
        doublyLinkedList.print();
    }
}
