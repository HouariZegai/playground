package org.zegai.dsa.code2019.array.simple;

public class SimpleArray {
    public static void main(String[] args) {
        // One dimension array
        int[] numbers = new int[6];
        numbers[0] = 1;
        numbers[1] = 12;
        numbers[2] = 4;
        numbers[3] = 8;
        numbers[4] = 35;
        numbers[5] = 19;

        for(int number : numbers)
            System.out.print(number + "\t");
        System.out.println();

        // Two dimension array
        char[][] data = new char[3][2];
        data[0][0] = 'a';
        data[0][1] = 'b';
        data[1][0] = 'c';
        data[1][1] = 'd';
        data[2][0] = 'e';
        data[2][1] = 'f';

        for(char[] rows : data) {
            for(char d : rows)
                System.out.print(d + "\t");
            System.out.println();
        }
    }
}
