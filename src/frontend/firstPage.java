package frontend;

public class firstPage extends javax.swing.JFrame {

    public firstPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TrainerRole = new javax.swing.JButton();
        AdminRole = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("            Gym System");

        TrainerRole.setBackground(new java.awt.Color(0, 0, 0));
        TrainerRole.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TrainerRole.setForeground(new java.awt.Color(255, 255, 255));
        TrainerRole.setText("Trainer Role");
        TrainerRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainerRoleActionPerformed(evt);
            }
        });

        AdminRole.setBackground(new java.awt.Color(0, 0, 0));
        AdminRole.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AdminRole.setForeground(new java.awt.Color(255, 255, 255));
        AdminRole.setText("Admin Role");
        AdminRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminRoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdminRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TrainerRole, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(AdminRole, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(TrainerRole, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TrainerRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainerRoleActionPerformed
        TrainerLogin t = new TrainerLogin(this);
        t.setVisible(true);
        t.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_TrainerRoleActionPerformed

    private void AdminRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminRoleActionPerformed
        AdminLogin m = new AdminLogin(this);
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_AdminRoleActionPerformed

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
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                firstPage x = new firstPage();
                x.setVisible(true);
                x.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminRole;
    private javax.swing.JButton TrainerRole;
    // End of variables declaration//GEN-END:variables
}
