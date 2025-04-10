/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopexample;

/**
 *
 * @author RC_Student_lab
 */
public class Student {
    
    //Attribute(fields)
    
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String cellNumber;
    
    
    //Constructor
    
    public Student(String firstName, String lastName, String userName, String password, String cellNumber){   
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.cellNumber = cellNumber;
    }
    
    //Getter method
    
    public String getUsername(){
    return userName;
}
    //Setter method
    
    public void getUsername(String userName){
        this.userName = userName;
    }
    
    //Instance method (non-static)
    
    public boolean checkUsernameFormat(){
        return userName.contains("_")&& userName.length() <= 5;
    }
    
    //Void method (no return)
    
    public void displayFullName(){
        System.out.println(firstName + "" + lastName);
    }
    
}
    