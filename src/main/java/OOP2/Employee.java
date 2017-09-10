package OOP2;

/**
 * Created by lukasz on 2017-07-18.
 */
public abstract class Employee {

    private String name;
    private String id;
    private int salary;

    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }
//metoda abstrakcyjna bo Employee to klasa abstrakcyjna
    public abstract void getVoice() ;




}
