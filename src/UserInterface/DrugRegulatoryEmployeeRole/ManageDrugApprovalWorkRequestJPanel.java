/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DrugRegulatoryEmployeeRole;

import Business.Enterprise.Enterprise;
import Business.WorkQueue.DrugManagementEmployeeWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ManageDrugApprovalWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrugApprovalWorkRequestJPanel
     */
    private JPanel userProcesContainer;
    private Enterprise enterprise;
    public ManageDrugApprovalWorkRequestJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        
        this.userProcesContainer = userProcessContainer;
        this.enterprise = enterprise;
        
        lblDecision.setVisible(false);
        btnSubmit.setVisible(false);
        cmbYesNo.setVisible(false);
        
        populateWorkRequestTable();
        populateCombo();
    }
    
    private void populateCombo(){
        
        cmbYesNo.removeAllItems();
        cmbYesNo.addItem("Approve");
        cmbYesNo.addItem("Decline");
    }
    
    private void populateWorkRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblWorkRequest.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){
            
            if(wr instanceof DrugManagementEmployeeWorkRequest){
               
                DrugManagementEmployeeWorkRequest dmewr = (DrugManagementEmployeeWorkRequest)wr;
                
                Object[] row = new Object[8];
                
                row[0] = dmewr;
                row[1] = dmewr.getSenderEnterpriseName();
                row[2] = dmewr.getSenderEnterpriseID();
                row[3] = dmewr.getDrug().getDrugId();
                row[4] = dmewr.getDrug().getDrugName();
                row[5] = dmewr.getStatus();
                row[6] = dmewr.getRequestDate();
                row[7] = dmewr.getResolveDate();
                
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        lblManageDrugApprovalWorkRequest = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        cmbYesNo = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        lblDecision = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnViewDrug = new javax.swing.JButton();

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Company Name", "Company ID", "Drug ID", "Drug Name", "Status", "Request Date", "Resolve Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);
        if (tblWorkRequest.getColumnModel().getColumnCount() > 0) {
            tblWorkRequest.getColumnModel().getColumn(0).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(1).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(2).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(3).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(4).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(5).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(6).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(7).setResizable(false);
        }

        lblManageDrugApprovalWorkRequest.setText("Manage Drug Approval Work Request");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        cmbYesNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblDecision.setText("Decision");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnViewDrug.setText("View Drug");
        btnViewDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDrugActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(lblManageDrugApprovalWorkRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(lblDecision)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProcess, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(cmbYesNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(99, 99, 99)
                        .addComponent(btnViewDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRefresh)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBack)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblManageDrugApprovalWorkRequest)
                .addGap(25, 25, 25)
                .addComponent(btnRefresh)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnViewDrug))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbYesNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDecision))
                .addGap(34, 34, 34)
                .addComponent(btnSubmit)
                .addGap(43, 43, 43)
                .addComponent(btnBack)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcesContainer.remove(this);
        CardLayout layout = (CardLayout)userProcesContainer.getLayout();
        layout.previous(userProcesContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblWorkRequest.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a Work Request First.");
            return;
        }
        
        DrugManagementEmployeeWorkRequest dmewr = (DrugManagementEmployeeWorkRequest)tblWorkRequest.getValueAt(selectedRow,0);
        
        if(dmewr.getStatus().equals("Processed")){
            JOptionPane.showMessageDialog(null, "The following work request is already processed.");
            return;
        }
        
        lblDecision.setVisible(true);
        cmbYesNo.setVisible(true);
        btnSubmit.setVisible(true);
        
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateWorkRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblWorkRequest.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a Work Request First.");
            return;
        }
        String decision = (String)cmbYesNo.getSelectedItem();
        
        DrugManagementEmployeeWorkRequest dmewr = (DrugManagementEmployeeWorkRequest)tblWorkRequest.getValueAt(selectedRow,0);
        
        dmewr.setStatus("Processed");
        dmewr.setResolveDate(new Date());
        
        if(decision == "Approve"){
            dmewr.getDrug().setIsApproved("Approved");
        }
        
        if(decision == "Decline"){
            dmewr.getDrug().setIsApproved("Declined");
        }
        
        lblDecision.setVisible(false);
        cmbYesNo.setVisible(false);
        btnSubmit.setVisible(false);
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnViewDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDrugActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkRequest.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a Work Request First.");
            return;
        }
        DrugManagementEmployeeWorkRequest dmewr = (DrugManagementEmployeeWorkRequest)tblWorkRequest.getValueAt(selectedRow,0);
        
        ViewDrugDetailJPanel vddjp = new ViewDrugDetailJPanel(userProcesContainer,dmewr.getDrug());
        userProcesContainer.add("View Drug Detail",vddjp);
        CardLayout layout = (CardLayout)userProcesContainer.getLayout();
        layout.next(userProcesContainer);
        
    }//GEN-LAST:event_btnViewDrugActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnViewDrug;
    private javax.swing.JComboBox cmbYesNo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDecision;
    private javax.swing.JLabel lblManageDrugApprovalWorkRequest;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}