package Lambda.Test4;

import java.util.function.Consumer;

public class Test3 {
    public Test3(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        Consumer<String> sayable = str -> new Test3(str);
        sayable.accept("Hello, this is Test class");
    }
}