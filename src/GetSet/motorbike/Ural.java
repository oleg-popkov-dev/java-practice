package GetSet.motorbike;

public class Ural extends Motorbike {


    public Ural(double volume, boolean firstAidKit) {
        super(volume);
        this.firstAidKit = firstAidKit;
    }

    public Ural(String name, String model, String color, double volume, boolean firstAidKit) {
        super(name, model, color, volume);
        this.firstAidKit = firstAidKit;
    }

    public Ural(boolean firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public Ural() {
    }


    private boolean firstAidKit;



    public boolean isFirstAidKit() {
        return firstAidKit;
    }

    public void setFirstAidKit(boolean firstAidKit) {
        this.firstAidKit = firstAidKit;
    }



    public void showInfo() {
        System.out.println(getName());
        System.out.println(getVolume());
        System.out.println(isFirstAidKit());
    }
}
