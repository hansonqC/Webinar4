package Farm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 2017-07-22.
 */
public  class Pig extends Animal{
    private boolean isReadyForSold;
    public static List<Pig> listOfPigs;

    public Pig( String animalType, int age, boolean isVaccinate, char sex, double weight, boolean isFeeded,boolean isReadyForSold) {
        super("swinia", age, isVaccinate, sex, weight,isFeeded);
        this.isReadyForSold = isReadyForSold;
    }

    public Pig(int amount) {
        init(amount);
    }

    public boolean isReadyForSold() {
        return isReadyForSold;
    }

    public void setReadyForSold(boolean readyForSold) {
        isReadyForSold = readyForSold;
    }




    @Override
    public void feeding(){
        for(Animal animal : listOfAnimals){
            if((animal.animalType=="pig")||(animal.getIsFeeded()==false)){
                animal.setFeeded(true,"pig");
            }
        }

    }
    @Override
    public void vaccinate(){

        for(Animal animal : listOfAnimals){
            if((animal.animalType=="pig")||(animal.getIsVaccinate()==false)){
                animal.setVaccinate(true);
            }
        }


    }
    @Override
    public void init(int amount){
        listOfPigs=new ArrayList<Pig>();
        while(listOfPigs.size()!=amount)
        listOfPigs.add(new Pig( animalType, 258, true, 'f', 92,true,true));
        listOfPigs.add(new Pig( animalType, 267, true, 'f', 110,true, true));
        listOfPigs.add(new Pig( animalType, 320, true, 'f', 120,true, true));
        listOfPigs.add(new Pig( animalType, 389, true, 'f', 135,true, true));
        listOfPigs.add(new Pig( animalType, 400, false, 'm', 140,true, true));
        listOfPigs.add(new Pig( animalType, 13, false, 'f', 11,true, false));
        listOfPigs.add(new Pig( animalType, 13, false, 'm', 10,true, false));
        listOfPigs.add(new Pig( animalType, 13, false, 'f', 13, true,false));
        listOfPigs.add(new Pig( animalType, 221, true, 'f', 96,true, false));
        listOfPigs.add(new Pig( animalType, 324, true, 'm', 132,true, false));
        listOfPigs.add(new Pig( animalType, 189, true, 'f', 99,true, false));
    }
}
