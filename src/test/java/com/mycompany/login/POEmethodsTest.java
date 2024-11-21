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
import org.mockito.Mockito;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.*;

import static org.mockito.Mockito.*;

/**
 *
 * @author RC_Student_lab
 */
public class POEmethodsTest {
    
    @Test
    public void displayWithStatusDoneTest(){
      //  @Test
   
        // Arrange: Create sample data for the test
        String[] developers = {"Alice", "Bob", "Charlie", "David"};
        String[] taskNames = {"Task A", "Task B", "Task C", "Task D"};
        int[] durations = {5, 8, 3, 6};
        String[] statuses = {"Done", "In Progress", "Done", "Not Started"};

        // Mock JOptionPane to capture the message being shown
        JOptionPane paneMock = mock(JOptionPane.class);

        // Act: Call the method to display task details for tasks marked as "Done"
        POEmethods.displayWithStatusDone(developers, taskNames, durations, statuses);

        // Expected message for tasks with status "Done"
        String expectedMessage = "Developer: Alice, Task Name: Task A, Task Duration: 5 hours\n" +
                                 "Developer: Charlie, Task Name: Task C, Task Duration: 3 hours\n";

        // Verify that JOptionPane.showMessageDialog was called with the expected message
        verify(paneMock).showMessageDialog(Mockito.any(), Mockito.eq(expectedMessage));
    }
    
    
    
    @ Test
     public void testDisplayWithLongestDuration() {
        // Sample test data
        String[] developers = {"John", "Jane", "Alice", "Bob"};
        String[] tasks = {"Task A", "Task B", "Task C", "Task D"};
        int[] durations = {10, 25, 18, 30};  // Task durations in hours
     JOptionPane paneMock = Mockito.mock(JOptionPane.class);
        // Expected result
        String expected = "Developer: Bob\nTask: Task D\nTask Duration: 30 hours";
        
        // Test the method
        POEmethods.displayWithLongestDuration(developers, tasks, durations);
        
        
        Mockito.verify(paneMock).showMessageDialog(Mockito.any(), Mockito.eq(expected));
       
    }
     
     @Test
    public void testSearchWithTaskName() {
        // Sample test data
        String[] developers = {"John", "Jane", "Alice", "Bob"};
        String[] tasks = {"Task A", "Task B", "Task C", "Task D"};
        String[] statuses = {"In Progress", "Done", "Pending", "In Progress"};
        JOptionPane paneMock = Mockito.mock(JOptionPane.class);
        // Expected result for Task B
        String expected = "Developer: Jane\nTask Name: Task B\nTask Status: Done\n";

        // Call the method
         POEmethods.searchWithTaskName(developers, tasks, tasks, "Task A");

        // Assert that the result matches the expected output
       Mockito.verify(paneMock).showMessageDialog(Mockito.any(), Mockito.eq(expected));
    }
   @Test
    public void testFindTasksAssignedToDeveloper_TasksFound() {
        // Sample test data
        String[] developers = {"John", "Jane", "Alice", "Bob"};
        String[] tasks = {"Task A", "Task B", "Task C", "Task D"};
        String[] statuses = {"In Progress", "Done", "Pending", "In Progress"};
         JOptionPane paneMock = Mockito.mock(JOptionPane.class);
        // Expected result for developer "Jane"
        String expected = "Tasks assigned to Jane:\nTask: Task B\nStatus: Done\n\n";

        // Call the method
         POEmethods.searchWithDeveloper(developers, tasks, tasks, expected);

        
         Mockito.verify(paneMock).showMessageDialog(Mockito.any(), Mockito.eq(expected));
}
     @Test
  
         private boolean testDeleteTask(String[] tasks, String taskToCheck) {
        for (String task : tasks) {
            if (task.equals(taskToCheck)) {
                return true;
            }
        }
        return false;
    }
    @Test
    public void testDisplayAllTasks() {
        // Arrange
        String[] developers = {"Developer 1", "Developer 2"};
        String[] taskNames = {"Task 1", "Task 2"};
        String[] taskStatuses = {"Completed", "In Progress"};
        int[] durations = {5, 3};
        JOptionPane paneMock = Mockito.mock(JOptionPane.class);
        // Create a mock for JOptionPane
       
 

        // Act
       POEmethods.displayAllTasks(developers, taskNames, taskStatuses, durations);

        // Prepare the expected message
        String expectedMessage = 
            "Developers: [Developer 1, Developer 2]\n" + 
            "Tasknames: [Task 1, Task 2]\n" + 
            "Task status: [Completed, In Progress]\n" + 
            "Duration: [5, 3]";

        // Verify that showMessageDialog was called with the correct message
        
        JOptionPane.showMessageDialog(any(), eq(expectedMessage));
    }
        
    }
