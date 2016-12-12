package savaAndCollect;
import stationeryShop.*;
import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Daria Serebryakova on 12.12.2016.
 */
public class SaveClientsToFile {

    public static void saveToFile(LinkedList<Client> clients) {
        Writer writer = null;
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream("clients.txt"), "UTF-8"));


            Iterator<Client> iter = clients.iterator();
            while(iter.hasNext()){
                writer.append(iter.next().toString() + "\r\n");
            }
            writer.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
