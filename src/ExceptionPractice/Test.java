package ExceptionPractice;

public class Test {
    public static void main(String[] args) {
        System.out.println("Начало программы");

        try {
            System.out.println("Перед method1");
            method1();
            System.out.println("После вызова method1. Никогда не будет показано");
        } catch (NullPointerException e) {
            System.out.println("Ссылка null. Исключение было поймано");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль. Исключение было поймано");
        } catch (Exception e) {
            System.out.println("Любые другие ошибки. Исключение было поймано");
        }
        System.out.println("Программа все еще работает");
    }

    public static void method1() {
//        int a = 100;
//        int b = 1;
//        System.out.println(a / b);

        Person p = null;
        System.out.println(p.a);
    }
}