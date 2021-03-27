package sel.edu;

//import sel.edu.module2.design.Person0;

import sel.edu.module2.Factory.*;
import sel.edu.module2.design.MaritalStatus;
import sel.edu.module2.design.Person0;
import sel.edu.module2.design.Triangle;
import sel.edu.module2.design.factories.AbstractFactory;
import sel.edu.module2.design.factories.AbstractFigures;
import sel.edu.module2.design.interfacesForClasses.IGeometry;
import sel.edu.module2.model.Student2;
import sel.edu.module2.polymorphism.Rectangle2;
import sel.edu.module2.polymorphism.interfaces.IGeometry1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, world!");

        // 2.  Check a string as a palindrome. \\
        // Ist way. \\


        /*String[] sentences = new String[5];
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
        System.out.println("\n" + "******  Thank You for attention:)  ******");*/

        Person0 johnLennon = new Person0 ("John", "Hippie", "Lennon",
                LocalDate.of(1955, Month.MARCH, 12), MaritalStatus.MARRIED);

        //System.out.println(johnLennon.getAge());
        //System.out.println(johnLennon.toString());
        Rectangle2 rec2 = new Rectangle2(3,4);
        rec2.toJSON();
        rec2.toXML();

        Rectangle3 r22 = new Rectangle3(3,4);
        //System.out.println(r22.getArea());
        //System.out.println(Rectangle3.getArea(7, 8)); // не створюючи об`єкт класу
        Rectangle3 r33 = RectangleFactory.create(3,4);

        Triangle t34 = TriangleFactory.create(1,1,10);
        //System.out.println(t34);

        double PI = Math.PI;
        double x = Math.sqrt(2);

        IGeometry1 cube = FigureFactory.create(3, Figures.CUBE);
        // OR IGeometry cube = (Cube) FigureFactory.create(3, Figures.CUBE);

        List<IGeometry1> list = new ArrayList<>();
        list.add(cube);

        Student2 student = new Student2("Ivan", "Ivahovych", "Ivanko",
                LocalDate.of(2000,1,1), true, "phone");

        Student2 st2 = new Student2.Builder()
                .setFirstName("Sergiy")
                .setLastName("Condor")
                .setPatronymic("Sergiovych")
                .setBirth(LocalDate.of(2000,1,1))
                .setGender(true)
                .setPhone("1313666")
                .build();

        Student2 st3 = new Student2.Builder()
                .setSimilarTo(st2)
                .setFirstName("Igor")
                .setPhone("12345")
                .build();

        Student2 st4 = st3;  // similar object to st3 - WRONG WAY
        st4.setFirstName("Yaroslav");

        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);

/*****************************************************************************/

/* Checking an abstract factory. */
        IGeometry cone = AbstractFactory.create(4,4,AbstractFigures.CONE);
        System.out.println(cone);


    }
}


