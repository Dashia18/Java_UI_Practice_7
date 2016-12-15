package dataScanAndSave;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Daria Serebryakova on 15.12.2016.
 */
public class DataFilter {


    public static String filterFileData(String path, String name) {

        List<String> strList = new LinkedList<String>();
        strList = MyScanner.fileScannerToSrtList(path);//read file to list
        String finalStr = "";
        for (String str:strList){

            if(str.contains(name) ){ //find string in list with name key
                finalStr = finalStr.concat(str+"\n");//make String from list
            }
        }
        System.out.println(finalStr);
        return finalStr;
    }

}
