package sel.edu.module2.model;

import java.time.LocalDate;

public class Student2 extends Person1 {
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birth;
    private boolean gender;
    private String phone;

    public Student2() {
    }

    public Student2(String firstName, String lastName, String patronymic, LocalDate birth, boolean gender, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birth = birth;
        this.gender = gender;
        this.phone = phone;
    }

    public Student2(String idCard, String firstName, String lastName, String patronymic, LocalDate birth, boolean gender, String phone) {
        super(idCard);
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birth = birth;
        this.gender = gender;
        this.phone = phone;
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
        return "Student2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birth=" + birth +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder{
        private Student2 student2ToBuild;

        public Builder() {
            this.student2ToBuild = new Student2();
        }

        public Builder setSimilarTo(Student2 student2) {
            this.student2ToBuild.firstName = student2.firstName;
            this.student2ToBuild.lastName = student2.lastName;
            this.student2ToBuild.patronymic = student2.patronymic;
            this.student2ToBuild.birth = student2.birth;
            this.student2ToBuild.gender = student2.gender;
            this.student2ToBuild.phone = student2.phone;
            return this;
        }

        public Builder setFirstName(String firstName){
            student2ToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName){
            student2ToBuild.setLastName(lastName);
            return this;
        }

        public Builder setPatronymic(String patronymic){
            student2ToBuild.setPatronymic(patronymic);
            return this;
        }

        public Builder setBirth(LocalDate birth){
            student2ToBuild.setBirth(birth);
            return this;
        }

        public Builder setGender(boolean gender){
            student2ToBuild.setGender(gender);
            return this;
        }

        public Builder setPhone(String phone){
            student2ToBuild.setPhone(phone);
            return this;
        }

        public Builder setIdCard (String idCard) {
            student2ToBuild.setIdCard(idCard);
            return this;
        }

        public Student2 build() {
            return student2ToBuild;
        }
    }


}
