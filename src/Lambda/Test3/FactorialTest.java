package Lambda.Test3;

public class FactorialTest {
    public static void main(String[] args) {
        Factorial factorial = value -> {
            int result = 1;

            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.getResult(5));
    }
}