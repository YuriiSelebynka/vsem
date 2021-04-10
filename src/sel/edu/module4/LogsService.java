package sel.edu.module4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class LogsService {
    private String file;

    public LogsService() {
    }

    public LogsService(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public static List<String> logsByDate (String file, LocalDate date) throws IOException {
        String dateAsString = date.toString();
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .collect(Collectors.toList());

        return list;
    }

    public static void logsByDateToFile(String file, LocalDate date) throws IOException {

        String dateAsString = date.toString();
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                //.filter(log -> log.contains("2019"))
                .collect(Collectors.toList());
        String str = list.toString();

        for(String log: list) {
            str += log + '\n';
        }

        String fileOutput = "/home/yurii/IdeaProjects/" +"ERROR" + dateAsString + ".log";
        Files.write(Paths.get(fileOutput), str.getBytes(StandardCharsets.UTF_8));
    }
}
