package pl.akademiakodu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by lukasz on 2017-07-11.
 */
public class Exercises {

    public static void main(String[] args) {

        Exercises ex = new Exercises();
        //ex.zad1(); //powtorka
        //ex.zad3();
        ex.zad4();
        // ex.zad5();
        //ex.zad6();
        //ex.zad7();
        //ex.zad8();


    }


    public int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        return sum;
    }

    public int[] reverse3(int[] nums) {
        int[] rev = new int[nums.length];
        int iterator = rev.length - 1;
        for (int i = 0; i < rev.length; i++) {
            rev[i] = nums[iterator];
            iterator--;

        }
        return rev;
    }

    public int[] maxEnd3(int[] nums) {
        int[] array = new int[nums.length];
        int max = Math.max(nums[0], nums[2]);
        array[0] = max;
        array[1] = max;
        array[2] = max;
        return array;
    }

    public int[] intSumLeft(int[] nums) {
        int[] array = new int[nums.length];
        int max = Math.max(nums[0], nums[2]);
        array[0] = max;
        array[1] = max;
        array[2] = max;
        return array;
    }

    //ZADANIA POWTÓRKOWE DZIEN 2

    public void zad1() {  //LOTTEK
        Random rand = new Random();
        int start = 1;
        int stop = 49;

        ArrayList list = new ArrayList();

        while (!(list.size() == 6)) {
            int number = rand.nextInt(stop - start) + start;
            if (list.contains(number)) {
                continue;
            } else {
                list.add(number);
            }

        }

        int[] liczby = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public void zad3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz wyraz");
        String word = scan.nextLine();
        boolean answear = false;

        if (((int) word.charAt(0) > 64) && ((int) word.charAt(0) < 91)) {
            answear = true;
        } else {
            answear = false;
        }
        System.out.println(answear);
    }
    public void zad4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz wyraz");
        String word = scan.nextLine();
        String newWord="";
        for(int i=0;i<word.length();i++){
            if(i%2==0){
                newWord+=word.charAt(i);
            }
        }
        System.out.println("Nowy wyraz to: "+newWord);
    }
    public void zad5() {

        System.out.println("\"Mowa jest srebrem, a milczenie jest zlotem\"");
    }

    public void zad6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scan.nextLine();
        boolean pal = false;
        int iterator = word.length() - 1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(iterator)) {

                pal = true;
            } else {
                pal = false;
            }
            iterator--;
        }
        System.out.println(pal);
    }

    public void zad7(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word=scan.nextLine();
        int counter=0;
        String digits="";
        for(int i=0;i<word.length();i++){
            if(((int)word.charAt(i)>47)&& ((int)word.charAt(i)<58)){
                counter++;
                digits+=word.charAt(i)+" ";
            }

        }
        System.out.println("W wyrazie wystepuje "+counter+" cyfr.\nOto one : "+digits);
    }





    public void zad8() { //Pole kola

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj promien kola");
        int r = scan.nextInt();
        System.out.println("Pole kola to :" + Math.PI * (r * r));

    }
} //ZADANIA POWTÓRKOWE DZIEN 2