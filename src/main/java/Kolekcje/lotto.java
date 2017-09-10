package Kolekcje;

import java.util.*;

/**
 * Created by lukasz on 2017-07-22.
 */
public class lotto {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>();


        Random radom = new Random();
        while(integerSet.size()!=6){
            integerSet.add(radom.nextInt(48)+1);
        }
        System.out.println("Twoje wylosowane liczby to : ");
        for(Integer integer:integerSet){
            System.out.println("Liczba : "+integer);
        }


    }

}
