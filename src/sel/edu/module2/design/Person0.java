package sel.edu.module2.design;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person0 {
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private MaritalStatus status;

    public Person0() {
    }

    public Person0(String firstName, String lastName, String patronymic, LocalDate dateOfBirth, MaritalStatus status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
    }

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

    @Override
    public String toString() {
        return "Person0{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public int getAge() {
        int years = (int) ChronoUnit.YEARS.between(LocalDate.now(), this.getDateOfBirth());
        return years;
    }

    private boolean isAdult(){
        boolean result = true;

        if (this.getAge() >= 18) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
