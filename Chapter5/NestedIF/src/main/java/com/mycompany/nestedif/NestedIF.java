/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nestedif;


import java.util.Scanner;


public class NestedIF {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        
        
        
        if (age >= 18){
            
            System.out.println("Do you have a liscence:");
            boolean hasLiscence = input.nextBoolean();
            
            if (hasLiscence){                                   //Nested IF function
                System.out.println("You can drive.");
            }
            
            else {System.out.println("Get your liscence first! ");
            }
            
        }
        
        else {System.out.println("You are too young!");}
        
    }
        
    
}
   
       
           

            
        
        
    
    

