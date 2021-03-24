package sel.edu.module1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author Yurii Selebynka
 * @version 1.0.0
 * @project vsem
 * @class vsem
 * @since 12-Mar-21 - 17.26
 **/

/* Arrays. Practice.

1. Find in the net and download a text version of a novel about Harry Potter.
   For instance, "Harry Potter and the Sorcerer's Stone".
2. Split the novel into an array of words.
3. Clean the words from a punctuation signs.
4. Create another array containing distinct words.
5. Order the words in alphabetic order. */

public class ArrayPractice {
    /*public static void main(String[] args) throws IOException {

          // 1. Find in the net and download a text version of a novel \\
         // about Harry Potter. For instance, "Harry Potter and the     \\
        // Sorcerer's Stone".                                            \\

        // download a text to string
        String text = new String(Files.readAllBytes(Paths
                .get("home\\yurii\\Стільниця\\harry.txt")));

//***************************************************************************\\

        // 3. Clean the words from a punctuation signs. \\

        text = text.replaceAll("[^A-Za-z `]", "");

//***************************************************************************\\

        // 2. Split the novel into an array of words. \\

        String[] words = text.split(" +");

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

//***************************************************************************\\

        // 4. Create another array containing distinct words. \\

        String[] distincts = stringOfDistincts.split(" ");

//***************************************************************************\\

        // 5. Order the words in alphabetic order. \\

        Arrays.sort(distincts);

        System.out.println("Results for Array practice:");

        for (int i = 0; i < distincts.length; i++) {
            System.out.println(distincts[i]);
        }
        System.out.println(
                "=========================================================");
        System.out.println("Total number of words is " +
                words.length + ".");
        System.out.println(
                "=========================================================");
        System.out.println("total number of distincts words is " +
                distincts.length + ".");
        System.out.println("\n" + "******  Thank You for attention:)  ******");
    }*/
}
