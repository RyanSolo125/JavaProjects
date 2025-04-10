/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guicalculateage;

/**
 *
 * @author RC_Student_lab
 */



import javax.swing.JOptionPane;


public class GUICalculateAge {

    public static void main(String[] args) {
       
        String currentyearString = JOptionPane.showInputDialog("Enter the current year:");
        String birthyearString = JOptionPane.showInputDialog("Enter your birth year: ");
        
        
        int currentYear = Integer.parseInt(currentyearString);
        int birthYear = Integer.parseInt(birthyearString);
        
        
        int age = currentYear - birthYear;
        
        
        JOptionPane.showMessageDialog(null, "Your age is: " + age);
        
        
        
        
    }
}
