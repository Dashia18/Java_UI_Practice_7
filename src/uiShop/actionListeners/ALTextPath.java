package uiShop.actionListener;

import dataScanAndSave.MyScanner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 20.12.2016.
 */
public class ALTextPath {
    public static ActionListener getActionListener(JTextField textPath, JTextArea textOut) {
        ActionListener aL = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String filePath = textPath.getText();
                String fileData=  MyScanner.txtScanner(filePath);//    data\clients.txt
                textOut.append(textPath.getText() + "\n");
                textOut.append(fileData + "\n");

            }
        };
        return aL;
    }

}
