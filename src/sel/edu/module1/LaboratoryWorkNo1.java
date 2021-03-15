package sel.edu.module1;

import javax.xml.soap.Text;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Text;

/**
 * @author Yurii Selebynka
 * @version 1.0.0
 * @project vsem
 * @class vsem
 * @since 15-Mar-21 - 18.15
 **/

/*Laboratory work No. 1

Topic: Introduction to the Java programming language, variables, data types,
 operators. Logical operators, branch operators, bit-wise operators,loops,
 strings, arrays, methods.

1. Find the longest word in the above text. +
2. Count the LINES where the word "Harry" is met. +
3. Take the array of distinct words from Harry Potter. +
4. How many distinct words begin from the letter "C".
5. Create an array of hashes.
6. Count the intersections of hashes.*/

public class LaboratoryWorkNo1 {
    private static String result;

    //private static Object result;


    public static void main (String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths
                .get("C:\\Users\\Yurii\\Desktop\\harry.txt")));
        text = text.replaceAll("[^A-Za-z `]", "");

        // 2. Count the LINES where the word "Harry" is met. \\

        String[] lines = text.split("\\n");
        System.out.println(lines.length);

        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("Harry")){
                counter++;
            }
            System.out.println("Total quantity of the LINES where the word"+
                    " Harry is met is " + counter);

        }

//***************************************************************************\\

        String[] words = text.split(" +");

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

//***************************************************************************\\

        // 3. Take the array of distinct words from Harry Potter. \\

        String[] distincts = stringOfDistincts.split(" ");

        Arrays.sort(distincts);

//***************************************************************************\\

        // 1. Find the longest word in the above text. \\

        for (int i = 0; i < distincts.length; i++) {
            //System.out.println(distinctArray[i]);
        }

        System.out.println("The longest word in the above text is: " +
                Arrays.stream(stringOfDistincts.split(" ")).max
                (Comparator.comparingInt(String::length)).orElse(null));

//***************************************************************************\\

        // 4. How many distinct words begin from the letter "C". \\

        int counter2 = 0;
        for (int i = 0; i < distincts.length; i++) {

            if (distincts[i].startsWith("C")) {
                counter2++;
            }
            System.out.println(counter2);
        }

//***************************************************************************\\

        // 5. Create an array of hashes. \\

        Hashtable<Integer, String>
                hm = new Hashtable<Integer, String>();

        for (int i = 0; i < distincts.length; i++) {
            hm.put(i,distincts[i]);
        }

        // OR \\

        int[] hashes = new int[distincts.length];
        for (int i = 0; i < hashes.length; i++) {
            hashes[i] = distincts[i].hashCode();
        }

//***************************************************************************\\

        // 6. Count the intersections of hashes. \\


//***************************************************************************\\

        System.out.println("\n" + "******  Thank You for attention:)  ******");
    }
}
