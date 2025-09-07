package org.zegai.leetcode.easy;

public class NumberOfSegmentsInString {

    public static void main(String[] args) {
        System.out.println(new NumberOfSegmentsInString().countSegments("Hello, my name is John") == 5);
        System.out.println(new NumberOfSegmentsInString().countSegments("Hello") == 1);
        System.out.println(new NumberOfSegmentsInString().countSegments("") == 0);
        System.out.println(new NumberOfSegmentsInString().countSegments("                ") == 0);
    }

    public int countSegments(String s) {
        if(s.isEmpty()) {
            return 0;
        }

        int words = 0;
        boolean word = false;
        for(char c: s.trim().toCharArray()) {
            if(c == ' ') {
                if(word) {
                    words++;
                    word = false;
                }
            } else {
                word = true;
            }
        }

        if(word)
            words++;

        return words;
    }
}
