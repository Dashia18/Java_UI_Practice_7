package dataScanAndSave;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by Daria Serebryakova on 15.12.2016.
 */
public class DataSort {
    public static String sort(String fName, String byType) {
       String finalStr = "";

        switch (fName) {
            case "clients": {
                String path = "data\\clients.txt";
                if (byType.equals("name")) {
                    finalStr = sorting(path, 0);
                } else if (byType.equals("discount")) {
                    finalStr = sorting(path, 2);
                }
                System.out.println("clients sorted by " + byType);
                break;
            }
            case "products": {
                String path = "data\\products.txt";
                if (byType.equals("name")) {
                    finalStr = sorting(path, 0);
                } else if (byType.equals("count")) {
                    finalStr = sorting(path, 1);
                } else if (byType.equals("price")) {
                    finalStr = sorting(path, 2);
                }
                System.out.println("products sorted by " + byType);
                break;
            }
            default: {
                System.out.println("File not found");
            }
        }
        return finalStr;
    }



    public static String sorting(String path, int parameter) {

        List<String> strList = new LinkedList<>();
        strList = MyScanner.fileScannerToSrtList(path);

        String[][] arr = new String[strList.size()][2];

        Pattern pattern2 = Pattern.compile("[ ,!?\\[\\]]");
        int i = 0;
        for (String str2:strList){
            String[] words2 = pattern2.split(str2);

            arr[i][0] = words2[parameter];
            arr[i][1] = str2;
            i++;
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] cmp1, String[] cmp2) {
                return cmp1[0].compareTo(cmp2[0]);   // сравнение по первому столбцу
            }
        });

        String finalStr = "";
        for (String[] str1: arr){
            finalStr = finalStr + str1[1] + "\n";
        }
        System.out.println(finalStr);

        return finalStr;
    }
}
