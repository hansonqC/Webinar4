package zadania;

import pl.akademiakodu.Table;

import java.util.Scanner;

/**
 * www.akademiakodu.pl
 Zadania tablice
 Zad1.
 Wprowad� n liczb ca�kowitych do jednowymiarowej tablicy i wyprowad� je na ekran w odwrotnej kolejno�ci.

 Zad2
 ?W tablicy jednowymiarowej przechowuj�c� liczby ca�kowite znale�� liczb� minimaln� ci�gu.

 Zad3
 ?W tablicy jednowymiarowej znajd� liczb�, kt�ra wyst�puje najcz�ciej.
 Zad4.
 Dla danej tablicy liczb ca�kowitych oblicz �redni� arytmetyczn� oraz sum� ci�gu.
 Zad5.
 Dla tablicy liczb ca�kowitych znajd� jednocze�nie minimum i maksimum tablicy.
 Zad6.
 http://main.edu.pl/en/user.phtml?op=showtask&task=scz&con=PAS
 Zad7.
 http://main.edu.pl/en/user.phtml?op=showtask&task=trz&con=PAS
 Zad8.
 http://main.edu.pl/en/user.phtml?op=showtask&task=modu&con=PAS
 Zad9
 ?Dana jest liczba naturalna n z przedzia�u 1 do 100, ci�g n liczb ca�kowitych oraz liczba
 ca�kowita k. Napisz program, kt�ry wyznaczy ilo�� wyst�pie� liczby k w podanym ci�gu liczb.
 Zad10.
 Wprowad� liczby ca�kowite do dwuwymiarowej tablicy liczb o wymiarach n wierszy i m
 kolumn (n i m zadeklarowane jako sta�e w programie) oraz oblicz sum� wyraz�w w tablicy.
 Znajd� minimum i maksimum w wierszach tablicy dwuwymiarowej.
 Zad11.
 ?https://codility.com/programmers/task/cyclic_rotation/
 Zad12.
 ?https://codility.com/programmers/task/odd_occurrences_in_array/
 **-  Dla ch�tnych.

 */
public class Tables {
    public static void main(String[] args) {
        Tables t = new Tables();
        //t.zad1();
        //t.zad2();
       //t.zad3();
       // t.zad4();
        //t.zad5();
        //t.zad6();
        t.zad7();
       // t.zad8();
        //t.zad9();
        //t.zad10();
        //t.zad11();
        //t.zad12();
        //t.zad13();


    }


    void zad1() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj welkosc tablicy");
        int n= scanner.nextInt();
        int[]tab= new int[]{1,2,3,4,5,6,7,8,9};
        for(int i=tab.length-1;i>=0;i--){
            System.out.println(tab[i]);
        }
    }

    void zad2() {
        int[]tab= new int[]{10,25,31,44,1,52,61,7,84,9};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int n:tab){
            if(n<min){
                min=n;
            }else{
                min=min;
            }
        }
        for(int n:tab){
            if(n>max){
                max=n;
            }else{
                max=max;
            }
        }
        System.out.println("Najmniejsza jest liczba "+min);
        System.out.println("Najwieksza jest liczba "+max);
    }

    void zad3() {
        int[]tab= new int[]{10,25,10,31,7,44,10,52,10,7,61,7,84,9,7,10};
        int counter = 0;
        int digit=0;
        for(int i=0;i<tab.length;i++){
            int localCounter = 0;
            for (int j=i;j<tab.length;j++){
                if(tab[i]==tab[j]){
                    localCounter++;
                }
            }
            if(localCounter>counter){
                counter=localCounter;
                digit=tab[i];
            }
        }
        System.out.println("Najczesciej wystepuje liczba "+digit+", "+counter+" razy.");
    }

    void zad4() {
        int[]tab= new int[]{10,25,10,31,7};
        double sum=0;
        double average=0;
        for(int i=0;i<tab.length;i++){
            sum+=tab[i];
        }
        average=sum/tab.length;
        System.out.println("Srednia arytmnetyczna : "+average+", suma ciagu : "+sum);
    }

    void zad5() {

    }

    void zad6() {
        System.out.println("Podaj liczbe n");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[]tab=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Podaj liczbe "+(i+1));
            tab[i]=scan.nextInt();
        }
        int[]tab2=new int[n];
        for(int i=0;i<tab2.length;i++){
            for(int j=i;j<tab.length;j++){
                tab2[i]+=tab[j];
            }
        }
        for(int i=0;i<tab2.length;i++){
            System.out.println(tab2[i]);
        }
    }

    void zad7() {
        int[]tab= new int[]{10,25,31,7,     10,44,52,61,7,84,9,10};
        boolean odp=false;
        for(int i=0;i<tab.length;i++){
            int localCounter=0;
            for(int j=i;j<tab.length;j++){
                if(tab[i]==tab[j]){
                    localCounter++;
                }
            }
            if(localCounter>=3){
                odp=true;
            }


        }
        System.out.println(odp);
    }

    void zad8() {

    }

    void zad9() {

    }

    void zad10() {

    }

    void zad11() {

    }

    void zad12() {

    }

    void zad13() {
        System.out.println("Podaj liczbe n");
        Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       /* int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = (factorial) * i;
        }  */
        System.out.println("n! = " + factorial(n));
    }
//Silnia
    int factorial(int n) {
        int fact=0;
        for(int i=0;i<=n;i++){
            if (n == 0) {
                fact=1;
            }else if(n>0){
                fact=n*factorial(n-1);
            }
        }

        return  fact;
    }
}


