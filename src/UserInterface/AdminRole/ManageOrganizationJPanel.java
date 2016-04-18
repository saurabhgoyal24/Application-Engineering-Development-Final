/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdminRole;

import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.MainAuthorityEnterprise;
import Business.Enterprise.PharmaceuticalCompanyEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.OrganizationType;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganization
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    public ManageOrganizationJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise = enterprise;
        populateOrganizationComboBox();
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblOrganization.getModel();
        dtm.setRowCount(0);
        
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            Object[] row = new Object[3];
            
            row[0] = o.getOrgId();
            row[1] = o.getOrgName();
            row[2] = o.getOrganizationType();
            
            dtm.addRow(row);
        }
    }
    
    private void populateOrganizationComboBox(){
        
        cmbOrganization.removeAllItems();
        if(enterprise instanceof HospitalEnterprise){
            for(OrganizationType ot : OrganizationType.values()){
                if(!((ot.equals(OrganizationType.DISEASEMANAGEMENTORGANIZATION))||(ot.equals(OrganizationType.RESEARCH))||(ot.equals(OrganizationType.PHARMACYSTORE))||(ot.equals(OrganizationType.DRUGMANAGEMENT))||(ot.equals(OrganizationType.DRUGREGULATORY)))){
                    cmbOrganization.addItem(ot);
                }
            }
        }
        
        if(enterprise instanceof ClinicEnterprise){
            for(OrganizationType ot : OrganizationType.values()){
                if(!((ot.equals(OrganizationType.DISEASEMANAGEMENTORGANIZATION))||ot.equals(OrganizationType.RESEARCH)||ot.equals(OrganizationType.DRUGMANAGEMENT)||ot.equals(OrganizationType.PHARMACYSTORE)||ot.equals(OrganizationType.DRUGREGULATORY))){
                    cmbOrganization.addItem(ot);
                }
            }
        }
        
        if(enterprise instanceof PharmacyEnterprise){
            for(OrganizationType ot : OrganizationType.values()){
                if((ot.equals(OrganizationType.PHARMACYSTORE))){
                    cmbOrganization.addItem(ot);
                }
            }
        }
        
        if(enterprise instanceof PharmaceuticalCompanyEnterprise){
            for(OrganizationType ot : OrganizationType.values()){
                if((ot.equals(OrganizationType.RESEARCH)||ot.equals(OrganizationType.DRUGMANAGEMENT))){
                    cmbOrganization.addItem(ot);
                }
            }
        }
        
        if(enterprise instanceof MainAuthorityEnterprise){
            for(OrganizationType ot : OrganizationType.values()){
                if((ot.equals(OrganizationType.DISEASEMANAGEMENTORGANIZATION))||ot.equals(OrganizationType.DOCTOR)||ot.equals(OrganizationType.PATIENT)||ot.equals(OrganizationType.DRUGREGULATORY)){
                    cmbOrganization.addItem(ot);
                }
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

        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbOrganization = new javax.swing.JComboBox();
        addJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Organization Type ");

        cmbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Organization Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganization);
        if (tblOrganization.getColumnModel().getColumnCount() > 0) {
            tblOrganization.getColumnModel().getColumn(0).setResizable(false);
            tblOrganization.getColumnModel().getColumn(1).setResizable(false);
            tblOrganization.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("Manage Organization");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addJButton)
                .addGap(242, 242, 242))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel2)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addComponent(addJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        OrganizationType type = (OrganizationType)cmbOrganization.getSelectedItem();
        
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(o.getOrganizationType() == type){
                JOptionPane.showMessageDialog(null, "This type of organization alrready exists in the enterprise.");
                return;
            }
        }
        
        
        enterprise.getOrganizationDirectory().createOrganization(type);
        populateTable();
    }//GEN-LAST:event_addJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables
}