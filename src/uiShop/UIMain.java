package uiShop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * Created by Daria Serebryakova on 19.12.2016.
 */
public class UIMain extends JFrame{
    public static void createFrame() {
        //Create and set up the window.
        JFrame frame = new JFrame("Stationery shop");
        //exit to close run
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        JLabel label = new JLabel("Input clint name");
//        label.setSize(40,70);
//        frame.getContentPane().add(label);

        JTextArea text = new JTextArea();
        text.setSize(60,70);
        frame.getContentPane().add(text);

        //Display the window.
//        frame.pack();
        frame.setSize(800,700);
        frame.setVisible(true);
    }
    public UIMain(){
        super("Stationery shop");

        setLocation(100, 100);
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        JPanel listPane = new JPanel();
        listPane.setLayout(new BoxLayout(listPane, BoxLayout.Y_AXIS));


    //list of elements in the Pane
        JPanel inpPanePath = new JPanel();
        inpPanePath.setVisible(false);

        JPanel inpPaneObjName = new JPanel();
        inpPaneObjName.setVisible(false);

        JPanel inpPaneNewDiscount = new JPanel();
        inpPaneNewDiscount.setVisible(false);

        JPanel inpPaneChangeName = new JPanel();
        inpPaneChangeName.setVisible(false);

        JPanel panelRadioSortClient = new JPanel(new GridLayout(0, 1, 0, 5));
        panelRadioSortClient.setVisible(false);

        JPanel panelRadioSortProduct = new JPanel(new GridLayout(0, 1, 0, 5));
        panelRadioSortProduct.setVisible(false);

        JTextArea textOut = new JTextArea(15, 40);




        ActionListener aL = new  ActionListener() {
            // соответственно, для любого нажатия...
            public void actionPerformed(ActionEvent e) {
                //берем сработавший компонент
                // (а это радио-кнопка) и выполняем действие
                String name = ((JRadioButton)e.getSource()).getText();
                switch (name) {
                    case "disploy file data":{
                        textOut.append(name + "\n");
                        inpPanePath.setVisible(true);
                        inpPaneObjName.setVisible(false);
                        inpPaneNewDiscount.setVisible(false);
                        inpPaneChangeName.setVisible(false);
                        panelRadioSortClient.setVisible(false);
                        panelRadioSortProduct.setVisible(false);
                        pack();
                        break;
                    }
                    case "add new object to file":{
                        textOut.append(name + "\n");
                        inpPanePath.setVisible(true);
                        inpPaneObjName.setVisible(true);
                        inpPaneNewDiscount.setVisible(false);
                        inpPaneChangeName.setVisible(false);
                        panelRadioSortClient.setVisible(false);
                        panelRadioSortProduct.setVisible(false);
                        pack();
                        break;
                    }
                    case "change information in file":{
                        textOut.append(name + "\n");
                        inpPanePath.setVisible(true);
                        inpPaneObjName.setVisible(true);
                        inpPaneNewDiscount.setVisible(true);
                        inpPaneChangeName.setVisible(true);
                        panelRadioSortClient.setVisible(false);
                        panelRadioSortProduct.setVisible(false);
                        pack();
                        break;
                    }
                    case "sort file data":{
                        textOut.append(name + "\n");
                        inpPanePath.setVisible(true);
                        inpPaneObjName.setVisible(false);
                        inpPaneNewDiscount.setVisible(false);
                        inpPaneChangeName.setVisible(false);
                        panelRadioSortClient.setVisible(true);
                        panelRadioSortProduct.setVisible(true);
                        pack();
                        break;
                    }
                }
            }
        };


        // Группа связанных радио-переключателей
        JPanel panelRadio = new JPanel(new GridLayout(0, 1, 0, 5));
            panelRadio.setBorder(BorderFactory.createTitledBorder("Choose operation"));
        String[] names1 = { "disploy file data", "add new object to file",
                    "change information in file", "sort file data" };
            ButtonGroup bg1 = new ButtonGroup();
            for (int i = 0; i < names1.length; i++) {
                JRadioButton radio = new JRadioButton(names1[i]);
                panelRadio.add(radio);
                radio.setFont(new Font("Arial", Font.PLAIN, 18));
                radio.addActionListener(aL);
                bg1.add(radio);
            }
        listPane.add(panelRadio);



//        JPanel inpPanePath = new JPanel();
        LabelAndTextField.addLabelAndTextField(listPane, inpPanePath, "Insert the path:", textOut);

//        JPanel inpPaneObjName = new JPanel();
        LabelAndTextField.addLabelAndTextField(listPane, inpPaneObjName,
                "Insert object data (ex.: Kozlov A.G. 3.0):", textOut);

//        JPanel inpPaneNewDiscount= new JPanel();
        LabelAndTextField.addLabelAndTextField(listPane, inpPaneNewDiscount,
                "Insert new discount:", textOut);

//        JPanel inpPaneChangeName = new JPanel();
        LabelAndTextField.addLabelAndTextField(listPane, inpPaneChangeName,
                "Insert data to change (ex.: Morozov A.G.):", textOut);


//        JPanel panelRadioSortClient = new JPanel(new GridLayout(0, 1, 0, 5));
        panelRadioSortClient.setBorder(BorderFactory.createTitledBorder("Choose clients type  of sorting"));
            String[] names2 = { "name", "discount"};
            ButtonGroup bg2 = new ButtonGroup();
            for (int i = 0; i < names2.length; i++) {
                JRadioButton radio2 = new JRadioButton(names2[i]);
                panelRadioSortClient.add(radio2);
                radio2.setFont(new Font("Arial", Font.PLAIN, 18));

                bg2.add(radio2);
            }
        listPane.add(panelRadioSortClient);

//        JPanel panelRadioSortProduct = new JPanel(new GridLayout(0, 1, 0, 5));
//        panelRadioSortProduct.setVisible(false);
        panelRadioSortProduct.setBorder(BorderFactory.createTitledBorder("Choose products type  of sorting"));
            String[] names3 = { "name", "count", "price"};
            ButtonGroup bg3 = new ButtonGroup();
            for (int i = 0; i < names3.length; i++) {
                JRadioButton radio3 = new JRadioButton(names3[i]);
                panelRadioSortProduct.add(radio3);
                radio3.setFont(new Font("Arial", Font.PLAIN, 18));

                bg3.add(radio3);
            }
        listPane.add(panelRadioSortProduct);






//        JTextArea textOut = new JTextArea(15, 40);
//            textOut.append("Ivanov O.P. 5.0 \n" +
//                    "Anisimova A.P. 4.0 \n" +
//                    "Romanova U.R. 5.0 \n" +
//                    "Pushkin A.S. 7.0 \n" +
//                    "Kozlova A.G. 3.0 \n" +
//                    "Morozov R.T. 2.0 ");

            textOut.setEditable(false);
            textOut.setFont(new Font("Arial", Font.PLAIN, 18));
            textOut.setBorder(BorderFactory.createTitledBorder("file contents:\n" ));
        listPane.add(textOut);



        listPane.add(Box.createRigidArea(new Dimension(0,5)));
        listPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        Container contentPane = getContentPane();
        contentPane.add(listPane, BorderLayout.AFTER_LAST_LINE);

        pack();
        setVisible(true);

    }


    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
//                createFrame();
                    new UIMain();

            }
        });
    }

}
