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
    
    StringBuilder hold = new StringBuilder();
    StringBuilder hild = new StringBuilder();
  // this boolean method accepts a parameter of a string and then it returns true if the number of characters in the given is less than 50.
    public static boolean checkTaskDescription(String description){ 
          return description.length() < 50;
    }
   
    public String createTaskID(String taskName, String developerDetails, int tasks){
        String taskInitials = taskName.substring(0, 2).toUpperCase();
        String devSuffix = developerDetails.length()>=3? developerDetails.substring(developerDetails.length() -3).toUpperCase() : developerDetails.toUpperCase();
        return  (taskInitials + ":" + tasks + ":" + devSuffix).toUpperCase();
        
    }
   
    public  void printTaskDetails(int i, String taskM, String developerDetails ,       
        String[] taskStatus,
        String taskNumber,
        String taskName ,
        String description ,
        String taskID ,
        String duration  
                        ){
        
        
        
            
       hold.append("Task Status: ").append(taskM).append("\nDeveloper Details: ").append(developerDetails).append("\nTask Number: ").append(taskNumber).append("\nTask Name: ").append(taskName).append("\nTask Description: ").append(description).append("\nTaskID: ").append(taskID).append("\nDuration of the task: ").append(duration);
       
     JOptionPane.showMessageDialog(null, hold);
        
    //return hold.toString();
    
    }
    
    public int returnTotalHours(int hours){
         int totalHours =0;
         totalHours = totalHours + hours;
     return totalHours;
    }
    
    public String printD_all_Details(){
        
        return hold.toString();
    }

    
    
    
    
    
    
    
    
    
    }