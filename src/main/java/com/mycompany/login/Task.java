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
    public  boolean checkTaskDescription(String description[], int i){
          description[i] = JOptionPane.showInputDialog("Enter the task Description");
            while(description[i].length()>=50){
                description[i] = JOptionPane.showInputDialog("Please make sure that you enter task description of less than 50 characters!! \nEnter the task description");}
            JOptionPane.showMessageDialog(null,"Task Description is successfully captured!!!");
          return description[i].length() < 50;
    }
    public static String createTaskID(String taskName, String developerDetails, int tasks){
        String taskInitials = taskName.substring(0, 1).toUpperCase();
        String devSuffix = developerDetails.length()>=3? developerDetails.substring(developerDetails.length() -3).toUpperCase() : developerDetails.toUpperCase();
        JOptionPane.showMessageDialog(null, taskInitials + ":" + tasks + ":" + devSuffix);
        return  taskInitials + ":" + tasks + ":" + devSuffix;
        
    }
    // String ill =createTaskID(String taskName, String developerDetails, int tasks);
    public  void printTaskDetails(int i, String taskM, String developerDetails ,       
        String[] taskStatus,
        String taskNumber,
        String taskName ,
        String[] description ,
        String[] taskID ,
        String[] duration  
                        ){
        
        
        //String ill = createTaskID(String taskName, String developerDetails, int tasks);
            
       hold.append("Task Status: ").append(taskM).append("\nDeveloper Details: ").append(developerDetails).append("\ntask Number: ").append(taskNumber).append("\nTask name: ").append(taskName).append("\nTask Description: ").append(description[i]).append("\nDuration of the task: ").append(duration[i]);
       
     
        
    //return hold.toString();
    
    }
   
    
    public String printD_all_Details(){
        
        return hold.toString();
    }
    
    
    
    
    
    
    
    
    
    
    
    }