package GetSet.motorbike;

public class Kawasaki extends Motorbike {


    public Kawasaki() {
    }

    public Kawasaki(String name, String model, String color, double volume) {
        super(name, model, color, volume);
    }


    public void jump() {
        System.out.println("Kawasaki jump");
    }
}