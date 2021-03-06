/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FDA.ForensicsOrganization;

import Business.FDA.FDAEnterprise;
import Business.FDA.ForensicReportDirectory;
import Business.FDA.ForensicsInvestigationWorkRequest;
import Business.Manufacturer.ManufacturerEnterprise;
import Business.Network;
import Business.UserAccount;
import Business.Wholesaler.WholesalerEnterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author karanmankodi
 */
public class ViewForensicInvestigationJPanel extends javax.swing.JPanel {

    JPanel upcJPanel;
    FDAEnterprise fdaEnt;
    UserAccount ua;
    Network network;
    ForensicsInvestigationWorkRequest req;
    ManufacturerEnterprise manuEnt;
    WholesalerEnterprise wholeEnt;
    ForensicReportDirectory reportDir;
    /**
     * Creates new form ViewForensicInvestigationJPanel
     */
    public ViewForensicInvestigationJPanel(JPanel upcJPanel, Network network, FDAEnterprise fdaEnt, UserAccount ua, ForensicsInvestigationWorkRequest req) {
        initComponents();
        this.upcJPanel = upcJPanel;
        this.fdaEnt = fdaEnt;
        this.ua = ua;
        this.network = network;
        this.req = req;
        reportDir = req.getForensicReportDir();
        
        nameJTextField.setText(req.getD().getName());
        idJTextField.setText(String.valueOf(req.getD().getId()));
        manuNameJTextField.setText(req.getD().getManuEnt().getEnterpriseName());
        colorJTextField.setText(req.getD().getColor());
        shapeTextField.setText(req.getD().getShape());
        tasteJTextField.setText(req.getD().getTaste());
        activeIngredientTextField.setText(req.getReport().getActiveIngredient());
        proportionJSlider1.setValue(req.getReport().getActiveIngProportion());
        inactiveIngredientTextField.setText(req.getReport().getInactiveIngredient());
        inactiveProportionJProgressBar.setValue(req.getReport().getInactiveIngProportion());
        basicJSlider.setValue(req.getReport().getBasicContent());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tasteJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        shapeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        manuNameJTextField = new javax.swing.JTextField();
        colorJTextField = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        activeIngredientTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        inactiveProportionJProgressBar = new javax.swing.JProgressBar();
        jLabel18 = new javax.swing.JLabel();
        inactiveIngredientTextField = new javax.swing.JTextField();
        basicJSlider = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        proportionJSlider1 = new javax.swing.JSlider();
        jLabel9 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tasteJTextField.setEditable(false);

        jLabel6.setText("Color");

        jLabel1.setText("Name");

        shapeTextField.setEditable(false);

        jLabel5.setText("Shape");

        jLabel4.setText("Taste");

        jLabel7.setText("Manufacturer");

        manuNameJTextField.setEditable(false);

        colorJTextField.setEditable(false);

        nameJTextField.setEditable(false);

        jLabel16.setText("Proportion");

        jLabel15.setText("Active Ingredient");

        jLabel17.setText("Proportion");

        jLabel18.setText("Inactive Ingredient");

        jLabel8.setText("Basic");

        jLabel9.setText("Acidic");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        idJTextField.setEditable(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(layout.createSequentialGroup()
                                    .add(jLabel18)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(inactiveIngredientTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(jLabel8)
                                    .add(8, 8, 8)
                                    .add(basicJSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jLabel9)))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(layout.createSequentialGroup()
                                    .add(jLabel5)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(shapeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jLabel6)
                                        .add(jLabel4))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(tasteJTextField)
                                        .add(colorJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(layout.createSequentialGroup()
                                    .add(jLabel1)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(jLabel7)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(manuNameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(jLabel2)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(backJButton)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel15)
                                    .add(jLabel16))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(proportionJSlider1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(activeIngredientTextField)))))
                    .add(layout.createSequentialGroup()
                        .add(22, 22, 22)
                        .add(jLabel17)
                        .add(18, 18, 18)
                        .add(inactiveProportionJProgressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(manuNameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(nameJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(3, 3, 3)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(idJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(colorJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(tasteJTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(shapeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(activeIngredientTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel15))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel16)
                    .add(proportionJSlider1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(inactiveIngredientTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel18))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel17)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, inactiveProportionJProgressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(13, 13, 13)
                        .add(jLabel8))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, basicJSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel9))
                .add(44, 44, 44)
                .add(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        upcJPanel.remove(this);
        CardLayout cardLayout = (CardLayout) upcJPanel.getLayout();
        cardLayout.previous(upcJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField activeIngredientTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JSlider basicJSlider;
    private javax.swing.JTextField colorJTextField;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JTextField inactiveIngredientTextField;
    private javax.swing.JProgressBar inactiveProportionJProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField manuNameJTextField;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JSlider proportionJSlider1;
    private javax.swing.JTextField shapeTextField;
    private javax.swing.JTextField tasteJTextField;
    // End of variables declaration//GEN-END:variables
}
