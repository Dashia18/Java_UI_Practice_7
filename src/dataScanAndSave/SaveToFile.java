package dataScanAndSave;
import stationeryShop.*;
import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Daria Serebryakova on 12.12.2016.
 */
public class SaveToFile {
    public static String runningMassage;
    //methods for work with file
    public static void saveToFile(String path, String finalStr) {
        FileWriter fw = null;
        File file = new File(path);
        boolean isSave = true;

        try {
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(finalStr);
            bw.close();
        } catch (IOException e) {
            isSave = false;
            runningMassage = "Data didn't saved\n";
            e.printStackTrace();
        }
        if(isSave){
            System.out.println("Data saved\n");
            runningMassage = "Data saved\n";
        }
    }
    public static void addToFile(String path, String data) {

        FileWriter fileWriter = null;
        boolean isAdd = true;
        try {
            fileWriter = new FileWriter(new File(path),true);
            fileWriter.write(data + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            isAdd = false;
            runningMassage = "Object \"" + data + "\" didn't add\n";
            e.printStackTrace();
        }
        if(isAdd){
            System.out.println("Object \"" + data + "\" add\n");
            runningMassage = "Object \"" + data + "\" add\n";
        }
    }
    public static void changeFile(String path, String data) {

        FileInputStream fileInput = null;
        boolean isChange = true;

        try {

            fileInput = new FileInputStream(new File(path));

        } catch (IOException e) {
            isChange = false;
            runningMassage = "Object \"" + data + "\" didn't changed\n";
            e.printStackTrace();
        }
        if(isChange){
            System.out.println("Object \"" + data + "\" changed\n");
            runningMassage = "Object \"" + data + "\"  changed\n";
        }
    }


    //methods for stationary Shop
    public static void saveListToFile(LinkedList<?> clients, String path) {//Wildcard
        Writer writer = null;
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));

            for (Object o:  clients) {
                writer.append(o.toString() + "\r\n");
            }
            writer.flush();

        } catch (IOException ex) {
            runningMassage = "list of clients didn't saved";
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
            runningMassage = "list of products didn't saved";
            ex.printStackTrace();
        }
    }
}
