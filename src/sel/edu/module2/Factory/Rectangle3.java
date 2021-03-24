package sel.edu.module2.Factory;

import sel.edu.module2.polymorphism.interfaces.IGeometry;

public class Rectangle3 implements IGeometry {
    int length;
    int width;

    public Rectangle3() {
    }

    public Rectangle3(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle3{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }
    // не створюючи об`єкт класу
    public static int getArea(int length, int width) {
        return length * width;
    }
}
