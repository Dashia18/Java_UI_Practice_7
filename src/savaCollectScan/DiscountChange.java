package savaCollectScan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Daria Serebryakova on 14.12.2016.
 */
public class DiscountChange {
    public static void chageDiscount(String path, String name, String data) {

        String txtFile = MyScanner.txtScanner(path);


        StringBuffer strBuf = new StringBuffer(txtFile);


        int begInd = strBuf.indexOf(name);


        System.out.println(begInd);
        System.out.println(name.length());
        strBuf = strBuf.replace(begInd + name.length() + 1, begInd + name.length() + 1 + 3, data);

        System.out.println(strBuf);

        FileWriter fw = null;
        File file = new File("data\\clients.txt");

        txtFile = strBuf.toString();

        try {
            fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(txtFile);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
