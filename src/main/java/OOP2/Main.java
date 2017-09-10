package OOP2;



/**
 * Created by lukasz on 2017-07-18.
 */
public class Main {
    public static void main(String[] args) {
        Boss oskar = new Boss("Oskar", "85060707337", 1200, true);
        oskar.getVoice();
        oskar.screamOnEmployee();
        oskar.isHappy();
        System.out.println(oskar.isHappy());

        CoBoss marta = new CoBoss("Marta", "54844", 1200, true);
        System.out.println(marta.isHappy());


        Lecturer irek = new Lecturer("Irek", "86070733752", 800);
        irek.getVoice();

      /*  Employee michal = new Employee("Michal","85690807225",10000);
        michal.getVoice();
        Employee marta = new CoBoss("Marta","85796715887",5000);
      marta.getVoice();   */

        //POLIMORFIZM -- Wyra¿anie czegos czyms innym
        //Employee boss=new Boss("Oskar","85060707337",10000);


        // TABLICA PRACOWNIKÓW ,NIEMO¯LIWA BEZ polimorfizmu
    }

}