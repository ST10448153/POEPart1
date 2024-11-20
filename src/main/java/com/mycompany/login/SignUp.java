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
        }
            // Check login
            String loginStatus = login.returnLoginStatus(userName, password);
            System.out.println(loginStatus);
        
     //   if(loginStatus.equals("A successful Login, Welcome ")){
            
        
        //we use JOptionPane class to print out the below message that will be displayed centrally on the screen.
        JOptionPane.showMessageDialog(null, "Welcome to EasyKhanban");
        /*
        Below we use JOptionPnae class to display the menu where the user can choose an option for example add tasks.
        because JOptionPane returns a string we pass it as the argument to the Integer.parseInt() to convert string to integer
        we then store that value in option variable.
        
        */
         int option = Integer.parseInt( JOptionPane.showInputDialog("Select an option:\n1.Add tasks \n2.Show report \n3.Quit"));
        // Below is an indefinite while loop that keeps on executing for as long as option is not equals to 0 or option is not equals to 3. 
        while (option != 0 || option !=3) {
           
           String add;
           int tasks;
           switch(option){
                  case 1 : 
                      /*
                      while inside the loop after the user has entered their option, a switch case is created to accomodate situations that come 
                      with different option.when the user choose option 1 a JOptionPane message is displayed that asks the user to enter the number of tasks
                      and that value is stored in input string variable that is then converted to integer variable called tasks.
                      */
                      String input = JOptionPane.showInputDialog("Enter the number of tasks:");
                        tasks = Integer.parseInt(input);

        //variables and arrays are declared and some initialized.
        String[] taskStatus = new String[tasks];
        String developerDetails = null;
        String time = null;
        String taskNumber;
        String taskName = null ;
        String description = null;
        String taskID;
        String[] duration = new String[tasks];
        int hours;
        int totalHours=0;
        String[] outputs = new String[tasks];
        
        for (int i = 0; i < tasks; i++) {
            /*
            here we enter a for loop that uses integer variable i as the control variable.and this control variable should not be
            greater or equals to the tasks variable which is the number of tasks the user wishes to enter, And lastly this control variable
            is incremented on each iteration.
            Below, a user is shown a small task status menu using JOptionPane and the result is stores in taskStatus array that is then
            converted into integer and stored in integer variable hill.
            */
            taskStatus[i] =JOptionPane.showInputDialog("Enter the status of the task:\n1.ToDo \n2.Done \n3.Doing");
          
           int statusTask = Integer.parseInt(taskStatus[i]);
           String taskM = null;
           if(statusTask ==1 ){
                 taskM = "To Do";
            }
           if(statusTask ==2){
              taskM = "Done";
           }
           if(statusTask ==3){
               taskM = "Doing";
           }
             
            //below the details of the developer such as first name and last name are prompted to the user and then stored in developerDetail string variable.
            developerDetails =JOptionPane.showInputDialog("Enter the details of the developer");
            
            //since we are still in a for loop the control variable i represent the number of times the user wants to enter the tasks,
            //it makes sense to convert it to string and then store that value in variable taskNumber, thats what happens below.
            taskNumber = String.valueOf(i);  
            //below a user is prompted to enter the task name and task description and the values are stored respectively.
            taskName = JOptionPane.showInputDialog("Enter task Name ");
            description = JOptionPane.showInputDialog("Enter the task Description");
            
            /*Below is an indefinite while loop that checks if the entered task description has more than 50 characters.
            checkTaskDescription() method is called from Task class and if the description is less than 50 characters then a confirmation
            message is displayed and then while loop is exited, if not then it continues to prompt the user until description is less than 50 characters.*/
            while(description.length()>=50){
                if(Task.checkTaskDescription(description)){
                    JOptionPane.showMessageDialog(null,"Task Description is successfully captured!!!");
                    break;
                }
                else
                description = JOptionPane.showInputDialog("Please make sure that you enter task description of less than 50 characters!! \nEnter the task description");
            }
            
          
            /*Below the user is prompted to enter the duration of the current task that is stored in hours and is stored in a string array called
             duration.this is then coverted into an integer variable called hours using Integer.parseInt() method.integer varaible totalHours is initialized
             to zero before entering the for loop and then the new totalHours value includes it's previous value plus the hours value and since this is addition
            is for integers totalHours has to be converted to string variable called gill so tha it can be displayed using printTaskDetails method.
            
            */
             time = JOptionPane.showInputDialog("Enter the duration of the task(in hours)");
             hours = Integer.parseInt(time);  
             totalHours = totalHours + hours;
             String hoursTotal = String.valueOf(totalHours);
           
          //createTaskID method is called from Task class and is given arguments and then the result is stored in string variable called taskID
          //the result is stored in a string variable because the method returns a string.
          taskID =Tasks.createTaskID(taskName, developerDetails, tasks);
          
          //here a printTaskDetails method is called from Task class and displays (using JOptionPane) all the task details.
          Tasks.printTaskDetails( i,taskM, developerDetails ,  taskStatus, taskNumber ,taskName , description, taskID, hoursTotal  );
       
        
          //after displaying all details the user is propted with the menu again.
          option = Integer.parseInt( JOptionPane.showInputDialog("Select an option:\n1.Add tasks \n2.Show report \n3.Quit"));
      
        }
        
         
   
        
        
         


        
                     
                  case 2:   JOptionPane.showMessageDialog(null,"Coming soon!");  
                           continue;
                  case 3:   JOptionPane.showMessageDialog(null,"Thank you for using our service...."); 
                            break;
           }
            option = Integer.parseInt( JOptionPane.showInputDialog("Select an option:\n1.Add tasks \n2.Show report \n3.Quit"));
        }
       

    }

    static void printTaskDetails(int i, String taskStatus, String developerDetails, String taskStatus0, int taskNumber, String taskName, String taskDescription, String expResult, int expected) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}  