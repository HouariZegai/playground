package org.zegai.leetcode.easy;

public class DetectCapitalUse {

    public static void main(String[] args) {
        System.out.println(new DetectCapitalUse().detectCapitalUse("USA"));
        System.out.println(new DetectCapitalUse().detectCapitalUse("leetcode"));
        System.out.println(new DetectCapitalUse().detectCapitalUse("Leetcode"));
        System.out.println(new DetectCapitalUse().detectCapitalUse("FlaG"));
        System.out.println(new DetectCapitalUse().detectCapitalUse("G"));
    }

    public boolean detectCapitalUse(String word) {
        if(word.length() < 2) {
            return true;
        }

        if(isLowercase(word.charAt(0)) || isLowercase(word.charAt(1))) {
            for (int i = 1; i < word.length(); i++) {
                if(!isLowercase(word.charAt(i))) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < word.length(); i++) {
                if(!isUppercase(word.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isUppercase(char c) {
        return c >= 65 && c <= 90;
    }

    public boolean isLowercase(char c) {
        return c >= 97 && c <= 122;
    }
}
