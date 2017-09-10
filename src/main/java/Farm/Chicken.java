package Farm;

import java.util.ArrayList;
import java.util.List;

/**
 import java.util.ArrayList;
 import java.util.List;

 /**
 * Created by lukasz on 2017-07-22.
 */
public class Chicken extends Animal {
    private boolean isLayingEggs;

    public static List<Chicken> listOfChickens;

    public Chicken( String animalType, int age, boolean isVaccinate, char sex, double weight,boolean isFeeded, boolean isLayingEggs) {
        super("kura", age, isVaccinate, sex, weight,isFeeded);
        this.isLayingEggs = isLayingEggs;
    }

    public Chicken(int amount) {
init(amount);
    }

    public boolean isLayinEggs() {
        return isLayingEggs;
    }

    public void setLayinEggs(boolean layinEggs) {
        isLayingEggs = layinEggs;
    }

    private void getEggs(){

    };


    @Override
    public void feeding(){
        for(Animal animal : listOfAnimals){
            if((animal.animalType=="chicken")||(animal.getIsFeeded()==false)){
                animal.setFeeded(true,"chicken");
            }
        }

    }
    @Override
    public void vaccinate(){

        for(Animal animal : listOfAnimals){
            if((animal.animalType=="chicken")||(animal.getIsVaccinate()==false)){
                animal.setVaccinate(true);
            }
        }


    }
    @Override
    public void init(int amount){
listOfChickens =new ArrayList<Chicken>();
        while(listOfChickens.size()!=amount)
        listOfChickens.add(new Chicken(animalType,120,true,'f',1,true,true));
       listOfChickens.add(new Chicken(animalType,110,true,'f',1,true,true));
        listOfChickens.add(new Chicken(animalType,400,true,'f',0.8,true,true));
        listOfChickens.add(new Chicken(animalType,256,true,'f',2.1,true,true));
        listOfChickens.add(new Chicken(animalType,10,false,'m',0.2,true,false));
        listOfChickens.add(new Chicken(animalType,10,false,'f',0.27,true,false));
        listOfChickens.add(new Chicken(animalType,10,false,'m',0.28,true,false));
        listOfChickens.add(new Chicken(animalType,10,false,'f',0.25,true,false));
        listOfChickens.add(new Chicken(animalType,10,false,'f',0.22,true,false));
        listOfChickens.add(new Chicken(animalType,320,true,'m',2.5,true,false));
        listOfChickens.add(new Chicken(animalType,121,true,'f',1.5,true,true));
    }

}
