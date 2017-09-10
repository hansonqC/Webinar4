package Farm;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by lukasz on 2017-07-27.
 */
public class Start implements Runnable {
    public Start() {

    }

    private void starter() {
      //  try {



            String name = JOptionPane.showInputDialog(null, "Jak masz na imie ? :", "FARMA", JOptionPane.INFORMATION_MESSAGE);
            String surname = JOptionPane.showInputDialog(null, "Jak sie nazywasz ? :", "FARMA", JOptionPane.INFORMATION_MESSAGE);
            String village = JOptionPane.showInputDialog(null, "Prawie bym zapomnial, jak ma sie nazywac Twoja wies ?", "FARMA", JOptionPane.INFORMATION_MESSAGE);
            Farmer farmer=new Farmer(name,surname,village);


            int cows = Integer.parseInt(JOptionPane.showInputDialog(null, "OK, wiec ile chcesz miec krow ?","FARMA", JOptionPane.INFORMATION_MESSAGE));
            int chickens = Integer.parseInt(JOptionPane.showInputDialog(null, "A ile kur ?", "FARMA", JOptionPane.INFORMATION_MESSAGE));
            int pigs = Integer.parseInt(JOptionPane.showInputDialog(null, "I jeszcze swinki ?", "FARMA", JOptionPane.INFORMATION_MESSAGE));
            Farm farm =new Farm(cows,chickens,pigs);
            new Game(farm,farmer);


      //  } catch (Exception ex) {
      //      JOptionPane.showMessageDialog(null, "UPS, cos poszlo nie tak !!!\n" + ex.getMessage(), "FARMA", JOptionPane.ERROR_MESSAGE);
        //   System.exit(0);

       // }

    }

    @Override
    public void run() {

        starter();


    }
}
