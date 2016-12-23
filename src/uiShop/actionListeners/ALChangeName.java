package uiShop.actionListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 20.12.2016.
 */
public class ALChangeName {
    public static ActionListener getActionListener(JTextField textChangeName, JTextArea textOut) {
        ActionListener aL = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String changeName = textChangeName.getText();
                textOut.append(textChangeName.getText() + "\n");
            }
        };
        return aL;
    }
}
