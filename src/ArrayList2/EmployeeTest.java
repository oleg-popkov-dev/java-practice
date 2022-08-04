package ArrayList2;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        while (true) {
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел)");
            System.out.println("Введите фамилию сотрудника");
            String surname = scanner.next();
            System.out.println("Введите имя сотрудника");
            String name = scanner.next();
            System.out.println("Введите возраст сотрудника");
            int age = scanner.nextInt();
            System.out.println("Введите гендер сотрудника");
            String genger = scanner.next();
            System.out.println("Введите образование сотрудника");
            String education = scanner.next();
            System.out.println("Введите должность сотрудника");
            String position = scanner.next();
            System.out.println("Введите отдел сотрудника");
            String department = scanner.next();

            Employee emp = new Employee(surname, name, age, genger, education, position, department);
            list.add(emp);

            System.out.println("Если хотите закончить ввод данных, введите end");
            String input = scanner.next();

            if (input.equals("end")) {
                break;
            }

        }

        while (true) {
            System.out.println("Введите фамилию и имя работника для которого хотите изменить данные. " +
                    "либо введите \"end\"");
            String surname = scanner.next();
            if ("end".equals(surname)) {
                break;
            }
            String name = scanner.next();

            int empIndex = searchBySurname(surname, name, list);
            if (empIndex != -1) {
                while(true) {
                    System.out.print("""
                            Выберите что хотите изменить.
                            1. Фамилия
                            2. Имя
                            3. Возраст
                            4. Гендер
                            5. Образование
                            6. Должность
                            7. Отдел
                            0. Выйти
                            """);
                    int option = scanner.nextInt();
                    if (option == 0) {
                        break;
                    }
                    switch (option) {
                        case 1: {
                            System.out.println("Введите новую фамилию: ");
                            String nSurname = scanner.next();
                            list.get(empIndex).setSurname(nSurname);
                        }

                        case 2: {
                            System.out.println("Введите новое имя: ");
                            String nName = scanner.next();
                            list.get(empIndex).setName(nName);
                        }

                        case 3: {
                            System.out.println("Введите новый возраст: ");
                            int nAge = scanner.nextInt();
                            list.get(empIndex).setAge(nAge);
                        }

                        case 4: {
                            System.out.println("Введите новый гендер: ");
                            String nGender = scanner.next();
                            list.get(empIndex).setGender(nGender);
                        }

                        case 5: {
                            System.out.println("Введите новое образование: ");
                            String nEducation = scanner.next();
                            list.get(empIndex).setEducation(nEducation);
                        }

                        case 6: {
                            System.out.println("Введите новую должность: ");
                            String nPosition = scanner.next();
                            list.get(empIndex).setPosition(nPosition);
                        }

                        case 7: {
                            System.out.println("Введите новый отдел: ");
                            String nDepartment = scanner.next();
                            list.get(empIndex).setDepartment(nDepartment);
                        }
                    }
                }
            }
        }
        System.out.format("""
                Список сотрудников:\s
                %-18s%-15s%-15s%-15s%-15s%-15s%-15s""",
                "Фамилия","Имя","Возраст","Пол","Образование","Должность","Отдел");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i).toString());
        }

    }
    public static int searchBySurname(String surname, String name, List<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            String dataSurname = list.get(i).getSurname();
            String dataName = list.get(i).getName();
            if (dataSurname.equals(surname) && dataName.equals(name)) {
                return i;
            }
        }
        return -1;
    }
}