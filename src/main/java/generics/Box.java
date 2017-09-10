package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lukasz on 2017-08-05.
 */
public class Box<T> implements IBox<T> {


    private List<T> list;

    public Box() {
        list = new LinkedList<>();
    }

    @Override   //pilnuje czy s± zaimplementowane wszystkie metody interfejsu
    public void add(T t) {
        list.add(t);

    }

    @Override
    public boolean remove(T t) {
        return list.remove(t);
    }

    // nie musze implementowac toString bo jest w jklasie Object, zostaje dodana domyslna implementacja
    @Override
    public String toString() {
        return list.toString();
    }


    //doaj metodê która jako argument przyjmuje obiekt typu T
    //i zwraca liczbê obiektów z listy którê s± równe (w sesnie equals) temu argumentowi
    //int count(T t);
    @Override
    public int count(T t) {   // w pprzypadku wasnej klasy obiekty beda porwnywane za pomoca domyslnego equals z klasy Object
        // beda porownywane adresy a nie wartosci dlatego trzeba zaimplementowac walasna metode equals
        int counter = 0;
        for (T t1 : list) {
            if (t.equals(t1)) {
                counter++;
            }
        }
        return counter;
    }

    ;


};
