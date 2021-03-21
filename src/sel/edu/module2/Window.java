package sel.edu.module2;

import java.util.Objects;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class Window
 * @version 1.0.0
 * @since 21.03.21 - 19, 07
 * */

/* Inheritance
1. Create a child from the class Rectangle.
2. Create a class Person and a class Student as its daughter. 25 fields. */

    /*  1. Create a child from the class Rectangle. */

public class Window extends Rectangle {
    String nameOfModel;
    String materialOfFrame;
    String typeOfGlass;
    String colorOfFrame;
    String purpose;
    int    numberOfSections;

    public Window (int length, int width, String nameOfModel,
                   String materialOfFrame, String typeOfGlass,
                   String colorOfFrame, String purpose,
                   int numberOfSections){
        super (length, width);
        this.nameOfModel = nameOfModel;
        this.materialOfFrame = materialOfFrame;
        this.typeOfGlass = typeOfGlass;
        this.colorOfFrame = colorOfFrame;
        this.purpose = purpose;
        this.numberOfSections = numberOfSections;
    }

    /* ======================= Getters and setters. ======================== */

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    public String getMaterialOfFrame() {
        return materialOfFrame;
    }

    public void setMaterialOfFrame(String materialOfFrame) {
        this.materialOfFrame = materialOfFrame;
    }

    public String getTypeOfGlass() {
        return typeOfGlass;
    }

    public void setTypeOfGlass(String typeOfGlass) {
        this.typeOfGlass = typeOfGlass;
    }

    public String getColorOfFrame() {
        return colorOfFrame;
    }

    public void setColorOfFrame(String colorOfFrame) {
        this.colorOfFrame = colorOfFrame;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNumberOfSections() {
        return numberOfSections;
    }

    public void setNumberOfSections(int numberOfSections) {
        this.numberOfSections = numberOfSections;
    }

    /* ========================== Equals method. =========================== */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Window window = (Window) o;
        return numberOfSections == window.numberOfSections &&
                Objects.equals(nameOfModel, window.nameOfModel) &&
                Objects.equals(materialOfFrame, window.materialOfFrame) &&
                Objects.equals(typeOfGlass, window.typeOfGlass) &&
                Objects.equals(colorOfFrame, window.colorOfFrame) &&
                Objects.equals(purpose, window.purpose);
    }

    /* ============================ Hash method. =========================== */

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfModel, materialOfFrame,
                            typeOfGlass, colorOfFrame, purpose,
                            numberOfSections);
    }

    /* ========================= ToString method. ========================== */

    @Override
    public String toString() {
        return "Window{" +
                "nameOfModel='" + nameOfModel + '\'' +
                ", materialOfFrame='" + materialOfFrame + '\'' +
                ", typeOfGlass='" + typeOfGlass + '\'' +
                ", colorOfFrame='" + colorOfFrame + '\'' +
                ", purpose='" + purpose + '\'' +
                ", numberOfSections=" + numberOfSections +
                '}';
    }
}

//*************************THANK YOU FOR ATTENTION!**************************\\