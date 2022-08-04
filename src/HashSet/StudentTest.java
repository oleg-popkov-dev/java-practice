package HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentTest {

    static Set<Student> set = new HashSet<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите информацию о студенте: ФИО, номер группы, номер студенческого билета");

        while (true) {
            System.out.println("Введите ФИО студента");
            String name = scanner.nextLine();
            System.out.println("Введите номер группы");
            String group = scanner.nextLine();
            System.out.println("Введите номер студенческого билета");
            String studentId = scanner.nextLine();

            Student student = new Student(name, group, studentId);
            set.add(student);

            System.out.println("Для завершения работы программы введите end, либо continue для продолжения");
            String end = scanner.nextLine();
            if (end.equals("end")) {
                break;
            }
        }

        for (Student s : set) {
            System.out.println(s + ", ");
        }

    }

}