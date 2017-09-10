package Farm;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by lukasz on 2017-07-22.
 */
public class Main {
    public static void main(String[] args) {
        Runnable time = new Time();
        Runnable start = new Start();
        Thread thread1=new Thread(time);
        thread1.setDaemon(true);
        Thread thread2=new Thread(start);
        thread1.start();
        thread2.start();


        //   System.out.println(cow.toString());
        // System.out.println(animal.toString());
    }

}




