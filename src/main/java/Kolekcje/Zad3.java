package Kolekcje;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by lukasz on 2017-07-22.
 */
public class Zad3 {

  /*  private static HashMap <String, String>dictionary;
    public static void main(String[] args) {
        dictionary.put("mama","mother");
        dictionary.put("tata","father");
        dictionary.put("syn","son");


        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj slowo");
        String word=scan.nextLine();
        if(dictionary.containsKey(word)){
            System.out.println(dictionary.get(word));
        }
    }*/
  public static void main(String[] args) {
new Zad3();
  }
  private Map<String, String> words;
  private Scanner scan;

    public Zad3() {
        words = new HashMap<>();
        scan=new Scanner(System.in);
        init();
        readDataFromConsole();
    }

    private void init(){
        words.put("mama","mother");
        words.put("tata","father");
        words.put("kuzyn","cousin");

    }
    private void readDataFromConsole(){

        String response = JOptionPane.showInputDialog("Podaj slowo");//scan.nextLine();
        while(!response.equals("exit")){
            if(words.containsKey(response)){

               JOptionPane.showMessageDialog(null,"Tlumaczenie: "+ words.get(response));
            }else{
                JOptionPane.showMessageDialog(null,"Nie znam takiego slowa");
            }
            response=JOptionPane.showInputDialog("Podaj slowo");

        }
    }
}



