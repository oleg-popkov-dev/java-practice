package GetSet;

// класс с общим поведением для всех транспортный средств
public class Transport {

    public Transport() {
        //System.out.println("Transport");
    }

    public Transport(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    // свойства/поля
    private String name;
    private String model;
    private String color;
    public final static int year = 2000; // будет иметь 1 значение на все объекты Transport или дочерние


    // get/set для свойств объекта
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // бизнес-методы
    public void drive() {
        System.out.println("Transport drive");
    }
    public void stop() {
        System.out.println("Transport stop");
    }

    public static String formatText(String text) {
        return text + "!!!";
    }

}