package org.zegai.dsa.ht;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
    }

    public void set(String key, int value) {
        int index = hash(key);

        Node newNode = new Node(key, value);

        if(dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }

        throw new IllegalArgumentException("Invalid key");
    }

    public List keys() {
        List<String> keys = new ArrayList<>();
        Node temp;
        for(Node node: dataMap) {
            temp = node;
            while(temp != null) {
                keys.add(temp.key);
                temp = temp.next;
            }
        }

        return keys;
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ": " + dataMap[i]);
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiKey = keyChars[i];
            hash = (hash + asciiKey * 23) % dataMap.length;
        }

        return hash;
    }
}
