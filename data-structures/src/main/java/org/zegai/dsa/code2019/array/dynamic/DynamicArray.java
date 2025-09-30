package org.zegai.dsa.code2019.array.dynamic;

import java.util.Arrays;

public class DynamicArray<T> {
    private T[] data;
    private int size;

    public DynamicArray() {
        this.size = 0;
        this.data = (T[]) new Object[1];
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void add(T element) {
        ensureCapacity(size + 1);
        data[size++] = element;
    }

    public void remove(int index) {
        for(int i = index; i < size - 1; i++)
            data[i] = data[i + 1];
        size--;
        ensureCapacity(size);
    }

    public int size() {
        return this.size;
    }

    public int length() { // just for testing
        return data.length;
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
