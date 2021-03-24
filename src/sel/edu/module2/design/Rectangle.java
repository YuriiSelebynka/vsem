package sel.edu.module2.design;

import sel.edu.module2.polymorphism.interfaces.IGeometry;

import java.util.Objects;

public class Rectangle implements IGeometry {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        // logic
        return length;
    }

    public void setLength(int length) {
        // logic
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = (width >= 0) ? width : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length = " + length +
                ", width = " + width +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getArea(){
        return this.getWidth() * this.getLength();
    }

}
