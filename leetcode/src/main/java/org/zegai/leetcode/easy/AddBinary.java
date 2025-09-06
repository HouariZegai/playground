package org.zegai.leetcode.easy;

import java.util.Stack;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("11", "1"));
        System.out.println(new AddBinary().addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;

        boolean hasOne = false;
        while (aIndex >= 0 && bIndex >= 0) {
            char aPop = a.charAt(aIndex--);
            char bPop = b.charAt(bIndex--);

            if (hasOne) {
                if (aPop == '1' && bPop == '1') {
                    sum.insert(0, '1');
                } else if ((aPop == '1' && bPop == '0') || (aPop == '0' && bPop == '1')) {
                    sum.insert(0, '0');
                } else {
                    sum.insert(0, '1');
                    hasOne = false;
                }
            } else {
                if (aPop == '1' && bPop == '1') {
                    sum.insert(0, '0');
                    hasOne = true;
                } else if ((aPop == '1' && bPop == '0') || (aPop == '0' && bPop == '1')) {
                    sum.insert(0, '1');
                } else {
                    sum.insert(0, '0');
                }
            }
        }

        while (aIndex >= 0) {
            char c = a.charAt(aIndex--);
            if (hasOne) {
                if (c == '0') {
                    sum.insert(0, '1');
                    hasOne = false;
                }
                if (c == '1') {
                    sum.insert(0, '0');
                }
            } else {
                sum.insert(0, c);
            }
        }

        while (bIndex >= 0) {
            char c = b.charAt(bIndex--);
            if (hasOne) {
                if (c == '0') {
                    sum.insert(0, '1');
                    hasOne = false;
                }
                if (c == '1') {
                    sum.insert(0, '0');
                }
            } else {
                sum.insert(0, c);
            }
        }

        if (hasOne) {
            sum.insert(0, '1');
        }

        return sum.toString();
    }
}
