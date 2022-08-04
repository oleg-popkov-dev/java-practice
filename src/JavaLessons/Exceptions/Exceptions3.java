package JavaLessons.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        //Checked Exception(Compile time exception) = исключительные случаи в работе программы
        //Unchecked Exception(Runtime exception) = ошибка в работе программы

        /*File file = new File("tests3");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("дадим знать пользователю");
        }
         */
        //int a = 1 / 0;

        //String name = null;
        //name.length();

        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}