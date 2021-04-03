package sel.edu.module3.collections.LaboratoryWorkNo2.Objects;

import sel.edu.module3.collections.LaboratoryWorkNo2.Interfaces.IAccounting;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class HotelLux
 * @version 1.0.0
 * @since 03.04.21 - 22, 42
 * */

/* Laboratory work No2.
Topic: Object-oriented programming, JavaCollectionFramework.

 - Choose a subject according to your number. Develop a service using
   all your best in OOP and Java collections.
 - Six methods must be written like in the following example. A point
   for each one.
Creative approaches are welcome. */

    /*    Choose a subject according to your number. Develop a service using *\
    \*    all your best in OOP and Java collections.                         */

    // 1. Create two appropriate classes and 5 objects of each one.

public class HotelLux implements IAccounting {

    private String name;
    private double numberOfDays;
    private double priceForApartments;

    public HotelLux() {
    }

    public HotelLux(String name, double numberOfDays,
                    double priceForApartments) {
        this.name               = name;
        this.numberOfDays       = numberOfDays;
        this.priceForApartments = priceForApartments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(double numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getPriceForApartments() {
        return priceForApartments;
    }

    public void setPriceForApartments(double priceForApartments) {
        this.priceForApartments = priceForApartments;
    }

    @Override
    public double getFinalPrice() {
        return this.getNumberOfDays() * this.getPriceForApartments();
    }

    @Override
    public String toString() {
        return "HotelLux{" +
                "name='" + name + '\'' +
                ", numberOfDays=" + numberOfDays +
                ", priceForApartments=" + priceForApartments +
                '}';
    }
}
