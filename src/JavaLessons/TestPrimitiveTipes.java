package JavaLessons;

public class TestPrimitiveTipes {
    public static void main(String[] args) {
        int a = 123123;
        long l = a;             //неявное
        int x = (int)l;         //явное
        System.out.println(x);

        double s = 234.54;
        int t = (int) s;
        System.out.println(t);

        // Классы-обертки
        // Byte, Short, Integer, Long, Float, Double, Character, Boolean.
        Integer x2 = 123;
        int y2 = x2;
        Integer.parseInt("123");

    }
}