/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.SalesEmployee;

import Business.Enterprise;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Network;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class SalesEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    ManufacturerEnterprise manuEnt;
    UserAccount ua;
    Network network;

    /**
     * Creates new form SalesEmployeeWorkAreaJPanel
     */
    public SalesEmployeeWorkAreaJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
        this.upcJPanel = upcJPanel;
        this.manuEnt = (ManufacturerEnterprise) ent;
        this.ua = ua;
        this.network = network;
        if (manuEnt.getLicense().equals(Boolean.FALSE)) {
            JOptionPane.showMessageDialog(null, "You are not licensed");
            upcJPanel.removeAll();
            CardLayout card = (CardLayout) upcJPanel.getLayout();
            card.previous(upcJPanel);
        } else {
            initComponents();
            nameJTextField.setText(ua.getEmployee().getName());
            idJTextField.setText(String.valueOf(ua.getEmployee().getId()));
            
        }
        refreshCounter();
    }

    public void refreshCounter(){
        noOfPendingRequestsJTextField.setText(String.valueOf(manuEnt.getMyOrganization(ua).getWorkQueue().getWorkRequestList().size()));
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
        workQueueJButton = new javax.swing.JButton();
        sentWorkQueueJButton = new javax.swing.JButton();
        displayOrdersJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        noOfPendingRequestsJTextField = new javax.swing.JTextField();
        refreshJButton = new javax.swing.JButton();
        idJTextField = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("--- SALES EMPLOYEE WORK AREA ---");

        workQueueJButton.setText("Work Queue");
        workQueueJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workQueueJButtonActionPerformed(evt);
            }
        });

        sentWorkQueueJButton.setText("Sent Work Queue");
        sentWorkQueueJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentWorkQueueJButtonActionPerformed(evt);
            }
        });

        displayOrdersJButton.setText("Display Orders");
        displayOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayOrdersJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("No of Pending Requests");

        noOfPendingRequestsJTextField.setEditable(false);

        refreshJButton.setText("Refresh Counter");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        idJTextField.setEditable(false);

        nameJTextField.setEditable(false);
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        jLabel4.setText("Name");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                            .add(139, 139, 139)
                            .add(sentWorkQueueJButton))
                        .add(layout.createSequentialGroup()
                            .add(refreshJButton)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel2)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(noOfPendingRequestsJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(76, 76, 76)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel4)
                                .add(4, 4, 4)
                                .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(workQueueJButton)
                                .add(displayOrdersJButton)))
                        .add(20, 20, 20)
                        .add(jLabel3)
                        .add(6, 6, 6)
                        .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(15, 15, 15)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4)
                            .add(jLabel3))))
                .add(29, 29, 29)
                .add(displayOrdersJButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 20, Short.MAX_VALUE)
                .add(workQueueJButton)
                .add(18, 18, 18)
                .add(sentWorkQueueJButton)
                .add(49, 49, 49)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(noOfPendingRequestsJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(refreshJButton))
                .add(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void workQueueJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workQueueJButtonActionPerformed
        // TODO add your handling code here:
        JPanel panel = new OrderProcessingJPanel(upcJPanel, network, manuEnt, ua);
        upcJPanel.add("SalesEmployeeOrderProcessing", panel);
        CardLayout cardLayout = (CardLayout) upcJPanel.getLayout();
        cardLayout.next(upcJPanel);
    }//GEN-LAST:event_workQueueJButtonActionPerformed

    private void sentWorkQueueJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentWorkQueueJButtonActionPerformed
        // TODO add your handling code here:
        JPanel panel = new SalesEmployeeSentWorkQueueJPanel(upcJPanel, network, manuEnt, ua);
        upcJPanel.add("SalesEmployeeSentWorkQueue", panel);
        CardLayout cardLayout = (CardLayout) upcJPanel.getLayout();
        cardLayout.next(upcJPanel);
    }//GEN-LAST:event_sentWorkQueueJButtonActionPerformed

    private void displayOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayOrdersJButtonActionPerformed
        // TODO add your handling code here:
        JPanel panel = new OrdersDisplayJPanel(upcJPanel, network, manuEnt, ua);
        upcJPanel.add("Display Orders", panel);
        CardLayout card = (CardLayout) upcJPanel.getLayout();
        card.next(upcJPanel);
    }//GEN-LAST:event_displayOrdersJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        refreshCounter();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton displayOrdersJButton;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField noOfPendingRequestsJTextField;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton sentWorkQueueJButton;
    private javax.swing.JButton workQueueJButton;
    // End of variables declaration//GEN-END:variables
}