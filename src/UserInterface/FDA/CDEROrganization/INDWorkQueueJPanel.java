/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FDA.CDEROrganization;

import Business.FDA.DrugProductionRequest;
import Business.FDA.FDAEnterprise;
import Business.Network;
import Business.UserAccount;
import Business.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karanmankodi
 */
public class INDWorkQueueJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    FDAEnterprise fdaEnt;
    UserAccount ua;
    Network network;
    /**
     * Creates new form LicensingWorkQueueJPanel
     */
    public INDWorkQueueJPanel(JPanel upcJPanel, Network network, FDAEnterprise fdaEnt, UserAccount ua) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.fdaEnt = fdaEnt;
        this.ua = ua;
        this.network = network;
        Refresh();
        
        fdaJTextField.setText("Food & Drug Administration");
    }

    public void Refresh() {
        int rowCount = licensingRequestJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) licensingRequestJTable.getModel()).removeRow(i);
        }

        ArrayList<WorkRequest> swList = fdaEnt.getCderOrg().getWorkQueue().getWorkRequestList();
        for (WorkRequest wr : swList) {

            Object row[] = new Object[5];
            row [0] = wr;
            row [1] = wr.getDrug();
            row [2] = wr.getManuEnt();
            
            ((DefaultTableModel) licensingRequestJTable.getModel()).addRow(row);
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
        licensingRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        sendForClinicalTestingJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fdaJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        licensingRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Request ID", "Drug", "Enterprise"
            }
        ));
        jScrollPane1.setViewportView(licensingRequestJTable);

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        sendForClinicalTestingJButton.setText("View IND Application");
        sendForClinicalTestingJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendForClinicalTestingJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("--- INVESTIGATIONAL NEW DRUG APPLICATIONS ---");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(backJButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(refreshJButton)
                        .add(18, 18, 18)
                        .add(sendForClinicalTestingJButton))
                    .add(layout.createSequentialGroup()
                        .add(95, 95, 95)
                        .add(fdaJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 260, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jLabel1)
                .add(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(fdaJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1)
                .add(7, 7, 7)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .add(32, 32, 32)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(sendForClinicalTestingJButton)
                    .add(refreshJButton)
                    .add(backJButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        Refresh();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void sendForClinicalTestingJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendForClinicalTestingJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = licensingRequestJTable.getSelectedRow();
        DrugProductionRequest dpRequest = (DrugProductionRequest) licensingRequestJTable.getValueAt(selectedRow, 0);

        ViewINDApplicationJPanel vijp = new ViewINDApplicationJPanel(upcJPanel, network, fdaEnt, ua, dpRequest);
        upcJPanel.add("View IND Application", vijp);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_sendForClinicalTestingJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField fdaJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable licensingRequestJTable;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton sendForClinicalTestingJButton;
    // End of variables declaration//GEN-END:variables
}