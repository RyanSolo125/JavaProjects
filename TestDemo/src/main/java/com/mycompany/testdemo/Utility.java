/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testdemo;

/**
 *
 * @author RC_Student_lab
 */
public class Utility {
    private String userName;
    private int userId;
    
    public Utility( String userName, int userId ) {
    this.userName = userName ;
    this.userId = userId ;
}
    // GETTERS
    
    public String getUserName(){return userName; }
    public int getUserId(){ return userId;}
    
    
    

// SETTERS

public void setUserName(String userName){
this.userName = userName;
    }


public void setUserId(int userId){
    this.userId = userId;
}


// BOOLEAN METHOD: check if number is even

public boolean isEven(int number){
    return number % 2 == 0;
}

// String method; greet user

public String greetUser(String name){
    if(name == null || name.isEmpty()){
        return "Hello Guest";
    }
    return "Hello " + name + "!";

    }


// Integer method; multiply 2 numbers

public int multiply(int a, int b){
    return a * b;
    }


}




