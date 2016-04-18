/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PatientRole;

import Business.EcoSystem;
import Business.Person.Patient;
import Business.WorkQueue.HospitalEnterpriseAdminWorkRequest;
import Business.WorkQueue.PatientWorkRequest;
import Business.WorkQueue.ReferDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ManageDoctorWorkRequests extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctorWorkRequests
     */
    private JPanel userProcessContainer;
    private Patient patient;
    private EcoSystem system;
    public ManageDoctorWorkRequests(JPanel userProcessContainer, EcoSystem system, Patient patient) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.patient = patient;
        populateWorkRequestTable();
    }
    
    private void populateWorkRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblWorkRequests.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest wr : patient.getWorkQueue().getWorkRequestList()){
            
            if(wr instanceof PatientWorkRequest){
                
                PatientWorkRequest pwr = (PatientWorkRequest)wr;
                
                Object[] row = new Object[6];
                row[0] = pwr;
                row[1] = pwr.getReceiverEnterprise().getOrgName();
                row[2] = pwr.getReceiver().getFirstName() + " " + pwr.getReceiver().getLastName();
                row[3] = pwr.getStatus();
                row[4] = pwr.getAppointmentDetails();
                row[5] = "Patient Request";
                dtm.addRow(row);
            }
            
            if(wr instanceof HospitalEnterpriseAdminWorkRequest){
                
                HospitalEnterpriseAdminWorkRequest heawr = (HospitalEnterpriseAdminWorkRequest)wr;
                Object[] row = new Object[6];
                row[0] = heawr;
                row[1] = heawr.getSenderEnterprise().getOrgName();
                row[2] = heawr.getDoctor().getFirstName() + " " + heawr.getDoctor().getLastName();
                row[3] = heawr.getStatus();
                row[4] = "";
                row[5] = "Hospital Admin Request";
                dtm.addRow(row);
            }
            
            if(wr instanceof ReferDoctorWorkRequest){
                ReferDoctorWorkRequest rdwr = (ReferDoctorWorkRequest)wr;
                
                Object[] row = new Object[6];
                row[0] = rdwr;
                row[1] = rdwr.getSenderEnterprise().getOrgName();
                row[2] = rdwr.getSender().getFirstName() + " " + rdwr.getSender().getLastName();
                row[3] = rdwr.getStatus();
                row[4] = "";
                row[5] = "Refer Request";
                
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

        lblManageDoctorWorkrequests = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnCreateWorkRequests = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        lblManageDoctorWorkrequests.setText("Manage Doctor Work Requests");

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
                "Message", "Enterprise Name", "Doctor Name", "Status", "Appointment Details", "Request Type"
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

        btnCreateWorkRequests.setText("Create Work Requests");
        btnCreateWorkRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateWorkRequestsActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCreateWorkRequests)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(240, 240, 240)
                            .addComponent(lblManageDoctorWorkrequests))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(btnBack)
                            .addGap(471, 471, 471))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRefresh))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblManageDoctorWorkrequests)
                .addGap(55, 55, 55)
                .addComponent(btnRefresh)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnCreateWorkRequests)
                .addGap(155, 155, 155)
                .addComponent(btnBack)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateWorkRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateWorkRequestsActionPerformed
        // TODO add your handling code here:
        CreateWorkRequestJPanel cwrjp = new CreateWorkRequestJPanel(userProcessContainer, patient, system);
        userProcessContainer.add("Create Work Request",cwrjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateWorkRequestsActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateWorkRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateWorkRequests;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageDoctorWorkrequests;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
