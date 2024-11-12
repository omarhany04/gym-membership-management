/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.TrainerRole;

public class CancelRegistrationWindow extends javax.swing.JFrame {

    TrainerRole t;
    TrainerRoleWindow tr = new TrainerRoleWindow();

    public CancelRegistrationWindow(TrainerRoleWindow tr, TrainerRole t) {
        this.t = t;
        this.tr = tr;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        MemberId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ClassId = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cancel Registraition");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 51));
        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("    Class Id");
        jLabel4.setOpaque(true);

        MemberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberIdActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 51));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText(" Member  Id");
        jLabel2.setOpaque(true);

        ClassId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassIdActionPerformed(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(0, 102, 102));
        Cancel.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Cancel Registration");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(Cancel)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String mi, ci;
    private void MemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberIdActionPerformed

    }//GEN-LAST:event_MemberIdActionPerformed

    private void ClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassIdActionPerformed

    }//GEN-LAST:event_ClassIdActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        mi = MemberId.getText();
        ci = ClassId.getText();
        try {
            if (mi.equals("") || ci.equals("")) {
                javax.swing.JOptionPane.showMessageDialog(null, "Some fields are Empty!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else if (!t.containsRegistration(mi + ci)) {
                javax.swing.JOptionPane.showMessageDialog(null, "The Member with Id= " + mi + " has been unregistered from class " + ci, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                t.cancelRegistration(mi, ci);
                javax.swing.JOptionPane.showMessageDialog(null, "The Member with Id= " + mi + " cancelled registration to class " + ci, "Message", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                tr.setVisible(true);
                tr.setLocationRelativeTo(null);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "ERROR", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_CancelActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        tr.setVisible(true);
        tr.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField ClassId;
    private javax.swing.JTextField MemberId;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
