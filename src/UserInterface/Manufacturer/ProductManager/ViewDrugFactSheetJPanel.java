/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer.ProductManager;

import Business.Manufacturer.Drug;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class ViewDrugFactSheetJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    Drug d;

    /**
     * Creates new form ViewDrugFactSheetJPanel
     */
    public ViewDrugFactSheetJPanel(JPanel upcJPanel, Drug d) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.d = d;


        nameJTextField.setText(d.getName());
        idJTextField.setText(String.valueOf(d.getId()));
        quantityJTextField.setText(String.valueOf(d.getAvailable()));
        priceJTextField.setText(String.valueOf(d.getPrice()));
        colorJTextField.setText(d.getColor());
        shapeTextField.setText(d.getShape());
        tasteJTextField.setText(d.getTaste());
        activeIngredientTextField.setText(d.getActiveIngredient());
        proportionJProgressBar.setValue(d.getActiveIngredientProportion());
        if (d.getClinicalTestApplication().getIndApp().getSafety().toString().equals("true")) {
            safetyJTextField.setText("Passed");
        } else {
            safetyJTextField.setText("Failed");
        }

        if (d.getClinicalTestApplication().getIndApp().getDesiredEffect().toString().equals("true")) {
            desiredEffectJTextField.setText("Passed");
        } else {
            desiredEffectJTextField.setText("Failed");
        }
        absorbJTextField.setText(String.valueOf(d.getClinicalTestApplication().getIndApp().getTimeToAbsorb()));
        effectJTextField.setText(String.valueOf(d.getClinicalTestApplication().getIndApp().getTimeForEffect()));
        eliminateJTextField.setText(String.valueOf(d.getClinicalTestApplication().getIndApp().getTimeToEliminate()));
        side1JTextField.setText(d.getClinicalTestApplication().getSideEffects().get(0));
        side2JTextField.setText(d.getClinicalTestApplication().getSideEffects().get(1));
        side3JTextField.setText(d.getClinicalTestApplication().getSideEffects().get(2));
//        yearJTextField.setText(String.valueOf(d.getClinicalTestApplication().getShelfLife().getYear()));
//        monthJTextField.setText(String.valueOf(d.getClinicalTestApplication().getShelfLife().getMonth()));
//        dateJTextField.setText(String.valueOf(d.getClinicalTestApplication().getShelfLife().getDate()));


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        eliminateJTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        activeIngredientTextField = new javax.swing.JTextField();
        proportionJProgressBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        shapeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        side3JTextField = new javax.swing.JTextField();
        side1JTextField = new javax.swing.JTextField();
        side2JTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tasteJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        effectJTextField = new javax.swing.JTextField();
        idJTextField = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        colorJTextField = new javax.swing.JTextField();
        quantityJTextField = new javax.swing.JTextField();
        absorbJTextField = new javax.swing.JTextField();
        desiredEffectJTextField = new javax.swing.JTextField();
        safetyJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Pharmacokinetics");

        eliminateJTextField.setEditable(false);

        jLabel15.setText("Active Ingredient");

        activeIngredientTextField.setEditable(false);

        jLabel2.setText("Quantity");

        jLabel16.setText("Proportion");

        jLabel6.setText("Color");

        shapeTextField.setEditable(false);

        jLabel5.setText("Shape");

        side2JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                side2JTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Price");

        priceJTextField.setEditable(false);

        jLabel13.setText("Time taken to eliminate drug");

        jLabel12.setText("Time taken for desired effect");

        jLabel9.setText("Desired Effect Check");

        jLabel8.setText("Safety Check");

        tasteJTextField.setEditable(false);

        jLabel11.setText("Time taken to absorb the drug");

        jLabel10.setText("Invivo Pre Clinical Tests - Tests on Rats");

        effectJTextField.setEditable(false);

        idJTextField.setEditable(false);

        nameJTextField.setEditable(false);

        jLabel7.setText("ID");

        jLabel17.setText("Noted Side Effects");

        jLabel1.setText("Name");

        colorJTextField.setEditable(false);

        quantityJTextField.setEditable(false);

        absorbJTextField.setEditable(false);

        desiredEffectJTextField.setEditable(false);

        safetyJTextField.setEditable(false);

        jLabel4.setText("Taste");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(180, 180, 180)
                        .add(side1JTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 321, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(180, 180, 180)
                        .add(side2JTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 321, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(180, 180, 180)
                        .add(side3JTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 321, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(5, 5, 5)
                        .add(jLabel15)
                        .add(6, 6, 6)
                        .add(activeIngredientTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(46, 46, 46)
                        .add(jLabel16)
                        .add(6, 6, 6)
                        .add(proportionJProgressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(163, 163, 163)
                        .add(jLabel17))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(100, 100, 100)
                                .add(jLabel7)
                                .add(6, 6, 6)
                                .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(60, 60, 60)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(18, 18, 18)
                                        .add(jLabel1))
                                    .add(jLabel2)
                                    .add(layout.createSequentialGroup()
                                        .add(22, 22, 22)
                                        .add(jLabel3))
                                    .add(layout.createSequentialGroup()
                                        .add(20, 20, 20)
                                        .add(jLabel6))
                                    .add(layout.createSequentialGroup()
                                        .add(20, 20, 20)
                                        .add(jLabel4))
                                    .add(layout.createSequentialGroup()
                                        .add(15, 15, 15)
                                        .add(jLabel5)))
                                .add(4, 4, 4)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(priceJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(shapeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(2, 2, 2)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(quantityJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(colorJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(tasteJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                        .add(96, 96, 96)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(22, 22, 22)
                                .add(jLabel10))
                            .add(layout.createSequentialGroup()
                                .add(jLabel8)
                                .add(58, 58, 58)
                                .add(safetyJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel9)
                                .add(8, 8, 8)
                                .add(desiredEffectJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jLabel14)
                            .add(layout.createSequentialGroup()
                                .add(jLabel11)
                                .add(6, 6, 6)
                                .add(absorbJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel12)
                                .add(15, 15, 15)
                                .add(effectJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel13)
                                .add(15, 15, 15)
                                .add(eliminateJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jButton1))
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jLabel7))
                            .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(jLabel1)
                                .add(24, 24, 24)
                                .add(jLabel2)
                                .add(18, 18, 18)
                                .add(jLabel3)
                                .add(18, 18, 18)
                                .add(jLabel6)
                                .add(24, 24, 24)
                                .add(jLabel4)
                                .add(18, 18, 18)
                                .add(jLabel5))
                            .add(layout.createSequentialGroup()
                                .add(12, 12, 12)
                                .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(quantityJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(6, 6, 6)
                                .add(priceJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(6, 6, 6)
                                .add(colorJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(tasteJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(6, 6, 6)
                                .add(shapeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel10)
                        .add(5, 5, 5)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jLabel8))
                            .add(safetyJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(1, 1, 1)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jLabel9))
                            .add(desiredEffectJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(12, 12, 12)
                        .add(jLabel14)
                        .add(12, 12, 12)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jLabel11))
                            .add(absorbJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(12, 12, 12)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jLabel12))
                            .add(effectJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(12, 12, 12)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jLabel13))
                            .add(eliminateJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(jLabel15))
                    .add(activeIngredientTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(jLabel16))
                    .add(proportionJProgressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jLabel17)
                .add(6, 6, 6)
                .add(side1JTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(6, 6, 6)
                .add(side2JTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(side3JTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 46, Short.MAX_VALUE)
                .add(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void side2JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_side2JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_side2JTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout card = (CardLayout)upcJPanel.getLayout();
        card.previous(upcJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absorbJTextField;
    private javax.swing.JTextField activeIngredientTextField;
    private javax.swing.JTextField colorJTextField;
    private javax.swing.JTextField desiredEffectJTextField;
    private javax.swing.JTextField effectJTextField;
    private javax.swing.JTextField eliminateJTextField;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField priceJTextField;
    private javax.swing.JProgressBar proportionJProgressBar;
    private javax.swing.JTextField quantityJTextField;
    private javax.swing.JTextField safetyJTextField;
    private javax.swing.JTextField shapeTextField;
    private javax.swing.JTextField side1JTextField;
    private javax.swing.JTextField side2JTextField;
    private javax.swing.JTextField side3JTextField;
    private javax.swing.JTextField tasteJTextField;
    // End of variables declaration//GEN-END:variables
}