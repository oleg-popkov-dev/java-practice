package Lambda.Test4;

import java.util.function.Consumer;

public class Test2 {

    public static void main(String[] args) {
        Test2 test = new Test2();
        Consumer<String> sayable = str -> test.saySomething(str);
        sayable.accept("Hello, this is non-static method");
    }

    private void saySomething(String s) {
        System.out.println(s);
    }
}