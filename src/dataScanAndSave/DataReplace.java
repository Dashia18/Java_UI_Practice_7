package dataScanAndSave;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Daria Serebryakova on 14.12.2016.
 */
public class DataReplace {

    public static String discountReplace(String path, String name, String dataOld, String dataNew) {

        List<String> strList = new LinkedList<String>();
        strList = MyScanner.fileScannerToSrtList(path);//read file to list for replace nedded data
        String finalStr = "";
        for (String str:strList){

            if(str.contains(name) && str.contains(dataOld)){ //find string in list with name key and old data
                str = str.replaceAll(dataOld, dataNew);//replaca discount
                System.out.println(str + " changed");
            }

            finalStr = finalStr.concat(str+"\n");//make String from list
        }
        return finalStr;
    }
    public static String nameReplace(String path, String name, String newName) {

        List<String> strList = new LinkedList<String>();
        strList = MyScanner.fileScannerToSrtList(path);//read file to list for replace nedded data
        String finalStr = "";
        for (String str:strList){

            if(str.contains(name) ){ //find string in list with name key
                str = str.replaceAll(name, newName);//replaca name
                System.out.println(str + " changed");
            }

            finalStr = finalStr.concat(str+"\n");//make String from list
        }
        return finalStr;
    }

}
