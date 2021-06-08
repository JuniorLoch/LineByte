/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import Entidade.DAO;
import Entidade.EntidadesBanco.ItemCompra;
import Entidade.EntidadesBanco.ItemVenda;
import Entidade.EntidadesBanco.Produto;
import Interfaces.TemplateLista;
import Interfaces.TemplatePainelCadastro;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author r4f4s
 */
public class CadastroItemCompra extends TemplatePainelCadastro {

    /**
     * Creates new form ItemCompra
     */
    public CadastroItemCompra() {
        initComponents();
        try {
            ic = ItemCompra.class.newInstance();//caso nao funcione, mudar para class.getdeclaredconstructor().newinstance()
        } catch (InstantiationException ex) {
            Logger.getLogger(CadastroItemCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CadastroItemCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizaTabela();
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
        LBValor = new javax.swing.JLabel();
        TFvalor = new javax.swing.JTextField();
        LBquantidade = new javax.swing.JLabel();
        TFquantidade = new javax.swing.JTextField();
        SPitemCompra = new javax.swing.JScrollPane();
        JTitemCompra = new javax.swing.JTable();
        CBproduto = new javax.swing.JComboBox<>();

        LBproduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBproduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBproduto.setText("Produto:");

        LBValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBValor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBValor.setText("Valor:");

        TFvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFvalorActionPerformed(evt);
            }
        });

        LBquantidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBquantidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBquantidade.setText("Quantidade:");

        TFquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFquantidadeActionPerformed(evt);
            }
        });

        JTitemCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        SPitemCompra.setViewportView(JTitemCompra);

        CBproduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPitemCompra)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBproduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LBValor)
                        .addGap(18, 18, 18)
                        .addComponent(TFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LBquantidade)
                        .addGap(18, 18, 18)
                        .addComponent(TFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBproduto)
                    .addComponent(LBquantidade)
                    .addComponent(TFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBValor)
                    .addComponent(CBproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SPitemCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TFvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFvalorActionPerformed

    private void TFquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFquantidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBproduto;
    private javax.swing.JTable JTitemCompra;
    private javax.swing.JLabel LBValor;
    private javax.swing.JLabel LBproduto;
    private javax.swing.JLabel LBquantidade;
    private javax.swing.JScrollPane SPitemCompra;
    private javax.swing.JTextField TFquantidade;
    private javax.swing.JTextField TFvalor;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getObjeto() {
        ItemCompra ic = new ItemCompra();
        ic.setCompra(null); //descobrir como colocar a compra selecionada aqui dentro
        ic.setProduto((Produto) CBproduto.getSelectedItem());
        ic.setQuantidade(Integer.parseInt(TFquantidade.getText()));
        return ic;
    }
    
    private List<TemplateLista> lista;
    private ItemCompra ic;
    
    public void atualizaTabela() {
        lista = DAO.listaNative(ItemCompra.class);
   
        Object[][] dados= new Object[6][ic.getTitulos().length];
        
        for (int i = 0; i < lista.size(); i++) {
            dados[i]=lista.get(i).getDados();
        }
        
        JTitemCompra.setModel(new DefaultTableModel(dados,ic.getTitulos()));
    }

    @Override
    public Object getObjeto(Object o) {
        ItemCompra itc;
        if(o == null){
            itc = new ItemCompra();

        } else {
            itc = (ItemCompra) o;
        }
        //preenchendo o objeto para salvar, daqui pra baixo voce exclui oq tem e copia tudo do getobjeto() la em cima, tirando
        // a primeira linha q é a declaracao
        itc.setCompra(null); //descobrir como colocar a compra selecionada aqui dentro
        itc.setProduto((Produto) CBproduto.getSelectedItem());
        itc.setQuantidade(Integer.parseInt(TFquantidade.getText()));
        return itc;
    }

    @Override
    public void preencherCampos(Object o) {
        if(o == null){
            TFquantidade.setText("");
            TFvalor.setText("");
            CBproduto.setSelectedItem(null);
        }else{
            ItemCompra itc = (ItemCompra) o; //coloquei itc pq netbeans tava reclamando
            TFquantidade.setText(Integer.toString(itc.getQuantidade())); 
            TFvalor.setText(Float.toString(itc.getProduto().getValor()*itc.getQuantidade())); // vai ter q mudar depois, temporário
            CBproduto.setSelectedItem(itc.getProduto());
        }
    }
}
