package sel.edu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, world!");

        // 2.  Check a string as a palindrome. \\
        // Ist way. \\


        String[] sentences = new String[5];
        sentences[0] = "Rats live on no evil star.";
        sentences[1] = "А кобыле цена дана, да не целы бока.";
        sentences[2] = "This sentence is not palindrome.";
        sentences[3] = "І що сало? Ласощі…";
        sentences[4] = "Це не паліндром.";




        System.out.println("Results for IInd task of Cycle practice:");

        for (int i = 0; i < sentences.length; i++) {

            System.out.println(sentences[i] + " - ");


            sentences[i] = sentences[i].replaceAll("[^A-Za-zА-Яа-я]", "");
            sentences[i] = sentences[i].replaceAll("\\ ", "");
            sentences[i] = sentences[i].replaceAll("\\–", "");
            sentences[i] = sentences[i].replaceAll("\\.", "");
            sentences[i] = sentences[i].replaceAll("\\,", "");
            sentences[i] = sentences[i].replaceAll("\\?", "");
            sentences[i] = sentences[i].replaceAll("\\!", "");
            sentences[i] = sentences[i].toLowerCase();

            String template = "";

            for (int k = 0; k < sentences[i].length(); k++) {
                int index = sentences[i].length() - k - 1;
                template += sentences[i].charAt(index);
            }


            if (sentences[i].equals(template)) {
                System.out.println("    This sentence is palindrome.");
            } else {
                System.out.println("    This sentence is not palindrome.");
            }

            //2nd way.

        }

        // 3.  Get the area limited by the following functions. \\
        double start = 0;
        double finish = Math.PI;
        double deltaX = 0.1;
        double y = 0.2; // 2 is the last cipher in my student card

        double area = 0;


        for (double x = 0; x < finish; x += deltaX) {
            double rectangle = 0;
            if (Math.sin(x) < y) {
                rectangle = Math.sin(x) * deltaX;
            } else {
                rectangle = y * deltaX;
            }
            area += rectangle;
        }
        System.out.println("Results for IIIrd task of Cycle practice:");
        System.out.println("The area limited by the functions x = 0 .. 3.14;" +
                " y = sin(x); y = 0.1 * k is " + area);
        System.out.println("\n" + "******  Thank You for attention:)  ******");
    }
}


