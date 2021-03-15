/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author fanci
 */
public class Tables extends javax.swing.JFrame {

     File file = new File("d:\\files\\Files\\Menu"); //file creation
     int lines;
    
    
    
    
    public Tables() {
        initComponents();
    }

    
     void createFolder(){
        if(!file.exists()){ //if "file" doesn't exist create it
            file.mkdirs();
        }
    }
    
    
    
    void readFile(){
        try { //checks if Menu.txt exists
            FileReader read = new FileReader(file+"\\Menu.txt"); //FileReader checks if MEnu.txt exists in provided path
            System.out.println("File exists!");
        } catch (FileNotFoundException ex) { //if Menu.txt doesn't exists this part of code creates it
            try {
                FileWriter write = new FileWriter(file+"\\Menu.txt"); //Menu.txt creation
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
     void addData(){ //adding data
        try {
            RandomAccessFile rw = new RandomAccessFile(file+"\\Menu.txt", "rw"); //allows to write and read from the file("rw" - Read and write mode)
            for(int i=0;i<lines;i++){ //There are multiple datas in the file so this loop allows the program to go throught each line of text
                rw.readLine();
                
            }
            
            Menu menu = new Menu();
           
            if(rw.length() == 0) {  // it only writes data to the file when it's empty so user can easily edit menu and delete the old one in order to update it
            
            rw.writeBytes("\r\n");                           
            rw.writeBytes("\r\n");      
            rw.writeBytes(menu.getAppetizers()+ "\r\n");
            rw.writeBytes(menu.getBurgers()+ "\r\n");                //writing string into a file
            rw.writeBytes(menu.getDrinks());         
           
            }
            
           
          
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } //method to add data to into the file
    
     void Count(){
        try {
            lines=1;
            RandomAccessFile rw = new RandomAccessFile(file+"\\Menu.txt", "rw");
            for(int i=0; rw.readLine() !=null;i++){
                lines++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    } //method to count the lines
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Table1 = new javax.swing.JButton();
        Table2 = new javax.swing.JButton();
        Table3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        ViewMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Bar");

        Table1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Table1.setText("Table 1");
        Table1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table1ActionPerformed(evt);
            }
        });

        Table2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Table2.setText("Table 2");
        Table2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table2ActionPerformed(evt);
            }
        });

        Table3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Table3.setText("Table 3");
        Table3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table3ActionPerformed(evt);
            }
        });

        jButton5.setText("Back to menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        ViewMenu.setText("View Menu");
        ViewMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(Table1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ViewMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Table2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(Table3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Table1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(ViewMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Table2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Table3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         Java_MainMenu login = new Java_MainMenu();
         dispose();
         login.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Table1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table1ActionPerformed
         TakingOrders TakingOrders = new TakingOrders();
         dispose();
         TakingOrders.setVisible(true);
    }//GEN-LAST:event_Table1ActionPerformed

    private void Table2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table2ActionPerformed
        TakingOrders TakingOrders = new TakingOrders();
         dispose();
         TakingOrders.setVisible(true);
    }//GEN-LAST:event_Table2ActionPerformed

    private void Table3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table3ActionPerformed
        TakingOrders TakingOrders = new TakingOrders();
         dispose();
         TakingOrders.setVisible(true);
    }//GEN-LAST:event_Table3ActionPerformed

    private void ViewMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMenuActionPerformed
        createFolder();
        readFile();                 
        Count();
        addData();
        
         ViewMenu View = new ViewMenu();
         dispose();
         View.setVisible(true);
        
        
    }//GEN-LAST:event_ViewMenuActionPerformed

    
         
    
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
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Table1;
    private javax.swing.JButton Table2;
    private javax.swing.JButton Table3;
    private javax.swing.JButton ViewMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
