package stationeryShop;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Client {
    private String name;
    private double discount;

    public Client() {
    }

    public Client(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + ' ' +
                " " + discount;
    }
}
