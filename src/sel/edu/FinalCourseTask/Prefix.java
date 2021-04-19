package sel.edu.FinalCourseTask;

import java.util.Scanner;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class Prefix
 * @version 1.0.0
 * @since 19.04.21 - 20, 35
 * */

public class Prefix {
    public static String prefix(String[] array) {
        // your code is here

        String commonPrefix1 = "";
        int count = 0, k = 0;

        if (array.length > 0) {
            for (int i = 0; i < array[0].length(); i++) {
                int j = 1;
                while (j < array.length) {
                    if (array[0].charAt(k) == array[j].charAt(k)) {
                        count++;
                        j++;
                    } else
                        break;
                }
                if (count == array.length - 1) {
                    commonPrefix1 += array[0].charAt(k);
                    count = 0;
                    k++;

                } else {
                    return commonPrefix1;
                }

            }
        }

        if (array.length == 0) return "";

        String commonPrefix2 = array[0];
        for (int i = 1; i < array.length; i++) {
            while (array[i].indexOf(commonPrefix2) != 0) {
                commonPrefix2 = commonPrefix2.substring(0, commonPrefix2.length() - 1);
                if (commonPrefix2.equals("")) return "";
            }
        }
        return commonPrefix2;
    }

        //return "";
   //}

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"} ;

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"} ;

        System.out.println(prefix(array2)); // abc









    }
}
