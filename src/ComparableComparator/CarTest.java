package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car bmw = new Car("e34", 310, 1990);
        Car mercedes = new Car("S63", 290, 2020);
        Car audi = new Car("Q5", 350, 2010);

        cars.add(bmw);
        cars.add(mercedes);
        cars.add(audi);

        //Collections.sort(cars);
        Comparator<Car> speedComparator = new MaxSpeedCarComparator();
        cars.sort(speedComparator);

        System.out.println(cars);
    }
}