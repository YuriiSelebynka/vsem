package sel.edu.module2.design;

import sel.edu.module2.polymorphism.interfaces.IGeometry;

public class Triangle implements IGeometry {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
