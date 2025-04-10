/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodsum2num2;

import java.util.Scanner;

public class MethodSum2Num2 {

    public static void main(String[] args) {

       int sum = calculateSum();
       
       System.out.println(sum);
    
    }
    
    
    public static int calculateSum(){
       Scanner input = new Scanner(System.in);
       
       
       System.out.print("Enter number 1: ");
       int num1 = input.nextInt();
       
       
       System.out.print("Enter number 2: ");
       int num2 = input.nextInt();
       
       int sum = num1 + num2;
       
    return(sum);
        
        
    }
}
