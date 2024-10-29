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
    
    
    @Test
    public void testCheckTaskDescription() {
      //String take =  JOptionPane.showInputDialog("Enter the description ");
        String description = null;
        int i = 0;
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(description);
        assertEquals(expResult, result);
       
        fail("actual and expected results are not the same");
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        String duration = "";
        int tasks = 0;
        Task instance = new Task();
        int expResult = 0;
        int result = instance.returnTotalHours(duration, tasks);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        String expResult = "";
        String result = instance.createTaskID(taskName, developerDetails, tasks);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
