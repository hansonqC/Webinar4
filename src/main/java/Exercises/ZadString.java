package Exercises;

import java.util.Scanner;

/**
 * Created by lukasz on 2017-07-19.
 */
public class ZadString {

    private void zad1(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Wpisz dowolny wyraz");
        String word=scan.nextLine();
        System.out.println("D³ugo¶æ wyrazu to "+word.length());

    }
    private void zad2(){
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Podaj dowolny wyraz");
        String word=scan.nextLine();
        System.out.println("Podaj liczbe n");

        n=scan.nextInt();
        if(n<word.length())
        System.out.println(word.substring(word.length()-n));
        else{
            System.out.println("Liczba jest wieksza od ilosci liter w podanym wyrazie");
        }



    }

    private void zad3(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word=scan.nextLine();
        boolean isBig=false;
        if((word.charAt(word.length()-1)=='M')||word.charAt(word.length()-1)=='m'){
            isBig=true;
        }else isBig=false;
        System.out.println(isBig);
    }

    private void zad4(){

            Scanner scan=new Scanner(System.in);
            System.out.println("Podaj wyraz");
            String word=scan.nextLine();
            String odp=Character.isDigit(word.charAt(0))?"Pierwszy znak jest cyfr±":"Pierwszy znak nie jest cyfr±";
        System.out.println(odp);
            }

private void zad5(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Podaj wyraz");
    String word=scan.nextLine();
    if(word.charAt(0)==word.charAt(word.length()-1)){
        System.out.println("Piersza i ostatnia litera s± identyczne");
    }

}


private void zad8(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Podaj 1 wyraz");
    String word1=scan.nextLine();
    System.out.println("Podaj 2 wyraz");
    String word2=scan.nextLine();
    if(word1.equals(word2)){
        System.out.println("Wyrazy s± takie same");

    }

}


    public static void main(String[] args) {
        new ZadString();
    }

    public ZadString() {


        //zad1();
        //ad2();
       // zad3();
        //zad4();
        zad5();
        //zad6();
        //zad7();
        //zad8();







    }
}
