/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guisumof2numbers;

/**
 *
 * @author RC_Student_lab
 */

import javax.swing.JOptionPane;

public class GUIsumof2numbers {

    public static void main(String[] args) {
        
        
       String numString1 = JOptionPane.showInputDialog("Enter number 1: ");
       String numString2 = JOptionPane.showInputDialog("Enter number 2: ");
       
       
       int num1 = Integer.parseInt(numString1);
       int num2 = Integer.parseInt(numString2);
       
       
       int sum = num1 + num2;
       
       
       JOptionPane.showMessageDialog(null, "The sum is" + sum + "!");
        
        
    }
}
