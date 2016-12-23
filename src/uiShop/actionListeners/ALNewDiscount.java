package uiShop.actionListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 20.12.2016.
 */
public class ALNewDiscount {
    public static String discountData;
    public static ActionListener getActionListener(JTextField newDiscount, JTextArea textOut) {
        ActionListener aL = new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newData = newDiscount.getText();
                discountData = newData;
                textOut.append(newDiscount.getText() + "\n");
            }
        };
        return aL;
    }
}
