/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class Task {
     public static void main(String[] args) {
      String input = JOptionPane.showInputDialog("Enter the number of tasks:");
        int tasks = Integer.parseInt(input);

        // Arrays to store names and marks
        String[] taskStatus = new String[tasks];
        String[] developerDetails = new String[tasks];
        String[] taskNumber = new String[tasks];
        String[] taskName = new String[tasks];
        String[] description = new String[tasks];
        String[] taskID = new String[tasks];
        String[] duration = new String[tasks];
        int hours;
        int totalHours=0;
        String[] outputs = new String[tasks];
        // Loop to get names and marks
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
             
            
            developerDetails[i] =JOptionPane.showInputDialog("Enter the details of the developer");
            taskNumber[i] = JOptionPane.showInputDialog("Enter the task Number" + (i + 1) + ":");
            taskName[i] = JOptionPane.showInputDialog("Enter task name " + (i + 1) +":");
            description[i] = JOptionPane.showInputDialog("Enter the task description" + (i + 1) + ":");
            JOptionPane.showMessageDialog(null,"Task Description is successfully captured!!!");
            duration[i] = JOptionPane.showInputDialog("Enter the duration of the task(in hours)");
            hours = Integer.parseInt(duration[i]);  
            totalHours = totalHours + hours;
        // Show the results in a JOptionPane
        JOptionPane.showMessageDialog(null,"Task Status: "+ taskM +"\n"+ "Developer Details: "+ developerDetails[i]+"\n"+"task Number: "+taskNumber[i]+"\n"+"Task name: "+taskName[i]+"\n"+
               "Task Description: "+ description[i] +"\n"+"Duration of the task: "+ duration[i] ,"Task Details", JOptionPane.INFORMATION_MESSAGE);
    }
         JOptionPane.showMessageDialog(null,"Total number of hours for all the tasks : "+ totalHours);
        }
}