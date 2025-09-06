package org.zegai.leetcode.easy;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("Hello World"));
        System.out.println(new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(new LengthOfLastWord().lengthOfLastWord("luffy is still joyboy"));
    }

    public int lengthOfLastWord(String s) {
        int sum = 0;
        for(int i = s.length() -1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                sum++;
            } else if (sum != 0) {
                break;
            }
        }

        return sum;
    }
}
