package ee.ttu.algoritmid.fibonacci;

public class Main {

    public static void main(String[] args) {

        AL01A test = new AL01A();
        String f = test.iterativeF(6);
        System.out.println(f);

        AL01B test2 = new AL01B();
        String time = test2.timeToComputeRecursiveFibonacci(40);
        System.out.println(time);
    }

    }
