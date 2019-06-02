package pl.sda.fields;

public class Person {
    private String nameAndSurname;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.nameAndSurname = name + " " + surname;
        this.age = age;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDontCallMe() {
        return null;
    }
}
