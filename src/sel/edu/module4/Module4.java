package sel.edu.module4;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Module4 {
    public static void main(String[] args) throws IOException {
        System.out.println("4");

         LocalDateTime start = LocalDateTime.now();



        String logs = new String
                (Files.readAllBytes(Paths
                //.get("logs.txt")));
                .get("/home/yurii/IdeaProjects/logs4.txt")));

        final String[] lines = logs.split("\n");
        System.out.println(lines.length); // 197

        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if(lines[i].contains("ERROR")) counter++;
        }
        System.out.println("ERRORS" + counter);

        LocalDateTime finish = LocalDateTime.now();

        ChronoUnit.MILLIS.between(start, finish);

        System.out.println("------------------------------------------------");

        start = LocalDateTime.now();

        final List<String> linesList = Files.readAllLines(Paths
                .get("/home/yurii/IdeaProjects/logs4.txt"));

        System.out.println("Way2 " + linesList.stream()
                .filter(line -> line.contains("ERROR")).count()); // 361

        finish = LocalDateTime.now();

        // OR

        start = LocalDateTime.now();

        System.out.println(Files.readAllLines(Paths
                .get("/home/yurii/IdeaProjects/logs4.txt")).stream()
                .filter(line -> line.contains("ERROR")).count());

        System.out.println(Files.lines(Paths
                .get("/home/yurii/IdeaProjects/logs4.txt"))
                .filter(line -> line.contains("ERROR")).count());

        finish = LocalDateTime.now();

        System.out.println("----------- Threads ----------------------------");

        System.out.println(LogsService
                .logsByDate("/home/yurii/IdeaProjects/logs.txt",
                        LocalDate.of(2020, Month.FEBRUARY, 14))
                .size());

        //LocalDateTime
                start = LocalDateTime.now();

        System.out.println(LogsService
                .logsByDate
                        ("/home/yurii/IdeaProjects/logs.txt", LocalDate
                        .of(2020, Month.FEBRUARY, 11)).size());
        LogsService.logsByDateToFile("/home/yurii/IdeaProjects/logs.txt", LocalDate
                .of(2020, Month.FEBRUARY, 11));

        //LocalDateTime
                finish = LocalDateTime.now();

        System.out.println(ChronoUnit.MILLIS.between(start, finish));

    }
}
