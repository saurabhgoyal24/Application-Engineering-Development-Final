/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MainAuthorityAdminRole;

import Business.EcoSystem;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import UserInterface.AdminRole.ManageEmployeeJPanel;
import UserInterface.AdminRole.ManageOrganizationJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Goyal
 */
public class MainAuthorityAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainAuthorityAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;

    public MainAuthorityAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
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
        btnManageDoctors = new javax.swing.JButton();
        btnManageOrganization = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnManagePatients = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MainAuthorityAdminWorkArea");

        btnManageDoctors.setText("Manage Doctors");
        btnManageDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDoctorsActionPerformed(evt);
            }
        });

        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        jButton1.setText("Manage Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnManagePatients.setText("Manage Patients");
        btnManagePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnManageDoctors, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(btnManageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManagePatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnManageDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnManagePatients, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDoctorsActionPerformed
        // TODO add your handling code here:
        boolean flag = false;

        for (Organization o : system.getMainAuthorityEnterprise().getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof DoctorOrganization) {
                ManageDoctorsJPanel majp = new ManageDoctorsJPanel(userProcessContainer, o);
                userProcessContainer.add("Manage Doctors", majp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                flag = true;
                layout.next(userProcessContainer);

            }
        }
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Create Doctor Organization first.");
            return;
        }

//        
//        ManageDoctorsJPanel majp = new ManageDoctorsJPanel(userProcessContainer, system);
//        userProcessContainer.add("Manage Doctors", majp);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageDoctorsActionPerformed

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:

        ManageOrganizationJPanel mojp = new ManageOrganizationJPanel(userProcessContainer, system.getMainAuthorityEnterprise());
        userProcessContainer.add("Manage Organization", mojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageEmployeeJPanel mejp = new ManageEmployeeJPanel(userProcessContainer, system.getMainAuthorityEnterprise(), null);
        userProcessContainer.add("Manage Employee", mejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnManagePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientsActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
        for (Organization o : system.getMainAuthorityEnterprise().getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof PatientOrganization) {
                ManagePatientsJPanel mpjp = new ManagePatientsJPanel(userProcessContainer, o);
                userProcessContainer.add("Manage Patient", mpjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                flag = true;
                layout.next(userProcessContainer);

            }
        }
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Create Patient Organization first.");
            return;
        }
        
    }//GEN-LAST:event_btnManagePatientsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDoctors;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManagePatients;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}