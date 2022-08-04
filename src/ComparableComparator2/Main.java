package ComparableComparator2;

import java.util.*;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        List<MilitaryPerson> unit = Arrays.asList(
                new MilitaryPerson("Иван", 18, Rank.РЯДОВОЙ),
                new MilitaryPerson("Саша", 22, Rank.СЕРЖАНТ),
                new MilitaryPerson("Макс", 25, Rank.СТАРШИНА),
                new MilitaryPerson("Вова", 33, Rank.МАЙОР),
                new MilitaryPerson("Петя", 50, Rank.ГЕНЕРАЛ));

        Scanner scanner = new Scanner(System.in);
        String message;

        while (true) {
            out.println("""
                    выберите какая сортировка подойдет:\s
                    1. по имени\s
                    2. по рангу
                    3. по возрасту
                    0. выйти""");
            message = scanner.nextLine();

            switch (Integer.parseInt(message)) {
                case 1 -> {
                    Comparator<MilitaryPerson> nameFilter = new NameFilter();
                    unit.sort(nameFilter);
                    out.println(unit);
                    out.println("Вы отсортировали список по именам");
                }
                case 2 -> {
                    Comparator<MilitaryPerson> rankFilter = new RankFilter();
                    unit.sort(rankFilter);
                    out.println(unit);
                    out.println("Вы отсортировали список по рангу");
                }
                case 3 -> {
                    Collections.sort(unit);
                    out.println(unit);
                    out.println("Вы отсортировали список по возрасту");
                }
            }
            if (message.equals("0")) {
                out.println("Good bye");
                break;
            }
        }
    }
}