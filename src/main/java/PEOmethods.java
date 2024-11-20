
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
import javax.swing.JOptionPane;
public class PEOmethods {
    

/**
 *
 * @author RC_Student_lab
 */

   static String taskM ="Done";
    static int tasks; 
    static  String[]  developer = new String[tasks];
    static String[] taskNAME = new String[tasks];
    static String[] tasKID = new String[tasks];
    static int[] duraTion = new int[tasks];
    static String[] taskStaTus = new String[tasks];
     
     public static void main(String[] args) {
         if(taskM.equals("Done")){
             for(int i=0;i<developer.length;i++){
                 JOptionPane.showMessageDialog(null,"Developers: " + developer[i] + "");
             }
         }
     }
}


