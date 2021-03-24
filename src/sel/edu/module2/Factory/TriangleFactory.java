package sel.edu.module2.Factory;

import sel.edu.module2.design.Triangle;

public class TriangleFactory {
    public static Triangle create (int a, int b, int c) {
        if (a + b <= c) {
    return null;
        }
        return new Triangle(a, b, c);
    }
}
