import java.math.BigInteger;

public class Lychrel {

    public static int convergesAtIteration(int n, int limit) {
        return converge(BigInteger.valueOf(n), 0, limit);
    }

    private static Integer converge(BigInteger n, int iteration, int limit) {
        if(isPalindrome(n) || iteration == limit)
            return iteration;

        return converge(reverse(n).add(n), iteration + 1, limit);
    }

    public static BigInteger reverse(BigInteger n) {
        char[] nDigits = n.toString().toCharArray();
        char[] rDigits = new char[nDigits.length];

        int lastIndex = nDigits.length - 1;
        for(int i = 0; i < nDigits.length; i++)
            rDigits[i] = nDigits[lastIndex - i];

        return new BigInteger(String.valueOf(rDigits));
    }

    public static boolean isPalindrome(BigInteger n) {
        String digits = n.toString();
        int lastIndex = digits.length() - 1;
        for(int i = 0; i < digits.length() / 2; i++)
            if(digits.charAt(i) != digits.charAt(lastIndex - i))
                return false;

        return true;
    }
}
