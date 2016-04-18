/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.Person.Patient;
import Business.SocialForum.Topic;
import Business.WorkQueue.ForumWorkRequest;
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
public class ViewDiscussionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDiscussionJPanel
     */
    private JPanel userProcessContainer;
    private Patient patient;
    private Topic topic;

    public ViewDiscussionJPanel(JPanel userProcessContainer,Topic topic ,Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        this.topic = topic;
        jplMessagePatient.setVisible(false);
        jplPostOnForum.setVisible(false);
        lblT.setText(topic.getTopicName());
        populateDiscussionTable();
    }
    
    private void populateDiscussionTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblDiscussion.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest wr : topic.getWorkQueue().getWorkRequestList()){
            if(wr instanceof ForumWorkRequest){
                Object[] row = new Object[3];
                
                row[0] = wr;
                row[1] = wr.getSender().getFirstName() + " " + wr.getSender().getLastName();
                row[2] = wr.getRequestDate();
                
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
        tblDiscussion = new javax.swing.JTable();
        btnPostOnForum = new javax.swing.JCheckBox();
        jplPostOnForum = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnPost = new javax.swing.JButton();
        btnMessagePatient = new javax.swing.JCheckBox();
        jplMessagePatient = new javax.swing.JPanel();
        lblMessage1 = new javax.swing.JLabel();
        txtMessageP = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        lblTopic = new javax.swing.JLabel();
        lblT = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtViewMessage = new javax.swing.JTextArea();

        jLabel1.setText("View Discussions");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblDiscussion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDiscussion);
        if (tblDiscussion.getColumnModel().getColumnCount() > 0) {
            tblDiscussion.getColumnModel().getColumn(0).setResizable(false);
            tblDiscussion.getColumnModel().getColumn(1).setResizable(false);
            tblDiscussion.getColumnModel().getColumn(2).setResizable(false);
        }

        btnPostOnForum.setText("Post On Forum");
        btnPostOnForum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostOnForumActionPerformed(evt);
            }
        });

        lblMessage.setText("Message");

        btnPost.setText("Post");
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplPostOnForumLayout = new javax.swing.GroupLayout(jplPostOnForum);
        jplPostOnForum.setLayout(jplPostOnForumLayout);
        jplPostOnForumLayout.setHorizontalGroup(
            jplPostOnForumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPostOnForumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMessage)
                .addGap(35, 35, 35)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnPost)
                .addGap(28, 28, 28))
        );
        jplPostOnForumLayout.setVerticalGroup(
            jplPostOnForumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPostOnForumLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jplPostOnForumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPost))
                .addGap(25, 25, 25))
        );

        btnMessagePatient.setText("Message patient");
        btnMessagePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMessagePatientActionPerformed(evt);
            }
        });

        lblMessage1.setText("Message");

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplMessagePatientLayout = new javax.swing.GroupLayout(jplMessagePatient);
        jplMessagePatient.setLayout(jplMessagePatientLayout);
        jplMessagePatientLayout.setHorizontalGroup(
            jplMessagePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplMessagePatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMessage1)
                .addGap(34, 34, 34)
                .addComponent(txtMessageP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSend)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jplMessagePatientLayout.setVerticalGroup(
            jplMessagePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplMessagePatientLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jplMessagePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage1)
                    .addComponent(txtMessageP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblTopic.setText("Topic");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        txtViewMessage.setColumns(20);
        txtViewMessage.setRows(5);
        txtViewMessage.setEnabled(false);
        jScrollPane2.setViewportView(txtViewMessage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPostOnForum)
                                        .addGap(8, 8, 8))
                                    .addComponent(btnMessagePatient))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jplMessagePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jplPostOnForum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblTopic)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblT)
                                .addGap(381, 381, 381)
                                .addComponent(btnRefresh))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTopic)
                            .addComponent(lblT))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnView)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jplPostOnForum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnPostOnForum)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jplMessagePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnMessagePatient)))
                .addGap(26, 26, 26)
                .addComponent(btnBack)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPostOnForumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostOnForumActionPerformed
        // TODO add your handling code here:
        if (btnPostOnForum.isSelected()) {
            jplPostOnForum.setVisible(true);
        }
        if (!btnPostOnForum.isSelected()) {
            jplPostOnForum.setVisible(false);
        }
    }//GEN-LAST:event_btnPostOnForumActionPerformed

    private void btnMessagePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMessagePatientActionPerformed
        // TODO add your handling code here:
        if (btnMessagePatient.isSelected()) {
            jplMessagePatient.setVisible(true);
        }
        if (!btnMessagePatient.isSelected()) {
            jplMessagePatient.setVisible(false);
        }
    }//GEN-LAST:event_btnMessagePatientActionPerformed

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        // TODO add your handling code here:
        String message = txtMessage.getText();
        if (message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the message.");
            return;
        }

        ForumWorkRequest fwr = new ForumWorkRequest();
        fwr.setMessage(message);
        fwr.setSender(patient);
        topic.getWorkQueue().getWorkRequestList().add(fwr);
        populateDiscussionTable();

    }//GEN-LAST:event_btnPostActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateDiscussionTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDiscussion.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a roow first.");
            return;
        }
        String message = txtMessageP.getText();
        if (message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the message.");
            return;
        }
        
        ForumWorkRequest fwr = (ForumWorkRequest)tblDiscussion.getValueAt(selectedRow,0);
        
        Patient p = (Patient)fwr.getSender();
        if(p==patient){
            JOptionPane.showMessageDialog(null,"You cannot message yourself.");
            return;
        }
        
        PatientCommunicationWorkRequest pcwr = new PatientCommunicationWorkRequest();
        pcwr.setMessage(message);
        pcwr.setReceiver(p);
        pcwr.setSender(patient);
        
        patient.getWorkQueue().getWorkRequestList().add(pcwr);
        p.getWorkQueue().getWorkRequestList().add(pcwr);
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDiscussion.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a discussion first.");
            return;
        }
        
        WorkRequest wr = (WorkRequest)tblDiscussion.getValueAt(selectedRow,0);
        
        txtViewMessage.setText(wr.getMessage());
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JCheckBox btnMessagePatient;
    private javax.swing.JButton btnPost;
    private javax.swing.JCheckBox btnPostOnForum;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jplMessagePatient;
    private javax.swing.JPanel jplPostOnForum;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lblT;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JTable tblDiscussion;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtMessageP;
    private javax.swing.JTextArea txtViewMessage;
    // End of variables declaration//GEN-END:variables
}