package sel.edu.module2.design.interfacesForClasses;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @interface IGeometry
 * @version 1.0.0
 * @since 27.03.21 - 20, 00
 **/

/* Polymorphism.

Create and implement  two interfaces for your class. */

public interface IGeometry { /* Creating the first interface */
    public double getDiameterOfBase ();
    public double getLengthOfBase ();
    public double getSideSurfaceArea ();
    public double getAreaOfBase ();
    public double getTotalArea ();
    public double getVolume ();
}
