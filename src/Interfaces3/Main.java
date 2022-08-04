package Interfaces3;

public class Main {

    public static void main(String[] args) {

        IPrinter printer = new Printer(20);
        printer.print("Hello World");
        printer.charge(11);
    }
}