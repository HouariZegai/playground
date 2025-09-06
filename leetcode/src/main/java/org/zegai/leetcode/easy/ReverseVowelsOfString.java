package org.zegai.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ReverseVowelsOfString {

    public static void main(String[] args) {
        System.out.println(new ReverseVowelsOfString().reverseVowels("IceCreAm").equals("AceCreIm"));
        System.out.println(new ReverseVowelsOfString().reverseVowels("leetcode").equals("leotcede"));
    }

    public String reverseVowels(String s) {
        Map<Character, Boolean> vowelsMap = createVowelsMap();

        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        char swap;
        while (i <= j) {
            if (vowelsMap.containsKey(arr[i]) && vowelsMap.containsKey(arr[j])) {
                swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            } else {
                if (!vowelsMap.containsKey(arr[i])) {
                    i++;
                }
                if (!vowelsMap.containsKey(arr[j])) {
                    j--;
                }
            }
        }

        return String.valueOf(arr);
    }

    private static Map<Character, Boolean> createVowelsMap() {
        Map<Character, Boolean> vowelsMap = new HashMap<>();
        vowelsMap.put('a', true);
        vowelsMap.put('e', true);
        vowelsMap.put('i', true);
        vowelsMap.put('o', true);
        vowelsMap.put('u', true);
        vowelsMap.put('A', true);
        vowelsMap.put('E', true);
        vowelsMap.put('I', true);
        vowelsMap.put('O', true);
        vowelsMap.put('U', true);

        return vowelsMap;
    }
}
