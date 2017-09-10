package OOP2;

/**
 * Created by lukasz on 2017-07-19.
 */
public class Person {
    private String name;
    private String surname;
    private String eyesColor;
    private int age;
    private int height;

    public Person(String name, String surname, String eyesColor, int age, int height) {
        this.name = name;
        this.surname = surname;
        this.eyesColor = eyesColor;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surnamename) {
        this.surname = surnamename;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
