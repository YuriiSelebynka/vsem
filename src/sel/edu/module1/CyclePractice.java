package sel.edu.module1;

import static sel.edu.module1.Palindrom.*;
import static sel.edu.module1.Palindrom.isPalindrom2;


/**
 * @author Yurii Selebynka
 * @version 1.0.0
 * @project vsem
 * @class vsem
 * @since 12-Mar-21 - 15.14
 **/

/* Cycles. Practice.

 1. Write to console 8 facts about yourself using primitive types. (1 points)
 2. Check a string as a palindrome ( 3 points)
 3. Get the area limited by the following functions
    x = 0 .. 3.14;    y = sin(x);   y = 0.1 * k,
    where k is the last cipher in your student card; (2 points) */

public class CyclePractice {

    // 2.  Check a string as a palindrome. \\

    //Ist way.

    public static boolean isPalindrom1(String text) {
        text = "abcdcba";
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); // remove garbage
        text = text.toLowerCase();

        boolean result = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    // IInd way (with building a reverse string).

    public static boolean isPalindrom2(String text) {

        text = "abcdcba";
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); // remove garbage
        text = text.toLowerCase();
        boolean result = true;
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed.equals(text);
    }

    // IIIrd way (using Stringbuilder).

    public static boolean isPalindrom3(String text) {
        text = "abcdcba";
        text = text.replaceAll("[^A-Za-zА-Яа-я]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        String reversed = sb.reverse().toString();
        boolean result;
        if (text.equals(reversed)) {
            result = true;
        } else {
            result = false;
        }
        return (reversed.equals(text)) ? true : false;} // - тернарний оператор

//***************************************************************************\\

    // 3.  Get the area limited by the following functions. \\

    /* Last number of my student card is 2. */

    public static double getIntegral(int secant) {
        double start = 0;
        double finish = Math.PI;
        int steps = 10;
        double step = (finish - start) / steps;
        double area = 0;
        double height = 0;

        for (int i = 0; i < steps; i++) {
            if (Math.sin(i * step) < 0.1 * secant) {
                height = Math.sin(i * step);
            } else {
                height = 0.1 * secant;
            }
            double currentArea = height * step;
            area = area + currentArea;
        }
        return area;
    }

//***************************************************************************\\

    public static void main(String[] args) {

        // 1. Write to console 8 facts about yourself using primitive types. \\

        byte myAge = 24;
        short myHeight = 160;
        float myWeight = 53.7f;
        double myIQ = 125.11;
        long randomLong = 75_000_000_000_000l;
        int randomInt = 1_000_000_000;
        char randomChar = '@';
        boolean randomBoolean = true;
        String aboutMyself = "My name is Yurii." + "\n" + "I am " +
                myAge + " years old." + "\n" + "My height is " +
                myHeight + "cm. My weight is " + myWeight + "kg." +
                "\n" + "My IQ is " + myIQ + ". " + "Random long type is " +
                randomLong + "nm." + "\n" + "Random integer is " +
                randomInt + ". " + "Random char is " + randomChar + "."
                + "\n" + "I think therefore i Am is " + randomBoolean + ".";

//***************************************************************************\\

        /*Here are result for tasks.*/

        System.out.println("\n" + "Results for Ist task of Cycle practice:");
        System.out.println(aboutMyself);
        System.out.println(
                "=========================================================" +
                        "\n");

        System.out.println("Results for IInd task of Cycle practice:");

        String text = "abcdcba";
        System.out.println("The first way");
        System.out.println(text + " is a palindrom  - " + isPalindrom1(text));
        System.out.println("The second way");
        System.out.println(text + " is a palindrom  - " + isPalindrom2(text));
        System.out.println("The third way");
        System.out.println(text + " is a palindrom  - " + isPalindrom3(text));
        System.out.println(
                "=========================================================" +
                        "\n");

        System.out.println("Results for IIIrd task of Cycle practice:");
        System.out.println("The area limited by the functions x = 0 .. 3.14;" +
                " y = sin(x); y = 0.1 * k is ");
        System.out.print(getIntegral(2));
        System.out.println("\n" + "******  Thank You for attention:)  ******");
        }
    }


