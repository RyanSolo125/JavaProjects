/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodsum2numbers;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;

public class MethodSum2Numbers {

    public static void main(String[] args) {
        
        
       Scanner input = new Scanner(System.in);
       
       
       System.out.print("Enter number 1: ");
       int num1 = input.nextInt();
       
       
       System.out.print("Enter number 2: ");
       int num2 = input.nextInt();
       
       
       int sum = calculateSum(num1, num2);
       
       
       System.out.println(sum);
       
       
       input.close();
    }
    
    
    public static int calculateSum(int a, int b){
        
        return(a + b);
        
        
    }
}
