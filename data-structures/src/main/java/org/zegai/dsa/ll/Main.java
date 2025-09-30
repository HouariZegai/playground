package org.zegai.dsa.ll;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
