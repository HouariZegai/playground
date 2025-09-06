package org.zegai.leetcode.easy;

public class FindIndexOfFirstOccurrenceInString {

    public static void main(String[] args) {
        System.out.println(new FindIndexOfFirstOccurrenceInString().strStr("sadbutsad", "sad"));
        System.out.println(new FindIndexOfFirstOccurrenceInString().strStr("adbutsad", "sad"));
        System.out.println(new FindIndexOfFirstOccurrenceInString().strStr("leetcode", "leeto"));
    }

    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if(haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
