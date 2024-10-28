/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

import javax.swing.JOptionPane;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author RC_Student_lab
 */
public class Unit_Test_Part2 {
     public  void checkTaskDescription(String description[], int i){
          description[i] = JOptionPane.showInputDialog("Enter the task Description");
            while(description[i].length()>=50){
                description[i] = JOptionPane.showInputDialog("Please make sure that you enter task description of less than 50 characters!! \nEnter the task description");}
            JOptionPane.showMessageDialog(null,"Task Description is successfully captured!!!");
          
    }
}

