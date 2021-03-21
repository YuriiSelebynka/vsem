package sel.edu;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class Cylinder
 * @version 1.0.0
 * @since 21.03.21 - 15, 50
 * */

/*  Java class design

Create a class from the attached document according to the order in your group
(i am the 21th in group - so i picked class cylinder).
  The class must contain:
1. Constructor.
2. Getters/Setters.
3. 5 methods.
4. Override toString() method
5. Override hash() and equals() methods.*/

    public class Cylinder {
        private double h;
        private double r;

    public Cylinder() {
        }

        /* 1. Create a constructor. */

    public Cylinder(double h, double r) {
        this.h = h;
        this.r = r;
    }

        /* 2. Create getters/setters. */

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    /* 3. Create 5 methods. */

    // I have been created one more method.

    public double getDiameterOfBase () {
        return this.r * 2;
    }

    public double getLengthOfBase () {
        return 2 * Math.PI * this.r;
    }

    public double getSideSurfaceArea () {
        return 2 * Math.PI * this.h * this.r;
    }

    public double getAreaOfBase () {
        return Math.PI * this.r * this.r;
    }

    public double getTotalArea () {
        return 2 * Math.PI * r * (this.h + this.r);
    }

    public double getVolume () {
        return Math.PI * this.r * this.r * this.h;
    }

    /* 4. Override toString() method. */

    @Override
    public String toString() {
        return "Parameters of the Cylinder: " + "\n" +
                "1. Height is " + h + " sm;" + "\n" +
                "2. Radius is " + r + " sm;" + "\n" +
                "3. The diameter of base is " +
                this.getDiameterOfBase() + " sm;" +
                "4. Length of base  is " + this.getLengthOfBase() + " sm;" +
                "\n" +"5. The side surface area is " +
                this.getSideSurfaceArea() + " sm;" + "\n" +
                "6. The area of base is " + this.getAreaOfBase() + " sm;" +
                "7. The total area is " + this.getTotalArea() + " sm;" +
                "8. The volume is " + this.getVolume() + " sm.";
    }

    /* 5. Override hash() and equals() methods. */

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

//*************************THANK YOU FOR ATTENTION!**************************\\
}
