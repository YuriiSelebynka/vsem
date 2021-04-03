package sel.edu.module3.collections;

import java.time.LocalDate;

public class Student3 {
    private String name;
    private LocalDate birth;
    private Gender gender;
    private int mark;

    public Student3() {
    }

    public Student3(String name, LocalDate birth, Gender gender, int mark) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", gender=" + gender +
                ", mark=" + mark +
                '}';
    }
}
