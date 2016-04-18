/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DoctorRole;

import Business.Person.Doctor;
import Business.Person.Person;
import Business.PharmaceuticalCompany.Drug;
import Business.WorkQueue.PharmaceuticalCompanyFeedbackRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class PharmacyRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyRequestJPanel
     */
    private JPanel userProcessContainer;
    private Doctor doctor;
    public PharmacyRequestJPanel(JPanel userProcessContainer, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.doctor = (Doctor)person;
        
        lblMessage.setVisible(false);
        btnReport.setVisible(false);
        txtMessage.setVisible(false);
        populatePharmacyRequestTable();
    }
    private void populatePharmacyRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblWorkRequests.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest wr : doctor.getWorkQueue().getWorkRequestList()){
            
            if(wr instanceof PharmacyWorkRequest){
                
                PharmacyWorkRequest pwr = (PharmacyWorkRequest)wr;
                Object[] row = new Object[6];
                row[0] = pwr;
                row[1] = pwr.getPatient().getFirstName()+" "+pwr.getPatient().getLastName();
                row[2] = pwr.getDrugList().getDrugName();
                row[3] =pwr.getPharmacyName();
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

        lblPharmacyRequests = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnReportPharmaceuticalCompany = new javax.swing.JCheckBox();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnReport = new javax.swing.JButton();

        lblPharmacyRequests.setText("Pharmacy Requests");

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message   ", "Patient", "Drug", "Pharmacy", "Enterprise", "Status"
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

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(576, 576, 576))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(lblPharmacyRequests))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnReportPharmaceuticalCompany))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMessage)
                                .addGap(40, 40, 40)
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblPharmacyRequests)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnReportPharmaceuticalCompany)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

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
        pcfr.setSender(doctor);

        d.getPharmaceuticalCompanyEnterprise().getWorkQueue().getWorkRequestList().add(pcfr);
    }//GEN-LAST:event_btnReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReport;
    private javax.swing.JCheckBox btnReportPharmaceuticalCompany;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPharmacyRequests;
    private javax.swing.JTable tblWorkRequests;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
