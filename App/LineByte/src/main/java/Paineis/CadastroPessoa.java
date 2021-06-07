/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import Entidade.DAO;
import Entidade.EntidadesBanco.Endereco;
import Entidade.EntidadesBanco.Pessoa;
import Interfaces.TemplatePainelCadastro;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author r4f4s
 */
public class CadastroPessoa extends TemplatePainelCadastro {

    /**
     * Creates new form CadastroPessoa
     */
    public CadastroPessoa() {
        initComponents();
        CBendereco.setModel(new DefaultComboBoxModel(DAO.listaNative(Endereco.class).toArray()));
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
        LBsexo = new javax.swing.JLabel();
        LBcpf = new javax.swing.JLabel();
        LBrg = new javax.swing.JLabel();
        LBdataNascimento = new javax.swing.JLabel();
        TFnome = new javax.swing.JTextField();
        TFcpf = new javax.swing.JTextField();
        TFrg = new javax.swing.JTextField();
        FTFdataNascimento = new javax.swing.JFormattedTextField();
        RBsexoMasculino = new javax.swing.JRadioButton();
        RBsexoFeminino = new javax.swing.JRadioButton();
        LBendereco = new javax.swing.JLabel();
        CBendereco = new javax.swing.JComboBox<>();

        LBnome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBnome.setText("Nome:");

        LBsexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBsexo.setText("Sexo:");

        LBcpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBcpf.setText("CPF:");

        LBrg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBrg.setText("RG:");

        LBdataNascimento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBdataNascimento.setText("Data Nascimento:");

        try {
            FTFdataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        RBsexoMasculino.setText("Masculino");

        RBsexoFeminino.setText("Feminino");

        LBendereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBendereco.setText("Endereço:");

        CBendereco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LBnome)
                            .addGap(18, 18, 18)
                            .addComponent(TFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBsexo)
                                .addGap(18, 18, 18)
                                .addComponent(RBsexoMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(RBsexoFeminino))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBrg)
                                .addGap(18, 18, 18)
                                .addComponent(TFrg, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(LBendereco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(CBendereco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(LBcpf)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(LBdataNascimento)
                            .addGap(18, 18, 18)
                            .addComponent(FTFdataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBnome)
                    .addComponent(TFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBcpf)
                    .addComponent(TFcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBrg)
                    .addComponent(TFrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBdataNascimento)
                    .addComponent(LBsexo)
                    .addComponent(FTFdataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBsexoMasculino)
                    .addComponent(RBsexoFeminino))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBendereco)
                    .addComponent(CBendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBendereco;
    private javax.swing.JFormattedTextField FTFdataNascimento;
    private javax.swing.JLabel LBcpf;
    private javax.swing.JLabel LBdataNascimento;
    private javax.swing.JLabel LBendereco;
    private javax.swing.JLabel LBnome;
    private javax.swing.JLabel LBrg;
    private javax.swing.JLabel LBsexo;
    private javax.swing.JRadioButton RBsexoFeminino;
    private javax.swing.JRadioButton RBsexoMasculino;
    private javax.swing.JTextField TFcpf;
    private javax.swing.JTextField TFnome;
    private javax.swing.JTextField TFrg;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getObjeto() {
        Pessoa p = new Pessoa();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        boolean err = false;
        p.setCpf(TFcpf.getText());
        try {
            p.setDataNasc(sdf.parse(FTFdataNascimento.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setEndereco((Endereco) CBendereco.getSelectedItem());
        p.setNome(TFnome.getText());
        p.setRg(TFrg.getText());
        
        if(RBsexoFeminino.isSelected() == true){
            if(RBsexoMasculino.isSelected() == true){
                JOptionPane.showMessageDialog(null, "Marque somente UM sexo!!");
                err = true;
            } else {
                p.setSexo("F");
            }
        } else {
            if(RBsexoMasculino.isSelected() == true){
                p.setSexo("M");
            } else {
                JOptionPane.showMessageDialog(null, "Marque pelo menos UM sexo!!");
                err = true;
            }
        }
        if(err == false) {
            return p;
        } else {
            return null; // em todo lugar que chamar esse método precisará de um verificador para nao salvar um objeto nulo
        }
    }

    @Override
    public Object getObjeto(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void preencherCampos(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
