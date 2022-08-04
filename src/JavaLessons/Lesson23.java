package JavaLessons;

public class Lesson23 {
    public static void main(String[] args) {
        /*
        String x ="hello";
        x = x.toUpperCase();
        System.out.println(x);
         */
        /*
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);
         */
        StringBuilder sb = new StringBuilder("Hello");
        //System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());


        System.out.printf("String %10d \n", 532);
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 100000);
        System.out.printf("String %10d \n", 100000000);

        System.out.println();

        System.out.printf("String %.2f \n", 43.32265);
        System.out.printf("String %.2f \n", 43.21);
        System.out.printf("String %.2f \n", 43.154);

    }
}