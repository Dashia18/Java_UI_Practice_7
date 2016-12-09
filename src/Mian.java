/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Mian {

    public static void main(String[] args) {

        Product product1 = new Pen(500,2,1,0.5,"Gel", "red");
        System.out.println("product1 = " + product1);

        Product product2 = new Pen(700,1,3,0.5,"Ball", "red","blue", "black");
        System.out.println("product2 = " + product2);



    }
}
