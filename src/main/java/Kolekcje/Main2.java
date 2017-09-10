package Kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lukasz on 2017-07-22.
 */
public class Main2 {
    public static void main(String[] args) {
    List<String> listOfNames = new ArrayList<>(); // od javy 1.7 nie trzeba dodawac drugi raz typu generycznego
    listOfNames.add("Oskar");
    listOfNames.add("Wojtek");

    if(listOfNames.contains("oskar")){
        System.out.println("Istnieje !");

    }else{
        System.out.println("Nie !");
    }

        listOfNames.remove(1);//zwraca boolean zeby byo wiadomo czy operacja sie udala
        listOfNames.get(1);

        Iterator<String> iterator= listOfNames.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

            //LinkedList jest szybsza przy dodawaniu i usuwaniu wyniku
            //ArrayList jest szybsza przy dodawaniu i ODBIERANIU wyniku


}
