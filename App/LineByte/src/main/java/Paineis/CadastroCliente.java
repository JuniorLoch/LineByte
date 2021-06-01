/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import Entidade.EntidadesBanco.Cliente;
import Entidade.EntidadesBanco.Pessoa;
import Interfaces.TemplatePainelCadastro;

/**
 *
 * @author r4f4s
 */
public class CadastroCliente extends TemplatePainelCadastro {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
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

        LBsenha = new javax.swing.JLabel();
        LBpessoa = new javax.swing.JLabel();
        TFsenha = new javax.swing.JTextField();
        CBpessoa = new javax.swing.JComboBox<>();

        LBsenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBsenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBsenha.setText("Senha:");

        LBpessoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBpessoa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBpessoa.setText("Pessoa:");

        TFsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFsenhaActionPerformed(evt);
            }
        });

        CBpessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(LBpessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBpessoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBpessoa)
                    .addComponent(CBpessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBsenha)
                    .addComponent(TFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TFsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFsenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBpessoa;
    private javax.swing.JLabel LBpessoa;
    private javax.swing.JLabel LBsenha;
    private javax.swing.JTextField TFsenha;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getObjeto() {
        Cliente c = new Cliente();
        c.setPessoa((Pessoa) CBpessoa.getSelectedItem());
        return c;
    }
}
