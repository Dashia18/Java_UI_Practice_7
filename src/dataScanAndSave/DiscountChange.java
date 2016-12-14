package dataScanAndSave;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Daria Serebryakova on 14.12.2016.
 */
public class DiscountChange {
    public static void chageObjectData(String path, String name, String dataOld, String dataNew) {

        List<String> strList = new LinkedList<String>();
        strList = MyScanner.fileScannerToSrtList(path);
        String finalStr = "";
        for (String str:strList){
            if(str.contains(name) && str.contains(dataOld)){
                str = str.replaceAll(dataOld, dataNew);
                System.out.println(str + " changed");
            }
            finalStr = finalStr.concat(str+"\n");
        }
        SaveToFile.saveToFile(path,finalStr);
    }
}
