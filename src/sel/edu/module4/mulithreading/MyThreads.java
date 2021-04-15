package sel.edu.module4.mulithreading;

import sel.edu.module4.LogsService;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class MyThreads
 * @version 1.0.0
 * @since 15.04.21 - 19, 31
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

    /* 5. Repeat the above task in parallel way. Multi-threading.            */

public class MyThreads extends Thread {
    private LocalDate date;

    public MyThreads(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public void run() {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(this.getName() + " has been started at " + start);
        try {
            LogsService.getLogsCountByDate(this.getDate());
        } catch (IOException e) {
            e.printStackTrace();
        }
        LocalDateTime finish = LocalDateTime.now();
        long durationOfParallelWay = ChronoUnit.MILLIS.between(start, finish);
        System.out.println(this.getName() + " has been finished at " + finish);
        System.out.println(this.getName() + " DURATION is " +
                durationOfParallelWay + " msec.");
    }
}
