package sel.edu.module2.model;

public class Person1 {
    private String idCard;

    public Person1() {
    }

    public Person1(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "idCard='" + idCard + '\'' +
                '}';
    }
}
