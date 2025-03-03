package main.java.org.example;

import org.student.StudentData;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(()->{
            new StudentData();
        });
    }
}