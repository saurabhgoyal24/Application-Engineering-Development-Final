/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DrugManagementEmployeeRole;

import Business.Enterprise.Enterprise;
import Business.WorkQueue.DrugManagementEmployeeWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.DrugRegulatoryEmployeeRole.ViewDrugDetailJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ManageWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    public ManageWorkRequestJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateWorkRequestTable();
    }
    
    private void populateWorkRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblWorkRequest.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){
            if(wr instanceof DrugManagementEmployeeWorkRequest){
                DrugManagementEmployeeWorkRequest dmewr = (DrugManagementEmployeeWorkRequest)wr;
                
                Object[] row = new Object[6];
                
                row[0] = dmewr;
                row[1] = dmewr.getDrug().getDrugName();
                row[2] = dmewr.getDrug().getDrugId();
                row[3] = dmewr.getStatus();
                row[4] = dmewr.getResolveDate();
                row[5] = dmewr.getRequestDate();
                
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
        lblManageWorkRequest = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnViewDrug = new javax.swing.JButton();

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Drug Name", "Drug ID", "Status", "Resolve Date", "Request Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        }

        lblManageWorkRequest.setText("Manage Work Requests");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
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
                        .addGap(264, 264, 264)
                        .addComponent(lblManageWorkRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewDrug)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblManageWorkRequest)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnViewDrug)
                .addGap(33, 33, 33)
                .addComponent(btnBack)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDrugActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkRequest.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a work request first.");
            return;
        }
        DrugManagementEmployeeWorkRequest dmewr = (DrugManagementEmployeeWorkRequest)tblWorkRequest.getValueAt(selectedRow, 0);
        
        ViewDrugDetailJPanel vddjp = new ViewDrugDetailJPanel(userProcessContainer, dmewr.getDrug());
        userProcessContainer.add("View Drug",vddjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDrugActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewDrug;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageWorkRequest;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}