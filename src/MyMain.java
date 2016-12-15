import dataScanAndSave.*;

/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class MyMain {

    public static void main(String[] args) {

        //call stationary shop to colect order
//        LinkedList<Order> orders = CollectOrder.orderCollecter();


        //3a - disploy file data
            System.out.println("Insert the path:");
            String path1 = MyScanner.consoleScanner();//"data\\clients.txt"
            MyScanner.txtScanner(path1);

        //3b - add new oblect to file
            System.out.println("Insert the path:");
            String path2 = MyScanner.consoleScanner();//"data\\clients.txt"
            System.out.println("Insert object data to add:");
                  String object = MyScanner.consoleScanner();//"Kozlov A.G. 3.0"
            SaveToFile.addToFile(path2,object);

//        //3c - change information in file
            System.out.println("Insert object Secondname to change:");
            String name = MyScanner.consoleScanner();//"Anisimova A.P."
            System.out.println("Insert old discount:");
            String discountOld = MyScanner.consoleScanner();//"12.0"
            System.out.println("Insert new discount:");
            String discountNew = MyScanner.consoleScanner();//"5.0"

                String finalStr1 = DataReplace.discountReplace("data\\clients.txt", name, discountOld,discountNew);
                SaveToFile.saveToFile("data\\clients.txt",finalStr1);

            System.out.println("Insert NEW object Secondname to change:");
            String newName = MyScanner.consoleScanner();//"Anisimova A.P."
            String nameStr = DataReplace.nameReplace("data\\clients.txt", name, newName);
            SaveToFile.saveToFile("data\\clients.txt",nameStr);



        //3d - sort file data
            System.out.println("Insert name of file {clients, products}:");
            String fName = MyScanner.consoleScanner();
            System.out.println("Insert the type of sort " +
            "{sorted client by name, discount}, {sorted products by name, count, price} :");
            String byType = MyScanner.consoleScanner();

                  String finalStr2 = DataSort.sort(fName, byType);
            System.out.println("Insert the path for save:");
            String pathSave = MyScanner.consoleScanner();//"data\\clientsSorted.txt", "data\\productsSorted.txt"
                   SaveToFile.saveToFile(pathSave,finalStr2);


        //Filtering
        System.out.println("Insert path");
        String path3 = MyScanner.consoleScanner();//"data\\clients.txt"
        System.out.println("Insert criteria:");
        String criteria = MyScanner.consoleScanner();//"12.0"
            String nameStrr = DataFilter.filterFileData(path3, criteria);
            SaveToFile.saveToFile("data\\clientsFiltering.txt",nameStrr);

    }

}
