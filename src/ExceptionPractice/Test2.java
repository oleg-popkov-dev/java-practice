package ExceptionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) {
        try {
            method3();
        } catch (ClassNotFoundException e) {
            System.out.println("FileNotFoundException был пойман.");
        } finally {
            System.out.println("Hello");
        }
    }

    public static void method1() throws FileNotFoundException,ClassCastException {
        FileInputStream fis = new FileInputStream("C2:\badFileName.txt");
    }

    public static void method2() throws FileNotFoundException, ClassNotFoundException {
        method1();
    }

    public static void method3() throws ClassNotFoundException{
        try {
            method1();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException был пойман.");
        } finally {
            System.out.println("hello2");
        }
    }

    public static void method4() {
        try {
            method1();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException был пойман.");
        }
    }
}