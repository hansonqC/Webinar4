package OOP2;

/**
 * Created by lukasz on 2017-07-18.
 *///ALT + ENTER
public class CoBoss extends Boss implements IWebinars{


    private boolean isHappy;

    public CoBoss(String name, String id, int salary,boolean isHappy) {
        super(name, id, salary,isHappy);
    }


    public boolean isHappy() {
        return isHappy;
    }


    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    public void connectMicrophone(){
        System.out.println("Podlaczono mikrofon");
    }

    @Override
    public void startRecording() {

    }

    @Override
    public void getVoice() {
        System.out.println("Szefie szefie mamy jeszcze czas na zyski");
    }
    // CoBoss jest pracownikiem !!!
}

