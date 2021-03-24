package sel.edu.module2.design;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class Person
 * @version 1.0.0
 * @since 21.03.21 - 19, 02
 * */

/* Inheritance
1. Create a child  from the class Rectangle.
2. Create a class Person and a class Student as its daughter. 25 fields. */

import java.time.LocalDate;
import java.util.Objects;

/* 2. Create a class Person and a class Student as its daughter. 25 fields. */

public class Person {
    String    firstName;
    String    lastName;
    String    patronymic;
    LocalDate dateOfBirth;
    String    gender;
    String    citizenship;

    public Person(String firstName, String lastName, String patronymic,
                   LocalDate dateOfBirth, String gender, String citizenship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.citizenship =citizenship;
    }

    /* ======================= Getters and setters. ======================== */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    /* ========================== Equals method. =========================== */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(patronymic, person.patronymic) &&
                Objects.equals(dateOfBirth, person.dateOfBirth) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(citizenship, person.citizenship);
    }

    /* ============================ Hash method. =========================== */

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, patronymic, dateOfBirth,
                            gender, citizenship);
    }

    /* ========================= ToString method. ========================== */

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", citizenship='" + citizenship + '\'' +
                '}';
    }
}

//*************************THANK YOU FOR ATTENTION!**************************\\