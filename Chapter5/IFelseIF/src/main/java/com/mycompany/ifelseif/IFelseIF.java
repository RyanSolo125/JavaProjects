/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelseif;

import java.util.Scanner;


public class IFelseIF {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter score: ");
        int score = input.nextInt();
        
        
        if (score >= 90){
            System.out.println("Grade: A");
        }
        
        else if (score >= 75){
            System.out.println("Grade: B");
        }
                
          else {
            System.out.println("Grade: C");      
        }
        
       
        
    }
}
