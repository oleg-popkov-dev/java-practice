package ExceptionPractice;

public class Test3 {
    public static void main(String[] args) {
        try {
            run();
        }  catch (
                IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        } catch (
                ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (
                NullPointerException e) {
            System.out.println("s1 ничего не содержит");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void run() {
        String s1 = null;
        System.out.println(s1.length());

        int[] array = {22, 3};
        System.out.println(array[3]);

        int number1 = 5;
        int number2 = 0;
        System.out.println(number1 / number2);
    }
}