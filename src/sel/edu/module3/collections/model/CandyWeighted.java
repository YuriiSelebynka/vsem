package sel.edu.module3.collections.model;

import sel.edu.module3.collections.interfaces.IAccounting;

public class CandyWeighted implements IAccounting {
    private String name;
    private double weight;
    private double priceForCandy;

    public CandyWeighted(String name, double weight, double priceForCandy) {
        this.name = name;
        this.weight = weight;
        this.priceForCandy = priceForCandy;
    }

    public CandyWeighted() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPriceForCandy() {
        return priceForCandy;
    }

    public void setPriceForCandy(double priceForCandy) {
        this.priceForCandy = priceForCandy;
    }

    @Override
    public String toString() {
        return "CandyWeighted{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", priceForCandy=" + priceForCandy +
                '}';
    }

    @Override
    public double getUltimatePrice() {
        return this.getPriceForCandy() * this.getWeight();
    }
}
