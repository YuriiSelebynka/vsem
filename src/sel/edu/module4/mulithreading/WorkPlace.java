package sel.edu.module4.mulithreading;

import sel.edu.module4.LogsService;
import sel.edu.module4.MyThread;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.regex.MatchResult;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class WorkPlace
 * @version 1.0.0
 * @since 10.04.21 - 21, 22
 * */

/* Home task.
   Topic: Multi-threading.

1. Use the file from the previous task - logs.txt.
2. Create a class that manages logs in this file.
3. Create a method that finds all the ERROR logs
   for a specific date and write them into a
   specific file (name = ERROR + Date + .log).
4. In your main class develop a functionality to create
   5 such a files for 5 different days. Launch them in
   consistent way (one after another ).
5. Repeat the above task in parallel way. Multi-threading.
6. Compare the results. */

public class WorkPlace {

    public static void main(String[] args) throws IOException {

    /* 1. Use the file from the previous task - logs.txt.                    */

        LocalDateTime start;
        LocalDateTime finish;

    /* 4. In your main class develop a functionality to create           *\
   |      5 such a files for 5 different days. Launch them in             |
   \*     consistent way (one after another ).                          */

        System.out.println("   CONSISTENT WAY: ");

        start = LocalDateTime.now();

        LocalDate date = LocalDate.of(2020,Month.FEBRUARY,10);

        for (int i = 0; i < 5; i++) {
            LogsService.getLogsCountByDate(date.plusDays(i));
        }

        finish = LocalDateTime.now();

        long durationOfConsistentWay = ChronoUnit.MILLIS.between(start, finish);

        System.out.println("Total duration of Consistent way is " +
                           durationOfConsistentWay + " msec." + "\n");

    /* 5. Repeat the above task in parallel way. Multi-threading.            */

        System.out.println("   PARALLEL WAY: ");

        start = LocalDateTime.now();

        for (int i = 0; i < 5; i++) {

            new MyThreads(date.plusDays(i)).start();
            LocalDateTime finish2 = LocalDateTime.now();
        }

        finish = LocalDateTime.now();

        long durationOfParallelWay = ChronoUnit.MILLIS.between(start, finish);

        System.out.println("Total duration of Parallel way is " +
                durationOfParallelWay + " msec." + "\n");

    /* 6. Compare the results. */

        if (durationOfConsistentWay < durationOfParallelWay) {
            System.out.println("Consistent way is faster." + "\n");
        } else {
            System.out.println("Parallel way is faster." + "\n");
        }

//=================================== SOUT: =================================\\

    /*   CONSISTENT WAY:
    2020-02-10 - 6987
    2020-02-11 - 7086
    2020-02-12 - 4731
    2020-02-13 - 4817
    2020-02-14 - 5315
    Total duration of Consistent way is 2990 msec.

    PARALLEL WAY:
    Thread-0 has been started at 2021-04-15T20:48:15.672
    Thread-1 has been started at 2021-04-15T20:48:15.672
    Thread-3 has been started at 2021-04-15T20:48:15.672
    Thread-2 has been started at 2021-04-15T20:48:15.672
    Total duration of Parallel way is 1 msec.

    Parallel way is faster.

    Thread-4 has been started at 2021-04-15T20:48:15.672
    2020-02-10 - 6987
    Thread-0 has been finished at 2021-04-15T20:48:16.417
    Thread-0 DURATION is 745 msec.
    2020-02-12 - 4731
    Thread-2 has been finished at 2021-04-15T20:48:16.468
    Thread-2 DURATION is 796 msec.
    2020-02-13 - 4817
    Thread-3 has been finished at 2021-04-15T20:48:16.484
    Thread-3 DURATION is 812 msec.
    2020-02-11 - 7086
    Thread-1 has been finished at 2021-04-15T20:48:16.491
    Thread-1 DURATION is 819 msec.
    2020-02-14 - 5315
    Thread-4 has been finished at 2021-04-15T20:48:16.530
    Thread-4 DURATION is 858 msec.

    Process finished with exit code 0 */

//==========               THANK YOU FOR ATTENTION :)              ==========\\

    }

}
