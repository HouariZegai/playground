package org.zegai.leetcode.easy;

public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("acb", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("b", "abc"));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (s.length() > t.length()) {
            return false;
        }
        if (s.equals(t)) {
            return true;
        }

        short k = 0;
        for (char c : t.toCharArray()) {
            if (c == s.charAt(k)) {
                k++;
                if (k == s.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}
