package sel.edu.module2.design;

import sel.edu.module2.design.interfacesForClasses.IGeometry;
import sel.edu.module2.design.interfacesForClasses.IPackings;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class Cone
 * @version 1.0.0
 * @since 27.03.21 - 20, 12
 * */

/* Programming patterns. Factory, Builder.

Develop for your class:
1. Factory;
2. Abstract factory;
3. Create a builder for the class Student;
4. Create a class MyInteger.
   Design a method  public static boolean isPrime(int num). */

public class Cone implements IGeometry, IPackings {
    double h;
    double lowR;

    public Cone() {
    }

    public Cone(double h, double lowR) {
        this.h = h;
        this.lowR = lowR;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getLowR() {
        return lowR;
    }

    public void setLowR(double lowR) {
        this.lowR = lowR;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "h=" + h +
                ", lowR=" + lowR +
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
