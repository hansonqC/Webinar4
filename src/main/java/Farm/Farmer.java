package Farm;

/**
 * Created by lukasz on 2017-07-22.
 */
public class Farmer  {

    private String name;
    private String surname;
    private String village;

    public Farmer(String name, String surname, String village) {
        this.name = name;
        this.surname = surname;
       this.village = village;
    }

    public Farmer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    @Override
    public String toString() {
        return "Farmer " + name + " "+ surname+"\nWies : "+village;
    }
}
