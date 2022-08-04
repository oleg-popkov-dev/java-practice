package JavaLessons;

public class Lesson20 {
    public static void main(String[] args) {

    Men m1 = new Men("Bob",40);
    Men m2 = new Men("Tom",30);
    m1.printNumberOfPeople();
    m2.printNumberOfPeople();
    Men m3 = new Men("Rob",46);
        m1.printNumberOfPeople();
        m2.printNumberOfPeople();
        m3.printNumberOfPeople();

        System.out.println(m1.toString());

        System.out.println(m2.toString());

        System.out.println(m3.toString());


    }
}

class Men {
    private String name;
    private int age;

    private static int countPeople;



    public Men(String name, int age) {
        //System.out.println("третий конструктор!");
        this.name = name;
        this.age = age;
        countPeople++;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public void printNumberOfPeople(){
       System.out.println("Number of people is " + countPeople);
   }

   public String toString() {
        return name + ", " + age;
   }
}