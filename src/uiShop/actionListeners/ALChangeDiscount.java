package uiShop.actionListeners;

import dataScanAndSave.DataReplace;
import dataScanAndSave.SaveToFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 20.12.2016.
 */
public class ALChangeDiscount {
    public static String discountData;

    public static ActionListener getActionListener(JTextField newDiscount, JTextArea textOut) {
        ActionListener aL = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newData = newDiscount.getText();
                discountData = newData;

                String finalStr1 = DataReplace.discountReplace(ALTextPath.path,
                                                               ALParseName.objectName,
                                                               ALParseName.objectDiscount,newData);
                textOut.append(ALParseName.objectName + " "+ newData + " is changed\n");
                SaveToFile.saveToFile(ALTextPath.path,finalStr1);
                textOut.append(ALParseName.objectName + " "+ newData + " is saved to"+ ALTextPath.path +"\n");
            }
        };
        return aL;
    }
}
