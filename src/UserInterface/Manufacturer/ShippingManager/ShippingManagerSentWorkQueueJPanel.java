/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.ShippingManager;

import Business.Enterprise;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import Business.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karanmankodi
 */
public class ShippingManagerSentWorkQueueJPanel extends javax.swing.JPanel {

    private JPanel upcJPanel;
    private ManufacturerEnterprise manuEnt;
    private UserAccount ua;
    Network network;
    /**
     * Creates new form ShippingManagerSentWorkQueueJPanel
     */
    public ShippingManagerSentWorkQueueJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
        initComponents();
        this.ua = ua;
        this.upcJPanel = upcJPanel;
        this.manuEnt = (ManufacturerEnterprise)ent;
        this.network = network;
        int rowCount = tblWorkQueue.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) tblWorkQueue.getModel()).removeRow(i);
        }


        Organization org = manuEnt.getMyOrganization(ua);

        for (WorkRequest request : org.getSentWorkQueue().getWorkRequestList()) {
            Object row[] = new Object[4];

            row[0] = request.getId();
            row[1] = request.getSender();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();

            ((DefaultTableModel) tblWorkQueue.getModel()).addRow(row);
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
        tblWorkQueue = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        viewDetailsJButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWorkQueue.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblWorkQueue);

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewDetailsJButton2.setText("View Details");
        viewDetailsJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("--- REQUESTS SENT ---");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel1)
                .add(173, 173, 173))
            .add(layout.createSequentialGroup()
                .add(backJButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(viewDetailsJButton2))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(11, 11, 11)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(backJButton)
                    .add(viewDetailsJButton2)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) upcJPanel.getLayout();
        cardLayout.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewDetailsJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkQueue.getSelectedRow();
        WorkRequest selectedRequest = (WorkRequest) tblWorkQueue.getValueAt(selectedRow, 0);
        ViewOrderDetailsJPanel vodjp = new ViewOrderDetailsJPanel(upcJPanel, selectedRequest);
        upcJPanel.add("Order Details", vodjp);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_viewDetailsJButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkQueue;
    private javax.swing.JButton viewDetailsJButton2;
    // End of variables declaration//GEN-END:variables
}
