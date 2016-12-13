package savaCollectScan;
import stationeryShop.*;
import java.util.LinkedList;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class CollectOrder {

    public static LinkedList<Order> orderCollecter(){

        //Clients
        Client client1 = new Client("Ivanov O.P", 5);
        Client client2 = new Client("Anisimova A.P", 7);
        Client client3 = new Client("Romanova U.R", 5);
        Client client4 = new Client("Pushkin A.S", 7);

        LinkedList<Client> clients = new LinkedList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
        SaveToFile.saveToFile(clients, "data\\clients.txt");

        //Products for clients
        LinkedList<Product> products1 = new LinkedList<>();
        LinkedList<Product> products2 = new LinkedList<>();
        products1.add(new Pen(2,25.0,1,0.5,"Gel", "red"));
        products1.add(new Pen(2,25.0,1,0.5,"Gel", "blue"));
        products2.add(new NoteBook(2, 60, "A5", "Yellow", "line", 96));

        LinkedList<Product> products3 = new LinkedList<>();
        products3.add(new Cutter(1, 38, "Black", "steel"));

        LinkedList<Product> products4 = new LinkedList<>();
        products4.add(new Pen(2,25.0,3,0.5,"Gel", "red", "blue", "green"));

        LinkedList<LinkedList<Product>> products = new LinkedList<>();
        products.add(products1);
        products.add(products2);
        products.add(products3);
        products.add(products4);
        SaveToFile.saveProductToFile(products);

        //Order = client + product list
        Order order1 = new Order(client1, products1);
        Order order2 = new Order(client2, products2);
        Order order3 = new Order(client3, products3);
        Order order4 = new Order(client4, products4);
        LinkedList<Order> orders = new LinkedList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        SaveToFile.saveToFile(orders,"data\\orders.txt");

//        for(Order order : orders){
//            System.out.println(order);
//        }

        return orders;
    }
}
