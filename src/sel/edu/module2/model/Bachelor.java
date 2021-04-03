package sel.edu.module2.model;

import sel.edu.module2.design.Person0;

import java.time.LocalDate;

public class Bachelor {


    private Person0 person0; // приклад композиції
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birth;
    private boolean gender;
    private String phone;

    public Bachelor() {
    }

    public Bachelor(Person0 person0, String firstName, String lastName, String patronymic, LocalDate birth, boolean gender, String phone) {
        this.person0 = person0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birth = birth;
        this.gender = gender;
        this.phone = phone;
    }

    public Person0 getPerson0() {
        return person0;
    }

    public void setPerson0(Person0 person0) {
        this.person0 = person0;
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

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Bachelor{" +
                "person0=" + person0 +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birth=" + birth +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }
}
