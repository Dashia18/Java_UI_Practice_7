package uiShop;

import uiShop.actionListeners.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Created by Daria Serebryakova on 19.12.2016.
 */
public class UIMain extends JFrame {

    public UIMain() {
        super("Stationery shop");

        super.setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPane = new JPanel();
        mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.Y_AXIS));

        //list of elements in the Pane
        JPanel panelRadio = new JPanel(new GridLayout(0, 1, 0, 5));
        panelRadio.setVisible(true);

        JPanel inpPanePath = new JPanel();
        inpPanePath.setVisible(false);

        JPanel inpPaneObjAddName = new JPanel();
        inpPaneObjAddName.setVisible(false);

        JPanel inpPaneObjChangeName = new JPanel();
        inpPaneObjChangeName.setVisible(false);

        JPanel inpPaneNewDiscount = new JPanel();
        inpPaneNewDiscount.setVisible(false);

        JPanel inpPaneChangeName = new JPanel();
        inpPaneChangeName.setVisible(false);

        JPanel panelRadioSortType = new JPanel(new GridLayout(0, 1, 0, 5));
        panelRadioSortType.setVisible(false);

        JPanel panelRadioSortClient = new JPanel(new GridLayout(0, 1, 0, 5));
        panelRadioSortClient.setVisible(false);

        JPanel panelRadioSortProduct = new JPanel(new GridLayout(0, 1, 0, 5));
        panelRadioSortProduct.setVisible(false);

        JTextArea textOut = new JTextArea(15, 70);
        panelRadio.setVisible(true);

        JPanel inpPaneSaveInFile = new JPanel();
        inpPaneSaveInFile.setVisible(false);


        ActionListener aL = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = ((JRadioButton) e.getSource()).getText();
                switch (name) {
                    case "disploy file data": {
                        textOut.append("Type of operation: " + name + "\n");
                        inpPanePath.setVisible(true);
                        inpPaneObjAddName.setVisible(false);
                        inpPaneObjChangeName.setVisible(false);
                        inpPaneNewDiscount.setVisible(false);
                        inpPaneChangeName.setVisible(false);
                        panelRadioSortType.setVisible(false);
                        panelRadioSortClient.setVisible(false);
                        panelRadioSortProduct.setVisible(false);
                        inpPaneSaveInFile.setVisible(false);
                        pack();
                        break;
                    }
                    case "add new object to file": {
                        textOut.append("Type of operation: " + name + "\n");
                        inpPanePath.setVisible(true);
                        inpPaneObjAddName.setVisible(true);
                        inpPaneObjChangeName.setVisible(false);
                        inpPaneNewDiscount.setVisible(false);
                        inpPaneChangeName.setVisible(false);
                        panelRadioSortType.setVisible(false);
                        panelRadioSortClient.setVisible(false);
                        panelRadioSortProduct.setVisible(false);
                        inpPaneSaveInFile.setVisible(false);
                        pack();
                        break;
                    }
                    case "change information in file": {
                        textOut.append("Type of operation: " + name + "\n");
                        inpPanePath.setVisible(true);
                        inpPaneObjAddName.setVisible(false);
                        inpPaneObjChangeName.setVisible(true);
                        inpPaneNewDiscount.setVisible(true);
                        inpPaneChangeName.setVisible(true);
                        panelRadioSortType.setVisible(false);
                        panelRadioSortClient.setVisible(false);
                        panelRadioSortProduct.setVisible(false);
                        inpPaneSaveInFile.setVisible(false);
                        pack();
                        break;
                    }
                    case "sort file data": {
                        textOut.append("Type of operation: " + name + "\n");
                        inpPanePath.setVisible(false);
                        inpPaneObjAddName.setVisible(false);
                        inpPaneObjChangeName.setVisible(false);
                        inpPaneNewDiscount.setVisible(false);
                        inpPaneChangeName.setVisible(false);
                        panelRadioSortType.setVisible(true);
                        panelRadioSortClient.setVisible(false);
                        panelRadioSortProduct.setVisible(false);
                        inpPaneSaveInFile.setVisible(true);
                        pack();
                        break;
                    }
                }
            }
        };

        String menuName = "Choose operation";
        String[] menuButtonsNames = {"disploy file data", "add new object to file",
                "change information in file", "sort file data"};
        RadioGroup.addRadioGroup(mainPane, panelRadio, aL, menuName, menuButtonsNames);


//      JPanel inpPanePath
        LabelAndTextField.addLabelAndTextField(mainPane, inpPanePath, "Insert the path:", textOut);


//      JPanel inpPaneObjAddName
        LabelAndTextField.addLabelAndTextField(mainPane, inpPaneObjAddName,
                "Insert object data for add (ex.: Kozlov A.G. 3.0):", textOut);

//      JPanel inpPaneObjChangeName
        LabelAndTextField.addLabelAndTextField(mainPane, inpPaneObjChangeName,
                "Insert object data for change (ex.: Kozlov A.G. 3.0):", textOut);

//      JPanel inpPaneNewDiscount
        LabelAndTextField.addLabelAndTextField(mainPane, inpPaneNewDiscount,
                "Insert new discount:", textOut);

//      JPanel inpPaneChangeName
        LabelAndTextField.addLabelAndTextField(mainPane, inpPaneChangeName,
                "Insert data to change (ex.: Morozov A.G.):", textOut);

//      JPanel panelRadioSortType
        String type;
        ActionListener aL1 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = ((JRadioButton) e.getSource()).getText();
                switch (name) {
                    case "data\\clients.txt": {
                        panelRadioSortClient.setVisible(true);
                        panelRadioSortProduct.setVisible(false);
                        textOut.append(name + "\n");

                        pack();
                        break;
                    }
                    case "data\\products.txt": {
                        panelRadioSortClient.setVisible(false);
                        panelRadioSortProduct.setVisible(true);

                        textOut.append(name + "\n");
                        pack();
                        break;
                    }
                }
            }
        };
        String fileNameForSort = "Choose filename for sorting";
        String[] fileNameType = {"data\\clients.txt", "data\\products.txt"};
        RadioGroup.addRadioGroup(mainPane, panelRadioSortType, aL1, fileNameForSort, fileNameType);

//      JPanel panelRadioSortClient
        String clientSortButtonsName = "Choose clients type  of sorting";
        String[] clientsSortType = {"name", "discount"};
        ActionListener aL2 = ALSortType.getActionListenerS(textOut);
        RadioGroup.addRadioGroup(mainPane, panelRadioSortClient, aL2, clientSortButtonsName, clientsSortType);

//        JPanel panelRadioSortProduct
        String productSortButtonsName = "Choose products type  of sorting";
        String[] productsSortType = {"name", "count", "price"};
        ActionListener aL3 = ALSortType.getActionListenerP(textOut);
        RadioGroup.addRadioGroup(mainPane, panelRadioSortProduct, aL3, productSortButtonsName, productsSortType);

        ScrolTextArea.addScrollTextArea(mainPane, textOut);

//      JPanel inpPaneSaveInFile
        LabelAndTextField.addLabelAndTextField(mainPane, inpPaneSaveInFile,
                "Insert file name to save (ex.: data\\clientsSorted.txt):", textOut);

        mainPane.add(Box.createRigidArea(new Dimension(0, 5)));
        mainPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Container contentPane = getContentPane();
        contentPane.add(mainPane, BorderLayout.AFTER_LAST_LINE);

        pack();
        setVisible(true);
    }


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UIMain();
            }
        });
    }

}
