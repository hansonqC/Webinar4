package Kolekcje;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lukasz on 2017-07-22.
 */
public class Kolekcje {
    public static void main(String[] args) {

        Set<String> names=new HashSet<>();  //Set bez powtorzen, bez indeksw
        names.add("Oskar");
        names.add("12121");
        names.add("Oskar");
        for(String name : names){
            System.out.println(name);
        }


        //TreeSet - sortuje liste

        Set<String> names2 = new TreeSet<>();


        names2.add("Oskar");
        names2.add("12121");
        names2.add("Oskar");

        for(String name : names){
            System.out.println(name);
        }

    }
}
