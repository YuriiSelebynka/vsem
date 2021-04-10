package sel.edu.module4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class FilesManagement
 * @version 1.0.0
 * @since 10.04.21 - 19, 50
 * */

/* Home task.
Topic: Files management.

1. Parse the file logs.txt (see the attachment).
   Extract to a separate file all the logs.
2. Calculate the total number of logs (lines).
3. Calculate the total number of ERROR logs.
   Use previous skills - String.split.
4. Calculate the total number of ERROR logs.
   Use Files.lines.
5. Compare two results. */

public class FilesManagement {

    public static void main(String[] args) throws IOException {

        System.out.println("==== HOME TASK. FILE MANAGEMENT. ====" + "\n");

    /* 1. Parse the file logs.txt (see the attachment).                      *\
    \*    Extract to a separate file all the logs.                           */

        LocalDateTime startForStringSplitMethod = LocalDateTime.now();

        String logs = new String
                (Files.readAllBytes(Paths
                        .get("/home/yurii/IdeaProjects/logs4.txt")));

        final String[] lines = logs.split("\n");


    /* 2. Calculate the total number of logs (lines).                        */

        System.out.println("1. The total number of logs (lines) is " +
                           lines.length + "." + "\n");

        System.out.println("2. Calculating of total number of ERRORS logs " +
                "with String.split method:");

    /* 3. Calculate the total number of ERROR logs.                          *\
    \*    Use previous skills - String.split.                                */

        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if(lines[i].contains("ERROR")) counter++;
        }
        System.out.println("2.1 The total number of ERRORS logs is " +
                           counter + ".");

        LocalDateTime finishForStringSplitMethod = LocalDateTime.now();

        int timeForStringSplitMethod = (int) ChronoUnit.MILLIS
                .between(startForStringSplitMethod,
                         finishForStringSplitMethod);

        System.out.println("2.2. Calculating of total number of ERRORS logs " +
                           "with String.split method takes " +
                            + timeForStringSplitMethod + " ms." + "\n");

    /* 4. Calculate the total number of ERROR logs.                          *\
    \*    Use Files.lines.                                                   */

        LocalDateTime startForFilesLinesMethod = LocalDateTime.now();

        System.out.println("3. Calculating of total number of ERRORS logs " +
                "with Files.lines method:");

        System.out.println("3.1. The total number of ERRORS logs is " +
                Files.lines(Paths.get("/home/yurii/IdeaProjects/logs4.txt"))
                .filter(line -> line.contains("ERROR")).count());

        LocalDateTime finishForFilesLinesMethod = LocalDateTime.now();

        int timeForFilesLinesMethod = (int) ChronoUnit.MILLIS
                .between(startForFilesLinesMethod,
                         finishForFilesLinesMethod);

        System.out.println("3.2. Calculating of total number of ERRORS logs " +
                           "with Files.lines method takes " +
                            + timeForFilesLinesMethod + " ms." + "\n");

    /* 5. Compare two results.                                               */

        if (timeForStringSplitMethod > timeForFilesLinesMethod) {
            System.out.println("4. Method Files.lines is quicker.");
        } else {
            System.out.println("4. Method String.split is quicker.");
        }

//=================================== SOUT: =================================\\

        /* ==== HOME TASK. FILE MANAGEMENT. ====

1. The total number of logs (lines) is 197.

2. Calculating of total number of ERRORS logs with String.split method:
2.1 The total number of ERRORS logs is 1.
2.2. Calculating of total number of ERRORS logs with String.split method takes 13 ms.

3. Calculating of total number of ERRORS logs with Files.lines method:
3.1. The total number of ERRORS logs is 1
3.2. Calculating of total number of ERRORS logs with Files.lines method takes 9 ms.

4. Method Files.lines is quicker. */

//==========               THANK YOU FOR ATTENTION :)              ==========\\

    }
}
