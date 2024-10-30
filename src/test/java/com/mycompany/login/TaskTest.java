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
    public void storeTask1(){
        String taskName = "Login feature";
        int taskNumber;
        int i=1;
        int Task =1;
        while(i<=numTasks){
           
           if (Task ==1){
               taskNumber =i;
           }
            }
     String taskDescription = "Create login to authenticate users";
     String developerDetails = "Robyn Harrison";
    
       
     
    }
    
   
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

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskName = "";
        String developerDetails = "";
        int tasks = 0;
        Task instance = new Task();
        String lastTwo;
        String str = "Loging Feature";
        String expResult =  str.substring(str.length() - 2);
        String result = instance.createTaskID(taskName, developerDetails, tasks);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        int i = 0;
        String taskM = "";
        String developerDetails = "";
        String[] taskStatus = null;
        String taskNumber = "";
        String taskName = "";
        String description = null;
        String taskID = "";
        String duration = "";
        Task instance = new Task();
        instance.printTaskDetails(i, taskM, developerDetails, taskStatus, taskNumber, taskName, description, taskID, duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
