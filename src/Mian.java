import savaCollectScan.CollectOrder;
import savaCollectScan.DiscountChange;
import savaCollectScan.MyScanner;
import savaCollectScan.SaveToFile;
import stationeryShop.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Mian {

    public static void main(String[] args) {

//        LinkedList<Order> orders = CollectOrder.orderCollecter();

        //3a
//        System.out.println("Insert the path:");
//        String dataConsole;
//        dataConsole = MyScanner.consoleScanner();//data\\clients.txt
//        MyScanner.txtScanner(dataConsole);

        //3b
//        System.out.println("Insert the path:");
//        String path = MyScanner.consoleScanner();//"data\\clients.txt"
//        System.out.println("Insert object data to add:");
//        String object = MyScanner.consoleScanner();//"Kozlov A.G. 3.0"
//        SaveToFile.addToFile(path,object);

        //3c

//        System.out.println("Insert object name to change (Secondname F.M. - format):");
//        String object = MyScanner.consoleScanner();//"Kozlov A.G."
//        System.out.println("Insert new discount:");
//        String discount = MyScanner.consoleScanner();//"12.0"
        DiscountChange.chageDiscount("data\\clients.txt", "Anisimova A.P.", "2.0");







    }

}
