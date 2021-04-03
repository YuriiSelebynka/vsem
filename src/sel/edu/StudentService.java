package sel.edu;

import sel.edu.module2.design.Student;
import sel.edu.module2.model.Student2;
import sel.edu.module3.collections.Student3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class StudentService {

    public boolean isAdult(Student student) {
        LocalDate birthday = student.getDateOfBirth();
        final long years = ChronoUnit.YEARS.between(birthday, LocalDateTime.now());
        if (years > 18) return true;

        return false;
    }
}
