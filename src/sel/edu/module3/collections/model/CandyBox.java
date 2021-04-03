package sel.edu.module3.collections.model;

import sel.edu.module3.collections.interfaces.IAccounting;

public class CandyBox implements IAccounting {
    private String name;
    private double weight;
    private double priceForCandy; // pricePerBox
    private double priceForBox;
    private int amount;

    public CandyBox(String name, double weight, double priceForCandy, double priceForBox, int amount) {
        this.name = name;
        this.weight = weight;
        this.priceForCandy = priceForCandy;
        this.priceForBox = priceForBox;
        this.amount = amount;

    }

    public CandyBox() {
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

    public double getPriceForBox() {
        return priceForBox;
    }

    public void setPriceForBox(double priceForBox) {
        this.priceForBox = priceForBox;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", priceForCandy=" + priceForCandy +
                ", priceForBox=" + priceForBox +
                ", amount=" + amount +
                '}';
    }

    @Override
    public double getUltimatePrice() {
        return (this.getPriceForBox() + this.getPriceForCandy() * this.weight) * amount;
    }
}
