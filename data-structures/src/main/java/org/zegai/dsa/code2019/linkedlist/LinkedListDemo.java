package org.zegai.dsa.code2019.linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<>();
        data.add(100);
        System.out.println("Size: " + data.size());

        data.add(10, 1);
        System.out.println("Size: " + data.size());

        data.diplay();
        System.out.printf("data[%d]=%d\n", 0, data.get(0));
        System.out.printf("data[%d]=%d\n", 1, data.get(1));

        data.delete(1);
        data.delete(0);
        System.out.println("Size: " + data.size());

        data.addToFirst(15);
        System.out.println("Size: " + data.size());
        data.diplay();

        System.out.printf("data[%d]=%d\n", 0, data.get(0));
    }
}