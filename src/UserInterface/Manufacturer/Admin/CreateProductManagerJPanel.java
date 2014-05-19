/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.Admin;

import Business.Employee;
import Business.Enterprise;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Network;
import Business.Roles.ManufacturerProductManagerRole;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class CreateProductManagerJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    ManufacturerEnterprise manuEnt;
    UserAccount ua;
    Network network;
    /**
     * Creates new form CreateProductManagerJPanel
     */
    public CreateProductManagerJPanel(JPanel upcJPanel, Network network, Enterprise ent, UserAccount ua) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.manuEnt = (ManufacturerEnterprise)ent;
        this.ua = ua;
        this.network = network;
        entNameJTextField.setText(manuEnt.getEnterpriseName());
        orgNameJTextField.setText(manuEnt.getProdMgmtOrg().getoName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        createAdminJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        entNameJTextField = new javax.swing.JTextField();
        orgNameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        passwordJTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setText("<< BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        createAdminJButton.setText("CREATE ADMIN");
        createAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAdminJButtonActionPerformed(evt);
            }
        });
        add(createAdminJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel1.setText("--- CREATE PRODUCT MANAGER ---");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 6, -1, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Enterprise Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setText("Organization Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 220, -1));

        entNameJTextField.setEditable(false);
        add(entNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 220, -1));

        orgNameJTextField.setEditable(false);
        add(orgNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 220, -1));

        jLabel5.setText("Username");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, -1));
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 90, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 400, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void createAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAdminJButtonActionPerformed
        // TODO add your handling code here:

        
        Employee emp = manuEnt.getProdMgmtOrg().getEmployeeDirectory().newEmployee();
        emp.setName(nameJTextField.getText());
        UserAccount ua1 = manuEnt.getProdMgmtOrg().getUserAccountDirectory().newUserAccount();
        ua1.setEmployee(emp);
        ua1.setUsername(usernameJTextField.getText());
        ua1.setPassword(passwordJTextField.getText());
        ua1.setRole(new ManufacturerProductManagerRole());

        JOptionPane.showMessageDialog(null, "Done");

    }//GEN-LAST:event_createAdminJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createAdminJButton;
    private javax.swing.JTextField entNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField orgNameJTextField;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}