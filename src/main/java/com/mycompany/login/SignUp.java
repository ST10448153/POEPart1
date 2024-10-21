/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class SignUp {
    public static String [] taskName;
    public static void main(String[] args) {
        
        
        JDialog window = new JDialog();
        window.setAlwaysOnTop(true);
        
        String firstName;
        String userName;
        String password;
        String lastName;

        Scanner obj = new Scanner(System.in);
        System.out.println("=======The user is registering========");

        System.out.println("Enter first name>> ");
        firstName = obj.nextLine();

        System.out.println("Enter last name>> ");
        lastName = obj.nextLine();

        System.out.println("Enter username>> ");
        userName = obj.nextLine();

        System.out.println("Enter password>> ");
        password = obj.nextLine();

        // Create a Login object and register the user
        Login login = new Login(firstName, userName, password, lastName);
        String registrationMessage = login.registerUser(userName, password);
        System.out.println(registrationMessage);

        if (registrationMessage.equals("User registered successfully")) {
            System.out.println("Now the user is signing in");

            System.out.println("Enter username>> ");
            String username2 = obj.nextLine();

            System.out.println("Enter password>> ");
            String password2 = obj.nextLine();

            // Check login
            String loginStatus = login.returnLoginStatus(username2, password2);
            System.out.println(loginStatus);
        }
      

        JOptionPane.showMessageDialog(null, "Welcome to EasyKhanban");
      int option = Integer.parseInt( JOptionPane.showInputDialog("Select an option:\n1.Add tasks \n2.Show report \n3.Quit"));
//        int option = Integer.parseInt(select);
        while (option != 0) {
           
           String add;
           int tasks;
           switch(option){
                  case 1 : tasks = Integer.parseInt(JOptionPane.showInputDialog(null,"How many tasks do you want to add?"));
                          String[] taskName = new String[tasks];
                          int duration = Integer.parseInt( JOptionPane.showInputDialog("Enter the duration (in hours)"));
                  for(int i =0;i<tasks;i++){
                      
                  
                         taskName[i] = JOptionPane.showInputDialog("Enter task name " + (i + 1) +":");
                       //  taskName = new String[tasks];
                         taskName[i] =  JOptionPane.showInputDialog("Enter task description" + (i + 1) + ":");
                        // taskName = new String[tasks];
                        JOptionPane.showMessageDialog(null, "task description is successfully captured!!!");
                        taskName[i] = JOptionPane.showInputDialog(" the developer details(Firstname and lastname)");
                        
                            
                        }
                         
                   
//                         String taskDescription = JOptionPane.showInputDialog(null,"Enter task description");
//                         JOptionPane.showMessageDialog(null, "task description is successfully captured!!!");
//                         String developerDetails = JOptionPane.showInputDialog(null,"Enter the developer details(Firstname and lastname)");
//                         
//                         int select = Integer.parseInt( JOptionPane.showInputDialog("Select an option:\n1.To do \n2.Done \n3.Doing"));
                        
                         
                            
                  case 2:   JOptionPane.showMessageDialog(null,"Coming soon!");      
                  case 3:   JOptionPane.showMessageDialog(null,"Thank you for using our service...."); 
           }
        }
       

    }

    // obj.close();
}
//for methods that return a boolean use assertTrue or assertFalse to test and execute