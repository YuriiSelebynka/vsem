package sel.edu.module4.mulithreading;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class LogsManager
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

    /* 2. Create a class that manages logs in this file.                     */

public class LogsManager {

    private String file;

    public LogsManager() {
    }

    public LogsManager(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public static List<String> logsByDate (String file, LocalDate date)
            throws IOException {
        String dateAsString = date.toString();
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .collect(Collectors.toList());

        return list;
    }

    /* 3. Create a method that finds all the ERROR logs                  *\
   |      for a specific date and write them into a                       |
   \*     specific file (name = ERROR + Date + .log).                   */

    public static void logsByDateToFile(String file, LocalDate date)
            throws IOException {

        String dateAsString = date.toString();
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains("ERROR"))
                .collect(Collectors.toList());
        String str = list.toString();

        for(String log: list) {
            str += log + '\n';
        }

        String fileOutput = "/home/yurii/IdeaProjects/" +"ERROR" +
                dateAsString + ".log";
        Files.write(Paths.get(fileOutput),
                str.getBytes(StandardCharsets.UTF_8));

    }
}
