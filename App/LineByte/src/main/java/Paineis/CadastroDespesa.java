/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import Entidade.DAO;
import Entidade.EntidadesBanco.Despesa;
import Entidade.EntidadesBanco.TipoDespesa;
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
public class CadastroDespesa extends TemplatePainelCadastro {

    /**
     * Creates new form CadastroDespesa
     */
    public CadastroDespesa() {
        initComponents();
        CBcategoria.setModel(new DefaultComboBoxModel(DAO.listaNative(TipoDespesa.class).toArray()));
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
        LBcategoria = new javax.swing.JLabel();
        LBdataVencimento = new javax.swing.JLabel();
        LBpago = new javax.swing.JLabel();
        TFnome = new javax.swing.JTextField();
        CBpago = new javax.swing.JCheckBox();
        FTFvencimento = new javax.swing.JFormattedTextField();
        LBvalor = new javax.swing.JLabel();
        TFvalor = new javax.swing.JTextField();
        CBcategoria = new javax.swing.JComboBox<>();

        LBnome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBnome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBnome.setText("Nome:");

        LBcategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBcategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBcategoria.setText("Categoria:");

        LBdataVencimento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBdataVencimento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBdataVencimento.setText("Data de Vencimento:");

        LBpago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBpago.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBpago.setText("Pago:");

        CBpago.setText("Sim");

        try {
            FTFvencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FTFvencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTFvencimentoActionPerformed(evt);
            }
        });

        LBvalor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBvalor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBvalor.setText("Valor:");

        CBcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBpago)
                        .addGap(45, 45, 45)
                        .addComponent(CBpago, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(LBcategoria)
                            .addGap(18, 18, 18)
                            .addComponent(CBcategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(LBdataVencimento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FTFvencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LBnome)
                                .addComponent(LBvalor))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBcategoria)
                    .addComponent(CBcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBnome)
                    .addComponent(TFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBvalor))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBpago)
                    .addComponent(CBpago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FTFvencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBdataVencimento))
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FTFvencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTFvencimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTFvencimentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBcategoria;
    private javax.swing.JCheckBox CBpago;
    private javax.swing.JFormattedTextField FTFvencimento;
    private javax.swing.JLabel LBcategoria;
    private javax.swing.JLabel LBdataVencimento;
    private javax.swing.JLabel LBnome;
    private javax.swing.JLabel LBpago;
    private javax.swing.JLabel LBvalor;
    private javax.swing.JTextField TFnome;
    private javax.swing.JTextField TFvalor;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getObjeto() {
        Despesa d = new Despesa();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            d.setDataVencimento(sdf.parse(FTFvencimento.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroDespesa.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setNome(TFnome.getText());
        d.setPago(CBpago.isSelected());
        d.setTipoDespesa((TipoDespesa)CBcategoria.getSelectedItem());
        d.setValor(Float.parseFloat(TFvalor.getText()));
        return d;
    }

    @Override
    public Object getObjeto(Object o) {
        Despesa d;
        if(o == null){
            d = new Despesa();

        } else {
            d = (Despesa) o;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            d.setDataVencimento(sdf.parse(FTFvencimento.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroDespesa.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setNome(TFnome.getText());
        d.setPago(CBpago.isSelected());
        d.setTipoDespesa((TipoDespesa)CBcategoria.getSelectedItem());
        d.setValor(Float.parseFloat(TFvalor.getText()));
        return d;
    }

    @Override
    public void preencherCampos(Object o) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // se houver algum campo de data isso é necessario
        if(o == null){
            TFnome.setText("");
            TFvalor.setText("");
            FTFvencimento.setText(""); 
            CBcategoria.setSelectedItem(null); 
            CBpago.setSelected(false); 
        }else{
            Despesa d = (Despesa) o;
            TFnome.setText(d.getNome());
            TFvalor.setText(d.getValor().toString());
            FTFvencimento.setText(sdf.format(d.getDataVencimento())); 
            CBcategoria.setSelectedItem(d.getTipoDespesa()); 
            CBpago.setSelected(d.getPago()); 
        }
    }
}
