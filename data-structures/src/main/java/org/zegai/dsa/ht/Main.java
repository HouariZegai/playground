package org.zegai.dsa.ht;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.set("houari", 1);
        ht.set("hou", 2);
        ht.set("zegai", 3);
        ht.printTable();

        System.out.println("Get: " + ht.get("houari"));
//        System.out.println(ht.get("zeg"));
        System.out.println("Keys: " + ht.keys());

        System.out.println("Has item in commons: " + itemInCommon(new int[]{1, 2}, new int[]{3, 4, 5}));
        System.out.println("Has item in commons: " + itemInCommon(new int[]{1, 2}, new int[]{3, 2, 5}));

        System.out.println("First Non Repeating Char: ");
        System.out.println(firstNonRepeatingChar("leetcodel"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        System.out.println(firstNonRepeatingChar("aabcc"));
        System.out.println(firstNonRepeatingChar("aaaaazzk"));
    }

    public static boolean itemInCommon(int[] arr1, int[] arr2) { // Interview question
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i: arr1) {
            myHashMap.put(i, true);
        }

        for (int j: arr2) {
            if(myHashMap.get(j) != null) {
                return true;
            }
        }

        return false;
    }

    public static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> duplicates = new HashSet<>();

        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i: arr) {
            if(map.get(i) != null) {
                duplicates.add(i);
            } else {
                map.put(i, true);
            }
        }

        return new ArrayList<>(duplicates);
    }

    public static Character firstNonRepeatingChar(String str) {
        if(str == null) return null;
        if(str.length() == 1) return str.charAt(0);

        Map<Character, Boolean> map = new HashMap<>();
        for(Character c: str.toCharArray()) {
            map.put(c, map.get(c) != null);
        }

        for(Character c: str.toCharArray()) {
            if(Boolean.FALSE.equals(map.get(c)))
                return c;
        }

        return null;
    }
}
