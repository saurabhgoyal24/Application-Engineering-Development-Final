/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole;

import UserInterface.AdminRole.Pharmacy.ManageDrugsJPanel;
import UserInterface.AdminRole.Pharmacy.ManagePharmacyStoreJPanel;
import UserInterface.AdminRole.PharmaceuticalCompany.ManagePharmaciesJPanel;
import Business.EcoSystem;
import Business.Encounter.Encounter;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmaceuticalCompanyEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.PharmacyStoreOrganization;
import Business.Organization.ResearchOrganization;
import Business.Person.PersonDirectory;
import Business.WorkQueue.EmergencyEnquiryWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.AdminRole.PharmaceuticalCompany.DrugCallBackJPanel;
import UserInterface.AdminRole.PharmaceuticalCompany.IssueNetworkNotificationJPanel;
import UserInterface.AdminRole.PharmaceuticalCompany.ManageFeedbackRequestJPanel;
import UserInterface.AdminRole.PharmaceuticalCompany.ManageResearchWorkRequest;
import UserInterface.AdminRole.Pharmacy.ManageDrugRequestsJPanel;
import UserInterface.AdminRole.Pharmacy.ViewCallBackRequestJPanel;
import UserInterface.ViewBroadCastMessageJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private PersonDirectory mainDoctorPersonDirectory;
    private Enterprise mainAuthorityEnterprise;
    private Organization doctorOrganization;
    private EcoSystem system;

    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        this.mainAuthorityEnterprise = system.getMainAuthorityEnterprise();

        if (checkMainAuthorityEnterprise()) {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.enterprise = enterprise;
            this.system = system;

            if (mainAuthorityEnterprise != null) {
                for (Organization o : mainAuthorityEnterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof DoctorOrganization) {
                        this.mainDoctorPersonDirectory = o.getPersonDirectory();
                    }
                }

            }
            lblEnterpriseName.setText(enterprise.getOrgName());
            hideControls();
        }
    }

    private boolean checkMainAuthorityEnterprise() {

        if ((mainAuthorityEnterprise == null)) {
            JOptionPane.showMessageDialog(null, "Main Authority enterprise not created properly.");
            return false;
        }
        if (mainAuthorityEnterprise.getOrganizationDirectory().getOrganizationList().size() != 4) {
            JOptionPane.showMessageDialog(null, "Main Authority enterprise not created properly.");
            return false;

        }
        return true;
    }

    private void hideControls() {

        if (enterprise instanceof HospitalEnterprise || enterprise instanceof ClinicEnterprise) {
            btnManagePharmacyStore.setVisible(false);
            btnManageDrugItem.setVisible(false);
            btnManagePharmacies.setVisible(false);
            btnManageDrugRequests.setVisible(false);
            btnIssueNetworkNotification.setVisible(false);
            btnViewNetworkNotification.setVisible(false);
            btnDrugCallBack.setVisible(false);
            btnViewCallBackRequest.setVisible(false);
            btnManageFeedbackRequest.setVisible(false);
            btnManageResearchWorkRequest.setVisible(false);
            if (enterprise instanceof ClinicEnterprise) {
                btnCreateEmergencyRequest.setVisible(false);
            }
            populateEmergencyEnquiryTable();
        } else {
            if (enterprise instanceof PharmacyEnterprise) {
                btnManageEmployee.setVisible(false);
                btnManagePatient.setVisible(false);
                btnManagePharmacies.setVisible(false);
                btnCreateEmergencyRequest.setVisible(false);
                jScrollPane1.setVisible(false);
                lblEmergencyEnquiries.setVisible(false);
                btnIssueNetworkNotification.setVisible(false);
                btnDrugCallBack.setVisible(false);
                btnUpdate.setVisible(false);
                btnManageFeedbackRequest.setVisible(false);
                btnManageResearchWorkRequest.setVisible(false);

            } else {
                if (enterprise instanceof PharmaceuticalCompanyEnterprise) {
                    btnManagePatient.setVisible(false);
                    btnManagePharmacyStore.setVisible(false);
                    btnManageDrugItem.setVisible(false);
                    btnManageDrugRequests.setVisible(false);
                    btnCreateEmergencyRequest.setVisible(false);
                    jScrollPane1.setVisible(false);
                    lblEmergencyEnquiries.setVisible(false);
                    btnViewNetworkNotification.setVisible(false);
                    btnUpdate.setVisible(false);
                    btnViewCallBackRequest.setVisible(false);
                }
            }
        }
    }

    private void populateEmergencyEnquiryTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblEmergency.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof EmergencyEnquiryWorkRequest) {
                EmergencyEnquiryWorkRequest eewr = (EmergencyEnquiryWorkRequest) wr;

                Object[] row = new Object[4];

                row[0] = eewr;
                row[1] = eewr.getMedicalRecordNumber();
                row[2] = eewr.getDoctor().getFirstName() + " " + eewr.getDoctor().getLastName();
                row[3] = eewr.getEnterprise();

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
        btnManageOrganization = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        lblEnterpriseName = new javax.swing.JLabel();
        btnManagePatient = new javax.swing.JButton();
        btnManagePharmacyStore = new javax.swing.JButton();
        btnManageDrugItem = new javax.swing.JButton();
        btnManagePharmacies = new javax.swing.JButton();
        btnManageDrugRequests = new javax.swing.JButton();
        btnCreateEmergencyRequest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmergency = new javax.swing.JTable();
        lblEmergencyEnquiries = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnIssueNetworkNotification = new javax.swing.JButton();
        btnViewNetworkNotification = new javax.swing.JButton();
        btnDrugCallBack = new javax.swing.JButton();
        btnViewCallBackRequest = new javax.swing.JButton();
        btnManageFeedbackRequest = new javax.swing.JButton();
        btnManageResearchWorkRequest = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Admin Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 98, -1, -1));

        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.setPreferredSize(new java.awt.Dimension(195, 23));
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });
        add(btnManageOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 150, 190, 34));

        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.setPreferredSize(new java.awt.Dimension(195, 23));
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        add(btnManageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 190, 32));

        lblEnterpriseName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEnterpriseName.setText("jLabel2");
        add(lblEnterpriseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 59, -1, -1));

        btnManagePatient.setText("Manage Patients");
        btnManagePatient.setPreferredSize(new java.awt.Dimension(195, 23));
        btnManagePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientActionPerformed(evt);
            }
        });
        add(btnManagePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 190, 33));

        btnManagePharmacyStore.setText("Manage Pharmacy Store");
        btnManagePharmacyStore.setPreferredSize(new java.awt.Dimension(195, 23));
        btnManagePharmacyStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmacyStoreActionPerformed(evt);
            }
        });
        add(btnManagePharmacyStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 195, 34));

        btnManageDrugItem.setText("Manage Drug Item");
        btnManageDrugItem.setPreferredSize(new java.awt.Dimension(195, 23));
        btnManageDrugItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDrugItemActionPerformed(evt);
            }
        });
        add(btnManageDrugItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 195, 32));

        btnManagePharmacies.setText("Manage Pharmacies");
        btnManagePharmacies.setPreferredSize(new java.awt.Dimension(195, 23));
        btnManagePharmacies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmaciesActionPerformed(evt);
            }
        });
        add(btnManagePharmacies, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 311, 200, 40));

        btnManageDrugRequests.setText("Manage Drug Requests");
        btnManageDrugRequests.setPreferredSize(new java.awt.Dimension(195, 23));
        btnManageDrugRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDrugRequestsActionPerformed(evt);
            }
        });
        add(btnManageDrugRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 195, 33));

        btnCreateEmergencyRequest.setText("Create Emergency Request");
        btnCreateEmergencyRequest.setPreferredSize(new java.awt.Dimension(195, 23));
        btnCreateEmergencyRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmergencyRequestActionPerformed(evt);
            }
        });
        add(btnCreateEmergencyRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 190, 40));

        tblEmergency.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Patient MRN", "Doctor Name", "Enterprise"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmergency);
        if (tblEmergency.getColumnModel().getColumnCount() > 0) {
            tblEmergency.getColumnModel().getColumn(0).setResizable(false);
            tblEmergency.getColumnModel().getColumn(1).setResizable(false);
            tblEmergency.getColumnModel().getColumn(2).setResizable(false);
            tblEmergency.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 516, 143));

        lblEmergencyEnquiries.setText("Emergency Enquiries");
        add(lblEmergencyEnquiries, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 87, -1));

        btnIssueNetworkNotification.setText("Issue Network Notification");
        btnIssueNetworkNotification.setPreferredSize(new java.awt.Dimension(195, 23));
        btnIssueNetworkNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueNetworkNotificationActionPerformed(evt);
            }
        });
        add(btnIssueNetworkNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 195, 34));

        btnViewNetworkNotification.setText("View Network Notification");
        btnViewNetworkNotification.setPreferredSize(new java.awt.Dimension(195, 23));
        btnViewNetworkNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewNetworkNotificationActionPerformed(evt);
            }
        });
        add(btnViewNetworkNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 195, 33));

        btnDrugCallBack.setText("Drug Call Back");
        btnDrugCallBack.setPreferredSize(new java.awt.Dimension(195, 23));
        btnDrugCallBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrugCallBackActionPerformed(evt);
            }
        });
        add(btnDrugCallBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 200, 33));

        btnViewCallBackRequest.setText("View Call Back Request");
        btnViewCallBackRequest.setPreferredSize(new java.awt.Dimension(195, 23));
        btnViewCallBackRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCallBackRequestActionPerformed(evt);
            }
        });
        add(btnViewCallBackRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 195, 33));

        btnManageFeedbackRequest.setText("Manage Feedback Request");
        btnManageFeedbackRequest.setPreferredSize(new java.awt.Dimension(195, 23));
        btnManageFeedbackRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFeedbackRequestActionPerformed(evt);
            }
        });
        add(btnManageFeedbackRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, 34));

        btnManageResearchWorkRequest.setText("Manage Research Work Requests");
        btnManageResearchWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageResearchWorkRequestActionPerformed(evt);
            }
        });
        add(btnManageResearchWorkRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 34));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:
        ManageOrganizationJPanel mojp = new ManageOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("Manage Organizaation", mojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        // TODO add your handling code here:
        ManageEmployeeJPanel mejp = new ManageEmployeeJPanel(userProcessContainer, enterprise, mainDoctorPersonDirectory);
        userProcessContainer.add("Manage Employee", mejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManagePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientActionPerformed
        // TODO add your handling code here:

        boolean flag = false;
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof DoctorOrganization) {
                doctorOrganization = o;
            }
        }

        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (o instanceof PatientOrganization) {
                ManagePatientJPanel mpjp = new ManagePatientJPanel(userProcessContainer, mainAuthorityEnterprise, doctorOrganization, o, enterprise);
                userProcessContainer.add("Manage Patient", mpjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                flag = true;
//                break;
            }
        }
        if (flag == false) {

            JOptionPane.showMessageDialog(null, "Create Patient Organization first.");

        }

    }//GEN-LAST:event_btnManagePatientActionPerformed

    private void btnManagePharmacyStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmacyStoreActionPerformed
        // TODO add your handling code here:
        boolean flag = false;

        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof PharmacyStoreOrganization) {

                PharmacyStoreOrganization pso = (PharmacyStoreOrganization) o;

                ManagePharmacyStoreJPanel mpsjp = new ManagePharmacyStoreJPanel(userProcessContainer, pso);
                userProcessContainer.add("Manage Pharmacy Store", mpsjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                flag = true;
            }
        }
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Create Pharmacy Store Organization first.");
        }

    }//GEN-LAST:event_btnManagePharmacyStoreActionPerformed

    private void btnManageDrugItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDrugItemActionPerformed
        // TODO add your handling code here:

        ManageDrugsJPanel mdjp = new ManageDrugsJPanel(userProcessContainer, system, enterprise);
        userProcessContainer.add("Manage Drugs", mdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageDrugItemActionPerformed

    private void btnManagePharmaciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmaciesActionPerformed
        // TODO add your handling code here:

        ManagePharmaciesJPanel mpjp = new ManagePharmaciesJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("Manage Pharmacies", mpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePharmaciesActionPerformed

    private void btnManageDrugRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDrugRequestsActionPerformed
        // TODO add your handling code here:
        ManageDrugRequestsJPanel mdrjp = new ManageDrugRequestsJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("Manage Drug Requests", mdrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageDrugRequestsActionPerformed

    private void btnCreateEmergencyRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmergencyRequestActionPerformed
        // TODO add your handling code here:
        CreateEmergencyRequestJPanel cerjp = new CreateEmergencyRequestJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("Create Emergency Request", cerjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateEmergencyRequestActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmergency.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request to process.");
            return;
        }

        WorkRequest wr = (WorkRequest) tblEmergency.getValueAt(selectedRow, 0);
        EmergencyEnquiryWorkRequest eewr = (EmergencyEnquiryWorkRequest) wr;

        if (enterprise instanceof HospitalEnterprise) {
            HospitalEnterprise he = (HospitalEnterprise) enterprise;
            for (Encounter encounter : he.getEncounterList()) {
                if (encounter.getPatient().getMedicalRecordNumber() == eewr.getMedicalRecordNumber()) {
                    eewr.getEncounterHistory().add(encounter);
                }
            }
        }
        if (enterprise instanceof ClinicEnterprise) {
            ClinicEnterprise ce = (ClinicEnterprise) enterprise;
            for (Encounter encounter : ce.getEncounterList()) {
                if (encounter.getPatient().getMedicalRecordNumber() == eewr.getMedicalRecordNumber()) {
                    eewr.getEncounterHistory().add(encounter);
                }
            }
        }
        enterprise.getWorkQueue().getWorkRequestList().remove(wr);
        populateEmergencyEnquiryTable();
        JOptionPane.showMessageDialog(null, "Updated");

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnIssueNetworkNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueNetworkNotificationActionPerformed
        // TODO add your handling code here:

        IssueNetworkNotificationJPanel innjp = new IssueNetworkNotificationJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("Issue Network Notification", innjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnIssueNetworkNotificationActionPerformed

    private void btnViewNetworkNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewNetworkNotificationActionPerformed
        // TODO add your handling code here:
        ViewBroadCastMessageJPanel vbcmjp = new ViewBroadCastMessageJPanel(userProcessContainer, enterprise.getWorkQueue());
        userProcessContainer.add("View Broadcast Message2", vbcmjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewNetworkNotificationActionPerformed

    private void btnDrugCallBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrugCallBackActionPerformed
        // TODO add your handling code here:
        DrugCallBackJPanel dcbjp = new DrugCallBackJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("Drug Call Back", dcbjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDrugCallBackActionPerformed

    private void btnViewCallBackRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCallBackRequestActionPerformed
        // TODO add your handling code here:

        ViewCallBackRequestJPanel vcbrjp = new ViewCallBackRequestJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("View Call Back Request", vcbrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewCallBackRequestActionPerformed

    private void btnManageFeedbackRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFeedbackRequestActionPerformed
        // TODO add your handling code here:
        ManageFeedbackRequestJPanel mfrjp = new ManageFeedbackRequestJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("Manage feedback Request", mfrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageFeedbackRequestActionPerformed

    private void btnManageResearchWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageResearchWorkRequestActionPerformed
        // TODO add your handling code here:
        boolean flag = false;

        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof ResearchOrganization) {
                ManageResearchWorkRequest mrwr = new ManageResearchWorkRequest(userProcessContainer, enterprise);
                userProcessContainer.add("Manage research Work Request", mrwr);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                flag = true;
                layout.next(userProcessContainer);
                break;

            }
        }
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Create research Organization first.");
        }

    }//GEN-LAST:event_btnManageResearchWorkRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEmergencyRequest;
    private javax.swing.JButton btnDrugCallBack;
    private javax.swing.JButton btnIssueNetworkNotification;
    private javax.swing.JButton btnManageDrugItem;
    private javax.swing.JButton btnManageDrugRequests;
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageFeedbackRequest;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManagePatient;
    private javax.swing.JButton btnManagePharmacies;
    private javax.swing.JButton btnManagePharmacyStore;
    private javax.swing.JButton btnManageResearchWorkRequest;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewCallBackRequest;
    private javax.swing.JButton btnViewNetworkNotification;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmergencyEnquiries;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JTable tblEmergency;
    // End of variables declaration//GEN-END:variables
}
