package org.zegai.dsa.code2019.queue.array;

import java.util.NoSuchElementException;

public class QueueArray<T> {
    private Object[] data;
    private int capacity;
    private int head; // Index of the first element
    private int tail; // Index of the first empty place

    public QueueArray(int capacity) {
        this.capacity = capacity;
        data = new Object[this.capacity];
        head = -1;
        tail = 0;
    }

    public void add(T element) {
        if(isFull())
            throw new IndexOutOfBoundsException("Queue full");

        if(isEmpty()) {
            head++;
            tail = (tail + 1) % capacity;
            data[head] = element;
        } else {
            data[tail] = element;
            tail = (tail + 1) % capacity;
        }
    }

    public T remove() {
        T dequeuedData = poll();

        if(dequeuedData == null)
            throw new NullPointerException("Queue is empty");
        return dequeuedData;
    }

    public T poll() {
        if(isEmpty())
            return null;

        T dequeuedData = (T) data[head];

        data[head] = null;
        head = (head + 1) % capacity;

        if(head == tail) { // Queue is empty after delete
            head = -1;
            tail = 0;
        }
        return dequeuedData;
    }

    public T get(int index) {
        if(index >= capacity || index < 0)
            throw new NoSuchElementException("Invalid index");

        return (T) data[(head + index) % capacity];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return tail == head && !isEmpty();
    }

    public void display() {
        int headIndex = head,
                tailIndex = tail;

        System.out.print("Data: [");
        if(!isEmpty()) {
            do {
                System.out.print(data[headIndex] + ", ");
                headIndex = (headIndex + 1) % capacity;
            } while (headIndex != tailIndex);
        }
        System.out.println("]");
    }

    public void print() {
        System.out.print("Print: [");
        for(Object item : data)
            System.out.print((T) item + ", ");
        System.out.println("]");
    }

}
