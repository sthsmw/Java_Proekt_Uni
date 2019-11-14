/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_hotel_uni;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class roomsForm extends javax.swing.JFrame {

    Rooms_Class rooms_class_object_1 = new Rooms_Class();
    
    public roomsForm() {
        initComponents();

        rooms_class_object_1.addingTypeOfRoomsIntoComboBox(jComboBox1_Room_Type);

        rooms_class_object_1.addingRoomsIntoTable(jTable1);        
        

        ButtonGroup butgr = new ButtonGroup();
        butgr.add(jRadioButton1_Yes);
        butgr.add(jRadioButton2_No);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textBox1_Room_Number = new javax.swing.JTextField();
        textBox1_Guest_GSM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn1_room_creation = new javax.swing.JButton();
        btn1_rooms_edit = new javax.swing.JButton();
        btn1_rooms_remove = new javax.swing.JButton();
        btn1_guests_clear = new javax.swing.JButton();
        SuccessOrNot_label1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn1_guests_clear1 = new javax.swing.JButton();
        jComboBox1_Room_Type = new javax.swing.JComboBox();
        btn1_Show_Type_Of_Rooms = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1_Yes = new javax.swing.JRadioButton();
        jRadioButton2_No = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(805, 530));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel2.setText("Number:");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel3.setText("Room Type: ");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel4.setText("GSM :");

        textBox1_Room_Number.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textBox1_Guest_GSM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Type", "GSM", "Free?"
            }
        )

    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    btn1_room_creation.setBackground(new java.awt.Color(102, 0, 102));
    btn1_room_creation.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
    btn1_room_creation.setText("New Room Creation");
    btn1_room_creation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn1_room_creation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn1_room_creationActionPerformed(evt);
        }
    });

    btn1_rooms_edit.setBackground(new java.awt.Color(102, 0, 102));
    btn1_rooms_edit.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
    btn1_rooms_edit.setText("Edit Existing Room");
    btn1_rooms_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn1_rooms_edit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn1_rooms_editActionPerformed(evt);
        }
    });

    btn1_rooms_remove.setBackground(new java.awt.Color(102, 0, 102));
    btn1_rooms_remove.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
    btn1_rooms_remove.setText("Remove Existing Room");
    btn1_rooms_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn1_rooms_remove.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn1_rooms_removeActionPerformed(evt);
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
    jLabel7.setText("ROOMS");

    btn1_guests_clear1.setBackground(new java.awt.Color(102, 0, 102));
    btn1_guests_clear1.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
    btn1_guests_clear1.setText("REFRESH");
    btn1_guests_clear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn1_guests_clear1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn1_guests_clear1ActionPerformed(evt);
        }
    });

    jComboBox1_Room_Type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jComboBox1_Room_Type.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox1_Room_TypeActionPerformed(evt);
        }
    });

    btn1_Show_Type_Of_Rooms.setBackground(new java.awt.Color(102, 0, 102));
    btn1_Show_Type_Of_Rooms.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
    btn1_Show_Type_Of_Rooms.setText("Room Type?");
    btn1_Show_Type_Of_Rooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn1_Show_Type_Of_Rooms.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn1_Show_Type_Of_RoomsActionPerformed(evt);
        }
    });

    jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
    jLabel5.setText("Reserved: ");

    jPanel2.setBackground(new java.awt.Color(255, 0, 51));

    jRadioButton1_Yes.setText("Yes");

    jRadioButton2_No.setText("No");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jRadioButton1_Yes)
            .addGap(18, 18, 18)
            .addComponent(jRadioButton2_No)
            .addContainerGap(19, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButton1_Yes)
                .addComponent(jRadioButton2_No))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

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
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addGap(57, 57, 57)
                    .addComponent(textBox1_Guest_GSM, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textBox1_Room_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1_Room_Type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn1_room_creation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn1_guests_clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn1_rooms_remove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn1_rooms_edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(SuccessOrNot_label1)))
                .addComponent(btn1_Show_Type_Of_Rooms))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 40, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
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
                        .addComponent(textBox1_Room_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jComboBox1_Room_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addComponent(btn1_Show_Type_Of_Rooms)
                    .addGap(14, 14, 14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(textBox1_Guest_GSM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1_room_creation)
                        .addComponent(SuccessOrNot_label1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn1_rooms_edit))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btn1_rooms_remove)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btn1_guests_clear)
            .addContainerGap(18, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            
        DefaultTableModel DfTblMl_1 = (DefaultTableModel)jTable1.getModel(); 

        int selectedLine = jTable1.getSelectedRow(); 

        textBox1_Room_Number.setText(DfTblMl_1.getValueAt(selectedLine, 0).toString()); 
        jComboBox1_Room_Type.setSelectedItem(DfTblMl_1.getValueAt(selectedLine, 1));        
        textBox1_Guest_GSM.setText(DfTblMl_1.getValueAt(selectedLine, 2).toString());  
        
        String isRes = DfTblMl_1.getValueAt(selectedLine, 3).toString();
        
        if(isRes.equals("Free"))
        {
            jRadioButton1_Yes.setSelected(true);
        }else if(isRes.equals("Not Free"))
        {
            jRadioButton2_No.setSelected(true);
        }
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn1_room_creationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_room_creationActionPerformed
        try
        {
            int rNumber = Integer.valueOf(textBox1_Room_Number.getText());
            int rType = Integer.valueOf(jComboBox1_Room_Type.getSelectedItem().toString()); 
            String rGSM = textBox1_Guest_GSM.getText();
                                    
            if(rooms_class_object_1.AddingRooms(rNumber, rType, rGSM) == true)
            {
                showMessageDialog(null, "You have added a room successfully! ", "Successful", INFORMATION_MESSAGE);
            }else
            {
                showMessageDialog(null, "You have NOT added a room successfully! ", "ERROR", ERROR_MESSAGE);
            }
            
        }catch(NumberFormatException e)
        {
            showMessageDialog(null, e.getMessage(), "ERROR", ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn1_room_creationActionPerformed

    private void btn1_rooms_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_rooms_editActionPerformed
        
        int rNumber = Integer.valueOf(textBox1_Room_Number.getText());
         
        int type = Integer.valueOf(jComboBox1_Room_Type.getSelectedItem().toString());
        String _GSM = textBox1_Guest_GSM.getText();
        String _isFree = "Not Free";
        
        if(jRadioButton1_Yes.isSelected())
        {
            _isFree="Free";
        }

        if( _GSM.isEmpty())
        {
            showMessageDialog(null, "Please fill the GSM box! ", "Error", ERROR_MESSAGE);
        }else
        {
            if(rooms_class_object_1.editingSelectedRoom(rNumber, type, _GSM, _isFree))
            {
                showMessageDialog(null, "You have edited it successfully! ", "Successful", INFORMATION_MESSAGE);
            }else
            {
                showMessageDialog(null, "You have NOT edited it successfully! ", "Error", ERROR_MESSAGE);
            }
        }                
    }//GEN-LAST:event_btn1_rooms_editActionPerformed

    private void btn1_rooms_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_rooms_removeActionPerformed
        int number_of_room = Integer.valueOf(textBox1_Room_Number.getText());
        if(rooms_class_object_1.delRoom(number_of_room))
            {
                showMessageDialog(null, "You have deleted it successfully! ", "Successful", INFORMATION_MESSAGE);
            }else
            {
                showMessageDialog(null, "You have NOT deleted it successfully! ", "Error", ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btn1_rooms_removeActionPerformed

    private void btn1_guests_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_guests_clearActionPerformed
        jComboBox1_Room_Type.setSelectedIndex(0); 
        jRadioButton2_No.setSelected(true);        
        textBox1_Room_Number.setText("");        
        textBox1_Guest_GSM.setText("");        
    }//GEN-LAST:event_btn1_guests_clearActionPerformed

    
    private void btn1_guests_clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_guests_clear1ActionPerformed
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Number", "Type", "GSM", "Free?"})); 
        
        rooms_class_object_1.addingRoomsIntoTable(jTable1);
    }//GEN-LAST:event_btn1_guests_clear1ActionPerformed

    private void btn1_Show_Type_Of_RoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_Show_Type_Of_RoomsActionPerformed
            Rooms_Type_Form rooms_type_form_obj_1 = new Rooms_Type_Form();
            rooms_type_form_obj_1.setVisible(true);
            rooms_type_form_obj_1.pack();
            rooms_type_form_obj_1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn1_Show_Type_Of_RoomsActionPerformed

    private void jComboBox1_Room_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_Room_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_Room_TypeActionPerformed

    
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
            java.util.logging.Logger.getLogger(roomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roomsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SuccessOrNot_label1;
    private javax.swing.JButton btn1_Show_Type_Of_Rooms;
    private javax.swing.JButton btn1_guests_clear;
    private javax.swing.JButton btn1_guests_clear1;
    private javax.swing.JButton btn1_room_creation;
    private javax.swing.JButton btn1_rooms_edit;
    private javax.swing.JButton btn1_rooms_remove;
    private javax.swing.JComboBox jComboBox1_Room_Type;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1_Yes;
    private javax.swing.JRadioButton jRadioButton2_No;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textBox1_Guest_GSM;
    private javax.swing.JTextField textBox1_Room_Number;
    // End of variables declaration//GEN-END:variables
}
