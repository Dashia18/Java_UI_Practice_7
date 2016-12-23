package uiShop.actionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 20.12.2016.
 */
public class ALNewDiscount {
    public static ActionListener getActionListener(JTextField newDiscount, JTextArea textOut) {
        ActionListener aL = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String filePath = newDiscount.getText();
                textOut.append(newDiscount.getText() + "\n");
            }
        };
        return aL;
    }
}
