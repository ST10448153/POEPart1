/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.login;


import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {
    
    public TaskTest() {
    }
    int numTasks =2;
     int taskDuration1 = 8;
     int taskDuration2 = 10;
    String taskDescription = "Create login to authenticate users";
    String taskStatus ="ToDo";
    String taskName = "Loging Feature";
    String developerDetails = "Robyn Harrison";
    
   
    @Test
    public void testCheckTaskDescriptionTrue() {
      // assertTrue(Task.checkTaskDescription(taskDescription));
       assertTrue(Task.checkTaskDescription(taskDescription));           
       System.out.println("Task successfully captured");
       
    }
    @Test
    public void testCheckTaskDescriptionFalse() {
        assertFalse(Task.checkTaskDescription(taskDescription)); 
          System.out.println("please enter description of less than 50 characters");
    }
     @Test
    public void testCreateTaskID() {
   
        
       
        int tasks = 2;
        Task instance = new Task();
        String lastTwo;
        
        String expResult =  taskName.substring(0, 2).toUpperCase() +":"+ tasks + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        String result = instance.createTaskID("Loging Feature", "Robyn Harrison", 2);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testReturnTotalHours() {
      int[] duration = {8,10};
      int time=0;
      int expected = duration[0] + duration[1];
      Task instance = new Task();
      int i=1;
      while(i<3){
          time = instance.returnTotalHours(duration[i]);
          i=i+1;
          
      }
      assertEquals(expected,time);
    }

   
    @Test
    public void testPrintTaskDetails() {
         int i =2;
         int taskNumber =0;
     
        Task instance = new Task();
        int[] duration = {8,10};
        int time=0;
        int expected = duration[0] + duration[1];
            String expResult =  taskName.substring(0, 2).toUpperCase() +":"+ numTasks + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
     
       
   
    }

    /**
     * Test of printD_all_Details method, of class Task.
     */
    @Test
    public void testPrintD_all_Details() {
        System.out.println("printD_all_Details");
        Task instance = new Task();
        String expResult = "";
        String result = instance.printD_all_Details();
        assertEquals(expResult, result);
        
    }
    
}
