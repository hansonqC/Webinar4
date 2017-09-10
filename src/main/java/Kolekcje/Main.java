package Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lukasz on 2017-07-22.
 */
public class Main {

    private static List<String> listOfNames;
    private static Scanner scan;
    public static void main(String[] args) {//metoda statyczna ma tylko jedn± instancje

        //Listy

        listOfNames=new ArrayList<>();
        scan =new Scanner(System.in);

        int choice;

        do{
            printMenu();
            choice=Integer.parseInt(scan.nextLine());
            parseChoice(choice);

        }while(choice!=3);

    }
    private static void printMenu(){
        System.out.println("Wpisz :");
        System.out.println("1 - aby dodac nowe imie");
        System.out.println("2 - aby wyswietlic wszystkie imiona :");
        System.out.println("3 - aby wyjsc");

        System.out.print("Twoj wybor : ");
    }
    private static void parseChoice(int choice){
        switch (choice){
            case 1: {
                System.out.print("Wpisz imie :");
                listOfNames.add(scan.nextLine());
                System.out.println("Dodales imie");
                break;
            }
            case 2 : {
                for(String listOfName : listOfNames){
                    System.out.println(listOfName);

                }
                break;
            }
            default : {
                System.out.println("Nie znam takiej komendy");
                break;
            }


        }
    }
}
