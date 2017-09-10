package pl.akademiakodu;

/**
 * Created by lukasz on 2017-06-28.
 */
public class Person {
    String name;
    String surname;
    int age;


    public  Person() {

    }
    public Person(String name, String surname,int age){

        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    String fullName(){
        return name +" "+surname;
    }
}
