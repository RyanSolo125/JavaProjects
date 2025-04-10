/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scannergreeting;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;

public class ScannerGreeting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        scannerGreeting(name);
        input.close();
    }
    
    public static void scannerGreeting(String name) {
        
        System.out.println("Hello, your name is " + name + "!");
    }
    
}
