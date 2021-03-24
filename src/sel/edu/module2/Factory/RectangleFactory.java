package sel.edu.module2.Factory;

public class RectangleFactory {
    public static Rectangle3 create (int length, int width) {
        return new Rectangle3 (length, width);
    }

    
}
