package sel.edu.exercises;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class MyInteger
 * @version 1.0.0
 * @since 28.03.21 - 00, 38
 * */

/* Programming patterns. Factory, Builder.
Develop for your class:
1. Factory;
2. Abstract factory;
3. Create a builder for the class Student;
4. Create a class MyInteger.
   Design a method public static boolean isPrime(int num). */

/*4. Create a class MyInteger.
     Design a method public static boolean isPrime(int num). */

public class MyInteger {
    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(11)); // true
        System.out.println(isPrime(21)); // false
        System.out.println(isPrime(31)); // true
        System.out.println(isPrime(1001)); // false
    }
}
