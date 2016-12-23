package uiShop.actionListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 23.12.2016.
 */
public class ALChooseClientTypeSort {

    public static ActionListener getActionListener(JTextArea textOut) {
        ActionListener aL2 = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = ((JRadioButton)e.getSource()).getText();
                switch (name){
                    case "name":{
                        textOut.append(name+"\n");
                        break;
                    }
                    case "discount":{
                        textOut.append(name+"\n");
                        break;
                    }
                }
            }
        };
        return aL2;
    }
}


