package sel.edu.module2.design;

import sel.edu.module2.polymorphism.interfaces.IGeometry;

public class Cube implements IGeometry {
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
