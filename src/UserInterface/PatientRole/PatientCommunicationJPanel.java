/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.Person.Patient;
import Business.Person.Person;
import Business.WorkQueue.PatientCommunicationWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class PatientCommunicationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientCommunicationJPanel
     */
    private JPanel userprocessContainer;
    private Patient patient;

    public PatientCommunicationJPanel(JPanel userProcessContainer, Person person) {
        initComponents();
        this.userprocessContainer = userProcessContainer;
        this.patient = (Patient) person;
        populateReceivedMessageTable();
        populateSentMessageTable();
        jplReplyMessage.setVisible(false);
        jplSendAnotherMessage.setVisible(false);
    }

    private void populateReceivedMessageTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblMessageReceived.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : patient.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof PatientCommunicationWorkRequest) {
                if (wr.getReceiver() == patient) {
                    Object[] row = new Object[3];
                    row[0] = wr;
                    row[1] = wr.getSender().getFirstName() + " " + wr.getSender().getLastName();
                    row[2] = wr.getRequestDate();
                    
                    dtm.addRow(row);
                }
            }
        }
    }
    
    private void populateSentMessageTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblMessageSent.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : patient.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof PatientCommunicationWorkRequest) {
                if (wr.getSender()== patient) {
                    Object[] row = new Object[3];
                    row[0] = wr;
                    row[1] = wr.getReceiver().getFirstName() + " " + wr.getReceiver().getLastName();
                    row[2] = wr.getRequestDate();
                    
                    dtm.addRow(row);
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

        lblPatientCommunication = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMessageReceived = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblMessageReceived = new javax.swing.JLabel();
        lblMessageSent = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMessageSent = new javax.swing.JTable();
        btnReplyToMessage = new javax.swing.JCheckBox();
        btnSendAnotherMessage = new javax.swing.JCheckBox();
        jplReplyMessage = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        txtMessageR = new javax.swing.JTextField();
        btnReply = new javax.swing.JButton();
        jplSendAnotherMessage = new javax.swing.JPanel();
        lblMessageS = new javax.swing.JLabel();
        txtMessageS = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        lblPatientCommunication.setText("Patient Communication");

        tblMessageReceived.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Message", "Sender", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMessageReceived);
        if (tblMessageReceived.getColumnModel().getColumnCount() > 0) {
            tblMessageReceived.getColumnModel().getColumn(0).setResizable(false);
            tblMessageReceived.getColumnModel().getColumn(1).setResizable(false);
            tblMessageReceived.getColumnModel().getColumn(2).setResizable(false);
        }

        lblMessageReceived.setText("Message Received");

        lblMessageSent.setText("Message Sent");

        tblMessageSent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMessageSent);
        if (tblMessageSent.getColumnModel().getColumnCount() > 0) {
            tblMessageSent.getColumnModel().getColumn(0).setResizable(false);
            tblMessageSent.getColumnModel().getColumn(1).setResizable(false);
            tblMessageSent.getColumnModel().getColumn(2).setResizable(false);
        }

        btnReplyToMessage.setText("Reply To Message");
        btnReplyToMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplyToMessageActionPerformed(evt);
            }
        });

        btnSendAnotherMessage.setText("Send Another Message");
        btnSendAnotherMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendAnotherMessageActionPerformed(evt);
            }
        });

        lblMessage.setText("Message");

        btnReply.setText("Reply");
        btnReply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplReplyMessageLayout = new javax.swing.GroupLayout(jplReplyMessage);
        jplReplyMessage.setLayout(jplReplyMessageLayout);
        jplReplyMessageLayout.setHorizontalGroup(
            jplReplyMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplReplyMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMessage)
                .addGap(30, 30, 30)
                .addComponent(txtMessageR, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnReply)
                .addGap(22, 22, 22))
        );
        jplReplyMessageLayout.setVerticalGroup(
            jplReplyMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplReplyMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplReplyMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage)
                    .addComponent(txtMessageR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReply))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblMessageS.setText("Message");

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplSendAnotherMessageLayout = new javax.swing.GroupLayout(jplSendAnotherMessage);
        jplSendAnotherMessage.setLayout(jplSendAnotherMessageLayout);
        jplSendAnotherMessageLayout.setHorizontalGroup(
            jplSendAnotherMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplSendAnotherMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMessageS)
                .addGap(18, 18, 18)
                .addComponent(txtMessageS, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSend)
                .addGap(18, 18, 18))
        );
        jplSendAnotherMessageLayout.setVerticalGroup(
            jplSendAnotherMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplSendAnotherMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplSendAnotherMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessageS)
                    .addComponent(txtMessageS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
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
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblMessageReceived))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblMessageSent))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnReplyToMessage)
                        .addGap(28, 28, 28)
                        .addComponent(jplReplyMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSendAnotherMessage)
                                .addGap(18, 18, 18)
                                .addComponent(jplSendAnotherMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 84, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(lblPatientCommunication)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPatientCommunication))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnRefresh)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMessageReceived)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnReplyToMessage)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMessageSent)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jplReplyMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jplSendAnotherMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSendAnotherMessage)
                                .addGap(14, 14, 14)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userprocessContainer.remove(this);
        CardLayout layout = (CardLayout) userprocessContainer.getLayout();
        layout.previous(userprocessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReplyToMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplyToMessageActionPerformed
        // TODO add your handling code here:
        if(btnReplyToMessage.isSelected()){
            jplReplyMessage.setVisible(true);
        }else{
            jplReplyMessage.setVisible(false);
        }
    }//GEN-LAST:event_btnReplyToMessageActionPerformed

    private void btnSendAnotherMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendAnotherMessageActionPerformed
        // TODO add your handling code here:
        if(btnSendAnotherMessage.isSelected()){
            jplSendAnotherMessage.setVisible(true);
        }else{
            jplSendAnotherMessage.setVisible(false);
        }
    }//GEN-LAST:event_btnSendAnotherMessageActionPerformed

    private void btnReplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplyActionPerformed
        // TODO add your handling code here:
        String message = txtMessageR.getText();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter a message first.");
            return;
        }
        int selectedRow = tblMessageReceived.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row first.");
            return;
        }
        PatientCommunicationWorkRequest pcwr = (PatientCommunicationWorkRequest)tblMessageReceived.getValueAt(selectedRow,0);
        Person p = pcwr.getSender();
        
        PatientCommunicationWorkRequest request = new PatientCommunicationWorkRequest();
        request.setMessage(message);
        request.setReceiver(p);
        request.setSender(patient);
        patient.getWorkQueue().getWorkRequestList().add(request);
        p.getWorkQueue().getWorkRequestList().add(request);
        
    }//GEN-LAST:event_btnReplyActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        String message = txtMessageS.getText();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter a message first.");
            return;
        }
        int selectedRow = tblMessageReceived.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row first.");
            return;
        }
        PatientCommunicationWorkRequest pcwr = (PatientCommunicationWorkRequest)tblMessageReceived.getValueAt(selectedRow,0);
        Person p = pcwr.getReceiver();
        
        PatientCommunicationWorkRequest request = new PatientCommunicationWorkRequest();
        request.setMessage(message);
        request.setReceiver(p);
        request.setSender(patient);
        patient.getWorkQueue().getWorkRequestList().add(request);
        p.getWorkQueue().getWorkRequestList().add(request);
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateReceivedMessageTable();
        populateSentMessageTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReply;
    private javax.swing.JCheckBox btnReplyToMessage;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox btnSendAnotherMessage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jplReplyMessage;
    private javax.swing.JPanel jplSendAnotherMessage;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessageReceived;
    private javax.swing.JLabel lblMessageS;
    private javax.swing.JLabel lblMessageSent;
    private javax.swing.JLabel lblPatientCommunication;
    private javax.swing.JTable tblMessageReceived;
    private javax.swing.JTable tblMessageSent;
    private javax.swing.JTextField txtMessageR;
    private javax.swing.JTextField txtMessageS;
    // End of variables declaration//GEN-END:variables
}
