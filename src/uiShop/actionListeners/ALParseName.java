package uiShop.actionListeners;

import dataScanAndSave.SaveToFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

/**
 * Created by Daria Serebryakova on 20.12.2016.
 */
public class ALParseName {

    public  static String objectName;
    public  static String objectDiscount;

    public static ActionListener getActionListener(JTextField textPath, JTextArea textOut) {
        ActionListener aL = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newObject = textPath.getText();
                if (newObject.length()==0){
                    textOut.append("Error: insert the object \n");
                }
                else{
                    Pattern pattern = Pattern.compile("[ ,!?\\[\\]]");
                    String[] words2 = pattern.split(newObject);

                    if(words2.length<3){
                        textOut.append("Error: inserted object is incorrect\n");
                    }
                    else{
                        objectName = words2[0] +" "+ words2[1];//name
                        objectDiscount = words2[2];// discount
                        textOut.append(objectName + " ");
                        textOut.append(objectDiscount + "will be chanced\n");
                    }


                }



            }
        };
        return aL;
    }
}
