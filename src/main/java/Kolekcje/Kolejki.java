package Kolekcje;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by lukasz on 2017-07-22.
 */
public class Kolejki {  //FIFO - first in
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("Oskar");
        queue.add("Czesc");
        queue.add("AkademiaKodu");

        queue.remove(); //zwroci wyjtek gdy lista pusta - usunie piersza z listy

        //offer to add tylko add zwraca wyjatek gdy kolejka pelna
        //remove to poll tylko  remove zwraca wyjatek gdy juz nie ma nic naliscie
        // element to to samo co peek tylko zwraca wyjatek gdy nie ma nastepnego elementu

        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
    }
}
