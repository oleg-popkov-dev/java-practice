package GetSet;

public class Engine {

    public Engine(){
    }

    public Engine(double volume) {
        this.volume = volume;
    }

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}