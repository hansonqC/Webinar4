package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 2017-08-05.
 */
public class Main {
    public static void main(String[] args) {
      test2();


    }

    public static void vector(){
        Vector3D<Double, Integer, Double> v1 = new Vector3D<>(2.3, 10, 1.2);
        Vector3D<Double, Integer, Double> v2 = new Vector3D<>(2.3, 10, 1.2);
        System.out.println(v1.equals(v2));


        Pair<String, Integer> pg = new Pair<>("Jan", 3);
        System.out.println(pg.getFirst() + " " + pg.getLast());
        String name = pg.getFirst();
        int m = pg.getLast();
        pg.setFirst(name + " Kowalski");
        pg.setLast(m + 1);
        System.out.println(pg.getFirst() + " " + pg.getLast());

    }
    public static void boxTest(){
        IBox<Long> box1 = new Box<>();
        box1.add(2L);
        box1.add(3L);

        box1.add(4L);
        if (box1.remove(3L)) {
            System.out.println("Udao sie usunac 3");
        } else {
            System.out.println("Nie udao sie usun±c 3");
        }
        System.out.println(box1);
    }
    public static void test2(){
        Car c1 = new Car (2132,"Toyota");
        Car c2 = new Car (5345,"BMW");
        Car c3 = new Car (5345,"BMW");


        IBox<Car> box=new Box<>();
        box.add(c1);
        box.add(c2);
        box.add(c3);

        Car c4=new Car(5345,"BMW");

      // Mozna usunac bo wartosc jest identyczna i jest zaimplementowana metoda equals w klasie Car

       // box.remove(c3);
      //  System.out.println(box.toString());
        System.out.println(box.count(c4));


    }


}
