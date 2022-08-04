package JavaLessons;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = scanner.nextLine();
        switch (age){
            case "null" :
                System.out.println("ты родился");
                break;
            case "seven" :
                System.out.println("ты пошел в школу");
                break;
            case "eighteen" :
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("ни одно из предыдущих условий не подошло");

        }
    }
}