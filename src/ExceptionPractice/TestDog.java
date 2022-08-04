package ExceptionPractice;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Мухтар");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение! Ошейник надет? " + dog.isCollarPutOn + "\r\n Поводок надет? "
            + dog.isLeashPutOn + "\r\n Намордник надет? " + dog.isMuzzlePutOn);
        }
    }
}