package org.zegai.leetcode.easy;


public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("III"));
        System.out.println(new RomanToInteger().romanToInt("LVIII"));
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int sum = 0;

        int i;
        for (i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'I') {
                if (s.charAt(i + 1) == 'V') {
                    sum += 4;
                    i++;
                    continue;
                }
                if (s.charAt(i + 1) == 'X') {
                    sum += 9;
                    i++;
                    continue;
                }
            }

            if (s.charAt(i) == 'X') {
                if (s.charAt(i + 1) == 'L') {
                    sum += 40;
                    i++;
                    continue;
                }
                if (s.charAt(i + 1) == 'C') {
                    sum += 90;
                    i++;
                    continue;
                }
            }

            if (s.charAt(i) == 'C') {
                if (s.charAt(i + 1) == 'D') {
                    sum += 400;
                    i++;
                    continue;
                }
                if (s.charAt(i + 1) == 'M') {
                    sum += 900;
                    i++;
                    continue;
                }
            }

            sum += getRomanValue(s, i);
        }

        if (i == s.length() - 1) {
            sum += getRomanValue(s, i);
        }

        return sum;
    }

    private static int getRomanValue(String s, int i) {
        return switch (s.charAt(i)) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
