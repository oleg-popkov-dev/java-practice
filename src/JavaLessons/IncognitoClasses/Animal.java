package JavaLessons.IncognitoClasses;

interface AbleToEat {
    public void eat();
}

class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {             ////создали анонимный класс реализующий интерфейс,
            @Override                                       ////вместо обычного объекта.
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat.eat();
    }
}