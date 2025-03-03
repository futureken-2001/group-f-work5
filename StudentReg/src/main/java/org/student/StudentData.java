package org.student;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class StudentData {
    JFrame frame;
    JRadioButton radioButton=new JRadioButton();
    JRadioButton radioButton2=new JRadioButton();
    CardLayout cardLayout=new CardLayout();
    JMenu menu1, menu2;
    JMenu menu;
    JMenuBar menuBar;
    JTree jTree;
    JPanel centerpanel;
    ButtonGroup buttonGroup;
actionListner al=new actionListner();
    public StudentData(){
        this.DataFrameMethod();
    }

    public JFrame DataFrameMethod(){
        frame=new JFrame("Student Registration");
        frame.setMinimumSize(new Dimension(700,700));
        frame.setLayout(new BorderLayout());
        frame.add(BorderLayout.SOUTH, Blocks.south());
        frame.add(BorderLayout.NORTH,this.menuBar());
        frame.add(BorderLayout.EAST, Blocks.east());
        frame.add(BorderLayout.WEST, Blocks.west());
        frame.add(BorderLayout.CENTER,this.centerpanel());
        frame.setVisible(true);
        return frame;
    }

    public JPanel centerpanel(){
        centerpanel=new JPanel();
        centerpanel.setLayout(cardLayout);
        centerpanel.add("firstPanel",firstpanel());
        centerpanel.add("secondPanel",viewDetailsPanel());
        centerpanel.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));

        return centerpanel;
    }

    public JPanel firstpanel(){
        JPanel firstJpanel=new JPanel();

        firstJpanel.setLayout(new BorderLayout());
        firstJpanel.add(BorderLayout.EAST, Blocks.east());
        firstJpanel.add(BorderLayout.SOUTH, Blocks.south());
        firstJpanel.add(BorderLayout.WEST,this.treeNode());
        firstJpanel.add(BorderLayout.CENTER,this.datapanel());

        return firstJpanel;
    }
    public JTree treeNode(){

        DefaultMutableTreeNode Users=new DefaultMutableTreeNode("Users");
        DefaultMutableTreeNode name=new DefaultMutableTreeNode("name");
        DefaultMutableTreeNode age=new DefaultMutableTreeNode("age");
        Users.add(name);
        Users.add(age);
        jTree=new JTree(Users);
        jTree.setSize(300,500);
        return jTree;
    }

    public JPanel datapanel(){
        JPanel panel=new JPanel();
        panel.setSize(new Dimension(200,200));
        GridLayout gridLayout=new GridLayout(7,2,10,10);
        gridLayout.setVgap(10);
        gridLayout.setHgap(10);
        panel.setLayout(gridLayout);

        JTextField textField1=new JTextField();

        JTextArea textArea3=new JTextArea();

        JTextField textField2=new JTextField();
        textField1.setBounds(25,25,200,200);
        textField2.setSize(200,300);



        panel.add(Blocks.label("Name"));
        panel.add(textField1);
        panel.add(Blocks.label("Field of Study"));
        panel.add(textArea3);
        panel.add(Blocks.label("BirthDay"));
        panel.add(Blocks.calendar());
        panel.add(Blocks.label("Course"));
        panel.add(Blocks.combo());
        panel.add(Blocks.label("Gender"));

        //Group radio buttons
        buttonGroup = new ButtonGroup();
        buttonGroup.getSelection();
        buttonGroup.add(radioButton);
        buttonGroup.add(radioButton2);
        radioButton.setText("Male");
        radioButton2.setText("Female");
        panel.add(this.radioButton);
        panel.add(Blocks.label(""));
        panel.add(this.radioButton2);
        panel.add(Blocks.button("Save"));
        panel.add(Blocks.button("Exit"));
        return panel;
    }

    public JPanel viewDetailsPanel(){

        JPanel panel = new JPanel(new GridLayout(6, 3, 10, 10)); // Rows, Columns, Horizontal Gap, Vertical Gap

        // Add labels and values separated by a JSeparator
        panel.add(new JLabel("Name:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(new JLabel("John Doe", SwingConstants.LEFT)); // Value

        panel.add(new JLabel("Birth Day:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(new JLabel("30", SwingConstants.LEFT)); // Value

        panel.add(new JLabel("Age:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(new JLabel("Software Engineer", SwingConstants.LEFT)); // Value

        panel.add(new JLabel("Field of Study:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(new JLabel("New York", SwingConstants.LEFT)); // Value

        panel.add(new JLabel("Course:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(new JLabel("New York", SwingConstants.LEFT)); // Value

        panel.add(new JLabel("Gender:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(new JLabel("New York", SwingConstants.LEFT)); // Value
        return panel;

    }

    public  JMenuBar menuBar(){

        menuBar = new JMenuBar();
        menu = new JMenu("File");
        menu1= new JMenu("Switch");


        //menu.setMnemonic();
        JMenuItem menuItem = new JMenuItem("Exit");
        JMenuItem menuItem1=new JMenuItem("Next panel");
        JMenuItem menuItem2=new JMenuItem("previous panel");

        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_MASK));
        menuItem.addActionListener(e->{
            System.exit(0);
        });
        menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
        menuItem1.addActionListener(e->{
            cardLayout.show(centerpanel,"secondPanel");
        });
        menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK));
        menuItem2.addActionListener(e->{
            cardLayout.show(centerpanel,"firstPanel");
            System.out.println(buttonGroup);
        });

        menu.add(menuItem);
        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menuBar.add(menu);
        menuBar.add(menu1);
        return menuBar;
    }

    public class actionListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton src=(JButton) e.getSource();
            if(src.equals("SAVE")){

            }
        }
    }

}