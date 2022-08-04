package JavaLessons.Enum;


public class Test {
    public static void main(String[] args) {
//        Animal animal = Animal.FROG;
//        System.out.println(animal.toString());
//        switch (animal){
//            case CAT:
//                System.out.println("It's a cat");
//                break;
//            case DOG:
//                System.out.println("It's a dog");
//                break;
//        }

        //Object -> Enum -> Season

//        Season season = Season.WINTER;
//        System.out.println(season.getTemperature());
//        System.out.println(season.getClass());

//        switch (season){
//            case WINTER:
//                System.out.println("It's cold outside");
//                break;
//            case SUMMER:
//                System.out.println("It's warm outside");
//                break;
//        }
        Season season = Season.AUTUMN;
        System.out.println(season.name());

        Animal animal = Animal.FROG;
        System.out.println(animal.name());

        Animal frog = animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Season spring = Season.SPRING;
        System.out.println(spring.ordinal());

    }
}