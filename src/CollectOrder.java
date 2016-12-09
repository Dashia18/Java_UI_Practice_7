import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class CollectOrder {

    public static LinkedList<Product> orderCollecter(){

//        Product product1 = new Pen(2,25.0,1,0.5,"Gel", "red");
        Product product2 = new Pen(1,50.7,3,0.5,"Ball", "red","blue", "black");
        Product product3 = new NoteBook(2, 60, "A5", "Yellow", "line", 96);
        Product product4 = new Cutter(1, 44.68, "Yellow","steel");

        LinkedList<Product> products = new LinkedList<>();
//        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

//        Iterator<Product> iter1 = products.iterator();
//        System.out.println("Your order:");
//        while(iter1.hasNext()){
//            System.out.println("*" + iter1.next() + " ");
//        }
//        System.out.println();

        return products;
    }
}
