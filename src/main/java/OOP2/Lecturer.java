package OOP2;

/**
 * Created by lukasz on 2017-07-18.
 */
public class Lecturer extends Employee implements IWebinars{
    public Lecturer(String name, String id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void getVoice() {
        System.out.println("Uczcie siê uczcie !Nauka to potêgi klucz!");
    }

    @Override
    public void connectMicrophone() {
        System.out.println("Podlaczono mikrofon");
    }

    @Override
    public void startRecording() {
        System.out.println("Wlaczono mikrofon");
    }
}
