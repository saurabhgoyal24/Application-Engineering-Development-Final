/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole;

import Business.Person.Address;
import Business.Person.Patient;
import Business.Person.Person;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh Goyal
 */
public class ViewPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatientJPanel
     */
    private JPanel userProcessContainer;
    private Person p;
    private Patient pa;

    public ViewPatientJPanel(JPanel userProcessContainer, Person p) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.p = p;
        pa = (Patient) p;
        btnUpdate.setVisible(false);
        setAllFields();
    }

    private void setAllFields() {
        txtAllergies.setText(pa.getAllergies());
        txtAptNo.setText(pa.getAddress().getAptNumber());
        txtCity.setText(pa.getAddress().getCity());
        txtCountry.setText(pa.getAddress().getCountry());
        txtDateOfBirth.setText(pa.getDateOfBirth());
        txtEmailId.setText(pa.getEmailId());
        txtEnrollmentDate.setText(pa.getDateOfEnrollment());
        txtFirstName.setText(pa.getFirstName());
        txtGender.setText(pa.getGender());
        txtInsuranceCompany.setText(pa.getInsuranceCompany());
        txtInsuraneID.setText(pa.getInsuranceID());
        txtLastName.setText(pa.getLastName());
        txtMaritalStatus.setText(pa.getMaritalStatus());
        txtPhoneNumber.setText(String.valueOf(pa.getPhoneNumber()));
//        txtPreferredDoctor.setText(pa.getPreferredDoctor().getFirstName()+ " " + pa.getPreferredDoctor().getLastName());
        txtPreferredDoctor.setText(String.valueOf(pa.getPreferredDoctor()));
        txtSsn.setText(String.valueOf(pa.getSsn()));
        txtState.setText(pa.getAddress().getState());
        txtStreetName.setText(pa.getAddress().getStreetName());
        txtZipCode.setText(String.valueOf(pa.getAddress().getZipCode()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCountry = new javax.swing.JTextField();
        lblEnrollPatient = new javax.swing.JLabel();
        txtAptNo = new javax.swing.JTextField();
        lblStreetName = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        txtStreetName = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        lblPreferredDoctor = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblEnrollmentDate = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        txtPreferredDoctor = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblApt = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblInsuranceCompany = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblInsuranceId = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtInsuranceCompany = new javax.swing.JTextField();
        lblEmailId = new javax.swing.JLabel();
        txtInsuraneID = new javax.swing.JTextField();
        lblCountry = new javax.swing.JLabel();
        lblAllergies = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        txtAllergies = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lblMaritalStatus = new javax.swing.JLabel();
        txtSsn = new javax.swing.JTextField();
        txtEnrollmentDate = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtMaritalStatus = new javax.swing.JTextField();
        btnUpdateDetails = new javax.swing.JCheckBox();
        btnUpdate = new javax.swing.JButton();

        txtCountry.setEditable(false);

        lblEnrollPatient.setText("Patient Details");

        txtAptNo.setEditable(false);

        lblStreetName.setText("Street Name");

        lblSsn.setText("SSN");

        txtStreetName.setEditable(false);

        lblState.setText("State");

        lblPreferredDoctor.setText("Preferred Doctor");

        lblCity.setText("City");

        txtPhoneNumber.setEditable(false);

        lblGender.setText("Gender");

        lblEnrollmentDate.setText("Enrollment Date");

        lblZipCode.setText("Zip Code");

        txtZipCode.setEditable(false);

        txtPreferredDoctor.setEditable(false);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblAddress.setText("Address");

        lblFirstName.setText("First Name");

        lblApt.setText("Apt No.");

        lblLastName.setText("Last Name");

        txtFirstName.setEditable(false);

        lblAge.setText("Date Of Birth");

        txtState.setEditable(false);

        lblInsuranceCompany.setText("Insurance Company");

        txtCity.setEditable(false);

        lblInsuranceId.setText("Insurance ID");

        txtLastName.setEditable(false);

        txtInsuranceCompany.setEditable(false);

        lblEmailId.setText("Email ID");

        txtInsuraneID.setEditable(false);

        lblCountry.setText("Country");

        lblAllergies.setText("Allergies");

        txtEmailId.setEditable(false);

        txtAllergies.setEditable(false);

        lblPhoneNumber.setText("Phone Number");

        lblMaritalStatus.setText("Marital Status");

        txtSsn.setEditable(false);

        txtEnrollmentDate.setEditable(false);

        txtDateOfBirth.setEditable(false);

        txtGender.setEditable(false);

        txtMaritalStatus.setEditable(false);

        btnUpdateDetails.setText("Update Details");
        btnUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInsuranceCompany)
                            .addComponent(lblAllergies))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInsuranceCompany)
                            .addComponent(txtAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(455, 455, 455))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName)
                            .addComponent(lblAge)
                            .addComponent(lblEmailId)
                            .addComponent(lblPhoneNumber))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txtDateOfBirth))
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLastName)
                                    .addComponent(lblSsn)
                                    .addComponent(lblGender))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(txtGender)
                                    .addComponent(txtSsn, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaritalStatus)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(125, 125, 125))))
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(lblEnrollPatient)
                .addGap(90, 90, 90)
                .addComponent(lblEnrollmentDate)
                .addGap(28, 28, 28)
                .addComponent(txtEnrollmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAddress)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblApt)
                                .addComponent(lblState))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAptNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblStreetName)
                                .addComponent(lblCountry))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(84, 84, 84)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblZipCode)
                                .addComponent(lblCity))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtZipCode)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPreferredDoctor)
                            .addComponent(lblInsuranceId))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtInsuraneID, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(txtPreferredDoctor))
                        .addGap(6, 6, 6))))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(btnUpdateDetails))
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnrollPatient)
                    .addComponent(lblEnrollmentDate)
                    .addComponent(txtEnrollmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSsn)
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailId)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaritalStatus)
                    .addComponent(txtMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApt)
                            .addComponent(txtAptNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStreetName)
                            .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblState)
                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCountry)
                                .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblZipCode)
                            .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInsuranceCompany)
                            .addComponent(txtInsuranceCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInsuraneID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAllergies)
                            .addComponent(txtAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPreferredDoctor)
                            .addComponent(txtPreferredDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblInsuranceId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnUpdateDetails)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(1, 1, 1)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsActionPerformed
        // TODO add your handling code here:
        if (btnUpdateDetails.isSelected()) {
            txtAllergies.setEditable(true);
            txtAptNo.setEditable(true);
            txtCity.setEditable(true);
            txtCountry.setEditable(true);
//        txtDateOfBirth.setEditable(true);
            txtEmailId.setEditable(true);
//        txtEnrollmentDate.setEditable(true);
            txtFirstName.setEditable(true);
//        txtGender.setEditable(true);
            txtInsuranceCompany.setEditable(true);
            txtInsuraneID.setEditable(true);
            txtLastName.setEditable(true);
//        txtMaritalStatus.setEditable(true);
            txtPhoneNumber.setEditable(true);
//        txtPreferredDoctor.setText(pa.getPreferredDoctor().getFirstName()+ " " + pa.getPreferredDoctor().getLastName());
//        txtPreferredDoctor.setEditable(true);
            txtSsn.setEditable(true);
            txtState.setEditable(true);
            txtStreetName.setEditable(true);
            txtZipCode.setEditable(true);

            btnUpdate.setVisible(true);
        } else {
            txtAllergies.setEditable(false);
            txtAptNo.setEditable(false);
            txtCity.setEditable(false);
            txtCountry.setEditable(false);
//        txtDateOfBirth.setEditable(true);
            txtEmailId.setEditable(false);
//        txtEnrollmentDate.setEditable(true);
            txtFirstName.setEditable(false);
//        txtGender.setEditable(true);
            txtInsuranceCompany.setEditable(false);
            txtInsuraneID.setEditable(false);
            txtLastName.setEditable(false);
//        txtMaritalStatus.setEditable(true);
            txtPhoneNumber.setEditable(false);
//        txtPreferredDoctor.setText(pa.getPreferredDoctor().getFirstName()+ " " + pa.getPreferredDoctor().getLastName());
//        txtPreferredDoctor.setEditable(true);
            txtSsn.setEditable(false);
            txtState.setEditable(false);
            txtStreetName.setEditable(false);
            txtZipCode.setEditable(false);

            btnUpdate.setVisible(false);
        }
    }//GEN-LAST:event_btnUpdateDetailsActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        int ssn = Integer.parseInt(txtSsn.getText());
        String emailId = txtEmailId.getText();
        long phoneNumber = Long.parseLong(txtPhoneNumber.getText());

        String aptNo = txtAptNo.getText();
        String streetName = txtStreetName.getText();
        String city = txtCity.getText();
        String state = txtState.getText();
        String country = txtCountry.getText();
        int zipCode = Integer.parseInt(txtZipCode.getText());

        String insuranceCompany = txtInsuranceCompany.getText();
        String insuranceId = txtInsuraneID.getText();
        String allergies = txtAllergies.getText();

        pa.setFirstName(firstName);
        pa.setLastName(lastName);
        pa.setSsn(ssn);
        pa.setEmailId(emailId);
        pa.setPhoneNumber(phoneNumber);

        Address address = new Address();
        address.setAptNumber(aptNo);
        address.setCity(city);
        address.setCountry(country);
        address.setState(state);
        address.setStreetName(streetName);
        address.setZipCode(zipCode);

        pa.setAddress(address);

        pa.setInsuranceCompany(insuranceCompany);
        pa.setInsuranceID(insuranceId);
        pa.setAllergies(allergies);
        JOptionPane.showMessageDialog(null, "Details updated.");


    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox btnUpdateDetails;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAllergies;
    private javax.swing.JLabel lblApt;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblEnrollPatient;
    private javax.swing.JLabel lblEnrollmentDate;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblInsuranceCompany;
    private javax.swing.JLabel lblInsuranceId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMaritalStatus;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPreferredDoctor;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreetName;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtAllergies;
    private javax.swing.JTextField txtAptNo;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEnrollmentDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtInsuranceCompany;
    private javax.swing.JTextField txtInsuraneID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMaritalStatus;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPreferredDoctor;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreetName;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
