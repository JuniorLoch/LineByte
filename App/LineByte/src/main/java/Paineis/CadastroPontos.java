/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import Entidade.EntidadesBanco.Funcionario;
import Entidade.EntidadesBanco.Pontos;
import Interfaces.TemplatePainelCadastro;

/**
 *
 * @author r4f4s
 */
public class CadastroPontos extends TemplatePainelCadastro {

    /**
     * Creates new form CadastroPontos
     */
    public CadastroPontos() {
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

        LBhoraEntrada = new javax.swing.JLabel();
        LBFuncionario = new javax.swing.JLabel();
        LBdata = new javax.swing.JLabel();
        LBhoraSaida = new javax.swing.JLabel();
        FTFdata = new javax.swing.JFormattedTextField();
        FTFhoraEntrada = new javax.swing.JFormattedTextField();
        FTFhoraSaida = new javax.swing.JFormattedTextField();
        CBfuncionario = new javax.swing.JComboBox<>();

        LBhoraEntrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBhoraEntrada.setText("Hora entrada:");

        LBFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBFuncionario.setText("Funcionário:");

        LBdata.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBdata.setText("Data:");

        LBhoraSaida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBhoraSaida.setText("Hora Saida:");

        FTFdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        FTFhoraEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        FTFhoraSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        FTFhoraSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTFhoraSaidaActionPerformed(evt);
            }
        });

        CBfuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBdata)
                        .addGap(18, 18, 18)
                        .addComponent(FTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(CBfuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBhoraEntrada)
                        .addGap(18, 18, 18)
                        .addComponent(FTFhoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LBhoraSaida)
                        .addGap(18, 18, 18)
                        .addComponent(FTFhoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBFuncionario)
                    .addComponent(CBfuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBdata)
                    .addComponent(FTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBhoraEntrada)
                    .addComponent(FTFhoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBhoraSaida)
                    .addComponent(FTFhoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FTFhoraSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTFhoraSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTFhoraSaidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBfuncionario;
    private javax.swing.JFormattedTextField FTFdata;
    private javax.swing.JFormattedTextField FTFhoraEntrada;
    private javax.swing.JFormattedTextField FTFhoraSaida;
    private javax.swing.JLabel LBFuncionario;
    private javax.swing.JLabel LBdata;
    private javax.swing.JLabel LBhoraEntrada;
    private javax.swing.JLabel LBhoraSaida;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getObjeto() {
        Pontos p = new Pontos();
        p.setFuncionario((Funcionario) CBfuncionario.getSelectedItem());
        p.setDataPonto(null); // fazer a conversao do formattedtextfield em simpledate
        p.setHoraEntrada(null); // como converter a string digitada em TIME
        p.setHoraSaida(null);// como converter a string digitada em TIME
        return p;
    }
}
