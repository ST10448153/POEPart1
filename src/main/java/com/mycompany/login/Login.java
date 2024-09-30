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
    public static String userName1 = "Phe_";
    public static String passWord1 = "#Ramp@65li";
    public static String firstname="Mashoto";
    public static String lastname="Molepo";
    
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

      
        return true;
    }
     
     public static String registerUser(){
         Scanner obj = new Scanner(System.in);
         //prompt,collect and store the first and last names of the user 
         System.out.println("Please enter your First name:");
         firstname = obj.nextLine();
         System.out.println("Enter your last name:");
         lastname = obj.nextLine();
         
         String username;
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
                System.out.println("username and password have been captured succefully,\n"+ firstname +" is registered succefully.");
            }
           
     
        return "username is not correctly formatted";

        
     }   
     
    public static boolean  loginUser(){
        Scanner obj = new Scanner(System.in);
        String username;
        System.out.println("Enter username>>");
        username = obj.nextLine();
         
        String password;
        System.out.println("Enter password>>");
        password = obj.nextLine();
       if(username.equals(userName1) && password.equals(passWord1)){
           System.out.println("Welcome " + firstname +"," +lastname +" it is great to see you again.");
       }else{
           System.out.println("username or password is incorrect, please try again");
       }
        return true;
    }
     
        
    public static void main(String[] args) {
        int select;
        Scanner obj = new Scanner(System.in);
        System.out.println("Please select an option:\n1.register Account\n2.Login to existing Account\n3.Logout\n");
        select = obj.nextInt();
        
        if(select == 1){
            registerUser();
        } 
        if(select ==2){
            //calling the method
           loginUser();
        }
        if(select ==3){
            System.out.println("Thank you, " +firstname +" "+ lastname +" for using our service....Now you are signed out.");
        }
        
        
        
       
        
       
    }
}
