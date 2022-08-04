package JavaLessons;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Введи 100");
             value = scanner.nextInt();
        } while (value != 100);

        System.out.println("Вы ввели 100");

    }
}