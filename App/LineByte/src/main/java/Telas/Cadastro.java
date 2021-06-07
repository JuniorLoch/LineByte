/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidade.DAO;
import Interfaces.TemplatePainelCadastro;
import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 *
 * @author User
 */
public class Cadastro extends javax.swing.JDialog {
    TemplatePainelCadastro painel;
    Object objeto;
    /**
     * Creates new form Cadastro
     * @param parent
     * @param modal
     * @param painel
     */
    public Cadastro(java.awt.Frame parent, boolean modal, TemplatePainelCadastro painel) {
        super(parent, modal);
        initComponents();
        this.painel=painel;
        PainelCadastro.setLayout(new GridLayout(1, 1));
        PainelCadastro.add(painel);
        pack();
        painel.preencherCampos(objeto);
    }
    public Cadastro(java.awt.Frame parent, boolean modal, TemplatePainelCadastro painel, Object objeto) {
        super(parent, modal);
        initComponents();
        this.painel=painel;
        PainelCadastro.setLayout(new GridLayout(1, 1));
        PainelCadastro.add(painel);
        this.objeto = objeto;
        pack();
        painel.preencherCampos(objeto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTsalvar = new javax.swing.JButton();
        BTcancelar = new javax.swing.JButton();
        PainelCadastro = new javax.swing.JPanel();
        BTsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BTsalvar.setBackground(new java.awt.Color(204, 255, 204));
        BTsalvar.setForeground(new java.awt.Color(0, 0, 0));
        BTsalvar.setText("Salvar");
        BTsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTsalvarActionPerformed(evt);
            }
        });

        BTcancelar.setBackground(new java.awt.Color(255, 255, 204));
        BTcancelar.setForeground(new java.awt.Color(0, 0, 0));
        BTcancelar.setText("Cancelar");
        BTcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcancelarActionPerformed(evt);
            }
        });

        PainelCadastro.setLayout(new java.awt.GridLayout(1, 0));

        BTsair.setBackground(new java.awt.Color(255, 86, 86));
        BTsair.setForeground(new java.awt.Color(0, 0, 0));
        BTsair.setText("Sair");
        BTsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(BTsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTsair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BTsair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTsairActionPerformed
        dispose();
    }//GEN-LAST:event_BTsairActionPerformed

    private void BTsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTsalvarActionPerformed
        if(painel.getObjeto(objeto) != null){ // pode dar alguma coisa no futuro
            
                DAO.salvar(painel.getObjeto(objeto));
                dispose();
                
        }
    }//GEN-LAST:event_BTsalvarActionPerformed

    private void BTcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BTcancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTcancelar;
    private javax.swing.JButton BTsair;
    private javax.swing.JButton BTsalvar;
    private javax.swing.JPanel PainelCadastro;
    // End of variables declaration//GEN-END:variables
}
