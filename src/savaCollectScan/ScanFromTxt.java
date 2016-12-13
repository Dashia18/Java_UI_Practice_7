package savaCollectScan;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Daria Serebryakova on 12.12.2016.
 */
public class ScanFromTxt {

    public static void txtScaner(String path) {
        LinkedList<String> info = new LinkedList<>();

        try {
            Scanner in = new Scanner(new File(path));
            StringBuffer data = new StringBuffer();
            while (in.hasNext())
                data.append(in.nextLine()).append("\n");
            info.add(data.toString());
//                System.out.println(data.toString());
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }

        for(String str : info){
            System.out.println(str);
        }
    }
}
