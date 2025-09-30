package org.zegai.dsa.dll;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
            node.prev = temp;
            tail = node;
        }

        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        if (length == 1) {
            Node temp = head;
            head = null;
            tail = null;
            length--;
            return temp;
        }

        Node prev = head;
        while (prev.next.next != null) {
            prev = prev.next;
        }

        Node temp = prev.next;
        prev.next = null;
        temp.prev = null;
        tail = prev;
        length--;

        return temp;
    }

    public Node removeLastUsingTail() {
        if (length == 0) {
            return null;
        }

        Node temp = tail;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }

        length--;
        return temp;
    }

    public void prepend(int value) {
        Node node = new Node(value);

        if (length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }

        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node temp = head;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }

        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node temp;
        if (index < length / 2) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }

        return temp;
    }

    public boolean set(int index, int value) {
        if (index < 0 || index >= length) {
            return false;
        }

        Node temp;
        if (index < length / 2) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }

        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node node = new Node(value);
        Node prev = get(index - 1);

        node.next = prev.next;
        prev.next.prev = node;
        prev.next = node;
        node.prev = prev;
        length++;

        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }

        Node temp = get(index);
        Node prev = temp.prev;
        Node after = temp.next;
        prev.next = after;
        after.prev = prev;
        temp.next = null;
        temp.prev = null;
        length--;

        return temp;
    }

    public void print() {
        Node temp = head;

        System.out.print("Items: ");
        while (temp != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isPalindrome() {
        if (length <= 1) {
            return true;
        }

        Node t1 = head;
        Node t2 = tail;
        for (int i = 0; i < length / 2; i++) {
            if (t1.value != t2.value) {
                return false;
            }
            t1 = t1.next;
            t2 = t2.prev;
        }

        return true;
    }
}
