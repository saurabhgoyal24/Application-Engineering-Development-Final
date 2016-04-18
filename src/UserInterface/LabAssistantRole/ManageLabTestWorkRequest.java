/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistantRole;

import Business.Organization.Organization;
import Business.Person.LabAssistant;
import Business.Person.Person;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ManageLabTestWorkRequest extends javax.swing.JPanel {

    /**
     * Creates new form ManageLabTestWorkRequest
     */
    private JPanel userProcessContainer;
    private Organization labOrganization;
    private LabAssistant labAssistant;
    private WorkRequest request;

    public ManageLabTestWorkRequest(JPanel userProcessContainer, Organization labOrganization, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.labOrganization = labOrganization;
        this.labAssistant = (LabAssistant) person;
        lblResult.setVisible(false);
        txtResult.setVisible(false);
        btnUpdateResult.setVisible(false);
        populateWorkRequestTable();
    }

    private void populateWorkRequestTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblLabTestWorkRequest.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : labOrganization.getWorkQueue().getWorkRequestList()) {

            if (wr instanceof LabTestWorkRequest) {
                LabTestWorkRequest ltwr = (LabTestWorkRequest) wr;

                Object[] row = new Object[6];
                row[0] = ltwr;
                row[1] = ltwr.getRequestDate();
                row[2] = ltwr.getSender().getFirstName() + " " + ltwr.getSender().getLastName();
                if (ltwr.getReceiver() != null) {
                    row[3] = ltwr.getReceiver().getFirstName() + " " + ltwr.getReceiver().getLastName();
                }
                row[4] = ltwr.getStatus();
                row[5] = ltwr.getLabTestResult();

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

        lblManageLabTestWorkRequest = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLabTestWorkRequest = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        btnProcessRequest = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnUpdateResult = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblManageLabTestWorkRequest.setText("Manage Lab Test Work Request");

        tblLabTestWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Date", "Sender Doctor", "Receiver ", "Status", "Result"
            }
        ));
        jScrollPane1.setViewportView(tblLabTestWorkRequest);

        btnAssignToMe.setText("Assign to Me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblResult.setText("Result");

        btnUpdateResult.setText("Update Result");
        btnUpdateResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateResultActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(btnRefresh)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(lblManageLabTestWorkRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(btnAssignToMe)
                        .addGap(112, 112, 112)
                        .addComponent(btnProcessRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblResult)
                        .addGap(47, 47, 47)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnUpdateResult))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblManageLabTestWorkRequest)
                .addGap(45, 45, 45)
                .addComponent(btnRefresh)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignToMe)
                    .addComponent(btnProcessRequest))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResult)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateResult))
                .addGap(67, 67, 67)
                .addComponent(btnBack)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateWorkRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblLabTestWorkRequest.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request first.");
            return;
        }
        WorkRequest wr = (WorkRequest) tblLabTestWorkRequest.getValueAt(selectedRow, 0);

        if (wr.getReceiver() != null) {
            JOptionPane.showMessageDialog(null, "This request has already been assigned.");
            return;
        }
        wr.setReceiver(labAssistant);
        wr.setStatus("Received and processing");
        populateWorkRequestTable();

    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblLabTestWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a work request first.");
            return;
        }
        request = (WorkRequest) tblLabTestWorkRequest.getValueAt(selectedRow, 0);
        
        if(request.getReceiver()==null){
            JOptionPane.showMessageDialog(null, "Assign this work request to yourself first.");
            return;
        }
        if(request.getReceiver()!=labAssistant){
            JOptionPane.showMessageDialog(null, "This request is not assigned to you.");
            return;
        }
        lblResult.setVisible(true);
        txtResult.setVisible(true);
        btnUpdateResult.setVisible(true);
        

    }//GEN-LAST:event_btnProcessRequestActionPerformed

    private void btnUpdateResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateResultActionPerformed
        // TODO add your handling code here:
        String result = txtResult.getText();
        if(result.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter the result  of the requested test.");
            return;
        }
        LabTestWorkRequest ltwr = (LabTestWorkRequest)request;
        if("Processed and result updated".equals(ltwr.getStatus())){
            JOptionPane.showMessageDialog(null, "This requesy has already been processed.");
            return;
        }
        ltwr.setLabTestResult(result);
        ltwr.setStatus("Processed and result updated");
        populateWorkRequestTable();
        lblResult.setVisible(false);
        txtResult.setVisible(false);
        btnUpdateResult.setVisible(false);
    }//GEN-LAST:event_btnUpdateResultActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdateResult;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageLabTestWorkRequest;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTable tblLabTestWorkRequest;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
