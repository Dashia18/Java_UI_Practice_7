package dataScanAndSave;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Created by Daria Serebryakova on 12.12.2016.
 */
public class MyScanner {

    public static String txtScanner(String path) {
        String txtFile = "";
        boolean isPrint = true;
        try {
            Scanner in = new Scanner(new File(path));
            StringBuffer data = new StringBuffer();
            while (in.hasNext()) {
                data.append(in.nextLine()).append("\n");
            }

            txtFile = data.toString();
        } catch (FileNotFoundException e){
            isPrint = false;
            System.out.println("file \"" + path + "\" not found");
//            e.printStackTrace();
        }catch ( Exception ex ) {
            isPrint = false;
            ex.printStackTrace();
        }

        if(isPrint){
            System.out.println("file \"" + path + "\" found \nfile contents:");
            System.out.println(txtFile);
        }

        return txtFile;
    }

    public static List<String> fileScannerToSrtList(String path) {
        List<String> strList = new LinkedList<>();
        try {
            Scanner in = new Scanner(new File(path));
            while (in.hasNext()){
                strList.add(in.nextLine());
            }
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
        return strList;
    }

    public static String consoleScanner() {
        Scanner in = new Scanner(System.in);
        String inpStr = in.nextLine();
        return  inpStr;
    }

}
