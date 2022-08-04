package Switch;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String message;
        while (true) {
            System.out.println("""
                    Выберите действие:\s
                    1. Добавить задачу\s
                    2. Вывести список задач
                    3. Удалить задачу
                    0. Выход""");
             message = scanner.nextLine();

            switch (Integer.parseInt(message)) {
                case 1 -> {
                    System.out.println("Введите задачу для планирования");
                    String task = scanner.nextLine();
                    list.add(task);
                }
                case 2 -> {
                    System.out.println("Список задач:");
                    int count = 1;
                    for (String lists : list) {
                        System.out.println(count + ". " + lists);
                        count++;
                    }
                }
                case 3 -> {
                    System.out.println("Под каким номером вы хотите удалить элемент");
                    String test = scanner.nextLine();
                    System.out.println(list.remove(Integer.parseInt(test)));
                    System.out.println(list);
                }
            }
            if(message.equals("0")) {
                System.out.println("Good bye");
                break;
            }
        }
    }
}