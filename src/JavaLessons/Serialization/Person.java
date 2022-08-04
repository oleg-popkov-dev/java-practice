package JavaLessons.Serialization;

import java.io.Serializable;

public class Person implements Serializable {


    private static final long serialVersionUID = 871172722344782684L;
    private String model;
    private double id;
    private int ageOfModel;

    public Person(String model, double id) {
        this.id = id;
        this.model = model;
    }

    public String getName() {
        return model;
    }

    public double getId() {
        return id;
    }

    public String toString() {
        return model + " " + id;
    }
}