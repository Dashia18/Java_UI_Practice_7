package savaAndCollect;

import stationeryShop.*;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Daria Serebryakova on 12.12.2016.
 */
public class SaveOrderToFile {
    public static void saveToFile(LinkedList<Order> orders) {
        Writer writer = null;
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream("data\\orders.txt"), "UTF-8"));


            Iterator<Order> iter = orders.iterator();
            while(iter.hasNext()){
                writer.append(iter.next().toString() + "\r\n");
            }
            writer.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
