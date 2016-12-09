/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Mian {

    public static void main(String[] args) {

        Product product1 = new Pen(2,25.0,1,0.5,"Gel", "red");
        System.out.println("product1 = " + product1);

        Product product2 = new Pen(1,50.7,3,0.5,"Ball", "red","blue", "black");
        System.out.println("product2 = " + product2);

        Client client1 = new Client("Ivanov I.I", 5);
        System.out.println("client1 = " + client1);

        Product product3 = new NoteBook(2, 60, "A5", "Yellow", "line", 96);
        System.out.println("product3 = " + product3);
        
        Product product4 = new Cutter(1, 44.68, "Yellow","steel");
        System.out.println("product4 = " + product4);

    }
}
