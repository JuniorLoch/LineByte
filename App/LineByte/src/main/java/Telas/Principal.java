/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidade.DAO;
import Entidade.EntidadesBanco.Cargo;
import Entidade.EntidadesBanco.Login;
import Entidade.EntidadesBanco.Cliente;
import Entidade.EntidadesBanco.Compra;
import Entidade.EntidadesBanco.Despesa;
import Entidade.EntidadesBanco.Endereco;
import Entidade.EntidadesBanco.Estoque;
import Entidade.EntidadesBanco.Fornecedor;
import Entidade.EntidadesBanco.Funcionario;
import Entidade.EntidadesBanco.Gerente;
import Entidade.EntidadesBanco.Pessoa;
import Entidade.EntidadesBanco.Pontos;
import Entidade.EntidadesBanco.Produto;
import Entidade.EntidadesBanco.TipoDespesa;
import Entidade.EntidadesBanco.Venda;
import Paineis.CadastroCargo;
import Paineis.CadastroCliente;
import Paineis.CadastroCompra;
import Paineis.CadastroDespesa;
import Paineis.CadastroEndereco;
import Paineis.CadastroEstoque;
import Paineis.CadastroFornecedor;
import Paineis.CadastroFuncionario;
import Paineis.CadastroGerente;
import Paineis.CadastroItemCompra;
import Paineis.CadastroItemVenda;
import Paineis.CadastroLogin;
import Paineis.CadastroPessoa;
import Paineis.CadastroPontos;
import Paineis.CadastroProdutos;
import Paineis.CadastroTipoDespesa;
import Paineis.CadastroVenda;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author User
 */
public class Principal extends javax.swing.JFrame {
    private String[] Entidades = {"Cargo","Cliente","Compra","Despesa","Endereco","Estoque","Fornecedor","Funcionario","Gerente","Login","Pessoa","Pontos","Produto","TipoDespesa"};
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        CBentidades.setModel(new DefaultComboBoxModel(Entidades));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBbomdia = new javax.swing.JLabel();
        BTanalize = new javax.swing.JButton();
        BTvendas = new javax.swing.JButton();
        BTsair = new javax.swing.JButton();
        BTcompras = new javax.swing.JButton();
        PainelCadastro = new javax.swing.JPanel();
        LBcadastro = new javax.swing.JLabel();
        BTcadastro = new javax.swing.JButton();
        CBentidades = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(115, 245, 245));

        LBbomdia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LBbomdia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBbomdia.setText("Bom dia");

        BTanalize.setBackground(new java.awt.Color(0, 255, 204));
        BTanalize.setForeground(new java.awt.Color(0, 0, 0));
        BTanalize.setText("Analize");
        BTanalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTanalizeActionPerformed(evt);
            }
        });

        BTvendas.setBackground(new java.awt.Color(102, 255, 51));
        BTvendas.setForeground(new java.awt.Color(0, 0, 0));
        BTvendas.setText("Vendas");
        BTvendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTvendasActionPerformed(evt);
            }
        });

        BTsair.setBackground(new java.awt.Color(247, 87, 87));
        BTsair.setText("Sair");
        BTsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTsairActionPerformed(evt);
            }
        });

        BTcompras.setBackground(new java.awt.Color(255, 204, 51));
        BTcompras.setForeground(new java.awt.Color(0, 0, 0));
        BTcompras.setText("Compras");
        BTcompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcomprasActionPerformed(evt);
            }
        });

        PainelCadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        LBcadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBcadastro.setText("O que deseja cadastrar");

        BTcadastro.setBackground(new java.awt.Color(204, 255, 255));
        BTcadastro.setForeground(new java.awt.Color(0, 0, 0));
        BTcadastro.setText("Cadastrar");
        BTcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcadastroActionPerformed(evt);
            }
        });

        CBentidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PainelCadastroLayout = new javax.swing.GroupLayout(PainelCadastro);
        PainelCadastro.setLayout(PainelCadastroLayout);
        PainelCadastroLayout.setHorizontalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CBentidades, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(BTcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(LBcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelCadastroLayout.setVerticalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LBcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBentidades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(BTcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTvendas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTcompras, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PainelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BTanalize, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addComponent(BTsair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBbomdia, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTanalize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTvendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTsair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTcompras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(PainelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(LBbomdia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTsairActionPerformed
        new TLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_BTsairActionPerformed

    private void BTcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcadastroActionPerformed
        switch(CBentidades.getSelectedItem().toString()){
            case "Cargo":
                new Listagem(Cargo.class,new CadastroCargo()).setVisible(true);
            break;
            case "Cliente":
                new Listagem(Cliente.class,new CadastroCliente()).setVisible(true);
            break;
            case "Compra":
                new Listagem(Compra.class,new CadastroCompra()).setVisible(true);
            break;
            case "Despesa":
                new Listagem(Despesa.class,new CadastroDespesa()).setVisible(true);
            break;
            case "Endereco":
                new Listagem(Endereco.class,new CadastroEndereco()).setVisible(true);
            break;
            case "Estoque":
                new Listagem(Estoque.class,new CadastroEstoque()).setVisible(true);
            break;
            case "Fornecedor":
                new Listagem(Fornecedor.class,new CadastroFornecedor()).setVisible(true);
            break;
            case "Funcionario":
                new Listagem(Funcionario.class,new CadastroFuncionario()).setVisible(true);
            break;
            case "Gerente":
                new Listagem(Gerente.class,new CadastroGerente()).setVisible(true);
            break;
            case "Login":
                new Listagem(Login.class,new CadastroLogin()).setVisible(true);
            break;
            case "Pessoa":
                new Listagem(Pessoa.class,new CadastroPessoa()).setVisible(true);
            break;
            case "Pontos":
                new Listagem(Pontos.class,new CadastroPontos()).setVisible(true);
            break;
            case "Produto":
                new Listagem(Produto.class,new CadastroProdutos()).setVisible(true);
            break;
            case "TipoDespesa":
                new Listagem(TipoDespesa.class,new CadastroTipoDespesa()).setVisible(true);
            break;
        }
        
    }//GEN-LAST:event_BTcadastroActionPerformed

    private void BTanalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTanalizeActionPerformed
        new Analize().setVisible(true);
    }//GEN-LAST:event_BTanalizeActionPerformed

    private void BTvendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTvendasActionPerformed
        new VendaCompra(this, true, new CadastroVenda(), new CadastroItemVenda()).setVisible(true);
    }//GEN-LAST:event_BTvendasActionPerformed

    private void BTcomprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcomprasActionPerformed
        new VendaCompra(this, true, new CadastroCompra(), new CadastroItemCompra()).setVisible(true);
    }//GEN-LAST:event_BTcomprasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTanalize;
    private javax.swing.JButton BTcadastro;
    private javax.swing.JButton BTcompras;
    private javax.swing.JButton BTsair;
    private javax.swing.JButton BTvendas;
    private javax.swing.JComboBox<String> CBentidades;
    private javax.swing.JLabel LBbomdia;
    private javax.swing.JLabel LBcadastro;
    private javax.swing.JPanel PainelCadastro;
    // End of variables declaration//GEN-END:variables
}
