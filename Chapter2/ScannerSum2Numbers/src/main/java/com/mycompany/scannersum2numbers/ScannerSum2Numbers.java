/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scannersum2numbers;

/**
 *
 * @author RC_Student_lab
 */

import java.util.Scanner;

public class ScannerSum2Numbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        
        int num1 = input.nextInt();
        
        System.out.print("Enter number 2: ");
        
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        
        
        System.out.println("The sum is: " + sum);
    }
}
