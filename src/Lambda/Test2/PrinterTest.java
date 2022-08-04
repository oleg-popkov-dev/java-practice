package Lambda.Test2;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = string -> System.out.println(string);
        printer.println("Hello world");
    }
}