/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_hotel_uni;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kom6i
 */
public class guestsForm extends javax.swing.JFrame {

    GuestClass gcObj1 = new GuestClass();
    
    public guestsForm() {
        initComponents();
        
        gcObj1.addingItemsIntoTable(jTable1); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textBox1_Guest_First_Name = new javax.swing.JTextField();
        textBox1_Guest_ID = new javax.swing.JTextField();
        textBox1_Guest_Last_Name = new javax.swing.JTextField();
        textBox1_Guest_GSM = new javax.swing.JTextField();
        textBox1_Guest_EMail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn1_guests_creation = new javax.swing.JButton();
        btn1_guests_edit = new javax.swing.JButton();
        btn1_guests_remove = new javax.swing.JButton();
        btn1_guests_clear = new javax.swing.JButton();
        SuccessOrNot_label1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn1_guests_clear1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel2.setText("Guest ID:");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel3.setText("First Name: ");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel4.setText("GSM :");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel5.setText("Last Name :");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel6.setText("E-Mail :");

        textBox1_Guest_First_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textBox1_Guest_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textBox1_Guest_Last_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textBox1_Guest_GSM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textBox1_Guest_EMail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Guest ID", "First Name", "Last Name", "GSM", "E-Mail"
            }
        )

    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    btn1_guests_creation.setBackground(new java.awt.Color(102, 0, 102));
    btn1_guests_creation.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
    btn1_guests_creation.setText("New Guest Creation");
    btn1_guests_creation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn1_guests_creation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn1_guests_creationActionPerformed(evt);
        }
    });

    btn1_guests_edit.setBackground(new java.awt.Color(102, 0, 102));
    btn1_guests_edit.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
    btn1_guests_edit.setText("Edit Existing Guest");
    btn1_guests_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn1_guests_edit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn1_guests_editActionPerformed(evt);
        }
    });

    btn1_guests_remove.setBackground(new java.awt.Color(102, 0, 102));
    btn1_guests_remove.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
    btn1_guests_remove.setText("Remove Existing Guest");
    btn1_guests_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn1_guests_remove.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn1_guests_removeActionPerformed(evt);
        }
    });

    btn1_guests_clear.setBackground(new java.awt.Color(102, 0, 102));
    btn1_guests_clear.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
    btn1_guests_clear.setText("Clear");
    btn1_guests_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn1_guests_clear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn1_guests_clearActionPerformed(evt);
        }
    });

    jLabel7.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
    jLabel7.setText("GUESTS");

    btn1_guests_clear1.setBackground(new java.awt.Color(102, 0, 102));
    btn1_guests_clear1.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
    btn1_guests_clear1.setText("REFRESH");
    btn1_guests_clear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn1_guests_clear1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn1_guests_clear1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(74, 74, 74)
            .addComponent(jLabel7)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn1_guests_clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn1_guests_remove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn1_guests_creation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn1_guests_edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SuccessOrNot_label1))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textBox1_Guest_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(textBox1_Guest_First_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textBox1_Guest_EMail, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textBox1_Guest_GSM, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textBox1_Guest_Last_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btn1_guests_clear1)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel7)
            .addGap(19, 19, 19)
            .addComponent(btn1_guests_clear1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(textBox1_Guest_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(textBox1_Guest_First_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(textBox1_Guest_Last_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(textBox1_Guest_GSM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(textBox1_Guest_EMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1_guests_creation)
                        .addComponent(SuccessOrNot_label1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn1_guests_edit))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btn1_guests_remove)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btn1_guests_clear)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1_guests_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_guests_clearActionPerformed
        textBox1_Guest_ID.setText("");
        textBox1_Guest_First_Name.setText("");
        textBox1_Guest_Last_Name.setText("");
        textBox1_Guest_GSM.setText("");
        textBox1_Guest_EMail.setText("");
    }//GEN-LAST:event_btn1_guests_clearActionPerformed

    private void btn1_guests_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_guests_removeActionPerformed
        int gID = Integer.valueOf(textBox1_Guest_ID.getText());
        if(gcObj1.delGuest(gID))
            {
                showMessageDialog(null, "You have deleted it successfully! ", "Successful", INFORMATION_MESSAGE);
            }else
            {
                showMessageDialog(null, "You have NOT deleted it successfully! ", "Error", ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btn1_guests_removeActionPerformed

    private void btn1_guests_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_guests_editActionPerformed
        int gID = Integer.valueOf(textBox1_Guest_ID.getText());
        String _FN = textBox1_Guest_First_Name.getText();
        String _LN = textBox1_Guest_Last_Name.getText();
        String _GSM = textBox1_Guest_GSM.getText();
        String _Email = textBox1_Guest_EMail.getText();

        if(_FN.isEmpty() || _LN.isEmpty() || _GSM.isEmpty() || _Email.isEmpty() )
        {
            showMessageDialog(null, "Please fill all of the text boxes! ", "Error", ERROR_MESSAGE);
            // return;
        }else
        {
            if(gcObj1.editingSelectedGuest(gID, _FN, _LN, _GSM, _Email))
            {
                showMessageDialog(null, "You have edited it successfully! ", "Successful", INFORMATION_MESSAGE);
            }else
            {
                showMessageDialog(null, "You have NOT edited it successfully! ", "Error", ERROR_MESSAGE);
            }
        }                        
    }//GEN-LAST:event_btn1_guests_editActionPerformed

    private void btn1_guests_creationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_guests_creationActionPerformed

        String _FN = textBox1_Guest_First_Name.getText();
        String _LN = textBox1_Guest_Last_Name.getText();
        String _GSM = textBox1_Guest_GSM.getText();
        String _Email = textBox1_Guest_EMail.getText();

        if(_FN.isEmpty() || _LN.isEmpty() || _GSM.isEmpty() || _Email.isEmpty() )
        {
            showMessageDialog(null, "Please fill all of the text boxes! ", "Error", ERROR_MESSAGE);
            return; 
        }

        if(gcObj1.AddingGuests(_FN, _LN, _GSM, _Email)) 
        {
            SuccessOrNot_label1.setText("Successfully Added");
        }else
        {
            SuccessOrNot_label1.setText("Something Went Wrong");
        }
    }//GEN-LAST:event_btn1_guests_creationActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel DfTblMl_1 = (DefaultTableModel)jTable1.getModel(); 

        int selectedLine = jTable1.getSelectedRow(); 

        textBox1_Guest_ID.setText(DfTblMl_1.getValueAt(selectedLine, 0).toString()); 
        textBox1_Guest_First_Name.setText(DfTblMl_1.getValueAt(selectedLine, 1).toString());
        textBox1_Guest_Last_Name.setText(DfTblMl_1.getValueAt(selectedLine, 2).toString());
        textBox1_Guest_GSM.setText(DfTblMl_1.getValueAt(selectedLine, 3).toString());
        textBox1_Guest_EMail.setText(DfTblMl_1.getValueAt(selectedLine, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

        
    private void btn1_guests_clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_guests_clear1ActionPerformed
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Guest ID", "First Name", "Last Name", "GSM", "E-Mail"})); 
        
        gcObj1.addingItemsIntoTable(jTable1);
    }//GEN-LAST:event_btn1_guests_clear1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(guestsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guestsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guestsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guestsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guestsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SuccessOrNot_label1;
    private javax.swing.JButton btn1_guests_clear;
    private javax.swing.JButton btn1_guests_clear1;
    private javax.swing.JButton btn1_guests_creation;
    private javax.swing.JButton btn1_guests_edit;
    private javax.swing.JButton btn1_guests_remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textBox1_Guest_EMail;
    private javax.swing.JTextField textBox1_Guest_First_Name;
    private javax.swing.JTextField textBox1_Guest_GSM;
    private javax.swing.JTextField textBox1_Guest_ID;
    private javax.swing.JTextField textBox1_Guest_Last_Name;
    // End of variables declaration//GEN-END:variables
}
