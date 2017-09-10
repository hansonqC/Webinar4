package Farm;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by lukasz on 2017-07-22.
 */
public abstract class Animal implements Comparable<Animal>{
    public static List<Animal> listOfAnimals;
    public String animalType;
    //public static String animaID="1";//=UUID.randomUUID().toString();;
    private int  age;//in days
    private boolean isVaccinate;
    private char sex;
    private double weight;
    private boolean isFeeded;



    public Animal(String animalType, int age, boolean isVaccinate, char sex, double weight,boolean isFeeded) {
        this.animalType = animalType;
        this.age = age;
        this.isVaccinate = isVaccinate;
        this.sex = sex;
        this.weight = weight;
        this.isFeeded = isFeeded;

    }

    public Animal()
    {

    }
//-------------------------------------------

// GETTERY I SETTERY ---------------------------


    public boolean getIsFeeded() {
        return isFeeded;
    }

    public void setFeeded(boolean feeded, String animalType) {
        isFeeded = feeded;
    }

    public String getAnimalType() {

        return animalType;
    }
    public int getAge() {
        return age;
    }

    boolean getIsVaccinate() {
        return isVaccinate;
    }
    public void setVaccinate(boolean vaccinate) {
        isVaccinate = vaccinate;
    }

    public char getSex() {
        return sex;
    }
    public double getWeight() {
        return weight;
    }

    public List<Animal> getListOfAnimals() {
        return listOfAnimals;
    }

//--------------------------------------------------------------

//---------  INNE METODY   -----------------





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (isVaccinate != animal.isVaccinate) return false;
        if (sex != animal.sex) return false;
        if (Double.compare(animal.weight, weight) != 0) return false;
        return animalType.equals(animal.animalType);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = animalType.hashCode();
        result = 31 * result + age;
        result = 31 * result + (isVaccinate ? 1 : 0);
        result = 31 * result + (int) sex;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {

        return animalType+" : [wiek : "+ age +
                " dni, szczepione : " + isVaccinate +
                ", plec : " + sex +
                ", waga : " + weight +
                " kg]\n";
    }

    public int compareTo(Animal o) {
        if(age == o.getAge()){
            return 0;
        }else if(age> o.getAge()){
            return 1;
        }
        return -1;

    }

    public abstract void init(int amount);
    public abstract void feeding();
    public abstract void  vaccinate();


    //  -------------------------------------------------------------
}
