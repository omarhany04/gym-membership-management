/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.AdminRole;

public class RemoveTrainerWindow extends javax.swing.JFrame {

    AdminRole r;
    AdminRoleWindow ar = new AdminRoleWindow();

    public RemoveTrainerWindow(AdminRoleWindow ar, AdminRole r) {
        this.r = r;
        this.ar = ar;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TrainerId = new javax.swing.JTextField();
        Remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remove Trainer");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Trainer Id");

        TrainerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainerIdActionPerformed(evt);
            }
        });

        Remove.setBackground(new java.awt.Color(0, 102, 102));
        Remove.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Remove.setForeground(new java.awt.Color(255, 255, 255));
        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TrainerId, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrainerId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String s;
    private void TrainerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainerIdActionPerformed

    }//GEN-LAST:event_TrainerIdActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        s = TrainerId.getText();
        try {
            if (s.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(null, "Please enter trainer Id", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else if (!r.contains(s)) {
                javax.swing.JOptionPane.showMessageDialog(null, "The Trainer with Id=" + s + " doesnot exist!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                r.removeTrainer(s);
                javax.swing.JOptionPane.showMessageDialog(null, "The Trainer with Id=" + s + "has been deleted", "Message", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                ar.setVisible(true);
                ar.setLocationRelativeTo(null);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "ERROR", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_RemoveActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        ar.setVisible(true);
        ar.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Remove;
    private javax.swing.JTextField TrainerId;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
