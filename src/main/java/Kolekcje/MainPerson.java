package Kolekcje;

import java.util.*;

/**
 * Created by lukasz on 2017-07-22.
 */
public class MainPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(10,"Oskar"));
        personList.add(new Person(20,"Aga"));
        personList.add(new Person(30,"Tomek"));
        personList.add(new Person(40,"Julita"));
    for(Person person : personList){
        System.out.println(person.toString());
    }

        Collections.sort(personList);//, new NameComparator());

        for(Person person : personList){
            System.out.println(person.toString());
        }

    }

    //klasa zagniezdzona do sortowania po imieniu
    private static class NameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }



}
