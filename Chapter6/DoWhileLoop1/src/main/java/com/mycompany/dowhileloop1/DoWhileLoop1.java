/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dowhileloop1;

/**
 *
 * @author RC_Student_lab
 */

import java.util.Scanner;

public class DoWhileLoop1 {

    public static void main(String[] args) {
        String password;
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Enter your password: ");
            password = input.next();
            
            if (!password.equals("java1234"))
            System.out.println("Wrong password. Try again.");
        } 
        while (!password.equals("java1234"));
        System.out.println("Access Granted!");
        
            
        }
        }
        
   
    

