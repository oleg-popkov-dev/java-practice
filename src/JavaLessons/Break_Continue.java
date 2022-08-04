package JavaLessons;

public class Break_Continue {
    public static void main(String[] args) {
        for (int a = 0; a <= 9; a++) {
            if ( a % 2 ==0) {
                continue;
            }
            System.out.println("Это нечетное число " + a);
        }
    }
}