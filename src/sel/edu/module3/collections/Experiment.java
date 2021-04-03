package sel.edu.module3.collections;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Experiment {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            list.add(i);

        }

        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            //list.add(50000,99);
            list.add(0,99);

        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish));

        //---------------------------------------------------------------------

        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);

        }

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            //linkedList.add(50000,99);
            linkedList.add(0,99);

        }
        finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish));
    }
}
