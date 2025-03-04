package main.java.org.example;

import org.student.StudentData;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        try{
        UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
        SwingUtilities.invokeLater(()->{
            new StudentData();
        });} catch (RuntimeException | ClassNotFoundException | InstantiationException | IllegalAccessException |
                    UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }
}