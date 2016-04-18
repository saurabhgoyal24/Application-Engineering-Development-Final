/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DiseaseManagementEmployeeRole;

import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Goyal
 */
public class DiseaseManagementEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DiseaseManagementEmployeeWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    public DiseaseManagementEmployeeWorkAreaJPanel(JPanel userPProcessContainer, Organization organization) {
        initComponents();
        this.userProcessContainer = userPProcessContainer;
        this.organization = organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDiseaseManagementEmployeeWorkArea = new javax.swing.JLabel();
        btnManageDisease = new javax.swing.JButton();

        lblDiseaseManagementEmployeeWorkArea.setText("Disease Management Employee Work Area");

        btnManageDisease.setText("Manage Disease");
        btnManageDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDiseaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(lblDiseaseManagementEmployeeWorkArea))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(btnManageDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblDiseaseManagementEmployeeWorkArea)
                .addGap(72, 72, 72)
                .addComponent(btnManageDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDiseaseActionPerformed
        // TODO add your handling code here:
        
        ManageDiseaseJPanel mdjp = new ManageDiseaseJPanel(userProcessContainer, organization);
        userProcessContainer.add("Manage Disease",mdjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDiseaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDisease;
    private javax.swing.JLabel lblDiseaseManagementEmployeeWorkArea;
    // End of variables declaration//GEN-END:variables
}
