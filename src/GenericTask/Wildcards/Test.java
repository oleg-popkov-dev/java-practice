package GenericTask.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String str = "Test!";
        Object obj = str;

        List<String> strings = new ArrayList<>();
        //List<?> objects = strings;
    }
}