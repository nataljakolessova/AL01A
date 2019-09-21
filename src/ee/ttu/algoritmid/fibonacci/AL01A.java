package ee.ttu.algoritmid.fibonacci;

public class AL01A {

    public static String iterativeF(int n) {
        if(n <= 1) {
            return String.valueOf(n);
        }
        int currentNum = 1;
        int prevNum = 1;

        for(int i=2; i<n; i++) {
            int sum = prevNum + currentNum;
            prevNum = currentNum;
            currentNum = sum;
        }
        return String.valueOf(currentNum);
    }
}
