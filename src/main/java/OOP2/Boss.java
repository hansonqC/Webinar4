package OOP2;

/**
 * Created by lukasz on 2017-07-18.
 */

// klasy mog± miec swoje konstruktory ale musi chociaz raz uruchomic konstruktor klasy nadrzednej
public class Boss extends Employee { //DZIEDZICZENIE TYLKO PO JEDNEJ KLASIE
    private boolean isHappy;


    /*
    public Boss(String name, String id, int salary) {
        super(name, id, salary); //wywolanie konstruktora klasy nadrzednej


    }  */

    public Boss(String name, String id, int salary,boolean isHappy) {
        super(name, id, salary); //wywolanie konstruktora klasy nadrzednej
        this.isHappy=isHappy;

    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }



    // PRZESLANIANIE METODY (CTRL+O)

    @Override // sprawdza czy metoda getVoice znajduje sie w klasie nadrzednej
    public void getVoice() {
        System.out.println("Do pracy !!! Bo bez pracy nie ma kolaczy");
    }
    public void screamOnEmployee(){
        System.out.println("KRZYYYYYYYCZE");
    }
}
