package uiShop.actionListeners;

import dataScanAndSave.DataSort;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 23.12.2016.
 */
public class ALSortType {
    public static String finalStr;

    public static ActionListener getActionListenerS(JTextArea textOut) {
        ActionListener aL2 = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = ((JRadioButton)e.getSource()).getText();
                switch (name){
                    case "name":{
                        textOut.append(name+"\n");

                        String finalStr2 = DataSort.sort("clients", name);
                        finalStr = finalStr2;
                        textOut.append(ALSortType.finalStr + "\n");
                        break;
                    }
                    case "discount":{
                        textOut.append(name+"\n");
                        String finalStr2 = DataSort.sort("clients", name);
                        finalStr = finalStr2;
                        textOut.append(ALSortType.finalStr + "\n");
                        break;
                    }
                }
            }
        };
        return aL2;
    }


    public static ActionListener getActionListenerP(JTextArea textOut) {
        ActionListener aL3 = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = ((JRadioButton)e.getSource()).getText();
                switch (name){
                    case "name":{
                        textOut.append(name+"\n");
                        String finalStr2 = DataSort.sort("products", name);
                        finalStr = finalStr2;
                        textOut.append(ALSortType.finalStr + "\n");
                        break;
                    }
                    case "count":{
                        textOut.append(name+"\n");
                        String finalStr2 = DataSort.sort("products", name);
                        finalStr = finalStr2;
                        textOut.append(ALSortType.finalStr + "\n");
                        break;
                    }
                    case "price":{
                        textOut.append(name+"\n");
                        String finalStr2 = DataSort.sort("products", name);
                        finalStr = finalStr2;
                        textOut.append(ALSortType.finalStr + "\n");
                        break;
                    }
                }
            }
        };

        return aL3;

    }

}


