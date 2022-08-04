package Math;

public class Test {
    public static void main(String[] args) {

        /*System.out.println(Math.pow(1, 2));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.pow(4, 2));
        System.out.println(Math.pow(5, 2));

        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(9));

        System.out.println(Math.cbrt(8));
        System.out.println(Math.cbrt(27));*/

        for (int i = 0; i < 5; i++){
            System.out.println(5 + Math.random() * 5);
        }

        /*System.out.println(Math.round(1.3));
        System.out.println(Math.round(1.6));
        System.out.println(Math.floor(3.9));
        System.out.println(Math.ceil(4.1));*/

        Test test = new Test();
        test.formula(5, 6);
    }
    public void formula (int a, int b){
        System.out.println( (int) Math.pow(a, 2) + (2 * a * b) + (int) Math.pow(b, 2));
    }
}