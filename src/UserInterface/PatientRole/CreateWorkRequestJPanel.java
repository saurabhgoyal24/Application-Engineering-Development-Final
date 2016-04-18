/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.CityNetwork;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;
import Business.WorkQueue.HospitalEnterpriseAdminWorkRequest;
import Business.WorkQueue.PatientWorkRequest;
import Business.WorkQueue.WorkRequest;
import static com.db4o.foundation.Iterators.map;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class CreateWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise e;
    private Patient patient;
    private HashMap<Doctor, Enterprise> hashMap;

    public CreateWorkRequestJPanel(JPanel userProcessContainer, Patient patient, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.patient = patient;

//        populateCountryComboBox();
//        getValuesFromWorkRequest();
        populateDoctorTable();
    }

//    private void populateCountryComboBox() {
//        cmbCountry.removeAllItems();
//
//        for (CountryNetwork cn : system.getCountryNetworkList()) {
//            cmbCountry.addItem(cn);
//        }
//    }
//
//    private void populateStateComboBox(CountryNetwork cn) {
//        cmbState.removeAllItems();
//
//        for (StateNetwork sn : cn.getStateNetwork()) {
//            cmbState.addItem(sn);
//        }
//    }
//    private void populateCityComboBox(StateNetwork sn) {
//        cmbCity.removeAllItems();
//
//        for (CityNetwork cin : sn.getCityNetwork()) {
//            cmbCity.addItem(cin);
//        }
//    }
//
//    private void populateEnterpriseComboBox(CityNetwork cin) {
//
//        cmbEnterprise.removeAllItems();
//
//        for (Enterprise e : cin.getEnterpriseDirectory().getEnterpriseList()) {
//
//            if ((e instanceof HospitalEnterprise) || (e instanceof ClinicEnterprise)) {
//                cmbEnterprise.addItem(e);
//            }
//        }
//    }
//    private void populateDoctorTable(Enterprise e) {
//        DefaultTableModel dtm = (DefaultTableModel) tblDoctor.getModel();
//        dtm.setRowCount(0);
//        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
//
//            if (o instanceof DoctorOrganization) {
//
//                for (Person p : o.getPersonDirectory().getPerosonList()) {
//
//                    Doctor d = (Doctor) p;
//
//                    Object[] row = new Object[3];
//                    row[0] = d.getFirstName() + " " + d.getLastName();
//                    row[1] = d;
//                    row[2] = d.getSpecialization();
//
//                    dtm.addRow(row);
//                }
//            }
//        }
//    }
//
//    public void getValuesFromWorkRequest() {
//
//        for (WorkRequest wr : patient.getWorkQueue().getWorkRequestList()) {
//            if (wr instanceof HospitalEnterpriseAdminWorkRequest) {
//                HospitalEnterpriseAdminWorkRequest heawr = (HospitalEnterpriseAdminWorkRequest) wr;
//                hashMap.put((Doctor) heawr.getDoctor(), heawr.getSenderEnterprise());
//            }
//            if (wr instanceof PatientWorkRequest) {
//                PatientWorkRequest pwr = (PatientWorkRequest) wr;
//                hashMap.put((Doctor) pwr.getReceiver(), pwr.getSenderEnterprise());
//            }
//        }
//    }
    public void populateDoctorTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDoctor.getModel();
        dtm.setRowCount(0);

        if (patient.getPreferredDoctorEnterprise() != null) {
            Object[] row = new Object[3];
            row[0] = patient.getPreferredDoctor().getFirstName() + " " + patient.getPreferredDoctor().getLastName();
            row[1] = patient.getPreferredDoctor();
            row[2] = patient.getPreferredDoctorEnterprise();
            dtm.addRow(row);
        }
        if (patient.getTemproryDoctor() != null) {
            Object[] row1 = new Object[3];
            row1[0] = patient.getTemproryDoctor().getFirstName() + " " + patient.getTemproryDoctor().getLastName();
            row1[1] = patient.getTemproryDoctor();
            row1[2] = patient.getTemproryDoctorEnterprise();
            dtm.addRow(row1);
        }

//        Iterator<Doctor> keySetIterator = hashMap.keySet().iterator();
//
//        while(keySetIterator.hasNext()) {
//            Doctor key = keySetIterator.next();
//
//            Object[] row = new Object[3];
//            row[0] = key;
//            row[1] = key.getFirstName();
//            row[2] = hashMap.get(key);
//            dtm.addRow(row);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateWorkRequest = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        btnCreateRequest = new javax.swing.JButton();
        txtMessage = new javax.swing.JTextField();

        lblCreateWorkRequest.setText("Create Work Request");

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor Name", "Doctor SSN", "Enterprise"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctor);
        if (tblDoctor.getColumnModel().getColumnCount() > 0) {
            tblDoctor.getColumnModel().getColumn(0).setResizable(false);
            tblDoctor.getColumnModel().getColumn(1).setResizable(false);
            tblDoctor.getColumnModel().getColumn(2).setResizable(false);
        }

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblMessage.setText("Message");

        btnCreateRequest.setText("Create Request");
        btnCreateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(lblCreateWorkRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(515, 515, 515)
                        .addComponent(lblID))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblMessage)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnCreateRequest))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblCreateWorkRequest)
                .addGap(157, 157, 157)
                .addComponent(lblID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnCreateRequest)
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addGap(148, 148, 148))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRequestActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblDoctor.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a doctor first.");
            return;
        }

        Doctor d = (Doctor) tblDoctor.getValueAt(selectedRow, 1);

        Enterprise e = (Enterprise) tblDoctor.getValueAt(selectedRow, 2);
        String message = txtMessage.getText();

        if (message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please write a message first.");
            return;
        }

        PatientWorkRequest pwr = new PatientWorkRequest();

        pwr.setMessage(message);
        pwr.setReceiverEnterprise(e);
        pwr.setPatient(patient);
        pwr.setStatus("Not Processed");
        pwr.setReceiver(d);

        d.getWorkQueue().getWorkRequestList().add(pwr);

        patient.getWorkQueue().getWorkRequestList().add(pwr);
        txtMessage.setText(null);

    }//GEN-LAST:event_btnCreateRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateRequest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateWorkRequest;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
