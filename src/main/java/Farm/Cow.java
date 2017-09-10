package Farm;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 2017-07-22.
 * /**
 * Created by lukasz on 2017-07-22.
 */
public class Cow extends Animal {
    private boolean isToMilk;
    private boolean isPregnant;
    public static List<Cow> listOfCows;


    public Cow(String animalType, int age, boolean isVaccinate, char sex, double weight, boolean isFeeded, boolean isToMilk, boolean isPregnant) {
        super("krowa", age, isVaccinate, sex, weight, isFeeded);
        this.isToMilk = isToMilk;
        this.isPregnant = isPregnant;
    }

    public Cow(int amount) {
        this.init(amount);
    }

    //SETTERY I GETTERY
    public boolean getIsToMilk() {
        return isToMilk;
    }

    public void setToMilk(boolean toMilk) {
        isToMilk = toMilk;
    }

    public boolean getIsPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }


    @Override
    public void feeding() {
        for (Animal animal : listOfAnimals) {
            if ((animal.animalType == "cow") || (animal.getIsFeeded() == false)) {
                animal.setFeeded(true,"cow");
            }
        }

    }

    @Override
    public void vaccinate() {

        for (Animal animal : listOfAnimals) {
            if ((animal.animalType == "cow") || (animal.getIsVaccinate() == false)) {
                animal.setVaccinate(true);
            }
        }

    }
    public void setVaccinate() {

    }

    @Override
    public void init(int amount) {
        listOfCows=new ArrayList<Cow>();
        while (listOfCows.size() != amount)
            listOfCows.add(new Cow(animalType, 850, true, 'f', 520, true, true, true));
       listOfCows.add(new Cow(animalType, 900, false, 'f', 590, true, true, false));
        listOfCows.add(new Cow(animalType, 400, true, 'f', 481, true, true, false));
        listOfCows.add(new Cow(animalType, 24, false, 'f', 63, true, true, false));
        listOfCows.add(new Cow(animalType, 15, false, 'm', 52, true, false, false));
        listOfCows.add(new Cow(animalType, 625, false, 'm', 612, true, false, false));
        listOfCows.add(new Cow(animalType, 418, false, 'f', 495, true, false, false));

        //  Animal chicken = new Chicken();
        //Animal pig = new Pig();


    }
}
