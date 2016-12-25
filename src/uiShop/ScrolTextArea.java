package uiShop;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Daria Serebryakova on 23.12.2016.
 */
public class ScrolTextArea {
    public static void addScrollTextArea(JPanel mainPanel, JTextArea textOut) {
        textOut.setEditable(false);
        textOut.setFont(new Font("Arial", Font.PLAIN, 18));
        textOut.setBorder(BorderFactory.createTitledBorder("Messages:\n" ));

        JScrollPane scroll = new JScrollPane (textOut,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        mainPanel.add(scroll);
    }
}
