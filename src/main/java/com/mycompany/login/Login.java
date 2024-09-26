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
    public static void main(String[] args) {
        int select;
        String username;
        String password;
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Please select an option:\n1.register Account\n2.Login to existing Account\n3.Logout\n");
        select = obj.nextInt();
        
        if(select == 1){
            
           
            System.out.println(checkUserName()); 
             
             
            //registering the password
            System.out.println(checkPasswordComplexity());
        } 
       /* if(option ==2){
           
        }*/
        
        
        
        
       
        
       
    }
}
