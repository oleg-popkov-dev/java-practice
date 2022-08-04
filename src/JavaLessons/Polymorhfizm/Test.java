package JavaLessons.Polymorhfizm;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        //Upcasting - восходящее преобразование
        Animal animal = dog;


        //Downcasting - нисходящее преобразование
        Dog dog2 = (Dog) animal;


       // Animal a = new Animal();
        //Dog d = (Dog) a;
    }
}