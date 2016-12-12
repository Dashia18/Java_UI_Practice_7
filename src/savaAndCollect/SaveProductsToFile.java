package savaAndCollect;

import stationeryShop.*;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Daria Serebryakova on 12.12.2016.
 */
public class SaveProductsToFile {

    public static void saveToFile(LinkedList<LinkedList<Product>> products) {
        Writer writer = null;
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream("products.txt"), "UTF-8"));


            Iterator<LinkedList<Product>> iter1 = products.iterator();
            while(iter1.hasNext()){

                Iterator<Product> iter2 = iter1.next().iterator();
                while(iter2.hasNext()){
                    writer.append(iter2.next().toString() + "\r\n");
                }

            }
            writer.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
