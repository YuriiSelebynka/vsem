package sel.edu.exercises;

public class MyInteger {
    public static boolean isPrime(int num) {
        // determine is the number prime or not
        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                // is not prime number
            }

        }
        return false;
    }

    // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 - приклади простих чисел Prime numbers
    public static void main(String[] args) {
        System.out.println(isPrime(11)); // true
        System.out.println(isPrime(21)); // false
        System.out.println(isPrime(31)); // true
        System.out.println(isPrime(1001)); // ??-
    }
}
