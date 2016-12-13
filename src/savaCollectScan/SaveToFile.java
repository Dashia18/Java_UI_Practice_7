package savaCollectScan;
import stationeryShop.*;
import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Daria Serebryakova on 12.12.2016.
 */
public class SaveToFile {

    public static void saveToFile(LinkedList<?> clients, String path) {//Wildcard
        Writer writer = null;
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));

            for (Object o:  clients) {
                writer.append(o.toString() + "\r\n");
            }
            writer.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    public static void saveProductToFile(LinkedList<LinkedList<Product>> products) {
        Writer writer = null;
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream("data\\products.txt"), "UTF-8"));


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
