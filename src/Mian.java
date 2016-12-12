import savaAndCollect.SaveClientsToFile;
import savaAndCollect.SaveOrderToFile;
import savaAndCollect.SaveProductsToFile;
import stationeryShop.*;

import java.util.LinkedList;


/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Mian {

    public static void main(String[] args) {

        Client client1 = new Client("Ivanov O.P", 5);
        Client client2 = new Client("Petrov A.P", 7);
        LinkedList<Client> clients = new LinkedList<>();
        clients.add(client1);
        clients.add(client2);
        SaveClientsToFile.saveToFile(clients);


        LinkedList<Product> products1 = new LinkedList<>();
        LinkedList<Product> products2 = new LinkedList<>();
        products1.add(new Pen(2,25.0,1,0.5,"Gel", "red"));
        products1.add(new Pen(2,25.0,1,0.5,"Gel", "blue"));
        products2.add(new NoteBook(2, 60, "A5", "Yellow", "line", 96));
        LinkedList<LinkedList<Product>> products = new LinkedList<>();
        products.add(products1);
        products.add(products2);
        SaveProductsToFile.saveToFile(products);


        Order order1 = new Order(client1, products1);
        System.out.println("order1 = " + order1);
        Order order2 = new Order(client2, products2);
        System.out.println("order2 = " + order2);
        LinkedList<Order> orders = new LinkedList<>();
        orders.add(order1);
        orders.add(order2);
        SaveOrderToFile.saveToFile(orders);


        String str = "Hello";




    }

}
