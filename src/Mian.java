import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;

import java.util.LinkedList;


/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Mian {

    public static void main(String[] args) {

        Client client1 = new Client("Ivanov O.P", 5);
        Client client2 = new Client("Petrov A.P", 7);
        LinkedList<Product> products1 = CollectOrder.orderCollecter();

        Order order1 = new Order(client1, products1);
        System.out.println("order1 = " + order1);
        Order order2 = new Order(client2, products1);
        System.out.println("order2 = " + order2);


        String str = "Hello";
//        File file = new File("OrderStore.txt");

        writeUsingOutputStream(order1.getOrderString());



    }

    private static void writeUsingOutputStream(String data) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File("OrderStore.txt"));
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
