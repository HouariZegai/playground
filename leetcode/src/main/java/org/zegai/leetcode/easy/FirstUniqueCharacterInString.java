package org.zegai.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharacterInString().firstUniqChar("leetcode") == 0);
        System.out.println(new FirstUniqueCharacterInString().firstUniqChar("loveleetcode") == 2);
        System.out.println(new FirstUniqueCharacterInString().firstUniqChar("aabb") == -1);
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
