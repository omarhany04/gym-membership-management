package frontend;

public class TrainerRoleWindow extends javax.swing.JFrame {

    backend.TrainerRole t = new backend.TrainerRole();

    public TrainerRoleWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewClasses = new javax.swing.JButton();
        AddClass = new javax.swing.JButton();
        ViewMembers = new javax.swing.JButton();
        AddMember = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        ViewRegistration = new javax.swing.JButton();
        CancelRegistration = new javax.swing.JButton();
        RegisterMember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trainer Role");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        ViewClasses.setBackground(new java.awt.Color(0, 102, 102));
        ViewClasses.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        ViewClasses.setForeground(new java.awt.Color(255, 255, 255));
        ViewClasses.setText("View Classes");
        ViewClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewClassesActionPerformed(evt);
            }
        });

        AddClass.setBackground(new java.awt.Color(0, 102, 102));
        AddClass.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        AddClass.setForeground(new java.awt.Color(255, 255, 255));
        AddClass.setText("Add Class");
        AddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassActionPerformed(evt);
            }
        });

        ViewMembers.setBackground(new java.awt.Color(0, 102, 102));
        ViewMembers.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        ViewMembers.setForeground(new java.awt.Color(255, 255, 255));
        ViewMembers.setText("View Members");
        ViewMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMembersActionPerformed(evt);
            }
        });

        AddMember.setBackground(new java.awt.Color(0, 102, 102));
        AddMember.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        AddMember.setForeground(new java.awt.Color(255, 255, 255));
        AddMember.setText("Add Member");
        AddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberActionPerformed(evt);
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

        ViewRegistration.setBackground(new java.awt.Color(0, 102, 102));
        ViewRegistration.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ViewRegistration.setForeground(new java.awt.Color(255, 255, 255));
        ViewRegistration.setText("View Registrations");
        ViewRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRegistrationActionPerformed(evt);
            }
        });

        CancelRegistration.setBackground(new java.awt.Color(0, 102, 102));
        CancelRegistration.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        CancelRegistration.setForeground(new java.awt.Color(255, 255, 255));
        CancelRegistration.setText("Cancel Registration");
        CancelRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelRegistrationActionPerformed(evt);
            }
        });

        RegisterMember.setBackground(new java.awt.Color(0, 102, 102));
        RegisterMember.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        RegisterMember.setForeground(new java.awt.Color(255, 255, 255));
        RegisterMember.setText(" Register Member for Class ");
        RegisterMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ViewClasses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisterMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(AddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(AddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddClass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegisterMember, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CancelRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewClassesActionPerformed

        ViewClassesWindow d = new ViewClassesWindow(this, t);
        d.setVisible(true);
        d.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ViewClassesActionPerformed

    private void AddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassActionPerformed
        AddClassWindow c = new AddClassWindow(this, t);
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_AddClassActionPerformed

    private void ViewMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMembersActionPerformed
        ViewMembersWindow b = new ViewMembersWindow(this, t);
        b.setVisible(true);
        b.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ViewMembersActionPerformed

    private void AddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberActionPerformed
        AddMemberWindow a = new AddMemberWindow(this, t);
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_AddMemberActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        t.logout();
        javax.swing.JOptionPane.showMessageDialog(null, "Saved successfully ", "Message", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        setVisible(false);
        firstPage f = new firstPage();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_LogoutActionPerformed

    private void ViewRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRegistrationActionPerformed
        ViewRegistrationsWindow v = new ViewRegistrationsWindow(this, t);
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_ViewRegistrationActionPerformed

    private void CancelRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelRegistrationActionPerformed
        CancelRegistrationWindow w = new CancelRegistrationWindow(this, t);
        w.setVisible(true);
        w.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_CancelRegistrationActionPerformed

    private void RegisterMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterMemberActionPerformed
        RegisterMemberForClassWindow r = new RegisterMemberForClassWindow(this, t);
        r.setVisible(true);
        r.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_RegisterMemberActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        firstPage f = new firstPage();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClass;
    private javax.swing.JButton AddMember;
    private javax.swing.JButton CancelRegistration;
    private javax.swing.JButton Logout;
    private javax.swing.JButton RegisterMember;
    private javax.swing.JButton ViewClasses;
    private javax.swing.JButton ViewMembers;
    private javax.swing.JButton ViewRegistration;
    // End of variables declaration//GEN-END:variables
}
