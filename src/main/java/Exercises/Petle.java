package Exercises;

import java.util.*;

/**
 * Created by lukasz on 2017-07-19.
 */
public class Petle {  //http://academytest.herokuapp.com/courses/4/topics/44


    private void zad3() {
        for (int i = 5; i < 51; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

    }

    private void zad5() {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe n");

        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private void zad6() {
        int a;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbe");
             a= scan.nextInt();
            if (a < 600) {
                System.out.println("Za mala");
            } else {
                System.out.println("Za duza");
            }
        }
        while (a != 600);


        System.out.println("Brawo");


    }
public void zad7(){


        int start=1;
        int stop=49;
    Random rand=new Random();
    int result=rand.nextInt(stop-start)+stop;
        int[]lotek=new int[6];

    List wynik=new ArrayList(Arrays.asList(lotek));
    while(wynik.size()<6){

        if(wynik.contains(result)){
            continue;
        }else{
            wynik.add(result);
        }
    }
    System.out.println(4);

}


    public static void main(String[] args) {
        new Petle();
    }

    public Petle() {
        // zad3();
        // zad5();
        //zad6();
        zad7();
    }
}
