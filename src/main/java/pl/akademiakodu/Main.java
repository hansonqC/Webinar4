package pl.akademiakodu;

import OOP2.Boss;
import OOP2.Employee;

import javax.swing.*;

public class Main {


// klasa Main jest klas± steruj±c±
    // new uruchamia konstruktor
    public static void main(String[] args) {

        Table oskarsTable = new Table(4,1,5);
        Table ireksTable = new Table(3,20);
/*

        System.out.println(oskarsTable.getLegs());
        System.out.println(oskarsTable.getTableinfo());
        System.out.println(oskarsTable.getLegs());
        oskarsTable.setLegs(6);
        System.out.println(oskarsTable.getLegs());*/

oskarsTable.makeVoice();
        System.out.println(ireksTable.getVolume());
if(oskarsTable.equals(ireksTable)){
    System.out.println("S± takie same");
}
}



}
