package org.zegai.dsa.code2019.stack.linkedlist;

public class StackLinkedListDemo {
    public static void main(String[] args) {
        System.out.println("Stack linked list");
        StackLinkedList<Integer> stackLinkedList = new StackLinkedList<>();
        stackLinkedList.push(10);
        stackLinkedList.push(3);

        System.out.println("size: " + stackLinkedList.size());
        System.out.println(stackLinkedList.pop());
        System.out.println("size: " + stackLinkedList.size());
        System.out.println(stackLinkedList.pop());
    }
}
