package GetSet;

import com.car.BMW;
import com.car.Car;
import com.car.Toyota;
import com.motorbike.Kawasaki;
import com.motorbike.Ural;

public class Main {

    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        System.out.println(toyota.year);

        Car car = new Car();
        System.out.println(car.year);

    }
}
