package JavaLessons.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main.");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("tests4");
        Scanner scanner = new Scanner(file);
    }
}