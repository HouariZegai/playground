package org.zegai.dsa.queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        System.out.println("Dequeue: "+ queue.dequeue());
        System.out.println("Dequeue: "+ queue.dequeue());
        queue.print();
        System.out.println("Dequeue: "+ queue.dequeue());
        System.out.println("Dequeue: "+ queue.dequeue());
        queue.print();
    }
}
