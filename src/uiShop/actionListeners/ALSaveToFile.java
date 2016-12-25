package uiShop.actionListeners;

import dataScanAndSave.SaveToFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 23.12.2016.
 */
public class ALSaveToFile {
    public static ActionListener getActionListener(JTextField textPath, JTextArea textOut) {
        ActionListener aL = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String filePath = textPath.getText();

                if (filePath.length()==0){
                    textOut.append("Error: insert path to save data \n");
                }
                else {
                    SaveToFile.saveToFile(filePath,ALSortType.finalStr);
                    textOut.append(SaveToFile.runningMassage);
                }

            }
        };
        return aL;
    }
}
