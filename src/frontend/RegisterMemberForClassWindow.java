package frontend;

import backend.TrainerRole;
import java.time.LocalDate;
import java.time.ZoneId;

public class RegisterMemberForClassWindow extends javax.swing.JFrame {

    TrainerRole t;
    TrainerRoleWindow tr = new TrainerRoleWindow();

    public RegisterMemberForClassWindow(TrainerRoleWindow tr, TrainerRole t) {
        this.t = t;
        this.tr = tr;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MemberId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ClassId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register Member");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Registration Date");
        jLabel3.setOpaque(true);

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

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String mi, ci;
    private void MemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberIdActionPerformed

    }//GEN-LAST:event_MemberIdActionPerformed

    private void ClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassIdActionPerformed

    }//GEN-LAST:event_ClassIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mi = MemberId.getText();
        ci = ClassId.getText();
        try {
            if (mi.equals("") || ci.equals("")) {
                javax.swing.JOptionPane.showMessageDialog(null, "Some fields are Empty!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else if (!t.containsClass(ci) || !t.containsMember(mi)) {
//                System.out.println(!t.containsClass(ci));
                javax.swing.JOptionPane.showMessageDialog(null, "The member or the class is not exist", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else if (t.fullClass(ci)) {
                javax.swing.JOptionPane.showMessageDialog(null, "The class has no available seats", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else if (t.containsRegistration(mi + ci)) {
                javax.swing.JOptionPane.showMessageDialog(null, "The Member has already registred", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else if (jDateChooser1.getDate() == null) {
                LocalDate date = LocalDate.now();
                t.registerMemberForClass(mi, ci, date);
                javax.swing.JOptionPane.showMessageDialog(null, "The Member with Id= " + mi + " has successfully registered to class " + ci, "Message", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                tr.setVisible(true);
                tr.setLocationRelativeTo(null);
            } else {
                LocalDate date = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (date.isBefore(LocalDate.now())) {
                    javax.swing.JOptionPane.showMessageDialog(null, "The selected date cannot be in the past", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                } else {
                    t.registerMemberForClass(mi, ci, date);
                    javax.swing.JOptionPane.showMessageDialog(null, "The Member with Id= " + mi + " has successfully registered to class " + ci, "Message", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    tr.setVisible(true);
                    tr.setLocationRelativeTo(null);
                }
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "ERROR", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        tr.setVisible(true);
        tr.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClassId;
    private javax.swing.JTextField MemberId;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
