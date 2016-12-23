package uiShop.actionListeners;

import dataScanAndSave.SaveToFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 20.12.2016.
 */
public class ALObjectData {
    public  static String objectData;
    public static ActionListener getActionListener(JTextField textPath, JTextArea textOut) {
        ActionListener aL = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newObject = textPath.getText();
                objectData = newObject;
                textOut.append(textPath.getText() + "\n");
                SaveToFile.addToFile(ALTextPath.path,newObject);
            }
        };
        return aL;
    }
}
