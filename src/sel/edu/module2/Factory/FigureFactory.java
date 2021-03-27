package sel.edu.module2.Factory;

import sel.edu.module2.design.Cube;
import sel.edu.module2.design.Quadrat;
import sel.edu.module2.design.Triangle;
import sel.edu.module2.polymorphism.interfaces.IGeometry1;

public class FigureFactory {
    public static IGeometry1 create(int length, int width) {

        if (length == width) {
            return new Quadrat(length);
        }
    return new Rectangle3(length, width);
    }

    public static IGeometry1 create(double a, double b, double c) {

        return new Triangle(a, b, c);
    }

    public static IGeometry1 create(double a, double b) {
        double c = Math.sqrt(a * a + b * b);

        return new Triangle(a, b, c);
    }

    public static IGeometry1 create(double a, double b, Figures figure) {
        if (figure.equals(Figures.TRIANGLE))
            return new Triangle(a,b,Math.sqrt(a * a + b * b));
        if (figure.equals(Figures.RECTANGLE))
            return new Rectangle3( (int) a, (int) b);
        return  null;

    }

    public static IGeometry1 create(double a, Figures figure) {
        if (figure.equals(Figures.TRIANGLE)) return new Triangle(a, a, a);
        if (figure.equals(Figures.QUADRAT)) return new Quadrat((int) a);
        if (figure.equals(Figures.CUBE)) return new Cube(a);
        return null;
    }
}
