/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    public static String userName1 = "Pheedi_";
    public static String passWord1 = "#Ramp@65li";
    
     public static boolean checkUserName(){
        /*this boolean method checks if the entered username 
        contains an underscore and it's length is less than 5 characters.*/
         String username;
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter username>>");
         username = obj.nextLine();
            
         //the method returns true when the conditions are met by the username otherwise is false.
        return username.contains("_") && username.length()<5;
            
     }

     public static boolean checkPasswordComplexity() {
         System.out.println("Enter password>>");
         Scanner obj = new Scanner(System.in);
         String password = obj.nextLine();
        boolean checkDigit = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                checkDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }

            
            if (checkDigit && hasUppercase && hasSpecialChar && password.length()>=8) {
                return true;
            }
        }

      
        return false;
    }
     
     public static String registerUser(){
         String username;
        
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter username>>");
         username = obj.nextLine();
         if(!username.contains("_") || username.length()>=5){
            System.out.println("username is not correctly formatted,please ensure that\nyour username"
                    + " contains an underscore and is no more than 5 characters.");
         }  
         
         
        String password;
        System.out.println("Enter password>>");
        password = obj.nextLine();
        boolean checkDigit = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                checkDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }
            
            if (!checkDigit || !hasUppercase || !hasSpecialChar || password.length()<8) {
                
                System.out.println("password is not correctly formatted,please ensure that your password\ncontains"
                        + " at least 8 characters, a number, a special character and capital letter.");
            }
            
            if(username.contains("_") && username.length()<5 && checkDigit && hasUppercase &&  hasSpecialChar && password.length()>=8){
                System.out.println("username and password have been captured succefully,\n"+ username +" is registered succefully.");
            }
           
     
        return "username is not correctly formatted";

        
     }   
     
    
        
    public static void main(String[] args) {
        int select;
        Scanner obj = new Scanner(System.in);
        System.out.println("Please select an option:\n1.register Account\n2.Login to existing Account\n3.Logout\n");
        select = obj.nextInt();
        
        if(select == 1){
            
            //calling the checkUserName method
            //System.out.println(checkUserName()); 
            //calling the checkPasswordComplexity method
           //System.out.println(checkPasswordComplexity());
            
            registerUser();
        } 
        if(select ==2){
            //calling the method
          // System.out.println(loginUser());
        }
        
        
        
        
       
        
       
    }
}
