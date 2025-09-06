package org.zegai.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    public static void main(String[] args) {
        System.out.println(new Isomorphic().isIsomorphic("egg", "add")); // true
        System.out.println(new Isomorphic().isIsomorphic("paper", "title")); // true
        System.out.println(new Isomorphic().isIsomorphic("p", "t")); // true
        System.out.println(new Isomorphic().isIsomorphic("foo", "bar")); // false
        System.out.println(new Isomorphic().isIsomorphic("badc", "baba")); // false
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        if (s.length() == 1) {
            return true;
        }

        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));

                continue;
            }

            if(map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
