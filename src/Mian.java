import dataScanAndSave.*;


/**
 * Created by Daria Serebryakova on 09.12.2016.
 */
public class Mian {

    public static void main(String[] args) {

//        LinkedList<Order> orders = CollectOrder.orderCollecter();

        //3a

        //3b
        System.out.println("Insert the path:");
        String path = MyScanner.consoleScanner();//"data\\clients.txt"
        System.out.println("Insert object data to add:");
        String object = MyScanner.consoleScanner();//"Kozlov A.G. 3.0"
        SaveToFile.addToFile(path,object);

        //3c

        System.out.println("Insert object Secondname to change:");
        String name = MyScanner.consoleScanner();//"Anisimova A.P."
        System.out.println("Insert old discount:");
        String discountOld = MyScanner.consoleScanner();//"12.0"
        System.out.println("Insert new discount:");
        String discountNew = MyScanner.consoleScanner();//"5.0"
        DiscountChange.chageObjectData("data\\clients.txt", name, discountOld,discountNew);







    }

}
