package org.zegai.dsa.code2019.stack.array;

public class StackArray<T> {
    private int size;
    private Object[] data;
    private int top;

    public StackArray(int size) {
        this.size = size;
        data = new Object[this.size];
        top = -1;
    }

    public void push(T element) {
        if(isFull()) // stack is full
            return;

        data[++top] = element;
    }

    public T pop() {
        if(isEmpty()) { // stack is empty
            return null;
        }

        return (T) data[top--];
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
