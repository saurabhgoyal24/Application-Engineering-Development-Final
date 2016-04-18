/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DrugRegulatoryEmployeeRole;

import Business.PharmaceuticalCompany.Drug;
import Business.WorkQueue.DrugManagementEmployeeWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Goyal
 */
public class ViewDrugDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDrugJPanel
     */
    private JPanel userProcessContainer;
    private Drug drug;
    
    public ViewDrugDetailJPanel(JPanel userProcessContainer, Drug drug) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.drug =drug;
        populateTextFields();
    }
    
    private void populateTextFields(){
        txtCompany.setText(drug.getPharmaceuticalCompanyEnterprise().getOrgName());
        txtCompanyId.setText(String.valueOf(drug.getPharmaceuticalCompanyEnterprise().getOrgId()));
        txtDrugId.setText(String.valueOf(drug.getDrugId()));
        txtDrugName.setText(drug.getDrugName());
        txtDrugStrength.setText(String.valueOf(drug.getDrugStrength()));
        txtIsApproved.setText(drug.getIsApproved());
        txtPrice.setText(String.valueOf(drug.getPrice()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDrugDetail = new javax.swing.JLabel();
        lblDrugId = new javax.swing.JLabel();
        lblDrugName = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        lblCompanyId = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblIsApproved = new javax.swing.JLabel();
        lblDrugStrength = new javax.swing.JLabel();
        txtDrugId = new javax.swing.JTextField();
        txtDrugName = new javax.swing.JTextField();
        txtCompany = new javax.swing.JTextField();
        txtCompanyId = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtIsApproved = new javax.swing.JTextField();
        txtDrugStrength = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnViewMedicationGuideLine = new javax.swing.JButton();

        lblDrugDetail.setText("Drug Detail");

        lblDrugId.setText("Drug ID");

        lblDrugName.setText("Drug Name");

        lblCompany.setText("Company");

        lblCompanyId.setText("Company ID");

        lblPrice.setText("Price");

        lblIsApproved.setText("IsApproved?");

        lblDrugStrength.setText("Drug Strength");

        txtDrugId.setEditable(false);

        txtDrugName.setEditable(false);

        txtCompany.setEditable(false);

        txtCompanyId.setEditable(false);

        txtPrice.setEditable(false);

        txtIsApproved.setEditable(false);

        txtDrugStrength.setEditable(false);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewMedicationGuideLine.setText("View Medication Guideline>>");
        btnViewMedicationGuideLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMedicationGuideLineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(lblDrugDetail))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDrugId)
                            .addComponent(lblDrugName)
                            .addComponent(lblCompany)
                            .addComponent(lblCompanyId)
                            .addComponent(lblPrice)
                            .addComponent(lblIsApproved)
                            .addComponent(lblDrugStrength))
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDrugId, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtDrugName)
                            .addComponent(txtCompany)
                            .addComponent(txtCompanyId)
                            .addComponent(txtPrice)
                            .addComponent(txtIsApproved)
                            .addComponent(txtDrugStrength))))
                .addContainerGap(205, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewMedicationGuideLine)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDrugDetail)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrugId)
                    .addComponent(txtDrugId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrugName)
                    .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompany)
                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompanyId)
                    .addComponent(txtCompanyId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIsApproved)
                    .addComponent(txtIsApproved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrugStrength)
                    .addComponent(txtDrugStrength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnViewMedicationGuideLine))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewMedicationGuideLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMedicationGuideLineActionPerformed
        // TODO add your handling code here:
        ViewMedicationGuidelineJPanel vmgjp = new ViewMedicationGuidelineJPanel(userProcessContainer, drug.getDrugGuideline());
        userProcessContainer.add("View Medication Guide Line",vmgjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewMedicationGuideLineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewMedicationGuideLine;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblCompanyId;
    private javax.swing.JLabel lblDrugDetail;
    private javax.swing.JLabel lblDrugId;
    private javax.swing.JLabel lblDrugName;
    private javax.swing.JLabel lblDrugStrength;
    private javax.swing.JLabel lblIsApproved;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtCompanyId;
    private javax.swing.JTextField txtDrugId;
    private javax.swing.JTextField txtDrugName;
    private javax.swing.JTextField txtDrugStrength;
    private javax.swing.JTextField txtIsApproved;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}