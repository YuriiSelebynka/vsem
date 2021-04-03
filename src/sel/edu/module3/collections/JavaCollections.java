package sel.edu.module3.collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class JavaCollections
 * @version 1.0.0
 * @since 03.04.21 - 15, 52
 * */

/*   JavaCollectionsFramework. List.

1. Create ArrayList and LinkedList containing 100 000 Integer elements.
   Compare time intervals.
2. Insert new 1000 elements on the beginning, on the middle and on
   the end of ones. Compare time intervals.
3. Update 1000 elements from the beginning, from the middle and
   from the end of ones. Compare time intervals.
4. Delete 1000 elements from the  beginning, from the middle and
   from the end of ones. Compare time intervals.*/

public class JavaCollections {

    public static void main(String[] args) {

     /*    1. Create ArrayList and LinkedList containing 100 000 Integer  *\
     \*    elements. Compare time intervals.                              */

        System.out.println("    MEASURING THE TIME OF WORK WITH LISTS" + "\n");

        // Creating ArrayList with 100 000 Integer elements.

        LocalDateTime start1A = LocalDateTime.now(); /*Numbers 1, 2, 3, ...
                      means number of operation in order of all actions;
                      "A" means ArrayList, "L" - means LinkedList */


        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            integers.add(i);
        }

        LocalDateTime finish1A = LocalDateTime.now();

//***************************************************************************\\

        // Creating LinkedList with 100 000 Integer elements.

        LocalDateTime start1L = LocalDateTime.now();

        List<Integer> integersLinked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            integersLinked.add(i);
        }

        LocalDateTime finish1L = LocalDateTime.now();

//***************************************************************************\\

        // Comparing times of creating lists with 100 000 Integer elements.

        System.out.println("TIME NEEDED FOR CREATING LISTS (IN MS)");

        System.out.println("1. ArrayList: "
                + ChronoUnit.MILLIS.between(start1A, finish1A) + " ms.");

        System.out.println("2. LinkedList: "
                + ChronoUnit.MILLIS.between(start1L, finish1L) + " ms.");

        if (ChronoUnit.MILLIS.between(start1A, finish1A) <
            ChronoUnit.MILLIS.between(start1L, finish1L)) {
            System.out.println("3. Creating of ArrayList is faster.");
        } else if (ChronoUnit.MILLIS.between(start1A, finish1A) >
                   ChronoUnit.MILLIS.between(start1L, finish1L)) {
            System.out.println("3. Creating of LinkedList is faster.");
        } else {
            System.out.println("3. Speed is equal.");
        }

        System.out.println("************************************************");
        System.out.print("\n");

//***************************************************************************\\

    /*    2. Insert new 1000 elements on the beginning, on the middle and on *\
    \*    the end of ones. Compare time intervals.                           */

        // Inserting new 1000 elements in the beginning of ArrayList.

        LocalDateTime start2A = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.add(0, i);
        }

        LocalDateTime finish2A = LocalDateTime.now();

//***************************************************************************\\

        // Inserting new 1000 elements in the beginning of LinkedList.

        LocalDateTime start2L = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.add(0, i);
        }

        LocalDateTime finish2L = LocalDateTime.now();

//***************************************************************************\\

        // Comparing times of inserting new 1000 elements in the beginning
        // of lists.

        System.out.println("TIME NEEDED FOR INSERTING NEW 1000 ELEMENTS IN " +
                "\n" + "THE BEGINNING OF LISTS (IN MS)");

        System.out.println("1. ArrayList: "
                + ChronoUnit.MILLIS.between(start2A, finish2A) + " ms.");

        System.out.println("2. LinkedList: "
                + ChronoUnit.MILLIS.between(start2L, finish2L) + " ms.");

        if (ChronoUnit.MILLIS.between(start2A, finish2A) <
            ChronoUnit.MILLIS.between(start2L, finish2L)) {
            System.out.println("3. Inserting in the beginning of ArrayList" +
                    "\n" + "   is faster.");
        } else if (ChronoUnit.MILLIS.between(start2A, finish2A) >
                   ChronoUnit.MILLIS.between(start2L, finish2L)) {
            System.out.println("3. Inserting in the beginning of LinkedList" +
                    "\n" + "   is faster.");
        } else {
            System.out.println("3. Speed is equal.");
        }

        System.out.println("************************************************");
        System.out.print("\n");

//***************************************************************************\\

        // Inserting new 1000 elements in the middle of ArrayList.

        LocalDateTime start3A = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.add(50499, i);
        }

        LocalDateTime finish3A = LocalDateTime.now();

//***************************************************************************\\

        // Inserting new 1000 elements in the middle of LinkedList.

        LocalDateTime start3L = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.add(50499, i);
        }

        LocalDateTime finish3L = LocalDateTime.now();

//***************************************************************************\\

        // Comparing times of inserting new 1000 elements in the middle
        // of lists.

        System.out.println("TIME NEEDED FOR INSERTING NEW 1000 ELEMENTS IN " +
                "\n" + "THE MIDDLE OF LISTS (IN MS)");

        System.out.println("1. ArrayList: "
                + ChronoUnit.MILLIS.between(start3A, finish3A) + " ms.");

        System.out.println("2. LinkedList: "
                + ChronoUnit.MILLIS.between(start3L, finish3L) + " ms.");

        if (ChronoUnit.MILLIS.between(start3A, finish3A) <
            ChronoUnit.MILLIS.between(start3L, finish3L)) {
            System.out.println("3. Inserting in the middle of ArrayList" +
                    "\n" + "   is faster.");
        } else if (ChronoUnit.MILLIS.between(start3A, finish3A) >
                   ChronoUnit.MILLIS.between(start3L, finish3L)) {
            System.out.println("3. Inserting in the middle of LinkedList" +
                    "\n" + "   is faster.");
        } else {
            System.out.println("3. Speed is equal.");
        }

        System.out.println("************************************************");
        System.out.print("\n");

//***************************************************************************\\

        // Inserting new 1000 elements in the end of ArrayList.

        LocalDateTime start4A = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.add(101998, i);
        }

        LocalDateTime finish4A = LocalDateTime.now();

//***************************************************************************\\

        // Inserting new 1000 elements in the end of LinkedList.

        LocalDateTime start4L = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.add(101998, i);
        }

        LocalDateTime finish4L = LocalDateTime.now();

//***************************************************************************\\

        // Comparing times of inserting new 1000 elements in the end
        // of lists.

        System.out.println("TIME NEEDED FOR INSERTING NEW 1000 ELEMENTS IN " +
                "\n" + "THE END OF LISTS (IN MS)");

        System.out.println("1. ArrayList: "
                + ChronoUnit.MILLIS.between(start4A, finish4A) + " ms.");

        System.out.println("2. LinkedList: "
                + ChronoUnit.MILLIS.between(start4L, finish4L) + " ms.");

        if (ChronoUnit.MILLIS.between(start4A, finish4A) <
            ChronoUnit.MILLIS.between(start4L, finish4L)) {
            System.out.println("3. Inserting in the end of ArrayList" +
                    "\n" + "   is faster.");
        } else if (ChronoUnit.MILLIS.between(start4A, finish4A) >
                   ChronoUnit.MILLIS.between(start4L, finish4L)) {
            System.out.println("3. Inserting in the end of LinkedList" +
                    "\n" + "   is faster.");
        } else {
            System.out.println("3. Speed is equal.");
        }

        System.out.println("************************************************");
        System.out.print("\n");

//***************************************************************************\\

    /* 3. Update 1000 elements from the beginning, from the middle and       *\
    \*    from the end of ones. Compare time intervals.                      */

        // Updating 1000 elements in the beginning of ArrayList.

        LocalDateTime start5A = LocalDateTime.now();

            for (int i = 0; i < 1000; i++) {
                integers.set(0, i);
            }

        LocalDateTime finish5A = LocalDateTime.now();

//***************************************************************************\\

        // Updating 1000 elements in the beginning of LinkedList.

        LocalDateTime start5L = LocalDateTime.now();

            for (int i = 0; i < 1000; i++) {
                integersLinked.set(0, i);
            }

        LocalDateTime finish5L = LocalDateTime.now();

//***************************************************************************\\

        // Comparing times of updating 1000 elements in the beginning
        // of lists.

        System.out.println("TIME NEEDED FOR UPDATING 1000 ELEMENTS IN " +
                "\n" + "THE BEGINNING OF LISTS (IN MS)");

        System.out.println("1. ArrayList: "
                + ChronoUnit.MILLIS.between(start5A, finish5A) + " ms.");

        System.out.println("2. LinkedList: "
                + ChronoUnit.MILLIS.between(start5L, finish5L) + " ms.");

        if (ChronoUnit.MILLIS.between(start5A, finish5A) <
            ChronoUnit.MILLIS.between(start5L, finish5L)) {
            System.out.println("3. Updating in the beginning of ArrayList" +
                    "\n" + "   is faster.");
        } else if (ChronoUnit.MILLIS.between(start5A, finish5A) >
                   ChronoUnit.MILLIS.between(start5L, finish5L)) {
           System.out.println("3. Updating in the beginning of LinkedList" +
                   "\n" + "   is faster.");
        } else {
            System.out.println("3. Speed is equal.");
        }

        System.out.println("************************************************");
        System.out.print("\n");

//***************************************************************************\\

        // Updating 1000 elements in the middle of ArrayList.

        LocalDateTime start6A = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(51499, i);
        }

        LocalDateTime finish6A = LocalDateTime.now();

//***************************************************************************\\

        // Inserting 1000 elements in the middle of LinkedList.

        LocalDateTime start6L = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(51499, i);
        }

        LocalDateTime finish6L = LocalDateTime.now();

//***************************************************************************\\

        // Comparing times of updating 1000 elements in the middle
        // of lists.

        System.out.println("TIME NEEDED FOR UPDATING 1000 ELEMENTS IN " +
                "\n" + "THE MIDDLE OF LISTS (IN MS)");

        System.out.println("1. ArrayList: "
                + ChronoUnit.MILLIS.between(start6A, finish6A) + " ms.");

        System.out.println("2. LinkedList: "
                + ChronoUnit.MILLIS.between(start6L, finish6L) + " ms.");

        if (ChronoUnit.MILLIS.between(start6A, finish6A) <
            ChronoUnit.MILLIS.between(start6L, finish6L)) {
            System.out.println("3. Updating in the middle of ArrayList" +
                    "\n" + "   is faster.");
        } else if (ChronoUnit.MILLIS.between(start6A, finish6A) >
                   ChronoUnit.MILLIS.between(start6L, finish6L)) {
            System.out.println("3. Updating in the middle of LinkedList" +
                    "\n" + "   is faster.");
        } else {
            System.out.println("3. Speed is equal.");
        }

        System.out.println("************************************************");
        System.out.print("\n");

//***************************************************************************\\

        // Updating 1000 elements in the end of ArrayList.

        LocalDateTime start7A = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(102998, i);
        }

        LocalDateTime finish7A = LocalDateTime.now();

//***************************************************************************\\

        // Updating 1000 elements in the end of LinkedList.

        LocalDateTime start7L = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(102998, i);
        }

        LocalDateTime finish7L = LocalDateTime.now();

//***************************************************************************\\

        // Comparing times of updating 1000 elements in the end
        // of lists.

        System.out.println("TIME NEEDED FOR UPDATING 1000 ELEMENTS IN " +
                "\n" + "THE END OF LISTS (IN MS)");

        System.out.println("1. ArrayList: "
                + ChronoUnit.MILLIS.between(start7A, finish7A) + " ms.");

        System.out.println("2. LinkedList: "
                + ChronoUnit.MILLIS.between(start7L, finish7L) + " ms.");

        if (ChronoUnit.MILLIS.between(start7A, finish7A) <
            ChronoUnit.MILLIS.between(start7L, finish7L)) {
            System.out.println("3. Updating in the end of ArrayList" +
                    "\n" + "   is faster.");
        } else if (ChronoUnit.MILLIS.between(start7A, finish7A) >
                   ChronoUnit.MILLIS.between(start7L, finish7L)) {
            System.out.println("3. Updating in the end of LinkedList" +
                    "\n" + "   is faster.");
        } else {
            System.out.println("3. Speed is equal.");
        }

        System.out.println("************************************************");
        System.out.print("\n");

//***************************************************************************\\

    /* 4. Delete 1000 elements from the beginning, from the middle and       *\
    \*    from the end of ones. Compare time intervals.                      */

        // Deleting 1000 elements from the  beginning of ArrayList.

        LocalDateTime start8A = LocalDateTime.now();

            for (int i = 0; i < 1000; i++) {
                integers.remove(i);
            }

        LocalDateTime finish8A = LocalDateTime.now();

//***************************************************************************\\

        // Deleting 1000 elements from the beginning of LinkedList.

        LocalDateTime start8L = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(i);
        }

        LocalDateTime finish8L = LocalDateTime.now();

//***************************************************************************\\

        // Comparing times of deleting 1000 elements in the beginning
        // of lists.

        System.out.println("TIME NEEDED FOR DELETING 1000 ELEMENTS IN " +
                "\n" + "THE BEGINNING OF LISTS (IN MS)");

        System.out.println("1. ArrayList: "
                + ChronoUnit.MILLIS.between(start8A, finish8A) + " ms.");

        System.out.println("2. LinkedList: "
                + ChronoUnit.MILLIS.between(start8L, finish8L) + " ms.");

        if (ChronoUnit.MILLIS.between(start8A, finish8A) <
            ChronoUnit.MILLIS.between(start8L, finish8L)) {
            System.out.println("3. Deleting in the beginning of ArrayList" +
                    "\n" + "   is faster.");
        } else if (ChronoUnit.MILLIS.between(start8A, finish8A) >
                   ChronoUnit.MILLIS.between(start8L, finish8L)) {
            System.out.println("3. Deleting in the beginning of LinkedList" +
                    "\n" + "   is faster.");
        } else {
            System.out.println("3. Speed is equal.");
        }

        System.out.println("************************************************");
        System.out.print("\n");

//***************************************************************************\\

        // Deleting 1000 elements from the middle of ArrayList.

        LocalDateTime start9A = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(50999 + i);
        }

        LocalDateTime finish9A = LocalDateTime.now();

//***************************************************************************\\

        // Deleting 1000 elements from the middle of LinkedList.

        LocalDateTime start9L = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(50999 + i);
        }

        LocalDateTime finish9L = LocalDateTime.now();

//***************************************************************************\\

        // Comparing times of deleting 1000 elements in the middle
        // of lists.

        System.out.println("TIME NEEDED FOR DELETING 1000 ELEMENTS IN " +
                "\n" + "THE MIDDLE OF LISTS (IN MS)");

        System.out.println("1. ArrayList: "
                + ChronoUnit.MILLIS.between(start9A, finish9A) + " ms.");

        System.out.println("2. LinkedList: "
                + ChronoUnit.MILLIS.between(start9L, finish9L) + " ms.");

        if (ChronoUnit.MILLIS.between(start9A, finish9A) <
            ChronoUnit.MILLIS.between(start9L, finish9L)) {
            System.out.println("3. Deleting in the middle of ArrayList" +
                    "\n" + "   is faster.");
        } else if (ChronoUnit.MILLIS.between(start9A, finish9A) >
                   ChronoUnit.MILLIS.between(start9L, finish9L)) {
            System.out.println("3. Deleting in the middle of LinkedList" +
                    "\n" + "   is faster.");
        } else {
            System.out.println("3. Speed is equal.");
        }

        System.out.println("************************************************");
        System.out.print("\n");

//***************************************************************************\\

        // Deleting 1000 elements from the end of ArrayList.

        LocalDateTime start10A = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(98999 + i);
        }

        LocalDateTime finish10A = LocalDateTime.now();

//***************************************************************************\\

        // Deleting 1000 elements from the end of LinkedList.

        LocalDateTime start10L = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(98999 + i);
        }

        LocalDateTime finish10L = LocalDateTime.now();

//***************************************************************************\\

        // Comparing times of deleting 1000 elements in the end
        // of lists.

        System.out.println("TIME NEEDED FOR DELETING 1000 ELEMENTS IN " +
                "\n" + "THE END OF LISTS (IN MS)");

        System.out.println("1. ArrayList: "
                + ChronoUnit.MILLIS.between(start10A, finish10A) + " ms.");

        System.out.println("2. LinkedList: "
                + ChronoUnit.MILLIS.between(start10L, finish10L) + " ms.");

        if (ChronoUnit.MILLIS.between(start10A, finish10A) <
            ChronoUnit.MILLIS.between(start10L, finish10L)) {
            System.out.println("3. Deleting in the end of ArrayList" +
                    "\n" + "   is faster.");
        } else if (ChronoUnit.MILLIS.between(start10A, finish10A) >
                   ChronoUnit.MILLIS.between(start10L, finish10L)) {
            System.out.println("3. Deleting in the end of LinkedList" +
                    "\n" + "   is faster.");
        } else {
            System.out.println("3. Speed is equal.");
        }

        System.out.println("************************************************");
        System.out.print("\n");

        System.out.println("Final size of ArrayList is " + integers.size());
        System.out.println("Final size of LinkedList is " +
                integersLinked.size());
    }
}

//=================================== SOUT: ==================================\\

    /*MEASURING THE TIME OF WORK WITH LISTS

        TIME NEEDED FOR CREATING LISTS (IN MS)
        1. ArrayList: 21 ms.
        2. LinkedList: 42 ms.
        3. Creating of ArrayList is faster.
        ************************************************

        TIME NEEDED FOR INSERTING NEW 1000 ELEMENTS IN
        THE BEGINNING OF LISTS (IN MS)
        1. ArrayList: 14 ms.
        2. LinkedList: 0 ms.
        3. Inserting in the beginning of LinkedList
        is faster.
        ************************************************

        TIME NEEDED FOR INSERTING NEW 1000 ELEMENTS IN
        THE MIDDLE OF LISTS (IN MS)
        1. ArrayList: 5 ms.
        2. LinkedList: 113 ms.
        3. Inserting in the middle of ArrayList
        is faster.
        ************************************************

        TIME NEEDED FOR INSERTING NEW 1000 ELEMENTS IN
        THE END OF LISTS (IN MS)
        1. ArrayList: 1 ms.
        2. LinkedList: 7 ms.
        3. Inserting in the end of ArrayList
        is faster.
        ************************************************

        TIME NEEDED FOR UPDATING 1000 ELEMENTS IN
        THE BEGINNING OF LISTS (IN MS)
        1. ArrayList: 0 ms.
        2. LinkedList: 1 ms.
        3. Updating in the beginning of ArrayList
        is faster.
        ************************************************

        TIME NEEDED FOR UPDATING 1000 ELEMENTS IN
        THE MIDDLE OF LISTS (IN MS)
        1. ArrayList: 0 ms.
        2. LinkedList: 78 ms.
        3. Updating in the middle of ArrayList
        is faster.
        ************************************************

        TIME NEEDED FOR UPDATING 1000 ELEMENTS IN
        THE END OF LISTS (IN MS)
        1. ArrayList: 0 ms.
        2. LinkedList: 0 ms.
        3. Speed is equal.
        ************************************************

        TIME NEEDED FOR DELETING 1000 ELEMENTS IN
        THE BEGINNING OF LISTS (IN MS)
        1. ArrayList: 15 ms.
        2. LinkedList: 1 ms.
        3. Deleting in the beginning of LinkedList
        is faster.
        ************************************************

        TIME NEEDED FOR DELETING 1000 ELEMENTS IN
        THE MIDDLE OF LISTS (IN MS)
        1. ArrayList: 8 ms.
        2. LinkedList: 78 ms.
        3. Deleting in the middle of ArrayList
        is faster.
        ************************************************

        TIME NEEDED FOR DELETING 1000 ELEMENTS IN
        THE END OF LISTS (IN MS)
        1. ArrayList: 0 ms.
        2. LinkedList: 1 ms.
        3. Deleting in the end of ArrayList
        is faster.
        ************************************************

        Final size of ArrayList is 100000
        Final size of LinkedList is 100000

        Process finished with exit code 0 */


//==========               THANK YOU FOR ATTENTION :)              ==========\\