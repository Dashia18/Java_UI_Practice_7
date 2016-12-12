package stationeryShop;

import java.util.LinkedList;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Order {
    private static int numberOfOrder = 0;
    private Client client;
    private LinkedList<Product> products;



    public Order(Client client, LinkedList<Product> products) {
        numberOfOrder++;
        this.client = client;
        this.products = products;

    }

    @Override
    public String toString() {
        return  numberOfOrder+
                " " + client +
                " " + products ;
    }
}
