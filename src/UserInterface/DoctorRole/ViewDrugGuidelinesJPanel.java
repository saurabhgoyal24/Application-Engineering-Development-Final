/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DoctorRole;

import Business.Enterprise.PharmaceuticalCompanyEnterprise;
import Business.PharmaceuticalCompany.Drug;
import UserInterface.DrugRegulatoryEmployeeRole.ViewDrugDetailJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ViewDrugGuidelinesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDrugGuidelinesJPanel
     */
    private JPanel userProcessContainer;
    private ArrayList<PharmaceuticalCompanyEnterprise> pharmaCompanyList;
    public ViewDrugGuidelinesJPanel(JPanel userProcessContainer, ArrayList<PharmaceuticalCompanyEnterprise> pharmaCompanyList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.pharmaCompanyList = pharmaCompanyList;
        populateEnterpriseComboBox();
    }
    
    private void populateEnterpriseComboBox(){
        cmbPharmaceuticalCompany.removeAllItems();
        for(PharmaceuticalCompanyEnterprise pce : pharmaCompanyList){
            cmbPharmaceuticalCompany.addItem(pce);
        }
    }
    
    private void populateDrugTable(PharmaceuticalCompanyEnterprise pce){
        DefaultTableModel dtm = (DefaultTableModel)tblDrugList.getModel();
        dtm.setRowCount(0);
        
        for(Drug d : pce.getDrugList()){
            if(d.getIsApproved().equals("Approved")){
                Object[] row = new Object[2];
                row[0] = d;
                row[1] = d.getDrugName();
                
                dtm.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewDrugGuidelines = new javax.swing.JLabel();
        lblPharmaceuticalCompany = new javax.swing.JLabel();
        cmbPharmaceuticalCompany = new javax.swing.JComboBox();
        lblPharmaceuticalCompanyId = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDrugList = new javax.swing.JTable();
        lblDrugList = new javax.swing.JLabel();
        btnViewDrugDetails = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblViewDrugGuidelines.setText("View Drug Guidelines");

        lblPharmaceuticalCompany.setText("Pharmaceutical Company");

        cmbPharmaceuticalCompany.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPharmaceuticalCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPharmaceuticalCompanyActionPerformed(evt);
            }
        });

        lblPharmaceuticalCompanyId.setText("Pharmaceutical Company ID");

        tblDrugList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Drug ID", "Drug Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDrugList);
        if (tblDrugList.getColumnModel().getColumnCount() > 0) {
            tblDrugList.getColumnModel().getColumn(0).setResizable(false);
            tblDrugList.getColumnModel().getColumn(1).setResizable(false);
        }

        lblDrugList.setText("Drug List");

        btnViewDrugDetails.setText("View Drug Details");
        btnViewDrugDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDrugDetailsActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(lblViewDrugGuidelines))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPharmaceuticalCompany)
                                .addComponent(lblPharmaceuticalCompanyId))
                            .addGap(97, 97, 97)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblId)
                                .addComponent(cmbPharmaceuticalCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDrugList)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewDrugDetails)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblViewDrugGuidelines)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPharmaceuticalCompany)
                    .addComponent(cmbPharmaceuticalCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPharmaceuticalCompanyId)
                    .addComponent(lblId))
                .addGap(29, 29, 29)
                .addComponent(lblDrugList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnViewDrugDetails)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(33, 33, 33))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPharmaceuticalCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPharmaceuticalCompanyActionPerformed
        // TODO add your handling code here:
        PharmaceuticalCompanyEnterprise pce = (PharmaceuticalCompanyEnterprise)cmbPharmaceuticalCompany.getSelectedItem();
        if(pce!=null){
            lblId.setText(String.valueOf(pce.getOrgId()));
            populateDrugTable(pce);
        }
    }//GEN-LAST:event_cmbPharmaceuticalCompanyActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewDrugDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDrugDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDrugList.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a drug first");
            return;
        }
        Drug drug = (Drug)tblDrugList.getValueAt(selectedRow, 0);
        
        ViewDrugDetailJPanel vddjp = new ViewDrugDetailJPanel(userProcessContainer, drug);
        userProcessContainer.add("View Drug Detail2",vddjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDrugDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewDrugDetails;
    private javax.swing.JComboBox cmbPharmaceuticalCompany;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDrugList;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPharmaceuticalCompany;
    private javax.swing.JLabel lblPharmaceuticalCompanyId;
    private javax.swing.JLabel lblViewDrugGuidelines;
    private javax.swing.JTable tblDrugList;
    // End of variables declaration//GEN-END:variables
}