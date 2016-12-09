import java.util.LinkedList;
import java.util.Iterator;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Mian {

    public static void main(String[] args) {

        Client client1 = new Client("Ivanov I.I", 5);
        Client client2 = new Client("Petrov A.P", 7);
        LinkedList<Product> products1 = CollectOrder.orderCollecter();

        Order order1 = new Order(client1, products1);
        System.out.println("order1 = " + order1);
        Order order2 = new Order(client2, products1);
        System.out.println("order2 = " + order2);

    }
}
