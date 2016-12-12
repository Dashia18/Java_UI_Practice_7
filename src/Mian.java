import savaCollectScan.CollectOrder;
import savaCollectScan.ScanTxt;
import stationeryShop.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Mian {

    public static void main(String[] args) {

        LinkedList<Order> orders = CollectOrder.orderCollecter();

        ScanTxt.txtScaner("data\\clients.txt");








    }

}
