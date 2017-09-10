package generics;

/**
 * Created by lukasz on 2017-08-05.
 */
public interface IBox<T> {
    void add(T t);
    boolean remove(T t);

    //metoda zwraca reprezentacje tekstow� listy
        String toString();

    //doaj metod� kt�ra jako argument przyjmuje obiekt typu T
    //i zwraca liczb� obiekt�w z listy kt�r� s� r�wne (w sesnie equals) temu argumentowi
    int count(T t);
}
