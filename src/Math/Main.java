package Math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalTime = 0;
        int biggestTime = 0;
        int smallestTime = Integer.MAX_VALUE;

        while (true){
            System.out.println("Введите название задачи");
            String name = scanner.nextLine();
            System.out.println("Сколько дней вам потребуется на выполнение?");
            int days = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько часов?");
            int hours = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько минут?");
            int minutes = Integer.parseInt(scanner.nextLine());

            int currentTimeTask = convertToSeconds(days, hours, minutes);
            totalTime += currentTimeTask;
            if(currentTimeTask > biggestTime){
                biggestTime = currentTimeTask;
            }
            if (currentTimeTask < smallestTime){
                smallestTime = currentTimeTask;
            }

            System.out.println("Для завершения работы введите *end*, для продолжения нажмите *enter*");
            String input = scanner.nextLine();
            if("end".equals(input)){
                break;
            }
        }
        System.out.println("Всего потребуется: " + totalTime + " секунд");
        System.out.println("Самая продолжительная задача займет: " + biggestTime + " секунд");
        System.out.println("Самая короткая задача займет: " + smallestTime + " секунд");

    }

    public static int convertToSeconds(int days, int hours, int minutes){
        return (days * 24) * 3600 + (hours * 3600) + (minutes * 60);
    }
}