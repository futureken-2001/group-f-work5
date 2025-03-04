package org.student;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
    JButton button1,button2;
    int yearOfBirth,dayofBirth,monthofBirth;
    JLabel Age=new JLabel(),
    Gender=new JLabel(),
    Course=new JLabel(),
    Name=new JLabel(),
    field_study=new JLabel(),
    birthDay=new JLabel();
    JTextField NameField;
    JTextArea fieldOfStudy;
    ArrayList<Student> students=new ArrayList<>();
    JComboBox comboBox;
    actionListner al=new actionListner();
    private DefaultMutableTreeNode rootNode;
    private DefaultTreeModel treeModel;
    DefaultMutableTreeNode childNode;


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
// Create the root node and tree model
        rootNode = new DefaultMutableTreeNode("StudentName");
        treeModel = new DefaultTreeModel(rootNode);
        jTree = new JTree(treeModel);

        // Add a TreeSelectionListener to the tree
        return jTree;
    }

    //Field study options in a combo box
    public JComboBox combo(){
        String s1[]={"BIT","BSCS","BSSE"};
        comboBox=new JComboBox<>(s1);
        return comboBox;
    }
    public JPanel datapanel(){
        JPanel panel=new JPanel();
        button1=new JButton("BACK");
        button1.setBounds(20,0,40,30);
        button1.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));
        button1.setBackground(new Color(176,196,222));
        button2=new JButton("SAVE");
        button2.setBounds(0,0,40,30);
        button2.setBackground(new Color(85,107,47));
        panel.setSize(new Dimension(200,200));
        GridLayout gridLayout=new GridLayout(7,2,10,10);
        gridLayout.setVgap(10);
        gridLayout.setHgap(10);
        panel.setLayout(gridLayout);
        NameField=new JTextField();
        fieldOfStudy=new JTextArea();
        NameField.setBounds(25,25,200,200);
        panel.add(Blocks.label("Name"));
        panel.add(NameField);
        panel.add(Blocks.label("Field of Study"));
        panel.add(fieldOfStudy);
        panel.add(Blocks.label("BirthDay"));
        panel.add(Blocks.calendar());
        panel.add(Blocks.label("Course"));
        panel.add(this.combo());
        panel.add(Blocks.label("Gender"));
        //Group radio buttons
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton);
        buttonGroup.add(radioButton2);
        radioButton.setText("Male");
        radioButton2.setText("Female");
        panel.add(this.radioButton);
        panel.add(Blocks.label(""));
        panel.add(this.radioButton2);

        panel.add(button1);
        panel.add(button2);

        //Handling Click events
        button2.addActionListener(al);
        button1.addActionListener(e->{
            cardLayout.show(centerpanel,"secondPanel");
        });
        return panel;
    }

    public JPanel viewDetailsPanel(){

        JPanel panel = new JPanel(new GridLayout(6, 3, 10, 10)); // Rows, Columns, Horizontal Gap, Vertical Gap

        // Add labels and values separated by a JSeparator
        panel.add(new JLabel("Name:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(Name); // Value

        panel.add(new JLabel("Birth Day:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(birthDay); // Value

        panel.add(new JLabel("Age:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(Age); // Value

        panel.add(new JLabel("Field of Study:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(field_study); // Value

        panel.add(new JLabel("Course:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(Course); // Value

        panel.add(new JLabel("Gender:", SwingConstants.RIGHT)); // Label
        panel.add(new JSeparator(SwingConstants.VERTICAL)); // Separator
        panel.add(Gender); // Value
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
            if(src.equals(button2)){
                //Get the selected Date
                Date selectedDate=Blocks.cal.getDate();

                //Extracting the year of the selected Date
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(selectedDate);
                  yearOfBirth=calendar.get(Calendar.YEAR);
                  dayofBirth=calendar.get(Calendar.DAY_OF_MONTH);
                  monthofBirth=calendar.get(Calendar.MONTH);

                  //formating the date 
                   String bd=dayofBirth+"/"+monthofBirth+"/"+yearOfBirth;
                   String name= NameField.getText();
                   String study=fieldOfStudy.getText();
                   String gender=radioButton.isSelected()?radioButton.getText():radioButton2.isSelected()?radioButton2.getText():"null";
                   String selectedItem=comboBox.getSelectedItem().toString();
                    int currentYear=Year.now().getValue();
                    int years= currentYear-yearOfBirth;

           if(!name.isBlank()&&!study.isBlank()&&radioButton.isSelected()||radioButton2.isSelected()){
               Student std=new Student(name,study,bd,selectedItem,gender);
               students.add(std);
               for (Student s:students){
                   String Agetext=String.valueOf(years);
                   String Gendertext=s.getGender();
                   String Coursetext=s.getCourse();
                   String Nametext=s.getName();
                   String field_studytext=s.getFieldOfStudy();
                   String birthDaytext=s.getBirthDay();
                   
                   //Assigning values to be displayed
                Age.setText(Agetext);
                Gender.setText(Gendertext);
                Course.setText(Coursetext);
                Name.setText(Nametext);
                field_study.setText(field_studytext);
                birthDay.setText(birthDaytext);

                    childNode = new DefaultMutableTreeNode(s.getName());
                    rootNode.add(childNode);

                   NameField.setText("");
                   fieldOfStudy.setText("");

               }


           }


            }
        }
    }

}