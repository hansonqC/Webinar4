package OOP2;

/**
 * Created by lukasz on 2017-07-19.
 */
public class MainWater {
    public static void main(String[] args) {
        MyWater mywater= new MyWater();
        mywater.addLarge(10);
        mywater.addLarge(2);

        mywater.addMedium(2);

        mywater.addSmall(20);

        mywater.show();
    }
}
