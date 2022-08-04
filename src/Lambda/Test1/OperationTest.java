package Lambda.Test1;

public class OperationTest {
//    private static double value1 = 2.0;
//    private static double value2 = 2.0;
    public static void main(String[] args) {

        double value1 = 2.0;
        double value2 = 2.0;

//        Operation operation = new Operation() {
//            @Override
//            public double getResult(double value1, double value2) {
//                return value1 + value2;
//            }
//        };
//
//        System.out.println(operation.getResult(2.0, 2.0));

        Operation lambda = () -> {
            return value1 + value2;
        };
        //value2 = 30;
        System.out.println(lambda.getResult());
        System.out.println(value1);
        System.out.println(value2);
    }
}