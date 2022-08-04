package Math;

public class Test2 {
    public static void main(String[] args) {
        String arg =  "100";

        int value1 = Integer.parseInt(arg);
        System.out.println(value1);

        Integer value2 = Integer.valueOf(arg);
        System.out.println(value2);

        if(value2.equals(value1)){
            String argggg = Integer.toString(value2);
            System.out.println( "строка " + argggg);
        } else {
            String argarg = String.valueOf(value1);
            System.out.println("строка " + argarg);
        }

    }
}