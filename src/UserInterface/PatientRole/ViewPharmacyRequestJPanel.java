/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.Person.Patient;
import Business.Person.Person;
import Business.PharmaceuticalCompany.Drug;
import Business.WorkQueue.PharmaceuticalCompanyFeedbackRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.DrugRegulatoryEmployeeRole.ViewDrugDetailJPanel;
import com.sun.corba.se.impl.orbutil.threadpool.WorkQueueImpl;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ViewPharmacyRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPharmacyRequestJPanel
     */
    private JPanel userProcessContainer;
    private Patient patient;
    private Drug drug;

    public ViewPharmacyRequestJPanel(JPanel userProcessContainer, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        populatePharmacyRequestTable();
        
        lblMessage.setVisible(false);
        txtMessage.setVisible(false);
        btnReport.setVisible(false);

    }

    private void populatePharmacyRequestTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblWorkRequests.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : patient.getWorkQueue().getWorkRequestList()) {

            if (wr instanceof PharmacyWorkRequest) {

                PharmacyWorkRequest pwr = (PharmacyWorkRequest) wr;
                Object[] row = new Object[6];
                row[0] = pwr;
                row[1] = pwr.getDrugList().getDrugName();
                row[2] = pwr.getSender().getFirstName() + " " + pwr.getSender().getLastName();
                row[3] = pwr.getPharmacyName();
                row[4] = pwr.getEnterprise().getOrgName();
                row[5] = pwr.getStatus();

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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnViewRequest = new javax.swing.JButton();
        lblDrugId = new javax.swing.JLabel();
        txtDrugId = new javax.swing.JTextField();
        lblDrugName = new javax.swing.JLabel();
        txtDrugName = new javax.swing.JTextField();
        btnViewDrugDetails = new javax.swing.JButton();
        btnReportPharmaceuticalCompany = new javax.swing.JCheckBox();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnReport = new javax.swing.JButton();

        jLabel1.setText("View Pharmacy Request");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Drug", "Doctor", "Pharmacy", "Enterprise", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequests);
        if (tblWorkRequests.getColumnModel().getColumnCount() > 0) {
            tblWorkRequests.getColumnModel().getColumn(0).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(1).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(2).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(3).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(4).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(5).setResizable(false);
        }

        btnViewRequest.setText("View Request");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });

        lblDrugId.setText("Drug ID");

        txtDrugId.setEditable(false);

        lblDrugName.setText("Drug name");

        txtDrugName.setEditable(false);

        btnViewDrugDetails.setText("View Drug Details");
        btnViewDrugDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDrugDetailsActionPerformed(evt);
            }
        });

        btnReportPharmaceuticalCompany.setText("Report Pharmaceutical Company");
        btnReportPharmaceuticalCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportPharmaceuticalCompanyActionPerformed(evt);
            }
        });

        lblMessage.setText("Message");

        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnViewRequest)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(lblDrugId)
                            .addGap(29, 29, 29)
                            .addComponent(txtDrugId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(lblDrugName)
                            .addGap(43, 43, 43)
                            .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addComponent(btnViewDrugDetails)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnReportPharmaceuticalCompany))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblMessage)
                        .addGap(40, 40, 40)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnViewRequest)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrugId)
                    .addComponent(txtDrugId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDrugName)
                    .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDrugDetails))
                .addGap(33, 33, 33)
                .addComponent(btnReportPharmaceuticalCompany)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkRequests.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first.");
            return;
        }

        PharmacyWorkRequest pwr = (PharmacyWorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
        drug = pwr.getDrugList();
        txtDrugId.setText(String.valueOf(pwr.getDrugList().getDrugId()));
        txtDrugName.setText(pwr.getDrugList().getDrugName());
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnViewDrugDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDrugDetailsActionPerformed
        // TODO add your handling code here:
        if (drug == null) {
            JOptionPane.showMessageDialog(null, "Please select a drug first.");
            return;
        }
        ViewDrugDetailJPanel vddjp = new ViewDrugDetailJPanel(userProcessContainer, drug);
        userProcessContainer.add("View drug details.", vddjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDrugDetailsActionPerformed

    private void btnReportPharmaceuticalCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportPharmaceuticalCompanyActionPerformed
        // TODO add your handling code here:
        if(btnReportPharmaceuticalCompany.isSelected()){
            lblMessage.setVisible(true);
            txtMessage.setVisible(true);
            btnReport.setVisible(true);
        }else{
            lblMessage.setVisible(false);
            txtMessage.setVisible(false);
            btnReport.setVisible(false);
        }
    }//GEN-LAST:event_btnReportPharmaceuticalCompanyActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkRequests.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Select a row first.");
            return;
        }
        String message = txtMessage.getText();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter a message first.");
            return;
        }
        PharmacyWorkRequest pwr = (PharmacyWorkRequest)tblWorkRequests.getValueAt(selectedRow,0);
        Drug d = pwr.getDrugList();
        PharmaceuticalCompanyFeedbackRequest pcfr = new PharmaceuticalCompanyFeedbackRequest();
        
        pcfr.setMessage(message);
        pcfr.setDrug(d);
        pcfr.setSender(patient);
        
        d.getPharmaceuticalCompanyEnterprise().getWorkQueue().getWorkRequestList().add(pcfr);
        txtMessage.setText(null);
    }//GEN-LAST:event_btnReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReport;
    private javax.swing.JCheckBox btnReportPharmaceuticalCompany;
    private javax.swing.JButton btnViewDrugDetails;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDrugId;
    private javax.swing.JLabel lblDrugName;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTable tblWorkRequests;
    private javax.swing.JTextField txtDrugId;
    private javax.swing.JTextField txtDrugName;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}