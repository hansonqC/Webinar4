package generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * porwnywanie samochodw
 */
public class ComparableEx {
    public static void main(String[] args) {
        Car c1 = new Car(2132,"Toyota");
        Car c2 = new Car(5345,"BMW");
        Car c3 = new Car(4332,"Subaru");
        List<Car> cars = Arrays.asList(c1,c2,c3);
        Collections.sort(cars);

    }
}
