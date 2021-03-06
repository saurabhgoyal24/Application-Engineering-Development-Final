/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface;

import Business.WorkQueue.IssueNetworkNotificationWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.smartcardio.Card;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ViewBroadCastMessageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBroadCastMessageJPanel
     */
    private JPanel userProcessContainer;
    private WorkQueue workQueue;
    public ViewBroadCastMessageJPanel(JPanel userProcessContainer, WorkQueue workQueue) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.workQueue = workQueue;
        populateBroadCastTable();
    }
    
    private void populateBroadCastTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblBroadcastMessage.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest wr : workQueue.getWorkRequestList()){
            if(wr instanceof IssueNetworkNotificationWorkRequest){
                IssueNetworkNotificationWorkRequest innwr = (IssueNetworkNotificationWorkRequest)wr;
                
                Object[] row = new Object[4];
                row[0] = innwr.getRequestDate();
                row[1] = innwr;
                row[2] = innwr.getEnterprise();
                row[3] = innwr.getEnterprise().getOrgId();
                
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

        btnBack = new javax.swing.JButton();
        lblViewBroadcastMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBroadcastMessage = new javax.swing.JTable();

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblViewBroadcastMessage.setText("View Broadcast Message");

        tblBroadcastMessage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Message", "Enterprise", "EnterrpriseID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBroadcastMessage);
        if (tblBroadcastMessage.getColumnModel().getColumnCount() > 0) {
            tblBroadcastMessage.getColumnModel().getColumn(0).setResizable(false);
            tblBroadcastMessage.getColumnModel().getColumn(1).setResizable(false);
            tblBroadcastMessage.getColumnModel().getColumn(2).setResizable(false);
            tblBroadcastMessage.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(lblViewBroadcastMessage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblViewBroadcastMessage)
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewBroadcastMessage;
    private javax.swing.JTable tblBroadcastMessage;
    // End of variables declaration//GEN-END:variables
}
