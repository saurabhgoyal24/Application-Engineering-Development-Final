/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminRole.ManageEnterprise;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MainAuthorityEnterprise;
import Business.Network.CityNetwork;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saurabh Goyal
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterprise
     */
    private JPanel userProcessContainer;
    private EcoSystem system;

    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateEnterpriseTable();

    }

    private void populateEnterpriseTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblEnterprise.getModel();
        dtm.setRowCount(0);

        if (system.getMainAuthorityEnterprise() != null) {
            Object[] row = new Object[5];

            row[3] = system.getMainAuthorityEnterprise();
            row[4] = system.getMainAuthorityEnterprise().getEnterpriseType();

            dtm.addRow(row);
        }

        for (CountryNetwork cn : system.getCountryNetworkList()) {
            for (StateNetwork sn : cn.getStateNetwork()) {
                for (CityNetwork cin : sn.getCityNetwork()) {
                    for (Enterprise e : cin.getEnterpriseDirectory().getEnterpriseList()) {
                        Object[] row = new Object[5];

                        row[0] = cn;
                        row[1] = sn;
                        row[2] = cin;
                        row[3] = e;
                        row[4] = e.getEnterpriseType();

                        dtm.addRow(row);

                    }
                }
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

        lblManageEnterprise = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        btnAddEnterprise = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDeleteEnterprise = new javax.swing.JButton();

        lblManageEnterprise.setText("Manage Enterprise");

        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Country", "State", "City", "Enterprise Name", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnterprise);
        if (tblEnterprise.getColumnModel().getColumnCount() > 0) {
            tblEnterprise.getColumnModel().getColumn(0).setResizable(false);
            tblEnterprise.getColumnModel().getColumn(1).setResizable(false);
            tblEnterprise.getColumnModel().getColumn(2).setResizable(false);
            tblEnterprise.getColumnModel().getColumn(3).setResizable(false);
            tblEnterprise.getColumnModel().getColumn(4).setResizable(false);
        }

        btnAddEnterprise.setText("Add Enterprise");
        btnAddEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnterpriseActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDeleteEnterprise.setText("Delete Enterprise");
        btnDeleteEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEnterpriseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(lblManageEnterprise))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnRefresh)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnDeleteEnterprise)
                                    .addGap(91, 91, 91)
                                    .addComponent(btnAddEnterprise)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblManageEnterprise)
                .addGap(31, 31, 31)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEnterprise)
                    .addComponent(btnDeleteEnterprise))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnterpriseActionPerformed
        // TODO add your handling code here:

        AddEnterpriseJPanel aejp = new AddEnterpriseJPanel(userProcessContainer, system);
        userProcessContainer.add("Add Enterprise", aejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddEnterpriseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateEnterpriseTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEnterpriseActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEnterprise.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select an enterprise first");
            return;
        }
        int d = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete.", "Warning", JOptionPane.YES_NO_OPTION);

        if (d == JOptionPane.YES_OPTION) {
            
            Enterprise enterprise = (Enterprise) tblEnterprise.getValueAt(selectedRow, 3);
            
            if (enterprise instanceof MainAuthorityEnterprise) {
                system.setMainAuthorityEnterprise(null);
                populateEnterpriseTable();
                return;
            }
            CityNetwork cityNetwork = (CityNetwork) tblEnterprise.getValueAt(selectedRow, 2);
            cityNetwork.getEnterpriseDirectory().removeEnterprise(enterprise);
            populateEnterpriseTable();

        } else {
            return;
        }
    }//GEN-LAST:event_btnDeleteEnterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEnterprise;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteEnterprise;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageEnterprise;
    private javax.swing.JTable tblEnterprise;
    // End of variables declaration//GEN-END:variables
}
