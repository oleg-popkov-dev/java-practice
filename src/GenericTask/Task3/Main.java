package GenericTask.Task3;

public class Main {
    public static void main(String[] args) {
        Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
        fruitBox.getObj().printClass();

        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getObj().printClass();

        Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getObj().printClass();

        Box2<String, Cabbage> vegetableBox = new Box2<>("cabbage", new Cabbage());
        vegetableBox.getObj().printClass();
    }
}