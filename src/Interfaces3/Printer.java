package Interfaces3;

public class Printer implements IPrinter {


    public Printer() {
    }

    public Printer(int paintVolume) {
        this.paintVolume = paintVolume;
    }


    private int paintVolume;


    @Override
    public int getPaintVolume() {
        return paintVolume;
    }

    public void setPaintVolume(int paintVolume) {
        this.paintVolume = paintVolume;
    }


    @Override
    public void print(String text) {

        System.out.println("На печать отправлен текст:" + text + ", длина: " + text.length());

        if (text.length() > paintVolume) {
            int count = text.length() - paintVolume;
            System.out.println("Не хватило краски " + count + " (всего краски в принтере " + paintVolume + ")");
            return;
        }

        paintVolume -= text.length();
        System.out.println("Текст распечатан: " + text + ", у принтера осталось краски " + paintVolume);
    }

    @Override
    public void charge(int volume) {
        paintVolume += volume;
        System.out.println("Принтер пополнен на длину текста " + volume + " (всего краски в принтере: " + paintVolume + ")");
    }
}