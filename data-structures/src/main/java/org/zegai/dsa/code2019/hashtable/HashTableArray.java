package org.zegai.dsa.code2019.hashtable;

public class HashTableArray<T> {
    private Entry[] arrayHash;
    private int size;

    public HashTableArray(int size) {
        this.size = size;
        arrayHash = new Entry[this.size];
        for(int i = 0; i < this.size; i++) {
            arrayHash[i] = new Entry();
        }
    }

    public void put(int key, T value) {
        Entry<T> newNode = new Entry<>(key, value);

        int index = generateHash(key);
        Entry<T> head = arrayHash[index];
        while(head.getNext() != null)
            head = head.getNext();
        head.setNext(newNode);
    }

    public T get(int key) {
        int index = generateHash(key);
        Entry<T> head = arrayHash[index];

        while(head != null) {
            if(head.getKey() == key)
                return head.getValue();
            head = head.getNext();
        }

        throw new NullPointerException("Invalid key");
    }

    private int generateHash(int key) {
        return key % size; // There is many way to generate hash
    }
}
