package JavaLessons;

public class If {
    public static void main(String[] args) {

        int myInt = 15;
        if( myInt < 5) {
            System.out.println("Верно");
        } else if (myInt > 20) {
            System.out.println("Неверно");
        } else {
            System.out.println("ни один из предыдущих случаев...");
        }
    }
}