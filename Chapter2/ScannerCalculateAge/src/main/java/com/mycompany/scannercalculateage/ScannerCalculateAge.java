/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scannercalculateage;

/**
 *
 * @author RC_Student_lab
 */



import java.util.Scanner;

public class ScannerCalculateAge {

    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int birthYear = input.nextInt();
        
        
        System.out.println("Enter the current year: ");
        int currentYear = input.nextInt();
        input.close();
        
        
        int age = birthYear - currentYear ;
        
        
        System.out.println("Your age is: " + age);
        
        
    }
    
    
    
}
