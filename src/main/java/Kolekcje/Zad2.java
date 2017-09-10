package Kolekcje;

import java.util.*;

/**
 * Created by lukasz on 2017-07-22.
 */
public class Zad2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("Podaj liczbe rozdzielone spacja");
        String integers = scan.nextLine();

        String[]arrayOfIntegers = integers.split(" ");
        Set<String> setOfIntegers = new HashSet<>(Arrays.asList(arrayOfIntegers));

        int counter=0;
         for(String arrayOfInteger  : setOfIntegers){
            for(String integer : setOfIntegers){
                if(integer.equals(arrayOfInteger)){
                    counter++;
                }

            }
             System.out.println("Wystapien liczby : "+arrayOfInteger +" : "+counter);
            counter=0;
         }


       /* while(list.size()!=6){
            System.out.println("Podaj liczbe");
            list.add(scan.nextInt());
        }*/


    }
}
