package Farm;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

import static java.lang.Thread.*;

/**
 * Created by lukasz on 2017-07-23.
 */
public class Time implements Runnable{
    private String date;
    private int hours;
    private int minuetes;
    private int seconds;
    private Farm farm;

    public Time() {
timeLoop();
    }

    public int getHours() {
        return hours;
    }

    public String getDate() {
        return date;
    }

    public int getMinuetes() {
        return minuetes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void timeLoop() {

        Date now = new Date();
        String dateNow = String.valueOf(now);
        int n = dateNow.indexOf(":");
        String subDate = dateNow.substring(n - 2, n + 6);
        this.hours = Integer.parseInt(subDate.substring(0, 2));
        this.minuetes = Integer.parseInt(subDate.substring(3, 5));
        this.seconds = Integer.parseInt(subDate.substring(6, 8));
        this.date=subDate;


    }
    private void closeBox(JOptionPane mainPane){

        Object[] options = {"ZAMKNIJ PROGRAM",
                "GRAM !"};
        JOptionPane pane=new JOptionPane("ZAMYKANIE PROGRAMU");
        pane.createDialog((JFrame)null, "ZAMYKANIE PROGRAMU");
      //  pane.setLocationRe

        pane.setLocation(50,50);
        pane.setForeground(Color.ORANGE);
        pane.setVisible(true);
        int n = pane.showOptionDialog(null,
                "W kazdej chwli mo¿esz zamknaæ ",
                "ZAMYKANIE PROGRAMU",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        if(n==0){
                System.exit(0);
        }
        final JOptionPane pane2 = new JOptionPane("ZAMYKANIE PROGRAMU");
        final JDialog d = pane2.createDialog((JFrame)null, "ZAMYKANIE PROGRAMU");
        d.setLocationRelativeTo(pane);
        d.setLocation(800,600);
        d.setVisible(true);
    }

    @Override
    public void run() {
        //closeBox();
        while (true) {

            try {
                timeLoop();

                sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
