/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import Entidade.DAO;
import Entidade.EntidadesBanco.Cargo;
import Entidade.EntidadesBanco.Funcionario;
import Entidade.EntidadesBanco.Login;
import Entidade.EntidadesBanco.Pessoa;
import Entidade.EntidadesBanco.Produto;
import Interfaces.TemplatePainelCadastro;
import Telas.Cadastro;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author r4f4s
 */
public class CadastroFuncionario extends TemplatePainelCadastro {
    private boolean check = false;
    /**
     * Creates new form CadastroFuncionario
     */
    public CadastroFuncionario() {
        initComponents();
        CBcargo.setModel(new DefaultComboBoxModel(DAO.listaNative(Cargo.class).toArray()));
        CBlogin.setModel(new DefaultComboBoxModel(DAO.listaNative(Login.class).toArray()));
        CBpessoa.setModel(new DefaultComboBoxModel(DAO.listaNative(Pessoa.class).toArray()));
        //Adicionando o NOVO nos ComboBox
        CBcargo.addItem("novo");// colar no resto dos construtores que possuem combobox
        CBlogin.addItem("novo");// colar no resto dos construtores que possuem combobox
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

        LBdataAdmissao = new javax.swing.JLabel();
        LBpessoa = new javax.swing.JLabel();
        LBcargo = new javax.swing.JLabel();
        LBlogin = new javax.swing.JLabel();
        LBdescricao = new javax.swing.JLabel();
        LBdatademissao = new javax.swing.JLabel();
        TFdescricao = new javax.swing.JTextField();
        FTFdataDemissao = new javax.swing.JFormattedTextField();
        FTFdataAdmissao = new javax.swing.JFormattedTextField();
        CBpessoa = new javax.swing.JComboBox<>();
        CBcargo = new javax.swing.JComboBox<>();
        CBlogin = new javax.swing.JComboBox<>();

        LBdataAdmissao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBdataAdmissao.setText("Data de Admissão:");

        LBpessoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBpessoa.setText("Pessoa:");

        LBcargo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBcargo.setText("Cargo:");

        LBlogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBlogin.setText("Login:");

        LBdescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBdescricao.setText("Descrição");

        LBdatademissao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBdatademissao.setText("Data de Demissão:");

        try {
            FTFdataDemissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FTFdataDemissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTFdataDemissaoActionPerformed(evt);
            }
        });

        try {
            FTFdataAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FTFdataAdmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTFdataAdmissaoActionPerformed(evt);
            }
        });

        CBpessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBpessoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBpessoaItemStateChanged(evt);
            }
        });

        CBcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBcargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBcargoItemStateChanged(evt);
            }
        });

        CBlogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBlogin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBloginItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBdescricao)
                                .addGap(18, 18, 18)
                                .addComponent(TFdescricao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBdatademissao)
                                .addGap(18, 18, 18)
                                .addComponent(FTFdataDemissao))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LBcargo)
                                .addGap(18, 18, 18)
                                .addComponent(CBcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LBlogin)
                                .addGap(18, 18, 18)
                                .addComponent(CBlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBpessoa)
                                .addGap(18, 18, 18)
                                .addComponent(CBpessoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(LBdataAdmissao)
                        .addGap(18, 18, 18)
                        .addComponent(FTFdataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(283, 283, 283))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBpessoa)
                    .addComponent(CBpessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBcargo)
                    .addComponent(LBlogin)
                    .addComponent(CBcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBdescricao)
                    .addComponent(TFdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBdataAdmissao)
                    .addComponent(FTFdataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBdatademissao)
                    .addComponent(FTFdataDemissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FTFdataDemissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTFdataDemissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTFdataDemissaoActionPerformed

    private void FTFdataAdmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTFdataAdmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTFdataAdmissaoActionPerformed

    private void CBpessoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBpessoaItemStateChanged
        if("novo".equals(CBpessoa.getSelectedItem()+"") && check == true){
            CadastroPessoa CP;
            new Cadastro(null, true, CP = new CadastroPessoa()).setVisible(true);
            CBpessoa.setModel(new DefaultComboBoxModel(DAO.listaNative(Pessoa.class).toArray()));
            CBpessoa.setSelectedItem(CP.getObjeto(null));
            check = false;
            CBpessoa.addItem("novo");
            check = true;
        }
    }//GEN-LAST:event_CBpessoaItemStateChanged

    private void CBcargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBcargoItemStateChanged
        if("novo".equals(CBcargo.getSelectedItem()+"") && check == true){
            CadastroCargo CC;
            new Cadastro(null, true, CC = new CadastroCargo()).setVisible(true);
            CBcargo.setModel(new DefaultComboBoxModel(DAO.listaNative(Cargo.class).toArray()));
            CBcargo.setSelectedItem(CC.getObjeto(null));
            check = false;
            CBcargo.addItem("novo");
            check = true;
        }
    }//GEN-LAST:event_CBcargoItemStateChanged

    private void CBloginItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBloginItemStateChanged
        if("novo".equals(CBlogin.getSelectedItem()+"") && check == true){
            CadastroLogin CL;
            new Cadastro(null, true, CL = new CadastroLogin()).setVisible(true);
            CBlogin.setModel(new DefaultComboBoxModel(DAO.listaNative(Login.class).toArray()));
            CBlogin.setSelectedItem(CL.getObjeto(null));
            check = false;
            CBlogin.addItem("novo");
            check = true;
        }
    }//GEN-LAST:event_CBloginItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBcargo;
    private javax.swing.JComboBox<String> CBlogin;
    private javax.swing.JComboBox<String> CBpessoa;
    private javax.swing.JFormattedTextField FTFdataAdmissao;
    private javax.swing.JFormattedTextField FTFdataDemissao;
    private javax.swing.JLabel LBcargo;
    private javax.swing.JLabel LBdataAdmissao;
    private javax.swing.JLabel LBdatademissao;
    private javax.swing.JLabel LBdescricao;
    private javax.swing.JLabel LBlogin;
    private javax.swing.JLabel LBpessoa;
    private javax.swing.JTextField TFdescricao;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getObjeto() {
        Funcionario f = new Funcionario();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        f.setCargo((Cargo) CBcargo.getSelectedItem());
        f.setDescricao(TFdescricao.getText());
        f.setPessoa((Pessoa) CBpessoa.getSelectedItem());
        f.setLogin((Login) CBlogin.getSelectedItem());
        try {
            f.setDataAdmissao(sdf.parse(FTFdataAdmissao.getText()));
            f.setDataDemissao(sdf.parse(FTFdataDemissao.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
    
    @Override
    public Object getObjeto(Object o) {
        Funcionario f;
        if(o == null){
            f = new Funcionario();

        } else {
            f = (Funcionario) o;
        }
        //preenchendo o objeto para salvar, daqui pra baixo voce exclui oq tem e copia tudo do getobjeto() la em cima, tirando
        // a primeira linha q é a declaracao
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        f.setCargo((Cargo) CBcargo.getSelectedItem());
        f.setDescricao(TFdescricao.getText());
        f.setPessoa((Pessoa) CBpessoa.getSelectedItem());
        f.setLogin((Login) CBlogin.getSelectedItem());
        try {
            f.setDataAdmissao(sdf.parse(FTFdataAdmissao.getText()));
            f.setDataDemissao(sdf.parse(FTFdataDemissao.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }

    @Override
    public void preencherCampos(Object o) { 
        //aqui é onde vai preencher os campos da tela como vazios, se tiver clicado em salvar
        //ou com os dados do objeto, se tiver clicado em editar
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // se houver algum campo de data isso é necessario
        if(o == null){
            //setando os campos como vazio quando tiver clicado em novo la no listagem
            TFdescricao.setText("");
            FTFdataDemissao.setText("");
            FTFdataAdmissao.setText("");
            CBpessoa.setSelectedItem(null);
            CBlogin.setSelectedItem(null);
            CBcargo.setSelectedItem(null);
        }else{
            Funcionario f = (Funcionario) o; // declara o objeto
            TFdescricao.setText(f.getDescricao());
            FTFdataDemissao.setText(sdf.format(f.getDataDemissao())+"");
            FTFdataAdmissao.setText(sdf.format(f.getDataAdmissao())+"");
            CBpessoa.setSelectedItem(f.getPessoa());
            CBlogin.setSelectedItem(f.getLogin());
            CBcargo.setSelectedItem(f.getCargo());
        }
    }
}
