package sel.edu.harryCols;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class harryCols {

    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths
                .get("/home/yurii/Desktop/logs.txt")));

        text = text.toLowerCase().replaceAll("[^A-Za-z `]", "");
        // хороший лайфхак
        String[] array = text.split(" ");
        //List<String> list = Arrays.asList(array.clone()); OR:
        List<String> list = Arrays.stream(array).collect(Collectors.toList());

        //List<String> distincts = list.stream().distinct().collect(Collectors.toList()); OR:
        // Set<String> distincts = list.stream().collect(Collectors.toSet()); // не використовують

        Map<String, Integer> map = new HashMap<>();
        Integer value = 0;
        for (int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                 value = map.get(array[i]);
                 map.put(array[i], value++);
            }
        }map.entrySet().stream().limit(100).forEach(System.out::println);

    }
}
