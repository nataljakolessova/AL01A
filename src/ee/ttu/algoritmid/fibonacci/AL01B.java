package ee.ttu.algoritmid.fibonacci;

import java.math.BigInteger;

public class AL01B {

    public static BigInteger recursiveF(int n) {
        if (n <= 1)
            return BigInteger.valueOf(n);
        return recursiveF(n - 1).add(recursiveF(n - 2));
    }
    public static String timeToComputeRecursiveFibonacci(int n) {
        double startTime = System.nanoTime();
        recursiveF(n);
        double endTime = System.nanoTime();
        double durationInNano = (endTime - startTime);
        double years = durationInNano / Math.pow(10, 9) /60/60/24/365;
        return String.valueOf(years);
    }

}
