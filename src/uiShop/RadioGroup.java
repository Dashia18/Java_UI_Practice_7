package uiShop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 23.12.2016.
 */
public class RadioGroup {
    public static JPanel addRadioGroup(JPanel mainPane, JPanel panelRadio, ActionListener aL,
                                       String mainName, String[] buttonsNames) {

        panelRadio.setBorder(BorderFactory.createTitledBorder(mainName));

        ButtonGroup bg1 = new ButtonGroup();
        for (int i = 0; i < buttonsNames.length; i++) {
            JRadioButton radio = new JRadioButton(buttonsNames[i]);
            panelRadio.add(radio);
            radio.setFont(new Font("Arial", Font.PLAIN, 18));

            radio.addActionListener(aL);


            bg1.add(radio);
        }
        mainPane.add(panelRadio);
        return panelRadio;
    }

}
