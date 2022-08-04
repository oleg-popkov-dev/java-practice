package JavaLessons;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] number = new int[10];
        number[0] = 10;
       String[] strings = new String[3];
       strings[0] = "Hello";
       strings[1] = "Good by";
       strings[2] = "Java";
        System.out.println(strings[0] + " " + strings[2]);

        System.out.println();

        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println();

        for (String string : strings){
            System.out.println(string);
        }

        int[] num = {1,2,3,4,5};
        int sum = 0;
        for( int x : num){
            sum = sum + x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = null;
        System.out.println(s);
    }
}