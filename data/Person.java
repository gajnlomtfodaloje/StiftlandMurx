package data;

import java.util.*;

public class Person {

    private String forename;
    private String surname;
    private int age;
    private Date dateOfBirth;
    private Adress personalAdress;

    public Person(String forename, String surname, int age, Date dateOfBirth, Adress personalAdress) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.personalAdress = personalAdress;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Adress getPersonalAdress() {
        return personalAdress;
    }

    public Person editPersonalInformation (String forename, String surname) {
        if (forename != null) {
            this.forename = forename;
        }
        if (surname != null) {
            this.surname = surname;
        }
        return this;
    }
}