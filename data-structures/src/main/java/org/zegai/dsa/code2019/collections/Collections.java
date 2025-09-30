package org.zegai.dsa.code2019.collections;

import org.zegai.dsa.code2019.linkedlist.LinkedList;
import org.zegai.dsa.code2019.queue.array.QueueArray;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class Collections {
    public static void main(String[] args) {
        // Linked list
        System.out.println("\nLinked List:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.diplay();
        linkedList.delete();
        linkedList.diplay();
        linkedList.delete();

        // Array list
        System.out.println("\nArray List:");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.remove(0);
        System.out.println(arrayList.toString());

        // Stack
        System.out.println("\nStack:");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(12);
        System.out.println(stack.toString());
        System.out.println("Pop: " + stack.pop());
        // Queue
        System.out.println("\nQueue Array:");
        QueueArray<String> queueArray = new QueueArray<>(2);
        queueArray.add("q1");
        queueArray.add("q2");
        queueArray.display();
        System.out.println("Remove: " + queueArray.remove());
        queueArray.display();

        // Hash Table
        System.out.println("\nHash Table:");
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Hello");
        hashtable.put(2, "World");
        System.out.println(hashtable.get(1));
        hashtable.remove(1);
        System.out.println(hashtable.toString());
    }
}
