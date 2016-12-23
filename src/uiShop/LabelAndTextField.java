package uiShop;

import uiShop.actionListeners.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Daria Serebryakova on 20.12.2016.
 */
public class LabelAndTextField {

    public static String addLabelAndTextField(JPanel mainPanel, JPanel currentPanel,
                                            String labelName, JTextArea textOut) {



        currentPanel.setLayout(new BoxLayout(currentPanel, BoxLayout.Y_AXIS));
        currentPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel label = new JLabel(labelName);
        label.setVisible(true);
        label.setFont(new Font("Arial", Font.PLAIN, 18));

        currentPanel.add(label);

        JTextField textField = new JTextField();



        switch (labelName){
            case "Insert the path:":{
                ActionListener aL = ALTextPath.getActionListener(textField, textOut);
                textField.addActionListener(aL);
                break;
            }
            case "Insert object data for add (ex.: Kozlov A.G. 3.0):":{
                ActionListener aL = ALAddData.getActionListener(textField, textOut);
                textField.addActionListener(aL);
                break;
            }
            case "Insert object data for change (ex.: Kozlov A.G. 3.0):":{
                ActionListener aL = ALParseName.getActionListener(textField, textOut);
                textField.addActionListener(aL);
                break;
            }
            case "Insert new discount:":{
                ActionListener aL = ALChangeDiscount.getActionListener(textField, textOut);
                textField.addActionListener(aL);
                break;
            }
            case "Insert data to change (ex.: Morozov A.G.):":{
                ActionListener aL = ALChangeName.getActionListener(textField, textOut);
                textField.addActionListener(aL);
                break;
            }
            case "Insert file name to save (ex.: data\\clientsSorted.txt):":{
                ActionListener aL = ALSaveToFile.getActionListener(textField, textOut);
                textField.addActionListener(aL);
                break;
            }
        }
        String data = textField.getText();
        textField.setVisible(true);
        textField.setFont(new Font("Arial", Font.PLAIN, 18));
        currentPanel.add(textField);
        mainPanel.add(currentPanel);

        return data;
    }

}
