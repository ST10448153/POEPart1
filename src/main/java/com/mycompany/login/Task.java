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
     public static void main(String[] args) {
        int numberOfStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students:"));
        String[] names = new String[numberOfStudents]; // Array to hold student names

        // Populate the array using a for loop
        for (int i = 0; i < numberOfStudents; i++) {
            names[i] = JOptionPane.showInputDialog("Enter name for student " + (i + 1) + ":");
        }

        // Display the entered names
        StringBuilder message = new StringBuilder("Entered names:\n");
        for (int i = 0; i < names.length; i++) {
            message.append("Student ").append(i + 1).append(": ").append(names[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, message.toString());
    }
}
