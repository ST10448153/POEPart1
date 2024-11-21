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
public class POEmethods {
   
    static int tasks;
    static  String[]  developer = new String[tasks];
    static String[] taskNAME = new String[tasks];
    static String[] tasKID = new String[tasks];
    static int[] duraTion = new int[tasks];
    static String[] taskStaTus = new String[tasks];
    
    public static String displayWithStatusDone(String[] developer, String[] taskNAME, int[] duraTion, String[] taskStaTus){
         StringBuilder result = new StringBuilder();
         for(int i = 0; i < tasks; i++){
              if(taskStaTus[i].equals("Done")){
                 result.append("Developer: ").append(developer[i])
                      .append(", Task Name: ").append(taskNAME[i])
                      .append(", Task Duration: ").append(duraTion[i])
                      .append("\n");
              }
        }
         if (result.length() == 0) {
            return result.toString();
        } 
        return result.toString();
    }
    public static void displayWithLongestDuration(String[] developer, String[] taskNAME, int[] duraTion){
         StringBuilder add = new StringBuilder();
         int max = duraTion[0];

    
        for (int i = 1; i < duraTion.length; i++) {
            if (duraTion[i] > max) {
                max = duraTion[i];
                add.append(developer[i]).append(duraTion[i]);
            }
        }
        JOptionPane.showMessageDialog(null, add.toString());
    }
    
    public static void searchWithTaskName(String[] developer, String[] taskNAME, String[] taskStaTus, String searchName){
        StringBuilder stick = new StringBuilder(); 
        for (int i = 0; i < taskNAME.length; i++) {
            
            if (taskNAME[i].equals(searchName)) {
               stick.append(taskStaTus[i]).append(developer[i]).append(taskStaTus[i]);
            }
        }
        JOptionPane.showMessageDialog(null, stick.toString());  
    }     
    
    public static void searchWithDeveloper(String[] developer, String[] taskNAME, String[] taskStaTus, String developerAssigned){
        StringBuilder stick = new StringBuilder(); 
        for (int i = 0; i < taskNAME.length; i++) {
            
            if (developer[i].equals(developerAssigned)) {
               stick.append(taskNAME[i]).append(taskStaTus[i]);
            }
        }
        JOptionPane.showMessageDialog(null, stick.toString());  
    }
    
    public static void deleteTask(String[] taskNAME, String taskToDelete){
         int indexToRemove = -1;
          for (int i = 0; i < taskNAME.length; i++) {
            if (taskNAME[i].equals(taskToDelete)) {
                indexToRemove = i;
                break;
            }
        }
    }
    
    public static void displayAllTasks(String[] developer, String[] taskName, String[] taskStaTus, int[] duraTion){
         StringBuilder taskDetails = new StringBuilder();
        

        // Loop through the arrays and append each task's data to the StringBuilder
        for (int i = 0; i < developer.length; i++) {
            taskDetails.append("Task " + (i + 1) + ":\n");
            taskDetails.append("Developer: " + developer[i] + "\n");
            taskDetails.append("Task Name: " + taskName[i] + "\n");
            taskDetails.append("Duration: " + duraTion[i] + " hours\n");
            taskDetails.append("Status: " + taskStaTus[i] + "\n");
            taskDetails.append("----------------------------\n");
        }

        // Display the formatted task data in a JOptionPane dialog
        JOptionPane.showMessageDialog(null, taskDetails.toString());
    }
   
       
}