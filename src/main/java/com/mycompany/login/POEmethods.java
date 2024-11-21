/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

import javax.swing.JOptionPane;
import java.util.Arrays;

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
    
    public static void displayWithStatusDone(String[] developer, String[] taskNAME, int[] duraTion, String[] taskStaTus){
          StringBuilder doneTasks = new StringBuilder();
        boolean tasksFound = false;

        // Loop through the taskStatus array and find tasks with "Done" status
        for (int i = 0; i < taskStaTus.length; i++) {
            if (taskStaTus[i].equalsIgnoreCase("Done")) {
                // If the task is "Done", append the details to StringBuilder
                 
                           }
               doneTasks.append("Developer: ").append(developer[i]).append("\n");
                doneTasks.append("Task Name: ").append(taskNAME[i]).append("\n");
                doneTasks.append("Duration: ").append(duraTion[i]).append(" hours\n\n");
                tasksFound = true;
              
            }
        

        // If there are any "Done" tasks, display them
        if (tasksFound) {
            JOptionPane.showMessageDialog(null, doneTasks.toString(), "Completed Tasks", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // If no tasks are marked as "Done", show an error message
            JOptionPane.showMessageDialog(null, "No tasks marked as 'Done'.", "Search Result", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void displayWithLongestDuration(String[] developer, String[] taskNAME, int[] duraTion){
          int maxDuration = -1;  // Initialize with a value smaller than any possible duration
        int maxIndex = -1;     // Index of the developer with the largest duration

        // Loop through the durations array to find the maximum duration
        for (int i = 0; i < duraTion.length; i++) {
            if (duraTion[i] > maxDuration) {
                maxDuration = duraTion[i];
                maxIndex = i;  // Store the index of the developer with the largest duration
            }
        }

        // If a maximum duration was found, display it; otherwise, show an error
        if (maxIndex != -1) {
            // Display developer name, task duration in a JOptionPane message box
            String message = "Developer: " + developer[maxIndex] + "\n" +
                             "Task Duration: " + maxDuration + " hours";
            JOptionPane.showMessageDialog(null, message, "Task with Largest Duration", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No tasks found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void searchWithTaskName(String[] developer, String[] taskNAME, String[] taskStaTus, String searchName){
      boolean taskFound = false;
        StringBuilder taskDetails = new StringBuilder();

        // Loop through the taskNames array to find the task
        for (int i = 0; i < taskNAME.length; i++) {
            if (taskNAME[i].equalsIgnoreCase(searchName)) {
                // If task is found, append the details to the StringBuilder
                taskDetails.append("Developer: " + developer[i] + "\n");
                taskDetails.append("Task Name: " + taskNAME[i] + "\n");
                taskDetails.append("Task Status: " + taskStaTus[i] + "\n");
                taskFound = true;
                break;  // Stop the loop once the task is found
            }
        }

        // If task is found, display details in a JOptionPane message box
        if (taskFound) {
            JOptionPane.showMessageDialog(null, taskDetails.toString(), "Task Details", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // If task is not found, show an error message
            JOptionPane.showMessageDialog(null, "Task '" + taskNAME + "' not found!", "Search Result", JOptionPane.ERROR_MESSAGE);
        }
    }     
    
    public static void searchWithDeveloper(String[] developer, String[] taskName, String[] taskStaTus, String developerAssigned){
         StringBuilder tasksAssigned = new StringBuilder();
        boolean tasksFound = false;

        // Loop through the developer array and match the developer's name
        for (int i = 0; i < developer.length; i++) {
            if (developer[i].equalsIgnoreCase(developerAssigned)) {
                tasksAssigned.append("Task: " + taskName[i] + "\nStatus: " + taskStaTus[i] + "\n\n");
                tasksFound = true;
            }
        }

        // If tasks are found, display them
        if (tasksFound) {
            JOptionPane.showMessageDialog(null, 
                "Tasks assigned to " + ":\n", 
                "Tasks Assigned", 
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            // If no tasks are found for the developer
            JOptionPane.showMessageDialog(null, 
                "No tasks found for the chosen developer: ", 
                "Search Result", 
                JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    public static void deleteTask(String[] taskNAME, String taskToDelete){
          // Find the index of the task to delete
          
        int indexToDelete = -1;
        for (int i = 0; i < taskNAME.length; i++) {
            if (taskNAME[i].equals(taskToDelete)) {
                indexToDelete = i;
                break;
            }
        }

        // If task is found, remove it and shift elements
        if (indexToDelete != -1) {
            // Create a new array with one less element
            String[] newTasks = new String[taskNAME.length - 1];

            // Copy elements before the task to delete
            System.arraycopy(taskNAME, 0, newTasks, 0, indexToDelete);

            // Copy elements after the task to delete
            System.arraycopy(taskNAME, indexToDelete + 1, newTasks, indexToDelete, taskNAME.length - indexToDelete - 1);

           JOptionPane.showMessageDialog(null,"Task '" + taskToDelete + "' has been deleted.");
            JOptionPane.showMessageDialog( null,newTasks ); // Return the new array
        } else {
            JOptionPane.showMessageDialog(null,"Task '" + taskToDelete + "' not found.");
            JOptionPane.showMessageDialog(null, taskNAME);  // Return the original array if task is not found
        }
        
    }
    
    public static void displayAllTasks(String[] developer, String[] taskName, String[] taskStaTus, int[] duraTion){
        String array1 = Arrays.toString(developer);
        String array2 = Arrays.toString(taskName);
        String array3 = Arrays.toString(taskStaTus);
        String array4 = Arrays.toString(duraTion);
       String combinedString = "Developers: " + array1 + "\nTasknames: " + array2 + "\nTask status: " + array3 + "\nDuration: " + array4;
       
         JOptionPane.showMessageDialog(null, combinedString);
    }
   
        public static void main(String[] args) {
            String[] developer = {"Mashoto","Pheedi","Peter","Selaelo"};
            String[] taskName = {"Create Login","Create add features", "Create reports", "Add array"};
            String[] taskStaTus = {"To Do","Doing","Done","To Do"};
            int[] duraTion = {5,8,2,11};
            
          //String  taskToDelete = "Add array";
           //displayAllTasks( developer, taskName,  taskStaTus, duraTion);
           //deleteTask( taskName, taskToDelete);
          // String developerAssigned = "selaelo";
           //searchWithDeveloper( developer,  taskName,  taskStaTus, developerAssigned);
          // String searchName = "Add array";
          // searchWithTaskName(developer, taskName, taskStaTus, searchName);
         // displayWithLongestDuration( developer, taskNAME,duraTion);
         displayWithStatusDone(developer,  taskName,duraTion, taskStaTus);
        }
          
        
}