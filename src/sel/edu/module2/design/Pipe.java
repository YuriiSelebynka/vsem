package sel.edu.module2.design;

import sel.edu.module2.design.interfacesForClasses.IGeometry;
import sel.edu.module2.design.interfacesForClasses.IPackings;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class pipe
 * @version 1.0.0
 * @since 27.03.21 - 21, 18
 * */

/* Programming patterns. Factory, Builder.

Develop for your class:
1. Factory;
2. Abstract factory;
3. Create a builder for the class Student;
4. Create a class MyInteger.
   Design a method  public static boolean isPrime(int num). */

public class Pipe implements IGeometry, IPackings {
    double h;
    double outerR;
    double innerR;

    public Pipe() {
    }

    public Pipe(double h, double outerR, double innerR) {
        this.h = h;
        this.outerR = outerR;
        this.innerR = innerR;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getOuterR() {
        return outerR;
    }

    public void setOuterR(double outerR) {
        this.outerR = outerR;
    }

    public double getInnerR() {
        return innerR;
    }

    public void setInnerR(double innerR) {
        this.innerR = innerR;
    }

    @Override
    public String toString() {
        return "Pipe{" +
                "h=" + h +
                ", outerR=" + outerR +
                ", innerR=" + innerR +
                '}';
    }

    @Override
    public double getDiameterOfBase() {
        return 0;
    }

    @Override
    public double getLengthOfBase() {
        return 0;
    }

    @Override
    public double getSideSurfaceArea() {
        return 0;
    }

    @Override
    public double getAreaOfBase() {
        return 0;
    }

    @Override
    public double getTotalArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public String toJSON() {
        return null;
    }

    @Override
    public String toXML() {
        return null;
    }
}
