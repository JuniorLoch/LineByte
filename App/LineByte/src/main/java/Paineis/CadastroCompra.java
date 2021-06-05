/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import Entidade.DAO;
import Entidade.EntidadesBanco.Compra;
import Entidade.EntidadesBanco.Fornecedor;
import Entidade.EntidadesBanco.Produto;
import Interfaces.TemplatePainelCadastro;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author r4f4s
 */
public class CadastroCompra extends TemplatePainelCadastro {

    /**
     * Creates new form CadastroCompra
     */
    public CadastroCompra() {
        initComponents();
        CBfornecedor.setModel(new DefaultComboBoxModel(DAO.listaNative(Fornecedor.class).toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBfornecedor = new javax.swing.JLabel();
        LBdata = new javax.swing.JLabel();
        LBvalor = new javax.swing.JLabel();
        LBvalorCompraDinamico = new javax.swing.JLabel();
        FTFdata = new javax.swing.JFormattedTextField();
        CBfornecedor = new javax.swing.JComboBox<>();
        LBnotaFiscal = new javax.swing.JLabel();
        TFnotaFiscal = new javax.swing.JTextField();

        LBfornecedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBfornecedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBfornecedor.setText("Fornecedor:");

        LBdata.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBdata.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBdata.setText("Data:");

        LBvalor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBvalor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBvalor.setText("Valor:");

        LBvalorCompraDinamico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBvalorCompraDinamico.setForeground(new java.awt.Color(0, 0, 204));
        LBvalorCompraDinamico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBvalorCompraDinamico.setText("0");

        try {
            FTFdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CBfornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LBnotaFiscal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBnotaFiscal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBnotaFiscal.setText("Nota Fiscal:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBfornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(CBfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LBvalor)
                                .addGap(18, 18, 18)
                                .addComponent(LBvalorCompraDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LBdata)
                                .addGap(18, 18, 18)
                                .addComponent(FTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(LBnotaFiscal)
                        .addGap(18, 18, 18)
                        .addComponent(TFnotaFiscal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBfornecedor)
                    .addComponent(CBfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LBnotaFiscal)
                        .addComponent(TFnotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LBdata)
                        .addComponent(FTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBvalor)
                    .addComponent(LBvalorCompraDinamico))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBfornecedor;
    private javax.swing.JFormattedTextField FTFdata;
    private javax.swing.JLabel LBdata;
    private javax.swing.JLabel LBfornecedor;
    private javax.swing.JLabel LBnotaFiscal;
    private javax.swing.JLabel LBvalor;
    private javax.swing.JLabel LBvalorCompraDinamico;
    private javax.swing.JTextField TFnotaFiscal;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getObjeto() {
        Compra c = new Compra();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            c.setDataCompra(sdf.parse(FTFdata.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setFornecedor((Fornecedor) CBfornecedor.getSelectedItem());
        c.setNotaFiscal(TFnotaFiscal.getText()); // cade o campo de insercao da nota no design
        return c;
    }
}
