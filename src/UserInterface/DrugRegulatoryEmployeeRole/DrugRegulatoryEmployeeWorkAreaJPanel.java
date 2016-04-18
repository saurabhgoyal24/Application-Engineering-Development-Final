/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DrugRegulatoryEmployeeRole;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Goyal
 */
public class DrugRegulatoryEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DrugRegulatoryEmployeeWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    public DrugRegulatoryEmployeeWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDrugRegulatoryEmployeeWorkArea = new javax.swing.JLabel();
        btnManageDrugApprovalRequest = new javax.swing.JButton();

        lblDrugRegulatoryEmployeeWorkArea.setText("Drug Regulatory Employee Work Area");

        btnManageDrugApprovalRequest.setText("Manage Drug Approval Request");
        btnManageDrugApprovalRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDrugApprovalRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(lblDrugRegulatoryEmployeeWorkArea))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnManageDrugApprovalRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDrugRegulatoryEmployeeWorkArea)
                .addGap(100, 100, 100)
                .addComponent(btnManageDrugApprovalRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDrugApprovalRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDrugApprovalRequestActionPerformed
        // TODO add your handling code here:
        
        ManageDrugApprovalWorkRequestJPanel mdawrjp = new ManageDrugApprovalWorkRequestJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("Manage Drug Approval Work Request",mdawrjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
                
    }//GEN-LAST:event_btnManageDrugApprovalRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDrugApprovalRequest;
    private javax.swing.JLabel lblDrugRegulatoryEmployeeWorkArea;
    // End of variables declaration//GEN-END:variables
}
