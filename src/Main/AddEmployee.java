/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fanci
 */
public class AddEmployee extends javax.swing.JFrame {

   File file = new File("d:\\files\\Files\\Employees"); //Employee file creation
   int lines;
   File file1 = new File("d:\\files\\Files"); 
   
   
   
  
   
   
   
    
    
    public AddEmployee() {
        initComponents();
    }
    
    
    
    
    
    
    
    
    void createFolder(){ //folder creation method
        if(!file.exists()){ //if "file" doesn't exist create it
            file.mkdirs();
        }
    }
    
   void readFile(){ //employees.txt creation method
        try { //checks if Employees.txt exists
            FileReader read = new FileReader(file+"\\Employees.txt"); //FileReader checks if Employees exists in provided path
            System.out.println("File exists!");
        } catch (FileNotFoundException ex) { //if Employees.txt doesn't exists this part of code creates it
            try {
                FileWriter write = new FileWriter(file+"\\Employees.txt"); //Employees.txt creation
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
    }
   
 
    
   void addData(String ID, String nm, String pos){ //adding data
       
        try {
            RandomAccessFile random = new RandomAccessFile(file+"\\Employees.txt", "rw"); //allows to write and read from the file("rw" - Read and write mode)
            for(int i=0;i<lines;i++){ //There are multiple datas in the file so this loop allows the program to go throught each line of text
                random.readLine();
                
            }
           
            
            random.writeBytes("\r\n");                            // 
            random.writeBytes("\r\n");                            //
            random.writeBytes("Employee ID:"+ID+"\r\n");         //Writing string input into the file 
            random.writeBytes("Name:"+nm+"\r\n");                //
            random.writeBytes("Position:"+pos );                 //
            
           
          
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       
       
      
        
        
           
    }
    
   void Count(){
        try {
            lines=1;
            RandomAccessFile random = new RandomAccessFile(file+"\\Employees.txt", "rw");
            for(int i=0; random.readLine() !=null;i++){
                lines++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//method to count the lines 
   
   
   
   void readAlphabeticalOrder(){
        try { //checks if EmployeesInAlphabeticalORder.txt exists
            FileReader read = new FileReader(file1+"\\EmployeesInAlphabeticalOrder.txt"); //FileReader checks if EmployeesInAlphabeticalORder.txt exists in provided path
            System.out.println("File exists!");
        } catch (FileNotFoundException ex) { //if EmployeesInAlphabeticalOrder.txt doesn't exists this part of code creates it
            try {
                FileWriter write = new FileWriter(file1+"\\EmployeesInAlphabeticalOrder.txt"); //EmployeesInAlphabeticalOrder.txt creation
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
    }
   
   void writeAlphabeticalOrder(){
       
      ArrayList<String> Employees = new ArrayList<>(); //EMployees Array List creation to store the data to be sorted in alphabetical order
      try {
            RandomAccessFile Alphabetical = new RandomAccessFile(file1+"\\EmployeesInAlphabeticalOrder.txt", "rw"); //allows to write and read from the file("rw" - Read and write mode)
            for(int i=0;i<lines;i++){ //There are multiple datas in the file so this loop allows the program to go throught each line of text
                Alphabetical.readLine();
                
            }

                Employees.add(NameText.getText()); //passing EMployees names from TextField and adding them into Employees ArrayList

                Alphabetical.writeBytes("\r\n");
                Alphabetical.writeBytes("Name: "+Employees); //writing Employees arraylist into the file
            
            
       
       
   }   catch (FileNotFoundException ex) {
           Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
       }
      
      
                BufferedReader reader = null; 
		
		BufferedWriter writer = null;
                
                try
        {
            
            ArrayList<String> sort = new ArrayList<>(); //Creates an ArrayList object to hold the lines of input file
            reader = new BufferedReader(new FileReader(file1+"\\EmployeesInAlphabeticalOrder.txt")); //Creates BufferedReader object to read the input file
             
            
             
            String currentLine = reader.readLine(); //Reads all the lines 
             
            while (currentLine != null) 
            {
                sort.add(currentLine);
                 
                currentLine = reader.readLine();
            }
             
            //Sorting the ArrayList
             
            Collections.sort(sort);
             
            //Creating BufferedWriter object to write into output file
             
            writer = new BufferedWriter(new FileWriter(file+"\\EmployeesInAlphabeticalOrder.txt"));
             
            //Writing sorted lines into output file
             
            for (String line : sort)
            {
                writer.write(line);
                 
                writer.newLine();
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error");
        }
        finally
        {
            //Closing the resources
             
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
                 
                if(writer != null)
                {
                    writer.close();
                }
            } 
            catch (IOException e) 
            {
                System.out.println("Error");
            }
        }
   }
   
   
   void CountAlphabetical(){
        try {
            lines=1;
            RandomAccessFile random = new RandomAccessFile(file1+"\\EmployeesInAlphabeticalOrder.txt", "rw");
            for(int i=0; random.readLine() !=null;i++){
                lines++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//method to count the lines 
   
  
 
   
  
    
    
    
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EmployeeText = new javax.swing.JTextField();
        NameText = new javax.swing.JTextField();
        PositionText = new javax.swing.JTextField();
        SaveDataButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("    Add Employee");

        jLabel2.setText("EmployeeID: ");

        jLabel3.setText("Name: ");

        jLabel4.setText("Position:");

        SaveDataButton.setText("Save data");
        SaveDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveDataButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Employee Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmployeeText)
                            .addComponent(NameText)
                            .addComponent(PositionText, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(SaveDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PositionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SaveDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Employee Employees = new Employee(); //calling employees menu
         dispose(); //closing previously opened menu
         Employees.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SaveDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveDataButtonActionPerformed
        createFolder();
        readFile();  
        Count();
        addData(EmployeeText.getText(), NameText.getText(), PositionText.getText()); //allows the user to add his own data
        readAlphabeticalOrder();       
        writeAlphabeticalOrder();
        CountAlphabetical();
        JOptionPane.showMessageDialog(null, "Data saved");
        //calling other methods
        
    }//GEN-LAST:event_SaveDataButtonActionPerformed
 
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmployeeText;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField PositionText;
    private javax.swing.JButton SaveDataButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
