
package com.mycompany.oopexample;


public class OOPExample {

    public static void main(String[] args) {
        
        
        //Creat student object
        
        Student student = new Student("Ryan" , "Solomon" , "rys_3" ,"8567507g#" , "+27665620456" );
        
        
        //Call instance method
        
        if (Student_checkUsernameFormat()){
            System.out.println("Username is valid.");
        }
        else{
            System.out.println("Username is not valid.");
        }
    }
}
