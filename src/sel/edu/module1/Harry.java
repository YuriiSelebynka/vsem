package sel.edu.module1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


/*@author pi
@project vsem
@class Harry
@version 1.0.0
@since 10.03.21 - 19, 41*/

public class Harry {

    public static void main(String[] args) throws IOException {
        /*int[] arrayInt = {44, 87, 3, 22, 60, 11};
        arrayInt[3] = 990;
        int[] arr2 = new int[11];
        String[] word = {"abcd", "ajn", "ujht", "rhjo"};

        System.out.println(arrayInt[4]);
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }*/

        // download a text to string
        String text = new String(Files.readAllBytes(Paths
                .get("/home/pi/Desktop/Гундоров_-_Байки_у_костра.txt")));
        System.out.println(text.substring(0, 100));
        System.out.println(text.length());
        text = text.replaceAll("[^A-Za-z `]", "");

        String[] words = text.split(" +"); // про плюс не забути!!!!
        System.out.println(words.length);

        for (int i = 0; i < 100; i++) {
            System.out.println(words[i]);
        }

        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == 12) {
              //  System.out.println(words[i]);
                counter++;
            }
        }
       // System.out.println(counter);

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
             }
        }

        String[] distincts = stringOfDistincts.split(" ");

        Arrays.sort(distincts);
        System.out.println(distincts.length);
        for (int i = 0; i < 100; i++) {
            System.out.println(distincts[i]);
        }
    }
}
