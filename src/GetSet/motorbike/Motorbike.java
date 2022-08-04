package GetSet.motorbike;


import GetSet.Transport;

public class Motorbike extends Transport {


    public Motorbike(double volume) {
        this.volume = volume;
    }

    public Motorbike(String name, String model, String color, double volume) {
        super(name, model, color);
        this.volume = volume;
    }

    public Motorbike() {
    }


    private double volume;
    public final int wheelCount = 2;


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}