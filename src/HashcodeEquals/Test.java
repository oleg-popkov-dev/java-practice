package HashcodeEquals;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(26, 2000);
        Person p2 = new Person(27, 2000);

        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}