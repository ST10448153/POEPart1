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
   //AddTasks hh = new AddTasks();
    
    static Task Tasks = new Task();
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
        while (option != 0 || option !=3) {
           
           String add;
           int tasks;
           switch(option){
                  case 1 : 
                      String input = JOptionPane.showInputDialog("Enter the number of tasks:");
                        tasks = Integer.parseInt(input);

        // Arrays to store names and marks
        String[] taskStatus = new String[tasks];
        String developerDetails;
        String taskNumber;
        String taskName ;
        String[] description = new String[tasks];
        String[] taskID = new String[tasks];
        String[] duration = new String[tasks];
        int hours;
        int totalHours=0;
        String[] outputs = new String[tasks];
        
        for (int i = 0; i < tasks; i++) {
            taskStatus[i] =JOptionPane.showInputDialog("Enter the status of the task:\n1.ToDo \n2.Done \n3.Doing");
           
           int hill = Integer.parseInt(taskStatus[i]);
           String taskM = null;
           if(hill ==1 ){
                 taskM = "To Do";
            }
           if(hill ==2){
              taskM = "Done";
           }
           if(hill ==3){
               taskM = "Doing";
           }
             
            
            developerDetails =JOptionPane.showInputDialog("Enter the details of the developer");
            
            taskNumber = String.valueOf(i);  

            taskName = JOptionPane.showInputDialog("Enter task Name ");
          
            Tasks.checkTaskDescription(description, i);
            Task.createTaskID(taskName, developerDetails, tasks);
            String ill = Task.createTaskID(taskName, developerDetails, tasks);
     
            duration[i] = JOptionPane.showInputDialog("Enter the duration of the task(in hours)");
            hours = Integer.parseInt(duration[i]);  
            totalHours = totalHours + hours;
       
        
      Tasks.printTaskDetails( i,taskM, developerDetails ,  taskStatus, taskNumber ,taskName ,description, taskID ,duration  );
      
      
      
      
        }
         
        JOptionPane.showMessageDialog(null,Tasks.printD_all_Details());
        
        
         JOptionPane.showMessageDialog(null,"Total number of hours for all the tasks : "+ totalHours);
        
                     
                  case 2:   JOptionPane.showMessageDialog(null,"Coming soon!");  
                           continue;
                  case 3:   JOptionPane.showMessageDialog(null,"Thank you for using our service...."); 
                            break;
           }
        }
       

    }
    }

    // obj.close();

//for methods that return a boolean use assertTrue or assertFalse to test and execute