/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidade.DAO;
import Interfaces.TemplateLista;
import Interfaces.TemplatePainelCadastro;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Listagem extends javax.swing.JFrame {
    
    private Class classe;
    private TemplatePainelCadastro painel;

    /**
     * Creates new form Listagem
     * @param classe
     * @param painel
     */
    public Listagem(Class classe, TemplatePainelCadastro painel) { 
        this.classe = classe;
        this.painel = painel;
        initComponents();
        try {
            tl= (TemplateLista) classe.newInstance();//cria instacia //porque precisa do (templatelista)
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Listagem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        atualizaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SPtabela = new javax.swing.JScrollPane();
        JTtabela = new javax.swing.JTable();
        PainelCabecalho = new javax.swing.JPanel();
        BTnovo = new javax.swing.JButton();
        BTsair = new javax.swing.JButton();
        BTeditar = new javax.swing.JButton();
        BTexcluir = new javax.swing.JButton();
        TFpesquisa = new javax.swing.JTextField();
        BTpesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTtabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        SPtabela.setViewportView(JTtabela);

        BTnovo.setText("Novo");
        BTnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTnovoActionPerformed(evt);
            }
        });

        BTsair.setBackground(new java.awt.Color(255, 86, 86));
        BTsair.setText("Sair");
        BTsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTsairActionPerformed(evt);
            }
        });

        BTeditar.setText("Editar");
        BTeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTeditarActionPerformed(evt);
            }
        });

        BTexcluir.setBackground(new java.awt.Color(255, 255, 117));
        BTexcluir.setForeground(new java.awt.Color(0, 0, 0));
        BTexcluir.setText("Excluir");
        BTexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTexcluirActionPerformed(evt);
            }
        });

        BTpesquisa.setText("Pesquisar");

        javax.swing.GroupLayout PainelCabecalhoLayout = new javax.swing.GroupLayout(PainelCabecalho);
        PainelCabecalho.setLayout(PainelCabecalhoLayout);
        PainelCabecalhoLayout.setHorizontalGroup(
            PainelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCabecalhoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(BTnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(BTsair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PainelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TFpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelCabecalhoLayout.setVerticalGroup(
            PainelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCabecalhoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PainelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTsair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(PainelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFpesquisa))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPtabela, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SPtabela, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTsairActionPerformed
        dispose();
    }//GEN-LAST:event_BTsairActionPerformed

    private void BTexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTexcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTexcluirActionPerformed

    private void BTnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTnovoActionPerformed
        new Cadastro(this,true,painel).setVisible(true);
        atualizaTabela();
    }//GEN-LAST:event_BTnovoActionPerformed

    private void BTeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTeditarActionPerformed
        new Cadastro(this,true,painel).setVisible(true);
        atualizaTabela();
    }//GEN-LAST:event_BTeditarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTeditar;
    private javax.swing.JButton BTexcluir;
    private javax.swing.JButton BTnovo;
    private javax.swing.JButton BTpesquisa;
    private javax.swing.JButton BTsair;
    private javax.swing.JTable JTtabela;
    private javax.swing.JPanel PainelCabecalho;
    private javax.swing.JScrollPane SPtabela;
    private javax.swing.JTextField TFpesquisa;
    // End of variables declaration//GEN-END:variables
    
    private List<TemplateLista> lista;
    private TemplateLista tl;
    
    private void atualizaTabela() {
        //lista = DAO.listaNative(classe);
   
        Object[][] dados= new Object[6][tl.getTitulos().length];
        /*
        for (int i = 0; i < lista.size(); i++) {
            dados[i]=lista.get(i).getDados();
        }
        */
        JTtabela.setModel(new DefaultTableModel(dados,tl.getTitulos()));
    }
}
