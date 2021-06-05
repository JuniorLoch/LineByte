/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import Entidade.DAO;
import Entidade.EntidadesBanco.Estoque;
import Entidade.EntidadesBanco.Pessoa;
import Entidade.EntidadesBanco.Produto;
import Interfaces.TemplatePainelCadastro;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author r4f4s
 */
public class CadastroEstoque extends TemplatePainelCadastro {

    /**
     * Creates new form CadastroEstoque
     */
    public CadastroEstoque() {
        initComponents();
        CBproduto.setModel(new DefaultComboBoxModel(DAO.listaNative(Produto.class).toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBproduto = new javax.swing.JLabel();
        LBquantidade = new javax.swing.JLabel();
        TFquantidade = new javax.swing.JTextField();
        CBproduto = new javax.swing.JComboBox<>();

        LBproduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBproduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBproduto.setText("Produto:");

        LBquantidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBquantidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBquantidade.setText("Quantidade:");

        CBproduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBquantidade)
                        .addGap(18, 18, 18)
                        .addComponent(TFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBproduto)
                        .addGap(46, 46, 46)
                        .addComponent(CBproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(282, 282, 282))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBproduto)
                    .addComponent(CBproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBquantidade)
                    .addComponent(TFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBproduto;
    private javax.swing.JLabel LBproduto;
    private javax.swing.JLabel LBquantidade;
    private javax.swing.JTextField TFquantidade;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getObjeto() {
        Estoque e = new Estoque();
        e.setProduto((Produto) CBproduto.getSelectedItem());
        e.setQtdEstoque(Integer.parseInt(TFquantidade.getText()));
        return e;
    }
}
