package org.zegai.dsa.code2019.queue.linkedlist;

public class QueueLinkedListDemo {
    public static void main(String[] args) {
        QueueLinkedList<String> queue = new QueueLinkedList<>();
        queue.add("Hello");
        queue.add("World");
        queue.diplay();

        System.out.println("Remove: " + queue.remove());
        queue.diplay();

        System.out.println("Remove: " + queue.remove());
        queue.add("Houari");
        queue.add("ZEGAI");
        queue.diplay();
        System.out.println("Remove: " + queue.remove());
        System.out.println("Remove: " + queue.remove());
        System.out.println("Remove: " + queue.remove()); // Null pointer exception: Queue is empty
        queue.diplay();
    }
}
