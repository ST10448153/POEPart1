/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.login;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author RC_Student_lab
 */
public class SignUpTest {
    
    @Test
    public void displayWithStatusDoneTest(){
       String[] developer = {"Mike Smith","Edward Harisson","Samantha Paulson","Glenda Oberholzer"};
       String[] taskNames = {"Create Login","Create add features","Creates reports","add arrays"};
       int[] taskDuration = {5, 8, 2, 11};
       String[] taskStatus = {"To Do", "Doing", "Done", "To Do"};
       String devLoperTemp=null;
       String tasknameTemp=null;
       int duRationTemp = 0;

        

       

        // Call the method
        POEmethods.displayWithStatusDone(developer, taskNames, taskDuration, taskStatus);
        // Define the expected output
        for(int i =0; i<taskStatus.length;i++){
            if(taskStatus[i].equals("Done")){
              devLoperTemp = developer[i];
              tasknameTemp = taskNames[i];
              duRationTemp = taskDuration[i];
            }
        }
        
        String expectedOutput = devLoperTemp + " "+ tasknameTemp + " " + duRationTemp;

        // Compare the captured output with the expected output
        //assertArrayEquals(expectedOutput, POEmethods.displayWithStatusDone(developer, taskNames, taskDuration, taskStatus)); 
        
        
    }

 

    /**
     * Test of printTaskDetails method, of class SignUp.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        int i = 0;
        String taskStatus = "";
        String developerDetails = "";
        String taskStatus0 = "";
        int taskNumber = 0;
        String taskName = "";
        String taskDescription = "";
        String expResult_2 = "";
        int expected = 0;
        SignUp.printTaskDetails(i, taskStatus, developerDetails, taskStatus0, taskNumber, taskName, taskDescription, expResult_2, expected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
