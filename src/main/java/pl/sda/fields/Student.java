package pl.sda.fields;

public class Student {
    private String name;
    private String surname;
    private String grades;

    public Student(String name, String surname, String grades) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGrades() {
        return grades;
    }
}
