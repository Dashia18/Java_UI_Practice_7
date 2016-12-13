import savaCollectScan.CollectOrder;
import savaCollectScan.ScanFromConsole;
import savaCollectScan.ScanFromTxt;
import stationeryShop.*;
import java.util.LinkedList;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Mian {

    public static void main(String[] args) {

        LinkedList<Order> orders = CollectOrder.orderCollecter();

        ScanFromTxt.txtScaner("data\\clients.txt");

        String dataConsole;
        dataConsole = ScanFromConsole.consoleScaner();
            System.out.println(dataConsole);









    }

}
