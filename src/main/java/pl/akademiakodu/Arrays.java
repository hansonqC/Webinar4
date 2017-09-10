package pl.akademiakodu;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by lukasz on 2017-07-13.
 */
public class Arrays {
    public static final String PODAJ_WIEL = "Podaj wielkosc ";

    public static void main(String[] args) {
        Arrays arr = new Arrays();
        //arr.zad1();
        //arr.zad2();
        //arr.zad3();
        //arr.zad4();
        //arr.zad5();
        //arr.zad6();
        //arr.zad7();
        arr.zad13();
        //int[] tab = new int[]{3,8,9,7,6};
        //int[] b = arr.zad11(tab, 3);
        //System.out.println(8%3);
        // for (int i = 0; i < b.length; i++) {
        //    System.out.print(b[i] + " ");
        //}
        //int[] tab = new int[]{1,2,3,4,5};
        //int[] b = arr.maxEnd3(tab);

        //int sumL=arr.sumLeft(tab,2);
        //System.out.println(sumL);

    }


    public void zad1() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wielkosc tablicy");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę");
            array[i] = scan.nextInt();
        }
        System.out.println("Otrzymales tablicę: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nNowa tablica: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }

    public void zad2() {
        int[] array = new int[]{55, 4, 88, 99, 6, 6};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("Najmniejszą liczą tablicy jest " + min);
    }

    public void zad3() {
        int[] array = new int[]{7, 8, 5, 8, 9, 6, 8, 66, 8, 4, 5, 5, 66, 5, 8, 7, 5, 8, 9, 22, 44, 1};
        int counter = 0;
        int number = 0;
        int localCounter = 0;
        for (int i = 0; i < array.length; i++) {
            localCounter = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    localCounter++;

                }
            }
            if (localCounter > counter) {
                counter = localCounter;
                number = array[i];
            }


        }
        System.out.println("Najczęsciej wystepuje liczba " + number + ", " + counter + " razy.");


    }

    public void zad4() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        System.out.println("Srednia arytmetyczna wynosi : " + average / array.length + "\nSuma wynosi : " + (int) average);
    }

    public void zad5() {

        int[] array = new int[]{55, 4, 88, 99, 6, 6};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("Najmniejszą liczą tablicy jest " + min + "\nNajwieksza liczba jest " + max);
    }

    public void zad6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe n");
        int n = scan.nextInt();
        int[] array = new int[n];
        String arr = "";
        String newArr = "";
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe");
            array[i] = scan.nextInt();
            arr += array[i] + " ";
        }
        System.out.println("Twoja tablica to : " + arr);
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i; j < newArray.length; j++) {
                newArray[i] += array[j];
            }
            newArr += newArray[i] + " ";
        }
        System.out.println("Twoja nowa tablica to : " + newArr);
    }

    public void zad7() {

        int[] array = new int[]{4, 5, 8, 6, 2, 7, 1, 2, 9, 2};

        int counter = 0;
        int localCounter = 0;
        for (int i = 0; i < array.length; i++) {
            localCounter = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    localCounter++;
                }
                if (localCounter > counter) {
                    counter = localCounter;
                }
            }


        }
        System.out.println(counter);
        if (counter >= 3) {
            System.out.println("TAK");
        }
    }

    public int[] zad11(int[] a, int k) {

        int[] array = new int[a.length];

        for (int i = 0; i < array.length; i++) {
            if ((i + k) < array.length) {
                array[i + k] = a[i];
            } else {
                for (int j = 0; (j + k) <= array.length; j++)
                    array[(i + k - array.length)] = a[i];
            }


        }
        return array;
    }

    public int zad12(int[] a) {
        int[] iterator = new int[a.length];

        int digit = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    iterator[i] = 1;
                    iterator[j] = 1;
                }
            }
            for (int k = 0; k < iterator.length; k++) {
                if (iterator[k] == 0) {
                    digit = a[k];
                }
            }


        }
        return digit;
    }
    public int[] maxEnd3(int[] nums) {
        int max=Integer.MIN_VALUE;
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
                max=nums[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=max;
        }
        return arr;
    }
    public int sumLeft(int[]arr,int i){
int sum=0;
    for(int j=i-1;j>=0;j--){
        sum+=arr[j];
    }



       return sum;

    }
    public void zad13(){

String name="Lukasz";
for(int i=0;i<name.length();i++){
    System.out.println(name.charAt(i));
    i++;
}
StringBuilder bul=new StringBuilder(name);
        System.out.println(bul.reverse());


    }

}

