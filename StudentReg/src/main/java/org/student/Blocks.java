package org.student;
import com.toedter.calendar.JCalendar;
import javax.swing.*;
import java.awt.*;

public class Blocks {
    static JPanel west,east,south,north;
    static JLabel label;
    static JCalendar cal;


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
    public  static JPanel south(){
        south=new JPanel();
        south.setPreferredSize(new Dimension(100,100));
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




}


