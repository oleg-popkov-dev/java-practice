package ComparableComparator;

public class Car implements Comparable<Car> {

    private String model;
    private int maxSpeed;
    private int manufactureYear;

    public Car(String model, int maxSpeed, int manufactureYear) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.manufactureYear = manufactureYear;
    }

    @Override
    public int compareTo(Car obj) {
        return this.getManufactureYear() - obj.getManufactureYear();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
}