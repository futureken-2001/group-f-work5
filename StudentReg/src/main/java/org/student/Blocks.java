package org.student;
import com.toedter.calendar.JCalendar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Blocks {
    static JPanel west,east,south,north;
    static JLabel label;
    static JComboBox comboBox;
    static JCalendar cal;
    //instance of DataInPutClass

    //Setting up panels for proper resizing
    public static JPanel west(){
        west=new JPanel();
        west.setPreferredSize(new Dimension(150,100));
        return west;
    }
    public static JPanel east(){
        east=new JPanel();
        east.setPreferredSize(new Dimension(100,100));
        return east;
    }
    public static JPanel north(){
        north=new JPanel();
        north.setPreferredSize(new Dimension(100,100));
        return north;
    }
    public  static JPanel south(){
        south=new JPanel();
        south.setPreferredSize(new Dimension(100,100));
        //south.setBackground(Color.CYAN);
        return south;
    }

    public static JLabel label(String labelName){
        label=new JLabel();
        label.setText(labelName);
        label.setBorder(BorderFactory.createEmptyBorder(0,120,0,0));
        return label;
    }

    public static JCalendar calendar(){
        cal=new JCalendar();
        cal.setSize(500,800);
        cal.setPreferredSize(new Dimension(400,900));

        cal.getDate();
        return cal;
    }





    public static JButton button(String buttonName){
        JButton btn=new JButton();
        btn.setText(buttonName);
        return btn;
    }



}


