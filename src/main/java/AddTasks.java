/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//
//import static com.mycompany.login.SignUp.Tasks;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author RC_Student_lab
// */
//public class AddTasks {
//    
//        JOptionPane.showMessageDialog(null, "Welcome to EasyKhanban");
//      int option = Integer.parseInt( JOptionPane.showInputDialog("Select an option:\n1.Add tasks \n2.Show report \n3.Quit"));
////        int option = Integer.parseInt(select);
//        while (option != 0 || option !=3) {
//           
//           String add;
//           int tasks;
//           switch(option){
//                  case 1 : 
//                      String input = JOptionPane.showInputDialog("Enter the number of tasks:");
//                        tasks = Integer.parseInt(input);
//
//        // Arrays to store names and marks
//        String[] taskStatus = new String[tasks];
//        String[] developerDetails = new String[tasks];
//        String[] taskNumber = new String[tasks];
//        String[] taskName = new String[tasks];
//        String[] description = new String[tasks];
//        String[] taskID = new String[tasks];
//        String[] duration = new String[tasks];
//        int hours;
//        int totalHours=0;
//        String[] outputs = new String[tasks];
//        
//        for (int i = 0; i < tasks; i++) {
//            taskStatus[i] =JOptionPane.showInputDialog("Enter the status of the task:\n1.ToDo \n2.Done \n3.Doing");
//           
//           int hill = Integer.parseInt(taskStatus[i]);
//           String taskM = null;
//           if(hill ==1 ){
//                 taskM = "To Do";
//            }
//           if(hill ==2){
//              taskM = "Done";
//           }
//           if(hill ==3){
//               taskM = "Doing";
//           }
//             
//            
//            developerDetails[i] =JOptionPane.showInputDialog("Enter the details of the developer");
//            
//            taskNumber[i] = String.valueOf(i);  
//
//            taskName[i] = JOptionPane.showInputDialog("Enter task Name ");
//           /* description[i] = JOptionPane.showInputDialog("Enter the task Description");
//            while(description[i].length()>=50){
//                description[i] = JOptionPane.showInputDialog("Please make sure that you enter task description of less than 50 characters!! \nEnter the task description");}
//            JOptionPane.showMessageDialog(null,"Task Description is successfully captured!!!");*/
//            Tasks.checkTaskDescription(description, i);
//           // Tasks.createTaskID(taskName, developerDetails, taskNumber);
//            duration[i] = JOptionPane.showInputDialog("Enter the duration of the task(in hours)");
//            hours = Integer.parseInt(duration[i]);  
//            totalHours = totalHours + hours;
//        // Show the results in a JOptionPane
//       /* JOptionPane.showMessageDialog(null,"Task Status: "+ taskM +"\n"+ "Developer Details: "+ developerDetails[i]+"\n"+"task Number: "+taskNumber[i]+"\n"+"Task name: "+taskName[i]+"\n"+
//            "Task Description: "+ description[i] +"\n"+"Duration of the task: "+ duration[i] ,"Task Details", JOptionPane.INFORMATION_MESSAGE);*/
//       
//        
//      Tasks.printTaskDetails( i,taskM, developerDetails ,      taskStatus, taskNumber ,taskName ,description , taskID ,duration  );
//      
//      
//      
//      
//        }
//         
//        JOptionPane.showMessageDialog(null,Tasks.printD_all_Details());
//        
//        
//         JOptionPane.showMessageDialog(null,"Total number of hours for all the tasks : "+ totalHours);
//        
//                     
//                  case 2:   JOptionPane.showMessageDialog(null,"Coming soon!");  
//                           break;
//                  case 3:   JOptionPane.showMessageDialog(null,"Thank you for using our service...."); 
//                            break;
//           }
//        }
//       
//
//}
//*/