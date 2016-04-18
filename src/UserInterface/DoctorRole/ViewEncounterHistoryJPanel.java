/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DoctorRole;

import Business.Encounter.Encounter;
import Business.Person.Patient;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ViewEncounterHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewEncounterHistoryJPanel
     */
    private JPanel userProcessContainer;
    private ArrayList<Encounter> encounterList;
    private Patient patient;
    public ViewEncounterHistoryJPanel(JPanel userProcessContainer, ArrayList<Encounter> encounterList, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.encounterList = encounterList;
        this.patient = patient;
        
        lblPName.setText(patient.getFirstName() + " " + patient.getLastName());
        populateEncounterTable();
    }
    
    private void populateEncounterTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblEncounterList.getModel();
        dtm.setRowCount(0);
        
        for(Encounter e : encounterList){
            
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

        lblEncounterHistory = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounterList = new javax.swing.JTable();
        lblListOgEncounters = new javax.swing.JLabel();
        btnViewEncounterDetails = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        lblPName = new javax.swing.JLabel();

        lblEncounterHistory.setText("Encounter History");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblEncounterList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Encounter ID", "Date Of Encounter"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncounterList);
        if (tblEncounterList.getColumnModel().getColumnCount() > 0) {
            tblEncounterList.getColumnModel().getColumn(0).setResizable(false);
            tblEncounterList.getColumnModel().getColumn(1).setResizable(false);
        }

        lblListOgEncounters.setText("List of Encounters");

        btnViewEncounterDetails.setText("View Encounter Details>>");
        btnViewEncounterDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterDetailsActionPerformed(evt);
            }
        });

        lblPatientName.setText("Patient Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(lblEncounterHistory))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViewEncounterDetails)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblListOgEncounters)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPatientName)
                                    .addGap(47, 47, 47)
                                    .addComponent(lblPName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblEncounterHistory)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientName)
                    .addComponent(lblPName))
                .addGap(36, 36, 36)
                .addComponent(lblListOgEncounters)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnViewEncounterDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
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

    private void btnViewEncounterDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEncounterList.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select an encounter first.");
            return;
        }
        Encounter encounter = (Encounter)tblEncounterList.getValueAt(selectedRow,0);
        ViewEncounterDetailsJpanel vedj = new ViewEncounterDetailsJpanel(userProcessContainer, encounter);
        userProcessContainer.add("View Encounter Details",vedj);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewEncounterDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewEncounterDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEncounterHistory;
    private javax.swing.JLabel lblListOgEncounters;
    private javax.swing.JLabel lblPName;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JTable tblEncounterList;
    // End of variables declaration//GEN-END:variables
}