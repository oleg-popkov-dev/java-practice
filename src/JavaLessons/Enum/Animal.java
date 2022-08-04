package JavaLessons.Enum;

public enum Animal {
    DOG("Собака"), CAT("Кошка"), FROG("Лягушка");

    private String translation;

    private Animal(){

    }

    private Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation(){
        return translation;
    }

    public String toString(){
        return "Перевод на русский язык " + translation;
    }
}