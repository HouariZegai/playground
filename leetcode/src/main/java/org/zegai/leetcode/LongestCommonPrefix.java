package org.zegai.leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"","racecar","car"}));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{null,"racecar","car"}));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower","flower","flower","flower"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs[0] == null || strs[0].isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++) {
            if(!allMatch(strs, strs[0].charAt(i), i)) {
                break;
            }
            sb.append(strs[0].charAt(i));
        }

        return sb.toString();
    }

    private boolean allMatch(String[] strs, char ch, int index) {
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() <= index || ch != strs[i].charAt(index)) {
                return false;
            }
        }

        return true;
    }
}
