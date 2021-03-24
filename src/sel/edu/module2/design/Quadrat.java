package sel.edu.module2.design;

import sel.edu.module2.polymorphism.interfaces.IGeometry;

public class Quadrat implements IGeometry {
    private int side;

    public Quadrat() {
    }

    public Quadrat(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "side=" + side +
                '}';
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
