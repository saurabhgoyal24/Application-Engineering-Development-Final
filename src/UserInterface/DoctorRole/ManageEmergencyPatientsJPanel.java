/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DoctorRole;

import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;
import Business.WorkQueue.EmergencyEnquiryWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ManageEmergencyPatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmergencyPatientsJPanel
     */
    private JPanel userProcessContainer;
    private Doctor doctor;
    
    
    public ManageEmergencyPatientsJPanel(JPanel userProcessContainer, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.doctor = (Doctor)person;
        
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblEmergencyEnquiries.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest wr : doctor.getWorkQueue().getWorkRequestList()){
            if(wr instanceof EmergencyEnquiryWorkRequest){
                EmergencyEnquiryWorkRequest eewr = (EmergencyEnquiryWorkRequest)wr;
                
                Object[] row = new Object[4];
                row[0] = eewr.getMedicalRecordNumber();
                row[1] = eewr;
                row[2] = eewr.getEnterprise();
                row[3] = eewr.getEncounterHistory().size();
                
                dtm.addRow(row);
            }
        }
    }
    
    private void populateEncounterTable(EmergencyEnquiryWorkRequest eewr){
        DefaultTableModel dtm = (DefaultTableModel)tblEncounters.getModel();
        dtm.setRowCount(0);
        
        for(Encounter e: eewr.getEncounterHistory()){
            Object[] row = new Object[2];
            
            row[0] = e;
            row[1] = e.getDateOfEncounter();
            
            dtm.addRow(row);
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

        btnBack = new javax.swing.JButton();
        lblManageEmergencyPatients = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmergencyEnquiries = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnViewEncounter = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEncounters = new javax.swing.JTable();
        btnViewEncounterDetails = new javax.swing.JButton();

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblManageEmergencyPatients.setText("Manage Emergency Patients");

        tblEmergencyEnquiries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient MRN", "Message", "Enterprise Name", "No. of updated details"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmergencyEnquiries);
        if (tblEmergencyEnquiries.getColumnModel().getColumnCount() > 0) {
            tblEmergencyEnquiries.getColumnModel().getColumn(0).setResizable(false);
            tblEmergencyEnquiries.getColumnModel().getColumn(1).setResizable(false);
            tblEmergencyEnquiries.getColumnModel().getColumn(2).setResizable(false);
            tblEmergencyEnquiries.getColumnModel().getColumn(3).setResizable(false);
        }

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnViewEncounter.setText("View Encounter");
        btnViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterActionPerformed(evt);
            }
        });

        tblEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EncounterID", "Encounter Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblEncounters);
        if (tblEncounters.getColumnModel().getColumnCount() > 0) {
            tblEncounters.getColumnModel().getColumn(0).setResizable(false);
            tblEncounters.getColumnModel().getColumn(1).setResizable(false);
        }

        btnViewEncounterDetails.setText("View Encounter Details>>");
        btnViewEncounterDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRefresh)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(lblManageEmergencyPatients))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnViewEncounter))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViewEncounterDetails)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblManageEmergencyPatients)
                .addGap(36, 36, 36)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewEncounter)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewEncounterDetails)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmergencyEnquiries.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select an emergency patient first.");
            return;
        }
        WorkRequest wr = (WorkRequest)tblEmergencyEnquiries.getValueAt(selectedRow, 1);
        EmergencyEnquiryWorkRequest eewr = (EmergencyEnquiryWorkRequest)wr;
        populateEncounterTable(eewr);
    }//GEN-LAST:event_btnViewEncounterActionPerformed

    private void btnViewEncounterDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEncounters.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select an encounter first.");
            return;
        }
        Encounter encounter = (Encounter)tblEncounters.getValueAt(selectedRow,0);
        ViewEncounterDetailsJpanel vedj = new ViewEncounterDetailsJpanel(userProcessContainer, encounter);
        userProcessContainer.add("View Encounter Details",vedj);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewEncounterDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewEncounter;
    private javax.swing.JButton btnViewEncounterDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblManageEmergencyPatients;
    private javax.swing.JTable tblEmergencyEnquiries;
    private javax.swing.JTable tblEncounters;
    // End of variables declaration//GEN-END:variables
}