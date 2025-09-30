package org.zegai.dsa.code2019.queue.array;

public class QueueArrayDemo {
    public static void main(String[] args) {
        arrayQueueDemo();
    }

    private static void arrayQueueDemo() {
        QueueArray<Integer> queue = new QueueArray(3);
        queue.add(10);
        queue.add(19);
        queue.add(1);
        queue.print();
        queue.display();
        System.out.println("Remove: " + queue.remove());
        queue.print();
        queue.display();
        System.out.println("Remove: " + queue.remove());
        queue.print();
        queue.display();
        queue.add(15);
        queue.add(3);
        queue.print();
        queue.display();
        System.out.println("Remove: " + queue.remove());
        System.out.println("Remove: " + queue.remove());
        queue.print();
        queue.display();
        queue.add(77);
        queue.print();
        queue.display();

        System.out.printf("queue[%d]=%d\n", 0, queue.get(0));
        System.out.printf("queue[%d]=%d\n", 1, queue.get(1));
        System.out.printf("queue[%d]=%d\n", 2, queue.get(2));
        System.out.printf("queue[%d]=%d\n", 2, queue.get(-1));

        System.out.println("Remove: " + queue.remove());
        System.out.println("Remove: " + queue.remove());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Remove: " + queue.remove()); // Null pointer exception: Queue is empty
    }
}
