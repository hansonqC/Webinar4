package OOP2;

/**
 * Created by lukasz on 2017-07-19.
 */
public class MyWater {
public static int BIG_BOTTLR=2;
    public static int MED_BOTTLE=2;
    public static int SMALL_BOTTLE=2;

    private int countBig;
    private int countMed;
    private int countSmall;


    void addLarge(int n){
        countBig+=n;
    }
    void addMedium(int n){
        countMed+=n;
    }
    void addSmall(int n){
        countSmall+=n;

    }

    public int getCountBig() {
        return countBig;
    }

    public void setCountBig(int countBig) {
        this.countBig = countBig;
    }

    public int getCountMed() {
        return countMed;
    }

    public void setCountMed(int countMed) {
        this.countMed = countMed;
    }

    public int getCountSmall() {
        return countSmall;
    }

    public void setCountSmall(int countSmall) {
        this.countSmall = countSmall;
    }
    public int volumeAll(){
        return (BIG_BOTTLR*countBig)+(MED_BOTTLE*countMed)+(SMALL_BOTTLE*countSmall);
    }
    public void show(){
        System.out.println("Pojemnosc wszystkich butelek "+volumeAll());
        System.out.println("Ilosc malych "+countSmall);
        System.out.println("Ilosc srednich "+countMed);
        System.out.println("Ilosc duzych "+countBig);
    }
}
