package Farm;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lukasz on 2017-07-22.
 */
public class Farm {

    private int cows;
    private int chickens;
    private int pigs;


    public Farm() {

    }
    public Farm(int cows, int chickens, int pigs) {

        this.cows = cows;
        this.chickens = chickens;
        this.pigs = pigs;

    }


    public int getChickens() {
        return chickens;
    }

    public void setChickens(int chickens) {
        this.chickens = chickens;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getPigs() {
        return pigs;
    }

    public void setPigs(int pigs) {
        this.pigs = pigs;
    }





}
