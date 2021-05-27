/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import Entidade.EntidadesBanco.Endereco;
import Entidade.EntidadesBanco.Fornecedor;
import Interfaces.TemplatePainelCadastro;

/**
 *
 * @author r4f4s
 */
public class CadastroFornecedor extends TemplatePainelCadastro {

    /**
     * Creates new form CadastroFornecedor
     */
    public CadastroFornecedor() {
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

        LBnome = new javax.swing.JLabel();
        LBcnpj = new javax.swing.JLabel();
        LBendereco = new javax.swing.JLabel();
        TFnome = new javax.swing.JTextField();
        TFcnpj = new javax.swing.JTextField();
        CBendereco = new javax.swing.JComboBox<>();

        LBnome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBnome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBnome.setText("Nome:");

        LBcnpj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBcnpj.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBcnpj.setText("CNPJ:");

        LBendereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBendereco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBendereco.setText("Endereco:");

        CBendereco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBnome)
                    .addComponent(LBcnpj))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBendereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBnome)
                    .addComponent(TFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBcnpj)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TFcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LBendereco)
                        .addComponent(CBendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBendereco;
    private javax.swing.JLabel LBcnpj;
    private javax.swing.JLabel LBendereco;
    private javax.swing.JLabel LBnome;
    private javax.swing.JTextField TFcnpj;
    private javax.swing.JTextField TFnome;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getObjeto() {
        Fornecedor f = new Fornecedor();
        f.setCpnj(TFcnpj.getText());
        f.setEndereco((Endereco) CBendereco.getSelectedItem());
        f.setNomeFornecedor(TFnome.getText());
        return f;
    }
}
