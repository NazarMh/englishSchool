package beans;

import dao.Identified;

import java.time.LocalDate;

public class Person implements Identified<Integer> {
    private String firstName;
    private String secondName;
    private LocalDate birthDate;
    private int id;


    public Person(String firstName, String secondName, LocalDate birthDate, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.id = id;
    }

    public Person(String firstName, String secondName, LocalDate birthDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
    }

    public Person() {
        this.firstName = "name";
        this.secondName = "surname";
        this.birthDate = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }


    protected void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
