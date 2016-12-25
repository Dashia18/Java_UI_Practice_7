package uiShop.actionListeners;

import dataScanAndSave.SaveToFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

/**
 * Created by Daria Serebryakova on 20.12.2016.
 */
public class ALAddData {

    public static ActionListener getActionListener(JTextField textPath, JTextArea textOut) {
        ActionListener aL = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newObject = textPath.getText();
                if (newObject.length()==0){
                    textOut.append("Error: insert object data \n");
                }
                else{
                    textOut.append(textPath.getText() + "\n");
                    SaveToFile.addToFile(ALTextPath.path,newObject);
                    textOut.append(SaveToFile.runningMassage);
                }

            }
        };
        return aL;
    }
}
