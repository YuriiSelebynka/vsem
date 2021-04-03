package sel.edu.module3.collections.LaboratoryWorkNo2;

import sel.edu.module3.collections.LaboratoryWorkNo2.Interfaces.IAccounting;
import sel.edu.module3.collections.LaboratoryWorkNo2.Objects.HotelLux;
import sel.edu.module3.collections.LaboratoryWorkNo2.Objects.HotelStandard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class WorkSheet
 * @version 1.0.0
 * @since 03.04.21 - 22, 16
 * */

/* Laboratory work No2.
Topic: Object-oriented programming, JavaCollectionFramework.

 - Choose a subject according to your number. Develop a service using
   all your best in OOP and Java collections.
 - Six methods must be written like in the following example. A point
   for each one.
Creative approaches are welcome. */

public class WorkSheet {

    public static void main(String[] args) {

    /*    Choose a subject according to your number. Develop a service using *\
    \*    all your best in OOP and Java collections.                         */

        System.out.println("       MODELLED SITUATION FOR TASK:" + "\n" +
                           "3 friends arrived to big resort city for " +
                           "weekends." + "\n" + "They are looking for best " +
                           "hotel for staying. There" + "\n" + "are 5 hotels " +
                           "of Standard-class and 5 - Lux-hotels." + "\n" +
                           "You may think that Standard hotels have better " +
                           "and" + "\n" + "cheaper prices, but don't forget " +
                           "about lunches and" + "\n" + "fact, that they " +
                           "(3) need space for sleeping." + "\n" + "So, " +
                           "let`s find out!");

        System.out.print("\n");
        System.out.println("------------------------------------------------");

        // 1. Create two appropriate classes and 5 objects of each one.

        List<IAccounting> listOfHotels = new ArrayList<>(
                Arrays.asList(
                        new HotelStandard("Tiachiv", 3,250,2,
                                100,1),
                        new HotelStandard("Polissia", 3, 125, 3,
                                3,50),
                        new HotelStandard("WestSide",3,245,2,
                                1,100),
                        new HotelStandard("EuroHotel", 3,300,3,
                                2,70),
                        new HotelStandard("Kordon",3,75,3,
                                2,50),
                        new HotelLux("WorldOfAstoria",3,1000),
                        new HotelLux("Korop",3,2000),
                        new HotelLux("TrumpTower",3,450),
                        new HotelLux("OceanDrive",3,400),
                        new HotelLux("Lucky38",3,400)
                )
        );

    /* 2. Six methods must be written like in the following example. A point *\
    \*    for each one.                                                      */

        // 2. Calculate the total price of a hotels.

        double sum = listOfHotels.stream()
                .mapToDouble(IAccounting::getFinalPrice).sum();
        System.out.println("The total price of hotels is " + sum + " USD.");
        System.out.println("------------------------------------------------");

        // 3. Finding the highest price.

        double expensive  = listOfHotels.stream()
                .mapToDouble(IAccounting::getFinalPrice).max().getAsDouble();
        System.out.println("The highest price is " + expensive + " USD.");
        System.out.println("------------------------------------------------");

        // 4. Finding the lowest price.

        double cheap      = listOfHotels.stream()
                .mapToDouble(IAccounting::getFinalPrice).min().getAsDouble();
        System.out.println("The lowest price is " + cheap + " USD.");
        System.out.println("------------------------------------------------");

        // 5. Finding the average price.

        double average    = listOfHotels.stream()
                .mapToDouble(IAccounting::getFinalPrice).average()
                .getAsDouble();
        System.out.println("The average price is " + average + " USD.");
        System.out.println("------------------------------------------------");

        // 6. Comparing prices.

        double sumHotelStandard = listOfHotels.stream()
                .filter(el->el instanceof HotelStandard)
                .mapToDouble(IAccounting::getFinalPrice).sum();

        double sumHotelLux = listOfHotels.stream()
                .filter(el->el instanceof HotelLux)
                .mapToDouble(IAccounting::getFinalPrice).sum();

        if (sumHotelStandard > sumHotelLux) {
            System.out.println("Standard-hotels cost more expensive.");
        } else if (sumHotelStandard < sumHotelLux) {
            System.out.println("Lux-hotels cost more expensive.");
        } else {
            System.out.println("Prices of both types of hotels are equal.");
        }
        System.out.println("------------------------------------------------");

//=================================== SOUT: =================================\\

        /*       MODELLED SITUATION FOR TASK:
          3 friends arrived to big resort city for weekends.
          They are looking for best hotel for staying. There
          are 5 hotels of Standard-class and 5 - Lux-hotels.
          You may think that Standard hotels have better and
          cheaper prices, but don't forget about lunches and
          fact, that they (3) need space for sleeping.
          So, let`s find out!

          ------------------------------------------------
          The total price of hotels is 20810.0 USD.
          ------------------------------------------------
          The highest price is 6000.0 USD.
          ------------------------------------------------
          The lowest price is 775.0 USD.
          ------------------------------------------------
          The average price is 2081.0 USD.
          ------------------------------------------------
          Lux-hotels cost more expensive.
          ------------------------------------------------  */

//==========               THANK YOU FOR ATTENTION :)              ==========\\
    }
}
