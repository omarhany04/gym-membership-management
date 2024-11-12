/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;


public class AdminRoleWindow extends javax.swing.JFrame {

    public AdminRoleWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddTrainer = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        ViewTrainers = new javax.swing.JButton();
        RemoveTrainer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Role");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        AddTrainer.setBackground(new java.awt.Color(0, 102, 102));
        AddTrainer.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        AddTrainer.setForeground(new java.awt.Color(255, 255, 255));
        AddTrainer.setText("Add Trainer");
        AddTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainerActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(0, 102, 102));
        Logout.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        ViewTrainers.setBackground(new java.awt.Color(0, 102, 102));
        ViewTrainers.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ViewTrainers.setForeground(new java.awt.Color(255, 255, 255));
        ViewTrainers.setText("View Trainers");
        ViewTrainers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTrainersActionPerformed(evt);
            }
        });

        RemoveTrainer.setBackground(new java.awt.Color(0, 102, 102));
        RemoveTrainer.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        RemoveTrainer.setForeground(new java.awt.Color(255, 255, 255));
        RemoveTrainer.setText("Remove Trainer");
        RemoveTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveTrainerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RemoveTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewTrainers, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(AddTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(RemoveTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(ViewTrainers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    backend.AdminRole r = new backend.AdminRole();
    private void AddTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainerActionPerformed

        AddTrainerWindow a = new AddTrainerWindow(this, r);
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_AddTrainerActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        r.logout();
        javax.swing.JOptionPane.showMessageDialog(null, "Saved successfully ", "Message", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        setVisible(false);
        firstPage f = new firstPage();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_LogoutActionPerformed

    private void ViewTrainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTrainersActionPerformed
        ViewTrainersWindow c = new ViewTrainersWindow(this, r);
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ViewTrainersActionPerformed

    private void RemoveTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveTrainerActionPerformed
        RemoveTrainerWindow b = new RemoveTrainerWindow(this, r);
        b.setVisible(true);
        b.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_RemoveTrainerActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        firstPage f = new firstPage();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTrainer;
    private javax.swing.JButton Logout;
    private javax.swing.JButton RemoveTrainer;
    private javax.swing.JButton ViewTrainers;
    // End of variables declaration//GEN-END:variables
}
