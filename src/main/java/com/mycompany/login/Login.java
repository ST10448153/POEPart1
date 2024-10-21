/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;


/**
 *
 * @author RC_Student_lab
 */
public class Login {
    // Global variables accessible anywhere inside the class
    String firstName;
    String userName;
    String password; // Changed from passWord to password for consistency
    String lastName;

    // Constructor
    public Login(String firstName, String userName, String password, String lastName) {
        this.firstName = firstName;
        this.userName = userName;
        this.password = password;
        this.lastName = lastName;
    }

    public boolean checkUserName(String userName) {
        // Check if the username contains an underscore and its length is less than 5 characters
        return userName.contains("_") && userName.length() < 5;
    }

    public boolean checkPasswordComplexity(String password) {
        boolean checkDigit = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;

        // Check each character for the required conditions
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                checkDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        // Return true only if all conditions are met
        return checkDigit && hasUppercase && hasSpecialChar && password.length() >= 8;
    }

    public String registerUser(String username, String password) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted. Ensure it contains an underscore and is less than 5 characters.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password does not meet complexity requirements.";
        }
        return "User registered successfully";
    }

    public boolean loginUser(String username, String password) {
        // Check if the provided username and password match the stored ones
        return username.equals(userName) && password.equals(this.password);
    }

    public String returnLoginStatus(String username, String password) {
        boolean loginSuccess = loginUser(username, password);
        if (loginSuccess) {
            return "A successful Login, Welcome ";
        } else {
            return "A failed Login.  ";
        }
    }
}

        
    

//the number of tasks that is pompted to the user is gonna be the 
//be the size of the array for tasks.