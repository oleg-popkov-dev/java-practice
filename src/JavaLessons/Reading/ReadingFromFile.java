package JavaLessons.Reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("/home/oleg/Desktop/Test");
        File file2 = new File("tests3");

        Scanner scanner = new Scanner(file2);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}