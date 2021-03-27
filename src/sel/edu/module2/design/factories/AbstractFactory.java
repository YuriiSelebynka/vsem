package sel.edu.module2.design.factories;

import javafx.scene.shape.Circle;
import sel.edu.module2.Factory.Figures;
import sel.edu.module2.design.*;
import sel.edu.module2.design.interfacesForClasses.IGeometry;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class AbstractFactory
 * @version 1.0.0
 * @since 27.03.21 - 21, 10
 * */

/* Programming patterns. Factory, Builder.

Develop for your class:
1. Factory;
2. Abstract factory;
3. Create a builder for the class Student;
4. Create a class MyInteger.
   Design a method  public static boolean isPrime(int num). */

/* 2. Developing an abstract factory. */

public class AbstractFactory {
    public static IGeometry create(double h, double r) {
        if (h == 0) {
            return (IGeometry) new Circle(r);
        }
        return new Cylinder(h, r);
    }

    public static IGeometry create(double h, double lowR, double highR,
                                   double outerR, double innerR) {
        if (lowR == highR) {
            return new Cylinder(h, lowR);
        }
        else if (highR == 0) {
            return new Cone(h, lowR);
        }
        else if (outerR > innerR) {
            return new Pipe(h, innerR, outerR);
        }
        return new TruncatedCone(h, lowR, highR);
    }

    public static IGeometry create(double h, double lowR, double highR,
                                   double innerR, double outerR,
                                   AbstractFigures figure) {
        if (figure.equals(AbstractFigures.CIRCLE))
            return (IGeometry) new Circle(lowR);
        if (figure.equals(AbstractFigures.TRUNCATEDCONE))
            return new TruncatedCone(h, lowR, highR);
        if (figure.equals(AbstractFigures.CONE))
            return new Cone(h,lowR);
        if (figure.equals(AbstractFigures.PIPE))
            return new Pipe(h,innerR,outerR);
        return null;
    }

}
