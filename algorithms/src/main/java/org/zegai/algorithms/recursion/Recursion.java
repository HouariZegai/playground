package org.zegai.algorithms.recursion;

public class Recursion {

    public static void main(String[] args) throws Exception {
        System.out.println("Fact:");
        System.out.printf("%d! = %d\n", 0, fact(0));
        System.out.printf("%d! = %d\n", 5, fact(5));
        System.out.printf("%d! = %d\n", -1, fact(-1)); // Throw exception: Invalid input

    }

    public static int fact(int number) throws Exception {
        if (number < 0)
            throw new Exception("Invalid input");

        if (number == 1 || number == 0) {
            return 1;
        }
        return number * fact(number - 1);
    }
}
