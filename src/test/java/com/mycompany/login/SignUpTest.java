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

    StringBuilder expectedOutput = new StringBuilder();
    for (int i = 0; i < taskStatus.length; i++) {
        if (taskStatus[i].equals("Done")) {
            expectedOutput.append(developer[i])
                           .append(" ")
                           .append(taskNames[i])
                           .append(" ")
                           .append(taskDuration[i])
                           .append("\n");
        }
    }

    // Call the method you're testing
    String actualOutput = POEmethods.displayWithStatusDone(developer, taskNames, taskDuration, taskStatus);

    // Assert that the actual output matches the expected output
    assertEquals(expectedOutput.toString(), actualOutput);

       

      
        }
    }



    /**
     * Test of printTaskDetails method, of class SignUp.
     */
   