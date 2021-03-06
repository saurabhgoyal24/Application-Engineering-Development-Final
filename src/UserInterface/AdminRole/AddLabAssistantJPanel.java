/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdminRole;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Person.Address;
import Business.Person.LabAssistant;
import Business.Role.LabAssistantRole;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Saurabh Goyal
 */
public class AddLabAssistantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddLabAssistantJPanel
     */
    private JPanel userProcessContainer;
    private Organization o;
    public AddLabAssistantJPanel(JPanel userProcessContainer, Organization o) {
        initComponents();
        jDateChooser1.getDateEditor().setEnabled(false);
        this.userProcessContainer = userProcessContainer;
        this.o=o;
        populateComboBox();
    }
    private void populateComboBox() {
        cmbGender.removeAllItems();
        cmbGender.addItem("Male");
        cmbGender.addItem("Female");

    }

    private boolean checkForEmptyFields() {
        if (txtAptNo.getText().isEmpty() || txtCity.getText().isEmpty() || txtCountry.getText().isEmpty()
                || txtEmailId.getText().isEmpty() || txtFirstName.getText().isEmpty()
                || txtLastName.getText().isEmpty()||txtLisenceNumber.getText().isEmpty()
                ||txtSpecialization.getText().isEmpty()
                || txtPhoneNumber.getText().isEmpty()
                ||(((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty())
                || txtSsn.getText().isEmpty()
                || txtState.getText().isEmpty() || txtStreetName.getText().isEmpty()
                || txtZipCode.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    
    private void setAllFieldsEmpty(){
        txtAptNo.setText(null);
        txtCity.setText(null);
        txtCountry.setText(null);
        txtEmailId.setText(null);
        txtFirstName.setText(null);
        txtLastName.setText(null);
        txtLisenceNumber.setText(null);
        txtPassword.setText(null);
        txtPhoneNumber.setText(null);
        txtSsn.setText(null);
        txtState.setText(null);
        txtStreetName.setText(null);
        txtSpecialization.setText(null);
        txtUsername.setText(null);
        txtZipCode.setText(null);
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCountry = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cmbGender = new javax.swing.JComboBox();
        lblGender = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        btnAddNurse = new javax.swing.JButton();
        lblPhoneNumber = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtSsn = new javax.swing.JTextField();
        lblEmailId = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblSpecialization = new javax.swing.JLabel();
        txtLisenceNumber = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtStreetName = new javax.swing.JTextField();
        lblSsn = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblStreetName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtAptNo = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtSpecialization = new javax.swing.JTextField();
        lblApt = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblLisenceNumber = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCountry.setText("Country");
        add(lblCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 321, -1, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 484, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 111, 113, -1));

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 111, 134, -1));

        lblGender.setText("Gender");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 114, -1, -1));
        add(txtZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 318, 81, -1));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 209, 110, -1));

        btnAddNurse.setText("Add Lab Assistant");
        btnAddNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNurseActionPerformed(evt);
            }
        });
        add(btnAddNurse, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 445, -1, -1));

        lblPhoneNumber.setText("Phone Number");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 212, -1, -1));

        lblZipCode.setText("Zip Code");
        add(lblZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 321, -1, -1));
        add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 159, 113, -1));
        add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 318, 130, -1));
        add(txtSsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 159, 134, -1));

        lblEmailId.setText("Email ID");
        add(lblEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 162, -1, -1));
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 292, 81, -1));

        lblCity.setText("City");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 295, -1, -1));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 67, 134, -1));

        jLabel1.setText("Add Lab Assistant");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 23, -1, -1));
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 318, 46, -1));

        lblSpecialization.setText("Specialization");
        add(lblSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));
        add(txtLisenceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 91, -1));
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 70, 113, -1));

        lblState.setText("State");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 321, -1, -1));
        add(txtStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 292, 130, -1));

        lblSsn.setText("SSN");
        add(lblSsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 162, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 407, 94, -1));

        lblStreetName.setText("Street Name");
        add(lblStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 295, -1, -1));

        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 410, -1, -1));
        add(txtAptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 292, 46, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 86, -1));

        lblAge.setText("Date Of Birth");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 117, -1, -1));

        lblUsername.setText("Username");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        lblLastName.setText("Last Name");
        add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));
        add(txtSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 134, -1));

        lblApt.setText("Apt No.");
        add(lblApt, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 295, -1, -1));

        lblFirstName.setText("First Name");
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 73, -1, -1));

        lblAddress.setText("Address");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 260, -1, -1));

        lblLisenceNumber.setText("Lisence Number");
        add(lblLisenceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNurseActionPerformed

        if(!checkForEmptyFields()){
            JOptionPane.showMessageDialog(null, "Incomplete details are entered." );
            return;
        }
        try {
            String firstName = txtFirstName.getText();
            String lastName = txtLastName.getText();
            //            Date dateOfBirth1 = jDateChooser1.getDate();
            String gender = (String) cmbGender.getSelectedItem();
            int ssn = Integer.parseInt(txtSsn.getText());
            String emailId = txtEmailId.getText();
            long phoneNumber = Long.parseLong(txtPhoneNumber.getText());

            String DateFormat = "EEE, MMM d, yyyy";
            SimpleDateFormat sdf = new SimpleDateFormat(DateFormat);
            Date d = jDateChooser1.getDate();
            String dateOfBirth = sdf.format(d);

            String aptNo = txtAptNo.getText();
            String streetName = txtStreetName.getText();
            String city = txtCity.getText();
            String state = txtState.getText();
            String country = txtCountry.getText();
            int zipCode = Integer.parseInt(txtZipCode.getText());

            String specialization = (String) txtSpecialization.getText();
            String lisenceNumber = (txtLisenceNumber.getText());

            String userName = txtUsername.getText();
            String password = txtPassword.getText();
            
            Pattern pattern = Pattern.compile("[a-zA-Z ]+");
            Matcher fiName = pattern.matcher(firstName);

            if (!fiName.matches()) {
                JOptionPane.showMessageDialog(null, "Invalid first name.");
                return;
            }

            Matcher laName = pattern.matcher(lastName);

            if (!laName.matches()) {
                JOptionPane.showMessageDialog(null, "Invalid last name.");
                return;
            }
            
            Matcher ciName = pattern.matcher(city);

            if (!ciName.matches()) {
                JOptionPane.showMessageDialog(null, "Invalid city name.");
                return;
            }
            
            Matcher stName = pattern.matcher(state);

            if (!stName.matches()) {
                JOptionPane.showMessageDialog(null, "Invalid state name.");
                return;
            }
            
            Matcher coName = pattern.matcher(country);

            if (!coName.matches()) {
                JOptionPane.showMessageDialog(null, "Invalid country name.");
                return;
            }

            if(!EcoSystem.checkIfSsnIsUnique(ssn,o)){
                return;
            }
            boolean check = EcoSystem.cheackIfUsernameIsUnique(userName);
            if (check == true) {
                LabAssistant labAssistant = new LabAssistant();
                labAssistant.setFirstName(firstName);
                labAssistant.setLastName(lastName);
                labAssistant.setDateOfBirth(dateOfBirth);

                labAssistant.setGender(gender);
                labAssistant.setLisenceNumber(lisenceNumber);
                labAssistant.setSsn(ssn);
                labAssistant.setEmailId(emailId);
                labAssistant.setPhoneNumber(phoneNumber);

                labAssistant.setLisenceNumber(lisenceNumber);
                labAssistant.setSpecialization(specialization);

                Address address = new Address();
                address.setAptNumber(aptNo);
                address.setCity(city);
                address.setCountry(country);
                address.setState(state);
                address.setStreetName(streetName);
                address.setZipCode(zipCode);

                labAssistant.setAddress(address);

                o.getPersonDirectory().createAndAddPerson(labAssistant);
                o.getUserAccountDirectory().createUserAccount(userName, password, labAssistant, new LabAssistantRole());
                setAllFieldsEmpty();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid credentials are entered.");
        }
    }//GEN-LAST:event_btnAddNurseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNurse;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbGender;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblApt;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLisenceNumber;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSpecialization;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreetName;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtAptNo;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLisenceNumber;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreetName;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
