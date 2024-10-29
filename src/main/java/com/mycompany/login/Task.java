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
   
    public  boolean checkTaskDescription(String description){ 
          return description.length() < 50;
    }
    public int returnTotalHours(String duration, int tasks){
        int hours, totalHours=0;    
   
                 duration = JOptionPane.showInputDialog("Enter the duration of the task(in hours)");
                 hours = Integer.parseInt(duration);  
                 totalHours = totalHours + hours;
            
         //JOptionPane.showMessageDialog(null, "Total hours is: "+ totalHours + " hours.");
        return totalHours;
    }
    public String createTaskID(String taskName, String developerDetails, int tasks){
        String taskInitials = taskName.substring(0, 2).toUpperCase();
        String devSuffix = developerDetails.length()>=3? developerDetails.substring(developerDetails.length() -3).toUpperCase() : developerDetails.toUpperCase();
      //  JOptionPane.showMessageDialog(null, taskInitials + ":" + tasks + ":" + devSuffix);
        return  (taskInitials + ":" + tasks + ":" + devSuffix).toUpperCase();
        
    }
    // String ill =createTaskID(String taskName, String developerDetails, int tasks);
    public  void printTaskDetails(int i, String taskM, String developerDetails ,       
        String[] taskStatus,
        String taskNumber,
        String taskName ,
        String description ,
        String taskID ,
        String duration  
                        ){
        
        
        //String ill = createTaskID(String taskName, String developerDetails, int tasks);
            
       hold.append("Task Status: ").append(taskM).append("\nDeveloper Details: ").append(developerDetails).append("\nTask Number: ").append(taskNumber).append("\nTask Name: ").append(taskName).append("\nTask Description: ").append(description).append("\nTaskID: ").append(taskID).append("\nDuration of the task: ").append(duration);
       
     JOptionPane.showMessageDialog(null, hold);
        
    //return hold.toString();
    
    }
  
    
    public String printD_all_Details(){
        
        return hold.toString();
    }
    
  /*  public String print_some_Details(){
        return hild.toString();
    }
    */
    
    
    
    
    
    
    
    
    
    
    }