package Lombok2;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("MacBook", new Monitor("SamsungMonitor"));

        computer.on();
        computer.off();
    }
}