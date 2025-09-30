package org.zegai.dsa.ll;

public class CustomLinkedList {

    Node head;
    Node tail;
    int length;

    public void prepend(int value) {
        Node node = new Node(value);

        if (length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }

        length++;
    }

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        length++;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            length++;
            return true;
        }

        if (index == length) {
            append(value);
            length++;
            return true;
        }

        Node node = new Node(value);
        Node temp = get(index - 1);

        node.next = temp.next;
        temp.next = node;
        length++;

        return true;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean set(int index, int value) {
        if (index < 0 || index >= length) {
            return false;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.value = value;

        return true;
    }

    public Node removeLast2() { // my 1st impl without pre var
        if (length == 0) {
            return null;
        }

        Node lastNode = tail;

        if (length == 1) {
            head = null;
            tail = null;
            length--;

            return lastNode;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        tail = temp;
        temp.next = null;
        length--;

        return lastNode;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;

        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) {
            tail = null;
        }

        return temp;
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

        Node temp = head;
        Node pre = head;

        for (int i = 0; i < index; i++) {
            pre = temp;
            temp = temp.next;
        }

        pre.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    public void reverse() {
        if (length < 2) {
            return;
        }

        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    // LeetCode
    public Node findMiddleNode() {
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head, fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // LeetCode
    public boolean hasLoop() {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // LeetCode
    public Node findKthFromEnd(int k) {
        if (k < 1 || head == null) {
            return null;
        }

        Node slow = head, fast = head;
        for(int i = 1; i < k; i++) {
            fast = fast.next;
            if(fast == null) {
                return null;
            }
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    // LeetCode
    public void removeDuplicates() {
        if (length < 2) {
            return;
        }

        Node current = head, runner;
        while(current != null && current.next != null) {
            runner = current;
            while(runner.next != null) {
                if(runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    length--;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }

    // LeetCode
    public int binaryToDecimal() {
        int num = 0;
        Node temp = head;
        while(temp != null) {
            num = num * 2 + temp.value;
            temp = temp.next;
        }

        return num;
    }

    // LeetCode
    public void partitionList(int x) {
        if (head == null || head.next == null) {
            return;
        }

        Node part1 = null;
        Node current1 = null;

        Node part2 = null;
        Node current2 = null;

        Node temp = head;

        while (temp != null) {
            if (temp.value < x) {
                if (current1 == null) {
                    current1 = temp;
                    part1 = current1;
                } else {
                    current1.next = temp;
                    current1 = current1.next;
                }
                temp = temp.next;
                current1.next = null;
            } else {
                if (current2 == null) {
                    current2 = temp;
                    part2 = current2;
                } else {
                    current2.next = temp;
                    current2 = current2.next;
                }
                temp = temp.next;
                current2.next = null;
            }
        }

        if (part1 != null) {
            current1.next = part2;
            head = part1;
        } else {
            head = part2;
        }
    }
}
