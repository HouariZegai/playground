package org.zegai.leetcode.easy;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        new ReverseString().reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {
        char swap;
        for(int i = 0; i < s.length / 2; i++) {
            swap = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = swap;
        }
    }
}
