package org.zegai.dsa.code2019.hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        HashTableArray<String> hashTableArray = new HashTableArray<>(5);
        hashTableArray.put(1, "Houari");
        hashTableArray.put(6, "ZEGAI");
        hashTableArray.put(2, "Worker");
        System.out.println(hashTableArray.get(6));
    }
}
