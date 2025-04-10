/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celsiustofaren;

/**
 *
 * @author RC_Student_lab
 */
public class CelsiusToFaren {

    public static void main(String[] args) {
        int result = converttoFarenheit(20);
        System.out.println("The conversion of 20 degrees Celsius to Farenheit is: " + result);
    }
    
    public static int converttoFarenheit(int a) {
        return((a * 9 / 5)+32);
    }
}
