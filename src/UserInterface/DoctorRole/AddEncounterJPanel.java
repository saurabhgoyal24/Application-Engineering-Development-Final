/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.EcoSystem;
import Business.Encounter.Encounter;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.CityNetwork;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.PharmaceuticalCompany.Drug;
import Business.PharmaceuticalCompany.DrugItem;
import Business.WorkQueue.HospitalEnterpriseAdminWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.PatientWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.ReferDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Goyal
 */
public class AddEncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEncounterJPanel
     */
    private JPanel userProcessContainer;
    private Patient patient;
    private Doctor doctor;
    private Enterprise enterprise;
    private WorkRequest workRequest;
    private EcoSystem system;
    private ArrayList<Drug> drugList;

    public AddEncounterJPanel(JPanel userProcessContainer, EcoSystem system, WorkRequest wr) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        btnCloseTheCase.setVisible(false);
        drugList = new ArrayList<>();

        if (wr instanceof HospitalEnterpriseAdminWorkRequest) {
            HospitalEnterpriseAdminWorkRequest heawr = (HospitalEnterpriseAdminWorkRequest) wr;
            this.patient = (Patient) heawr.getPatient();
            this.doctor = (Doctor) heawr.getDoctor();
            this.enterprise = (Enterprise) heawr.getSenderEnterprise();
        }
        if (wr instanceof PatientWorkRequest) {
            PatientWorkRequest patientWorkRequest = (PatientWorkRequest) wr;
            this.patient = patientWorkRequest.getPatient();
            this.doctor = (Doctor) patientWorkRequest.getReceiver();
            this.enterprise = patientWorkRequest.getReceiverEnterprise();

            if (patient.getTemproryDoctor() == doctor) {
                btnCloseTheCase.setVisible(true);
            }
        }
        if (wr instanceof ReferDoctorWorkRequest) {
            ReferDoctorWorkRequest rdwr = (ReferDoctorWorkRequest) wr;
            this.patient = rdwr.getPatient();
            this.doctor = (Doctor) rdwr.getReceiver();
            this.enterprise = rdwr.getReceiverEnterprise();
            btnCloseTheCase.setVisible(true);
        }
        this.workRequest = wr;
        populateCountryComboBox();
        hideControls();
    }

    private void hideControls() {
        lblMessage.setVisible(false);
        txtMessage.setVisible(false);
        lblCity.setVisible(false);
        lblCountry.setVisible(false);
        lblState.setVisible(false);
        cmbCity.setVisible(false);
        cmbCountry.setVisible(false);
        cmbState.setVisible(false);
        lblMedicine.setVisible(false);
        txtMessagep.setVisible(false);
        lblEnterpriseID.setVisible(false);
        lblId.setVisible(false);
        cmbPharmacies.setVisible(false);
        lblPharmacies.setVisible(false);
        cmbDrugs.setVisible(false);
        lblDrug.setVisible(false);
        lblDName.setVisible(false);
        lblDrugName.setVisible(false);
    }

    private void populateCountryComboBox() {

        cmbCountry.removeAllItems();
        for (CountryNetwork cn : system.getCountryNetworkList()) {
            cmbCountry.addItem(cn);

        }
    }

    private void populateStateComboBox(CountryNetwork cn) {
        cmbState.removeAllItems();
        for (StateNetwork sn : cn.getStateNetwork()) {
            cmbState.addItem(sn);
        }
    }

    private void populateCityComboBox(StateNetwork sn) {
        cmbCity.removeAllItems();
        for (CityNetwork cin : sn.getCityNetwork()) {

            cmbCity.addItem(cin);
        }
    }

    private void populatePharmacyEnterpriseComboBox(CityNetwork cin) {
        cmbPharmacies.removeAllItems();
        for (Enterprise e : cin.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof PharmacyEnterprise) {
                cmbPharmacies.addItem(e);
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

        lblAddEncounter = new javax.swing.JLabel();
        lblVitalSign = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblTemprature = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblRespiratoryRate = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtTemprature = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtRespiratoryRate = new javax.swing.JTextField();
        txtHeartRate = new javax.swing.JTextField();
        btnRequestLabTest = new javax.swing.JCheckBox();
        lblMessage = new javax.swing.JLabel();
        btnAddEncounter = new javax.swing.JButton();
        txtMessage = new javax.swing.JTextField();
        btnAddPrescription = new javax.swing.JCheckBox();
        lblCountry = new javax.swing.JLabel();
        cmbCountry = new javax.swing.JComboBox();
        lblState = new javax.swing.JLabel();
        cmbState = new javax.swing.JComboBox();
        lblCity = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox();
        lblPharmacies = new javax.swing.JLabel();
        cmbPharmacies = new javax.swing.JComboBox();
        lblMedicine = new javax.swing.JLabel();
        txtMessagep = new javax.swing.JTextField();
        lblEnterpriseID = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        btnCloseTheCase = new javax.swing.JCheckBox();
        lblDrug = new javax.swing.JLabel();
        cmbDrugs = new javax.swing.JComboBox();
        lblDrugName = new javax.swing.JLabel();
        lblDName = new javax.swing.JLabel();

        lblAddEncounter.setText("Add Encounter");

        lblVitalSign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVitalSign.setText("Vital Sign");

        lblHeight.setText("Height (cms)");

        lblWeight.setText("Weight (pounds)");

        lblTemprature.setText("Temprature (`C)");

        lblBloodPressure.setText("Blood Pressure");

        lblRespiratoryRate.setText("Respiratory Rate");

        lblHeartRate.setText("Heart Rate");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRequestLabTest.setText("Request lab test");
        btnRequestLabTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestLabTestActionPerformed(evt);
            }
        });

        lblMessage.setText("Message");

        btnAddEncounter.setText("Add Encounter");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });

        btnAddPrescription.setText("Add Prescription");
        btnAddPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPrescriptionActionPerformed(evt);
            }
        });

        lblCountry.setText("Country");

        cmbCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryActionPerformed(evt);
            }
        });

        lblState.setText("State");

        cmbState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStateActionPerformed(evt);
            }
        });

        lblCity.setText("City");

        cmbCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityActionPerformed(evt);
            }
        });

        lblPharmacies.setText("Pharmacies");

        cmbPharmacies.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPharmacies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPharmaciesActionPerformed(evt);
            }
        });

        lblMedicine.setText("Message");

        lblEnterpriseID.setText("ID");

        btnCloseTheCase.setText("Close the Case");

        lblDrug.setText("Drug");

        cmbDrugs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDrugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDrugsActionPerformed(evt);
            }
        });

        lblDrugName.setText("Drug Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(lblAddEncounter))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVitalSign)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHeight)
                                    .addComponent(lblWeight)
                                    .addComponent(lblTemprature)
                                    .addComponent(lblBloodPressure)
                                    .addComponent(lblRespiratoryRate)
                                    .addComponent(lblHeartRate))
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHeight)
                                    .addComponent(txtWeight)
                                    .addComponent(txtTemprature)
                                    .addComponent(txtBloodPressure)
                                    .addComponent(txtRespiratoryRate)
                                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnRequestLabTest)
                            .addComponent(btnAddPrescription)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAddEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(231, 231, 231)
                                            .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(57, 57, 57)
                                                    .addComponent(lblMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(36, 36, 36)
                                                    .addComponent(txtMessagep, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(btnCloseTheCase))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblCountry)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(cmbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(46, 46, 46)
                                                        .addComponent(lblState))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblPharmacies)
                                                            .addComponent(lblDrug))
                                                        .addGap(49, 49, 49)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(cmbPharmacies, 0, 94, Short.MAX_VALUE)
                                                            .addComponent(cmbDrugs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEnterpriseID)
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblCity)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblId)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDrugName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDName))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblMessage)
                                .addGap(100, 100, 100)
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAddEncounter)
                .addGap(18, 18, 18)
                .addComponent(lblVitalSign)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemprature)
                    .addComponent(txtTemprature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespiratoryRate)
                    .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeartRate)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRequestLabTest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddPrescription)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry)
                    .addComponent(cmbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblState)
                    .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity)
                    .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPharmacies)
                    .addComponent(cmbPharmacies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnterpriseID)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrug)
                    .addComponent(cmbDrugs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDrugName)
                    .addComponent(lblDName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicine)
                    .addComponent(txtMessagep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCloseTheCase)
                .addGap(18, 18, 18)
                .addComponent(btnAddEncounter)
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRequestLabTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestLabTestActionPerformed
        // TODO add your handling code here:
        if (btnRequestLabTest.isSelected()) {
            lblMessage.setVisible(true);
            txtMessage.setVisible(true);
        }
        if (!btnRequestLabTest.isSelected()) {
            lblMessage.setVisible(false);
            txtMessage.setVisible(false);
        }
    }//GEN-LAST:event_btnRequestLabTestActionPerformed

    private void btnAddEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEncounterActionPerformed
        // TODO add your handling code here:

        if (txtBloodPressure.getText().isEmpty() || txtHeartRate.getText().isEmpty() || txtHeight.getText().isEmpty()
                || txtRespiratoryRate.getText().isEmpty() || txtTemprature.getText().isEmpty() || txtWeight.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Details entered are incomplete.");
            return;
        }
        try {
            float height = Float.parseFloat(txtHeight.getText());
            float weight = Float.parseFloat(txtWeight.getText());
            float temprature = Float.parseFloat(txtTemprature.getText());
            float bloodPressure = Float.parseFloat(txtBloodPressure.getText());
            int respiratoryRate = Integer.parseInt(txtRespiratoryRate.getText());
            int heartRate = Integer.parseInt(txtHeartRate.getText());

            if(btnCloseTheCase.isSelected()&&btnRequestLabTest.isSelected()){
                JOptionPane.showMessageDialog(null, "You cannot request lab test if you want to close the case");
                return;
            }
            Encounter encounter = new Encounter();

            encounter.setDateOfEncounter(new Date());
            encounter.setDoctor(doctor);
            encounter.setPatient(patient);
            encounter.getVitalSign().setBloodPrssure(bloodPressure);
            encounter.getVitalSign().setHeartRate(heartRate);
            encounter.getVitalSign().setHeight(height);
            encounter.getVitalSign().setRespiratoryRate(respiratoryRate);
            encounter.getVitalSign().setWeight(weight);
            encounter.getVitalSign().setTemprature(temprature);

            if (btnCloseTheCase.isSelected()) {
                int c = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the case.", "Warning", JOptionPane.YES_NO_OPTION);
                if (c == JOptionPane.YES_OPTION) {
                    if (workRequest instanceof ReferDoctorWorkRequest) {
                        patient.setTemproryDoctor(null);
                        patient.setTemproryDoctorEnterprise(null);
                    }
                    if ((workRequest instanceof PatientWorkRequest) && (patient.getTemproryDoctor() == doctor)) {
                        patient.setTemproryDoctor(null);
                        patient.setTemproryDoctorEnterprise(null);
                    }
                }
            }
            if (btnRequestLabTest.isSelected()) {
                String message = txtMessage.getText();

                if (message.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a message first.");
                    return;
                }
                LabTestWorkRequest ltwr = new LabTestWorkRequest();
                ltwr.setMessage(message);
                ltwr.setSender(doctor);
                ltwr.setPatient(patient);
                ltwr.setStatus("Sent to Lab Organization.");
                ltwr.setEnterprise(enterprise);

                encounter.setLabTestWorkRequest(ltwr);

                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof LabOrganization) {
                        o.getWorkQueue().getWorkRequestList().add(ltwr);

                    }
                }

                patient.getWorkQueue().getWorkRequestList().add(ltwr);
                doctor.getWorkQueue().getWorkRequestList().add(ltwr);
            }

            if (btnAddPrescription.isSelected()) {

                Enterprise e = (Enterprise) cmbPharmacies.getSelectedItem();

                if (e == null) {
                    JOptionPane.showMessageDialog(null, "There is no pharmacy enterprise selected.");
                    return;
                }

                String message = txtMessagep.getText();

                Drug drug = (Drug) cmbDrugs.getSelectedItem();

                if (message.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the message first.");
                    return;
                }

                PharmacyWorkRequest pwr = new PharmacyWorkRequest();
                pwr.setSender(doctor);
                pwr.setPatient(patient);
                pwr.setEnterprise(enterprise);
                pwr.setMessage(message);
                pwr.setStatus("Sent to pharmacy");
                pwr.setPharmacyName(e.getOrgName());
                pwr.setDrug(drug);
                encounter.getDrugList().add(drug);
                btnAddEncounter.setEnabled(false);

                doctor.getWorkQueue().getWorkRequestList().add(pwr);
                patient.getWorkQueue().getWorkRequestList().add(pwr);
                e.getWorkQueue().getWorkRequestList().add(pwr);
            }

            if (enterprise instanceof HospitalEnterprise) {
                HospitalEnterprise he = (HospitalEnterprise) enterprise;
                he.getEncounterList().add(encounter);
            }
            if (enterprise instanceof ClinicEnterprise) {
                ClinicEnterprise ce = (ClinicEnterprise) enterprise;
                ce.getEncounterList().add(encounter);
            }

            if (workRequest instanceof HospitalEnterpriseAdminWorkRequest) {
                workRequest.setStatus("Processed");
            }
            JOptionPane.showMessageDialog(null,"Encounter updated");
            btnAddEncounter.setEnabled(false);
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid data is entered.");
            return;
        }


    }//GEN-LAST:event_btnAddEncounterActionPerformed

    private void btnAddPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPrescriptionActionPerformed
        // TODO add your handling code here:
        if (btnAddPrescription.isSelected()) {

            lblCity.setVisible(true);
            lblCountry.setVisible(true);
            lblState.setVisible(true);
            cmbCity.setVisible(true);
            cmbState.setVisible(true);
            cmbCountry.setVisible(true);
            lblMedicine.setVisible(true);
            txtMessagep.setVisible(true);
            lblEnterpriseID.setVisible(true);
            lblId.setVisible(true);
            lblPharmacies.setVisible(true);
            cmbPharmacies.setVisible(true);
            lblDrug.setVisible(true);
            lblDName.setVisible(true);
            lblDrugName.setVisible(true);
            cmbDrugs.setVisible(true);
        }

        if (!btnAddPrescription.isSelected()) {

            lblCity.setVisible(false);
            lblCountry.setVisible(false);
            lblState.setVisible(false);
            cmbCity.setVisible(false);
            cmbState.setVisible(false);
            cmbCountry.setVisible(false);
            lblMedicine.setVisible(false);
            txtMessagep.setVisible(false);
            lblEnterpriseID.setVisible(false);
            lblId.setVisible(false);
            lblPharmacies.setVisible(false);
            cmbPharmacies.setVisible(false);
            lblDrug.setVisible(false);
            lblDName.setVisible(false);
            lblDrugName.setVisible(false);
            cmbDrugs.setVisible(false);

        }
    }//GEN-LAST:event_btnAddPrescriptionActionPerformed

    private void cmbCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryActionPerformed
        // TODO add your handling code here:
        CountryNetwork cn = (CountryNetwork) cmbCountry.getSelectedItem();
        if (cn != null) {
            populateStateComboBox(cn);
        }
    }//GEN-LAST:event_cmbCountryActionPerformed

    private void cmbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateActionPerformed
        // TODO add your handling code here:
        StateNetwork sn = (StateNetwork) cmbState.getSelectedItem();
        if (sn != null) {
            populateCityComboBox(sn);
        }
    }//GEN-LAST:event_cmbStateActionPerformed

    private void cmbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityActionPerformed
        // TODO add your handling code here:
        CityNetwork cin = (CityNetwork) cmbCity.getSelectedItem();
        if (cin != null) {
            populatePharmacyEnterpriseComboBox(cin);
        }
    }//GEN-LAST:event_cmbCityActionPerformed

    private void cmbPharmaciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPharmaciesActionPerformed
        // TODO add your handling code here:
        Enterprise e = (Enterprise) cmbPharmacies.getSelectedItem();
        if (e != null) {
            lblId.setText(String.valueOf(e.getOrgId()));

            PharmacyEnterprise pe = (PharmacyEnterprise) e;

            ArrayList<Drug> drugList = new ArrayList<Drug>();

            for (DrugItem di : pe.getDrugItemList()) {
                boolean flag = false;
                if (di.getDrug() != null) {
                    Drug d = di.getDrug();

                    for (Drug dr : drugList) {
                        if (d == dr) {
                            flag = true;
                        }

                    }
                    if (flag == false) {
                        drugList.add(d);
                    }
                }
            }
            cmbDrugs.removeAllItems();

            for (Drug d : drugList) {
                cmbDrugs.addItem(d);
            }
        }

    }//GEN-LAST:event_cmbPharmaciesActionPerformed

    private void cmbDrugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDrugsActionPerformed
        // TODO add your handling code here:
        Drug drug = (Drug) cmbDrugs.getSelectedItem();
        if (drug != null) {
            lblDName.setText(drug.getDrugName());
        }
    }//GEN-LAST:event_cmbDrugsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JCheckBox btnAddPrescription;
    private javax.swing.JButton btnBack;
    private javax.swing.JCheckBox btnCloseTheCase;
    private javax.swing.JCheckBox btnRequestLabTest;
    private javax.swing.JComboBox cmbCity;
    private javax.swing.JComboBox cmbCountry;
    private javax.swing.JComboBox cmbDrugs;
    private javax.swing.JComboBox cmbPharmacies;
    private javax.swing.JComboBox cmbState;
    private javax.swing.JLabel lblAddEncounter;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDName;
    private javax.swing.JLabel lblDrug;
    private javax.swing.JLabel lblDrugName;
    private javax.swing.JLabel lblEnterpriseID;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPharmacies;
    private javax.swing.JLabel lblRespiratoryRate;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTemprature;
    private javax.swing.JLabel lblVitalSign;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtMessagep;
    private javax.swing.JTextField txtRespiratoryRate;
    private javax.swing.JTextField txtTemprature;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
