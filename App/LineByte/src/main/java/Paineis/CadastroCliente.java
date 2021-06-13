/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import Entidade.DAO;
import Entidade.EntidadesBanco.Cliente;
import Entidade.EntidadesBanco.Pessoa;
import Interfaces.TemplatePainelCadastro;
import Telas.Cadastro;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author r4f4s
 */
public class CadastroCliente extends TemplatePainelCadastro {
    private boolean check = false;
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        CBpessoa.setModel(new DefaultComboBoxModel(DAO.listaNative(Pessoa.class).toArray()));
        CBpessoa.addItem("novo");// colar no resto dos construtores que possuem combobox
        check = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBpessoa = new javax.swing.JLabel();
        CBpessoa = new javax.swing.JComboBox<>();

        LBpessoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBpessoa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBpessoa.setText("Pessoa:");

        CBpessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBpessoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBpessoaItemStateChanged(evt);
            }
        });
        CBpessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBpessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(LBpessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBpessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBpessoa)
                    .addComponent(CBpessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CBpessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBpessoaActionPerformed
       
    }//GEN-LAST:event_CBpessoaActionPerformed
    
    private void CBpessoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBpessoaItemStateChanged
        // fazer isso com todas as combobox
        if("novo".equals(CBpessoa.getSelectedItem()+"") && check == true){
            CadastroPessoa CP;
            new Cadastro(null, true, CP = new CadastroPessoa()).setVisible(true);
            CBpessoa.getModel().setSelectedItem(CP.getObjeto(null));
        }
    }//GEN-LAST:event_CBpessoaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBpessoa;
    private javax.swing.JLabel LBpessoa;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getObjeto() {
        Cliente c = new Cliente();
        c.setPessoa((Pessoa) CBpessoa.getSelectedItem());
        return c;
    }

    @Override
    public Object getObjeto(Object o) {
        Cliente c;
        if(o == null){
            c = new Cliente();

        } else {
            c = (Cliente) o;
        }
       
            c.setPessoa((Pessoa) CBpessoa.getSelectedItem());
        return c;
    }

    @Override
    public void preencherCampos(Object o) {
       if(o == null){
            CBpessoa.setSelectedItem(null);
        }else{
            Cliente c = (Cliente) o;
            CBpessoa.setSelectedItem(c.getPessoa());
        }
    }
}
