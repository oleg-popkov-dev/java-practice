package GetSet.car;

public class BMW extends Car {

    public BMW(String name, String model, String color) {
        super(name, model, color);
    }

    public BMW() {
        //System.out.println("BMW");
    }

    @Override
    public void drive() {

        super.signal();
        super.drive();
        System.out.println("BMW drive");
    }
}