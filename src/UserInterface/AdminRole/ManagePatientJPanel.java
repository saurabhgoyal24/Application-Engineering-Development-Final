/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;
import Business.WorkQueue.HospitalEnterpriseAdminWorkRequest;
import EDU.purdue.cs.bloat.tree.Assign;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ManagePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise mainAuthorityEnterprise;
    private Organization doctorOrganization;
    private Organization patientOrganization;
    private Enterprise enterprise;

    public ManagePatientJPanel(JPanel userProcessContainer, Enterprise mainAuthorityEnterprise, Organization doctorOrganization, Organization patientOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.mainAuthorityEnterprise = mainAuthorityEnterprise;
        this.doctorOrganization = doctorOrganization;
        this.patientOrganization = patientOrganization;
        this.enterprise = enterprise;
        
        populatePatientTable();
    }

    private void populatePatientTable() {
        //DefaultTableModel dtm = (DefaultTableModel)tblPatients.getModel();
        DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
        dtm.setRowCount(0);

        for (Person p : patientOrganization.getPersonDirectory().getPerosonList()) {

            if (p != null) {
                Patient patient = (Patient) p;

                Object[] row = new Object[5];
                row[0] = patient.getMedicalRecordNumber();
                row[1] = p.getFirstName() +" " + p.getLastName();
                row[2] = patient.getPreferredDoctor();
                row[3] = patient;
                row[4] = patient.getIsAssigned();

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

        lblManagePatient = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnEnrollPatient = new javax.swing.JButton();
        btnRemovePatient = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        btnAssignPreferredDoctor = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblManagePatient.setText("Manage Patient");

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medical Record Number", "Patient Name", "Preferred Doctor", "SSN", "IsAssigned?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatients);
        if (tblPatients.getColumnModel().getColumnCount() > 0) {
            tblPatients.getColumnModel().getColumn(0).setResizable(false);
            tblPatients.getColumnModel().getColumn(1).setResizable(false);
            tblPatients.getColumnModel().getColumn(2).setResizable(false);
            tblPatients.getColumnModel().getColumn(3).setResizable(false);
            tblPatients.getColumnModel().getColumn(4).setResizable(false);
        }

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnEnrollPatient.setText("Enroll Patient");
        btnEnrollPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrollPatientActionPerformed(evt);
            }
        });

        btnRemovePatient.setText("Remove Patient");
        btnRemovePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePatientActionPerformed(evt);
            }
        });

        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        btnAssignPreferredDoctor.setText("Assign Preferred Doctor");
        btnAssignPreferredDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignPreferredDoctorActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(265, 265, 265)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnRefresh)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblManagePatient)
                                    .addGap(278, 278, 278))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(btnBack))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAssignPreferredDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemovePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnrollPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblManagePatient)
                .addGap(20, 20, 20)
                .addComponent(btnRefresh)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnrollPatient)
                    .addComponent(btnRemovePatient)
                    .addComponent(btnViewPatient))
                .addGap(18, 18, 18)
                .addComponent(btnAssignPreferredDoctor)
                .addGap(73, 73, 73)
                .addComponent(btnBack)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnrollPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrollPatientActionPerformed
        // TODO add your handling code here:
        EnrollPatientJPanel epjp = new EnrollPatientJPanel(userProcessContainer, mainAuthorityEnterprise, doctorOrganization, patientOrganization);
        userProcessContainer.add("Enroll Patient", epjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEnrollPatientActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populatePatientTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRemovePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePatientActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatients.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient first.");
            return;
        }

        int c = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this patient from your record.", "Warning", JOptionPane.YES_NO_OPTION);
        if (c == JOptionPane.YES_OPTION) {
            Person p = (Person) tblPatients.getValueAt(selectedRow, 3);
            patientOrganization.getPersonDirectory().getPerosonList().remove(p);
            populatePatientTable();
        }
    }//GEN-LAST:event_btnRemovePatientActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatients.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient first.");
            return;
        }
        
        Person p = (Person) tblPatients.getValueAt(selectedRow, 3);
        ViewPatientJPanel vpjp = new ViewPatientJPanel(userProcessContainer, p);
        userProcessContainer.add("View Patient",vpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnAssignPreferredDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignPreferredDoctorActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblPatients.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a patient first.");
            return;
        }
        
        Patient patient = (Patient)tblPatients.getValueAt(selectedRow, 3);
        
        Doctor doctor = patient.getPreferredDoctor();
        
//        for(Patient p : doctor.getPatientList()){
//            if(p == patient){
//                JOptionPane.showMessageDialog(null, "This doctor already has this patient assigned.");
//                return;
//            }
//        }
        if(patient.getPreferredDoctorEnterprise()!=null){
            JOptionPane.showMessageDialog(null, "This patient has already been assigned doctor.");
            return;
        }
        HospitalEnterpriseAdminWorkRequest heawr = new HospitalEnterpriseAdminWorkRequest();
        heawr.setDoctor(doctor);
        heawr.setPatient(patient);
        heawr.setSenderEnterprise(enterprise);
        heawr.setMessage(doctor.getFirstName() + " " + doctor.getLastName() + " doctor has been assigned to patient " + patient.getFirstName() + " " + patient.getLastName());
        heawr.setStatus("Not Processed.");
        
        doctor.getWorkQueue().getWorkRequestList().add(heawr);
        patient.getWorkQueue().getWorkRequestList().add(heawr);
        
        patient.setPreferredDoctorEnterprise(enterprise);
        patient.setIsAssigned("Yes");
        doctor.getPatientList().add(patient);
        populatePatientTable();
//        int selectedRow = tblPatients.getSelectedRow();
//        if(selectedRow<0){
//            JOptionPane.showMessageDialog(null, "Selece a patient first.");
//            return;
//        }
//        if(doctorOrganization==null){
//            JOptionPane.showMessageDialog(null, "Add a doctor organization first.");
//            return;
//        }
//        Person p = (Person) tblPatients.getValueAt(selectedRow, 3);
//        Patient patient =(Patient)p;
//        
//        AssignDoctorJPanel adjp = new AssignDoctorJPanel(userProcessContainer,doctorOrganization,patient,enterprise);
//        userProcessContainer.add("Assign Doctor", adjp);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAssignPreferredDoctorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignPreferredDoctor;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnrollPatient;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemovePatient;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManagePatient;
    private javax.swing.JTable tblPatients;
    // End of variables declaration//GEN-END:variables
}
