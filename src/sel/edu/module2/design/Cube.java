package sel.edu.module2.design;

import sel.edu.module2.polymorphism.interfaces.IGeometry1;

public class Cube implements IGeometry1 {
    private double side;

    public Cube(double side) {
        this.side = side;
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
