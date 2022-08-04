package GenericTask.Task2;

public class Test {
    public static void main(String[] args) {
        Box<String, String> sample1 = new Box<>("Runtime", "Java");
        System.out.println(sample1);
        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);
    }
}