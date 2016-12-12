package stationeryShop;

import java.util.LinkedList;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Order {
    private int numberOfOrder = 0;
    private static int counter = 1;
    private Client client;
    private LinkedList<Product> products;



    public Order(Client client, LinkedList<Product> products) {
        numberOfOrder = counter;
        counter++;
        this.client = client;
        this.products = products;


    }
//    public static int getCurrNumberOfOrder(){
//
//        return numberOfOrder;
//    }
    @Override
    public String toString() {
        return  numberOfOrder+
                " " + client +
                " " + products ;
    }
}
