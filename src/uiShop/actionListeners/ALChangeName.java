package uiShop.actionListeners;

import dataScanAndSave.DataReplace;
import dataScanAndSave.SaveToFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

/**
 * Created by Daria Serebryakova on 20.12.2016.
 */
public class ALChangeName {
    public static ActionListener getActionListener(JTextField textChangeName, JTextArea textOut) {
        ActionListener aL = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newName = textChangeName.getText();

                if (newName.length()==0){
                    textOut.append("Error: insert new data \n");
                }
                else {

                    textOut.append(textChangeName.getText() + "\n");
                    textOut.append(ALParseName.objectName + "\n");
                    textOut.append(newName + "\n");
                    String nameStr = DataReplace.nameReplace(ALTextPath.path, ALParseName.objectName, newName);

                    textOut.append(ALParseName.objectName + " is changed\n");
                    SaveToFile.saveToFile(ALTextPath.path, nameStr);
                    textOut.append(SaveToFile.runningMassage);
                    textOut.append(newName + " is saved to" + ALTextPath.path + "\n");
                }

            }
        };
        return aL;
    }
}
