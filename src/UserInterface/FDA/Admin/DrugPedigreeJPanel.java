/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FDA.Admin;

import Business.Manufacturer.Drug;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Network;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karanmankodi
 */
public class DrugPedigreeJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    Network network;

    /**
     * Creates new form DrugPedigreeJPanel
     */
    public DrugPedigreeJPanel(JPanel upcJPanel, Network network) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.network = network;
        Refresh();

    }

    public void Refresh() {
        int rowCount = pedigreeJTable.getRowCount();
        ArrayList<ManufacturerEnterprise> manuEntList;
        manuEntList = network.getEnterpriseDirectory().searchManuEnterprise();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) pedigreeJTable.getModel()).removeRow(i);

        }

        for (ManufacturerEnterprise manuEnt : manuEntList) {
            for (Drug d : manuEnt.getProdMgmtOrg().getDrugCatalog().getDrugList()) {
                Object row[] = new Object[d.getDrugPedigree().size() + d.getRequestIDs().size() + 1];
                row[0] = d;
                int x = 1;
                for (int i = d.getDrugPedigree().size(); i > 0; i--) {
                    row[x] = d.getDrugPedigree().get(i - 1);
                    x = x + 2;
                }


                int y = 2;
                for (int j = d.getRequestIDs().size(); j > 0; j--) {
                    row[y] = d.getRequestIDs().get(j - 1);
                    y = y + 2;
                }

                ((DefaultTableModel) pedigreeJTable.getModel()).addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        pedigreeJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        drugDetailsJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        printJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        pedigreeJTable.setAutoCreateColumnsFromModel(true);
        pedigreeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Drug", "User", "Order ID", "User", "Order ID", "User", "Order ID", "User", "Order ID", "User", "Order ID", "User", "Order ID", "User", "Order ID", "User", "Order ID"
            }
        ));
        jScrollPane1.setViewportView(pedigreeJTable);

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        drugDetailsJButton.setText("View Drug Details");
        drugDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugDetailsJButtonActionPerformed(evt);
            }
        });

        jButton1.setText("View Batch Nos per Drug");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        printJButton.setText("Print");
        printJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1)
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(backJButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 28, Short.MAX_VALUE)
                .add(printJButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1)
                .add(37, 37, 37)
                .add(drugDetailsJButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(backJButton)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(drugDetailsJButton)
                        .add(jButton1)
                        .add(printJButton))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void drugDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = pedigreeJTable.getSelectedRow();
        Drug selectedDrug = (Drug) pedigreeJTable.getValueAt(selectedRow, 0);
        ViewDrugDetailsJPanel vddjp = new ViewDrugDetailsJPanel(upcJPanel, selectedDrug);
        upcJPanel.add("Drug Details", vddjp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_drugDetailsJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = pedigreeJTable.getSelectedRow();
        Drug selectedDrug = (Drug) pedigreeJTable.getValueAt(selectedRow, 0);
        ViewBatchNosJPanel panel = new ViewBatchNosJPanel(upcJPanel, selectedDrug);
        upcJPanel.add("View Transaction Details per Drug", panel);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void printJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJButtonActionPerformed
        // TODO add your handling code here:
        try {
            pedigreeJTable.print();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Printer Exception");
        }
    }//GEN-LAST:event_printJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton drugDetailsJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pedigreeJTable;
    private javax.swing.JButton printJButton;
    // End of variables declaration//GEN-END:variables
}
