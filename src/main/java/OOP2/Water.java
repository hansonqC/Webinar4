package OOP2;

/**
 * Created by lukasz on 2017-07-19.
 */
public class Water {
    public static double SMALL=0.5;
    public static double MEDIUM=1.0;
    public static double LARGE=2.0;
    private double smallVolume;
    private double mediumVolume;
    private double largeVolume;

    public double getSmallVolume() {
        return smallVolume;
    }

    public void setSmallVolume(double smallVolume) {
        this.smallVolume = smallVolume;
    }

    public double getMediumVolume() {
        return mediumVolume;
    }

    public void setMediumVolume(double mediumVolume) {
        this.mediumVolume = mediumVolume;
    }

    public double getLargeVolume() {
        return largeVolume;
    }

    public void setLargeVolume(double largeVolume) {
        this.largeVolume = largeVolume;
    }

    void addLarge(int n){
this.largeVolume+=n;
    }
    void addMedium(int n){
this.mediumVolume+=n;
    }
    void addSmall(int n){
this.smallVolume+=n;
    }

    void volumeAll(){
        System.out.println("Pojemnosc malej buteleki "+SMALL);
        System.out.println("Pojemnosc sredniej buteleki "+MEDIUM);
        System.out.println("Pojemnosc duzej buteleki "+LARGE);

    }


}

