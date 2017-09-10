package Farm;

import java.util.ArrayList;

/**
 * Created by lukasz on 2017-07-27.
 */
public class Game {

    private Farm farm;
    private Farmer farmer;

    public Game(Farm farm, Farmer farmer) {

        this.farm = farm;
        this.farmer = farmer;
        Animal cow=new Cow(farm.getCows());
        Animal chicken= new Chicken(farm.getChickens());
        Animal pig = new Pig(farm.getPigs());
       // cow.se
      //  Animal.listOfAnimals=new ArrayList<Animal>().addAll()
    }


}
