/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

/**
 *
 * @author r4f4s
 */
public class CadastroCargo extends javax.swing.JPanel {

    /**
     * Creates new form CadastroCargo
     */
    public CadastroCargo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBnomeCargo = new javax.swing.JLabel();
        LBsalario = new javax.swing.JLabel();
        TFnomeCargo = new javax.swing.JTextField();
        TFsalario = new javax.swing.JTextField();

        LBnomeCargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBnomeCargo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBnomeCargo.setText("Nome do Cargo:");

        LBsalario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBsalario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBsalario.setText("Salário:");

        TFsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFsalarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(TFsalario))
                    .addComponent(TFnomeCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBnomeCargo))
                .addGap(0, 268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(LBnomeCargo)
                .addGap(18, 18, 18)
                .addComponent(TFnomeCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LBsalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TFsalario))
                .addContainerGap(278, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TFsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFsalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFsalarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBnomeCargo;
    private javax.swing.JLabel LBsalario;
    private javax.swing.JTextField TFnomeCargo;
    private javax.swing.JTextField TFsalario;
    // End of variables declaration//GEN-END:variables
}