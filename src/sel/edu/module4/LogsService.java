package sel.edu.module4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class LogsService {
    private final static String file = "/home/yurii/IdeaProjects/logs.txt";

    public LogsService() {
    }



    public String getFile() {
        return file;
    }


    // 2021-03-11
    public static List<String> logsByDate (String file, LocalDate date) throws IOException {
        String dateAsString = date.toString();
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .collect(Collectors.toList());

        return list;
    }

    public static void getLogsCountByDate(LocalDate date) throws IOException {
        String dateAsString = date.toString();
        String file = "/home/yurii/IdeaProjects/logs.txt";
        System.out.println(date + " - " + Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString)).count());
    }



    public static void logsByDateToFile(String file, LocalDate date) throws IOException {

        /* String dateAsString = date.toString();
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                //.filter(log -> log.contains("2019"))
                .collect(Collectors.toList());
        String str = list.toString(); */

        String dateAsString = date.toString();
        String str = "";
        StringBuilder sb = new StringBuilder(str); // хороша річ
        Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .filter(log -> log.contains("ERROR"))
                .forEach(log -> sb.append(log + '\n')); // append оптимальний

        /*for(String log: list) { // так не  добре, оскільки String immutable (yнезмінюваний)
            str += log + '\n'; */
        /*  1. str = "";
            2. Буде два рядки. Перша "" і друга лог1;
            3. Три рядки: Перша "", друга лог1, третя лог1 + лог2.
            4. Чотири рядки     ..................... четвертий рядок лог1 + лог2 + лог3.
        }*/

        String fileOutput = "/home/yurii/IdeaProjects/" +"ERROR" + dateAsString + ".log";
        Files.write(Paths.get(fileOutput), str.getBytes(StandardCharsets.UTF_8));
    }
}
