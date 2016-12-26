package uiShop.actionListeners;

import dataScanAndSave.MyScanner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 20.12.2016.
 */
public class ALTextPath {
    public static String path;

    public static ActionListener getActionListener(JTextField textPath, JTextArea textOut) {
        ActionListener aL = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String filePath = textPath.getText();
                if (filePath.length() == 0) {
                    textOut.append("Error: insert path \n");
                    path = filePath;
                } else {
                    String fileData = MyScanner.txtScanner(filePath);//    data\clients.txt
                    textOut.append(MyScanner.runningMassage);
                    textOut.append(fileData + "\n");
                }
            }
        };
        return aL;
    }
}
