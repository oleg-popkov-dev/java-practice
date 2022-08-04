package JavaLessons;

public class ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setNameAndAge("John", 50);
        //person1.setNameAndAge(); = 50;
        //System.out.println("Меня зовут " + person1.name + "," + " " + "мне " + person1.age + " лет.");
        person1.sayHello();
        person1.speak();
        //int year1 = person1.calculateYearsToRetirement();


        //Person person2 = new Person();
        //person2.name = "Dean";
        //person2.age = 30;
        //System.out.println("Меня зовут " + person2.name + "," + " " + "мне " + person2.age + " лет.");
        //person2.sayHello();
        //person2.speak();
        //int year2 = person2.calculateYearsToRetirement();


        Person person3 = new Person();
        person3.setName("Sam");
        person3.setAge(26);
        System.out.println("Выводим значение в методе main " + person3.getName());
        System.out.println("Выводим значение в методе main " + person3.getAge());
        //System.out.println("Меня зовут " + person3.name + "," + " " + "мне " + person3.age + " лет.");
        //person3.sayHello();
        person3.speak();
        //int year3 = person3.calculateYearsToRetirement();

    }}

class Person {
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)
   private String name;
   private int age;

   public void setName(String userName) {
      if (userName.isEmpty()){
          System.out.println("Ты ввел пустое имя");
      } else {
       name = userName;}
   }
   public String getName() {
       return name;
   }

   public void setAge(int userAge) {
       if (userAge < 0) {
           System.out.println("Возраст должен быть положительным");
       } else {
       age = userAge;}
   }
   public int getAge() {
       return age;
   }

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement() {
        int years = 65-age;
        return years;
    }

    void speak() {
        //for( int i = 0; i < 3; i ++ ){
            System.out.println("Меня зовут " + name +", мне " + age + " лет.");
        //}
    }
    void sayHello() {
        System.out.println("Hello!");
    }
}