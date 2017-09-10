package Kolekcje;
//Zawsze generujemy equals i hashCode


public class Person implements Comparable<Person>{  //Implementujemy interfej comparable zeby moc sortowa
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {   // zamienia klase na ciag znakow,informacyyjna
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    //zwracamy 0 gdy obekty sa takie same (maja byc na rowni z soba)
    //zwracamy 1 gdy cos ma pojsc nizej niz cos
    //zwracamy -1 gdy cos ma pojsc wyzej niz cos


  /*  @Override //dla name
    public int compareTo(Person o) {
       name.compareTo(o.getName());

    }


    */



    @Override
    public int compareTo(Person o) {
        if(age == o.getAge()){
            return 0;
        }else if(age> o.getAge()){
            return 1;
        }
        return -1;

    }
}
