/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MainAuthorityAdminRole;

import Business.EcoSystem;
import Business.Enterprise.MainAuthorityEnterprise;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ManageDoctorsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctorsJPanel
     */
    private JPanel userProcessContainer;
//    private EcoSystem system;
    private MainAuthorityEnterprise mainAuthorityEnterprise;
    private Organization o;

    public ManageDoctorsJPanel(JPanel userProcessContainer, Organization o) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.o = o ;
        
//        this.system = system;
//        mainAuthorityEnterprise = (MainAuthorityEnterprise) system.getMainAuthorityEnterprise();
        populateDoctorTable();
    }

    private void populateDoctorTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDoctor.getModel();
        dtm.setRowCount(0);

        for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {

            if (ua.getPerson() instanceof Doctor) {
                Object[] row = new Object[4];

                row[0] = ua.getPerson().getFirstName() + " " + ua.getPerson().getLastName();
                Doctor d = (Doctor) ua.getPerson();
                row[1] = d.getLisenceNumber();
                row[2] = ua;
                row[3] = ua.getPassword();
                
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
        tblDoctor = new javax.swing.JTable();
        bntAddDoctor = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        jLabel1.setText("Manage Doctors");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Lisence Number", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            tblDoctor.getColumnModel().getColumn(3).setResizable(false);
        }

        bntAddDoctor.setText("Add Doctor");
        bntAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddDoctorActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bntAddDoctor)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefresh))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(btnRefresh)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(bntAddDoctor)
                .addGap(133, 133, 133)
                .addComponent(btnBack)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void bntAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddDoctorActionPerformed
        // TODO add your handling code here:
        CreateDoctorJPanel adjp = new CreateDoctorJPanel(userProcessContainer, o);
        userProcessContainer.add("Add Doctor", adjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_bntAddDoctorActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateDoctorTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAddDoctor;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDoctor;
    // End of variables declaration//GEN-END:variables
}
