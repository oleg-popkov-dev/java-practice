package Lambda.Test4;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Consumer<String> sayable = Test::saySomething;
        //sayable.accept("Hello, this is static method");
        sayable.accept("Hello, this is static method");
    }

    static void saySomething(String s) {
        System.out.println(s);
    }
}