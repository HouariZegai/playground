package org.zegai.algorithms.egyptianmultiplication;

public class EgyptianMultiplicationDemo {

    // The algorithm complexity is : O(log(n))
    private static int getMul(int a, int b) { // Calc multiplication (Get A * B)
        int result = 0;
        while (b >= 1) {
            if (b % 2 != 0)
                result += a;

            b /= 2;
            a *= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        int a = 125;
        int b = 91;
        int result = EgyptianMultiplicationDemo.getMul(a, b);

        System.out.println(a + " * " + b + " = " + result);
    }
}
