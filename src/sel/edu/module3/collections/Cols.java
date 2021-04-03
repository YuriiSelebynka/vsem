package sel.edu.module3.collections;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import sel.edu.module3.collections.interfaces.IAccounting;
import sel.edu.module3.collections.model.CandyBox;
import sel.edu.module3.collections.model.CandyWeighted;

public class Cols {

    public static void main(String[] args) {

        List<Integer> list0 = new ArrayList<>( // add & remove does better
                Arrays.asList(12,45,55,34,84,28)
        );

        int sum = 0; // - старий спосіб розрахунку суми

        for (int i = 0; i < list0.size(); i++) {
            sum += list0.get(i);
        }
        //System.out.println(sum);

        // кращий спосіб з використанням стрімів
        int sum2 = list0.stream().mapToInt(Integer::intValue).sum();
        //int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();

        //System.out.println(sum2);
        //System.out.println(max);

        List<Student3> students = new ArrayList<>(
               Arrays.asList(
                       new Student3 ("John Lennon", LocalDate.of(2003,
                               Month.FEBRUARY,1), Gender.MALE, 90),
                       new Student3 ("Paul McCartney", LocalDate.of(2004,
                               Month.FEBRUARY,6), Gender.MALE, 75),
                       new Student3("Yoko Ono", LocalDate.of(2000,
                               Month.FEBRUARY,1), Gender.MALE, 50),
                       new Student3("Freddie Mercury", LocalDate.of(2004,
                               Month.AUGUST,23), Gender.MALE, 80),
                       new Student3("Tarja Turunen", LocalDate.of(2002,
                               Month.SEPTEMBER,1), Gender.MALE, 80)
               )


        );
        // важлива опція !!!
        List<Student3> men = students.stream()
                .filter(student -> student.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
        System.out.println(men);

        List<Student3> troechniki = students.stream()
                .filter(item -> item.getMark() <75)
                .collect(Collectors.toList());

        System.out.println(troechniki);

        Student3 otlichnik = students.stream().max(Comparator.comparing(Student3::getMark)).get();
        double avg = students.stream().mapToInt(Student3::getMark).average().getAsDouble();

        System.out.println(otlichnik);
        System.out.println(avg);

        int max = students.stream().mapToInt(Student3::getMark).max().getAsInt();
        int min = students.stream().mapToInt(Student3::getMark).min().getAsInt();
        //---------------------------------------------------------------------

        //List<CandyBox, CandyWeighted> так не можна робити

        List<IAccounting> list = new ArrayList<>(// використання інтерфейса
                Arrays.asList(
                        new CandyBox("Lastivka", 0.2, 100,10,2),
                        new CandyBox("Roshen", 0.2, 100,10,2),
                        new CandyBox("Vinok Dunaya", 0.2, 120,15,1),
                        new CandyBox("Lastivka", 0.2, 100,10,2),
                        new CandyBox("Lastivka", 0.2, 100,10,2),
                        new CandyWeighted("Korivka",0.150,60),
                        new CandyWeighted("Romashka",1.0,88),
                        new CandyWeighted("Korivka",0.150,60),
                        new CandyWeighted("Korivka",0.150,60),
                        new CandyWeighted("Korivka",0.150,60)
                )
        );

        // 2nd task
        double totalIncome = list.stream().mapToDouble(IAccounting::getUltimatePrice).sum();

        // 3rd task
        double expensive  = list.stream().mapToDouble(IAccounting::getUltimatePrice).max().getAsDouble();

        // 4th task
        double cheap      = list.stream().mapToDouble(IAccounting::getUltimatePrice).min().getAsDouble();


    }
}
