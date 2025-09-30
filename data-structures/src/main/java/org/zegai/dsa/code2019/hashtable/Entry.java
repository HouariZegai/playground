package org.zegai.dsa.code2019.hashtable;

public class Entry<T> {
    private int key;
    private T value;
    private Entry next;

    public Entry()  {

    }

    public Entry(int key, T value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }
}
