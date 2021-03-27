package sel.edu.module2.design.factories;

import sel.edu.module2.design.Cylinder;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class CylinderFactory
 * @version 1.0.0
 * @since 27.03.21 - 20, 40
 * */

/* Programming patterns. Factory, Builder.

Develop for your class:
1. Factory;
2. Abstract factory;
3. Create a builder for the class Student;
4. Create a class MyInteger.
Design a method  public static boolean isPrime(int num). */

/* 1. Developing factory for class Cylinder. */

public class CylinderFactory {
    public static Cylinder create (double h, double r) {
        return new Cylinder(h, r);
    }
}
