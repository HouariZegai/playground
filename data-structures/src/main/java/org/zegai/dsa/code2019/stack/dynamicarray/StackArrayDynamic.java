package org.zegai.dsa.code2019.stack.dynamicarray;

import java.util.Arrays;

public class StackArrayDynamic<T> {
    private Object[] data;
    private int top;

    public StackArrayDynamic() {
        data = new Object[1];
        this.top = -1;
    }

    public void push(T element) {
        ensureCapacity(top + 2);

        data[++top] = element;
    }

    public T pop() {
        if(isEmpty()) { // stack is empty
            return null;
        }

        T removedItem =  (T) data[top--];
        ensureCapacity(top);

        return removedItem;
    }

    public int size() {
        return this.top + 1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = data.length;
        if(minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if(newCapacity < minCapacity) // when delete all item and need to add element (if size style 0)
                newCapacity = minCapacity;
            data = Arrays.copyOf(data, newCapacity);
        } else if(minCapacity <= oldCapacity / 2) {
            int newCapacity = oldCapacity / 2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }
}
