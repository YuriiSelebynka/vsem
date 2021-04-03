package sel.edu.module3.collections.LaboratoryWorkNo2.Objects;

import sel.edu.module3.collections.LaboratoryWorkNo2.Interfaces.IAccounting;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class HotelStandard
 * @version 1.0.0
 * @since 03.04.21 - 22, 33
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

public class HotelStandard implements IAccounting {

    private String name;
    private double numberOfDays;
    private double priceForBed;
    private double numberOfBeds;
    private double priceForOptionalServices;
    private double numberForOptionalServices;

    public HotelStandard() {
    }

    public HotelStandard(String name, double numberOfDays, double priceForBed,
                         double numberOfBeds, double priceForOptionalServices,
                         double numberForOptionalServices) {
        this.name                      = name;
        this.numberOfDays              = numberOfDays;
        this.priceForBed               = priceForBed;
        this.numberOfBeds              = numberOfBeds;
        this.priceForOptionalServices  = priceForOptionalServices;
        this.numberForOptionalServices = numberForOptionalServices;
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

    public double getPriceForBed() {
        return priceForBed;
    }

    public void setPriceForBed(double priceForBed) {
        this.priceForBed = priceForBed;
    }

    public double getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(double numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPriceForOptionalServices() {
        return priceForOptionalServices;
    }

    public void setPriceForOptionalServices(double priceForOptionalServices) {
        this.priceForOptionalServices = priceForOptionalServices;
    }

    public double getNumberForOptionalServices() {
        return numberForOptionalServices;
    }

    public void setNumberForOptionalServices(
            double numberForOptionalServices) {
        this.numberForOptionalServices = numberForOptionalServices;
    }

    @Override
    public double getFinalPrice() {
        return (this.getNumberOfDays() * this.getPriceForBed() *
                this.getNumberOfBeds()) + (this.getPriceForOptionalServices() *
                this.getNumberForOptionalServices());
    }

    @Override
    public String toString() {
        return "HotelStandard{" +
                "name='" + name + '\'' +
                ", numberOfDays=" + numberOfDays +
                ", priceForBed=" + priceForBed +
                ", numberOfBeds=" + numberOfBeds +
                ", priceForOptionalServices=" + priceForOptionalServices +
                ", numberForOptionalServices=" + numberForOptionalServices +
                '}';
    }
}
