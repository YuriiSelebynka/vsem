package sel.edu.FinalCourseTask;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class Main
 * @version 1.0.0
 * @since 19.04.21 - 18, 06
 * */

/*1. GLOSSARY - 10 points
 *
 *   1.1. Download a text about Harry Potter.
 *   1.2. For each distinct word in the text calculate the number of occurrence.
 *   1.3. Use RegEx.
 *   1.4. Sort in the DESC mode by the number of occurrence.
 *   1.5. Find the first 20 pairs.
 *   1.6  Find all the proper names.
 *   1.7. Count them and arrange in alphabetic order.
 *   1.8. First 20 pairs and names write into to a file test.txt.
 *   1.9. Create a fine header for the file.
 *   1.10 Use Java Collections to demonstrate your experience (Map, List).
 *
 * Show all your skills and experience.  All the tricks will be taken into account.
* */

public class Main {
    public static void main(String[] args) throws IOException {

        /* 1.1. Download a text about Harry Potter.                          */

        String text = new String(Files.readAllBytes(Paths
                .get("/home/yurii/IdeaProjects/harry.txt")));

        /* 1.2. For each distinct word in the text calculate                 *\
        \*      the number of occurrence.                                    */

        /* 1.3. Use RegEx.                                                   */

        /* 1.4. Sort in the DESC mode by the number of occurrence.           */

        /* 1.5. Find the first 20 pairs.                                     */

        /* 1.10 Use Java Collections to demonstrate your experience          *\
        \*      (Map, List).                                                 */

        text = text.toLowerCase().replaceAll("[^A-Za-z `]", "");
        String[] array = text.split(" ");

        Map<String, Long> result = Arrays.stream(array)
                .collect(Collectors.groupingBy(Function.<String>identity(),
                        Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long> comparingByValue().reversed())
                .limit(20)
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (l,r) -> l,
                        LinkedHashMap::new));

        System.out.println(result);

        /* 1.6  Find all the proper names.                                   */

        /* 1.7. Count them and arrange in alphabetic order.                  */



        String distinctString = "";

        for (int i = 0; i < array.length; i++) {
            if (!distinctString.contains(array[i])){
                distinctString += array[i] + " ";
            }
        }

        String [] distinctArray = distinctString.split(" ");

        Arrays.sort(distinctArray);

        for (int i = 0; i < distinctArray.length; i++) {
            //if (distinctArray.substring(0, 1).toUpperCase().equals(word.substring(0, 1)))
            System.out.println(distinctArray[i]);

        }
        /*===================================================================*/

        String text2 = new String(Files.readAllBytes(Paths
                .get("/home/yurii/IdeaProjects/harry.txt")));
        text2 = text2.replaceAll(" `", "");
        String[] array2 = text2.split(" ");

        String properNames = "";

        int counter2 = 0;
        for (int i = 0; i < array2.length; i++) {



                if (array2[i].startsWith("[^A-Z]")) {
                    counter2++;
                }
            }
        System.out.println(counter2);



        /*String [] properArray = properNames.split(" ");

        Arrays.sort(properArray);

        for (int i = 0; i < properArray.length; i++) {
            //if (distinctArray.substring(0, 1).toUpperCase().equals(word.substring(0, 1)))
            System.out.println(properArray[i]);*/

        /* 1.8. First 20 pairs and names write into to a file test.txt.      */

        String firstTwenty = result.toString();

        Path path = Paths.get("/home/yurii/IdeaProjects/test.txt");
        Files.write(path, Collections.singleton(firstTwenty));

        /* 1.9. Create a fine header for the file.                           */

        try {

            String content = "This is the HEADER of the file\n"
                    + result.toString();

            File f = new File("/home/yurii/IdeaProjects/header.txt");

            FileWriter fw = new FileWriter(f.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  }

