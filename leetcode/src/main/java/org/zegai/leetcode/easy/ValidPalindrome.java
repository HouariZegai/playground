package org.zegai.leetcode.easy;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new ValidPalindrome().isPalindrome("race a car"));
        System.out.println(new ValidPalindrome().isPalindrome(" "));
        System.out.println(new ValidPalindrome().isPalindrome("0A"));
        System.out.println(new ValidPalindrome().isPalindrome(",,,,,,,,,,,,acva"));
    }

    public boolean isPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return true;
        }

        int i = 0;
        int j = len - 1;

        while (i <= j) {
            if (!isAlphanumeric(s.charAt(i))) {
                i++;
                continue;
            }
            if (!isAlphanumeric(s.charAt(j))) {
                j--;
                continue;
            }

            if (normalizeStr(s.charAt(i)) != normalizeStr(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    private char normalizeStr(char ch) {
        return (ch >= 65 && ch <= 90) ? (char) (ch + 32) : ch;
    }

    private boolean isAlphanumeric(char ch) {
        return (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57);
    }
}
