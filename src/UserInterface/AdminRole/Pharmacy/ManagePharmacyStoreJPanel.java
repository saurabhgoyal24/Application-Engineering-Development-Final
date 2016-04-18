/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole.Pharmacy;

import Business.Organization.PharmacyStoreOrganization;
import Business.PharmacyStore.PharmacyStore;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ManagePharmacyStoreJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePharmacyStoreJPanel
     */
    private JPanel userProcessContainer;
    private PharmacyStoreOrganization pharmacyStoreOrganization;

    public ManagePharmacyStoreJPanel(JPanel userProcessContainer, PharmacyStoreOrganization pharmacyStoreOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.pharmacyStoreOrganization = pharmacyStoreOrganization;
        populatePharmacyStoreTable();
    }

    private void populatePharmacyStoreTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblPharmacyStore.getModel();
        dtm.setRowCount(0);

        for (PharmacyStore pharmacyStore : pharmacyStoreOrganization.getPharmacyStoreList()) {

            Object[] row = new Object[5];

            row[0] = pharmacyStore;
            row[1] = pharmacyStore.getName();
            row[2] = pharmacyStore.getAddress().getCountry();
            row[3] = pharmacyStore.getAddress().getState();
            row[4] = pharmacyStore.getAddress().getCity();

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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPharmacyStore = new javax.swing.JTable();
        lblManagePharmacyStore = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnAddStore = new javax.swing.JButton();
        btnRemoveStore = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        tblPharmacyStore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "StoreID", "Name", "Country", "State", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPharmacyStore);
        if (tblPharmacyStore.getColumnModel().getColumnCount() > 0) {
            tblPharmacyStore.getColumnModel().getColumn(0).setResizable(false);
            tblPharmacyStore.getColumnModel().getColumn(1).setResizable(false);
            tblPharmacyStore.getColumnModel().getColumn(2).setResizable(false);
            tblPharmacyStore.getColumnModel().getColumn(3).setResizable(false);
            tblPharmacyStore.getColumnModel().getColumn(4).setResizable(false);
        }

        lblManagePharmacyStore.setText("Manage Pharmacy Store");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAddStore.setText("Add Store");
        btnAddStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStoreActionPerformed(evt);
            }
        });

        btnRemoveStore.setText("Remove Store");
        btnRemoveStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStoreActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemoveStore)
                        .addGap(88, 88, 88)
                        .addComponent(btnAddStore))
                    .addComponent(btnRefresh)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(lblManagePharmacyStore))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblManagePharmacyStore)
                .addGap(38, 38, 38)
                .addComponent(btnRefresh)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddStore)
                    .addComponent(btnRemoveStore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStoreActionPerformed
        // TODO add your handling code here:
        AddStoreJPanel asjp = new AddStoreJPanel(userProcessContainer, pharmacyStoreOrganization);
        userProcessContainer.add("Add Store", asjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddStoreActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populatePharmacyStoreTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRemoveStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStoreActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPharmacyStore.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a pharmacy store first.");
            return;
        }
        int c = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete.", "Warning", JOptionPane.YES_NO_OPTION);
        if (c == JOptionPane.YES_OPTION) {
            PharmacyStore ps = (PharmacyStore) tblPharmacyStore.getValueAt(selectedRow, 0);
            pharmacyStoreOrganization.getPharmacyStoreList().remove(ps);

            populatePharmacyStoreTable();
        }
    }//GEN-LAST:event_btnRemoveStoreActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout =(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStore;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemoveStore;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManagePharmacyStore;
    private javax.swing.JTable tblPharmacyStore;
    // End of variables declaration//GEN-END:variables
}