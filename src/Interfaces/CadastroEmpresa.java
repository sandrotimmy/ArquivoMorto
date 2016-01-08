
package Interfaces;

import arquivomorto.CRUD;
import arquivomorto.Empresa;
import arquivomorto.ConexaoBanco;
import arquivomorto.DocumentoLimitado;
import java.awt.AWTKeyStroke;
import java.awt.Dialog;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class CadastroEmpresa extends javax.swing.JDialog {

    private ArrayList<Empresa> listaEmpresas;
    private Statement s;
    private CRUD c;
    HashSet backup;
    private int posicao;//controla o caminhamento do cadastro
    private int last;//será sempre o codigo da ação "cadastrar

    public CadastroEmpresa(Dialog owner) {
        super(owner);
        this.listaEmpresas = new ArrayList();//Carrega o cadastro de empresas na tela
    }

    public CadastroEmpresa() throws SQLException {
        HashSet conj = new HashSet(this.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
         backup = (HashSet) conj.clone();
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                botaoCadastrar.requestFocus();
            }
        });
        this.listaEmpresas = new ArrayList();
        this.s = ConexaoBanco.getStatement();
        Empresa e = new Empresa();
        try {
            s.execute("SELECT * FROM EMPRESA ORDER BY IDEMPRESA");
            ResultSet rs = s.getResultSet();
            while (rs.next()) {
                listaEmpresas.add(new Empresa(Integer.parseInt(rs.getString("IDEMPRESA")), rs.getString("NOMEEMPRESA")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.c = new CRUD();
        initComponents();
        if (!listaEmpresas.isEmpty()) {
            jTextFieldCod.setText(Integer.toString(listaEmpresas.get(listaEmpresas.size() - 1).getIdEmpresa()));
            jTextFieldNome.setText(listaEmpresas.get(listaEmpresas.size() - 1).getNomeEmpresa());
            posicao = listaEmpresas.size() - 1;
        }

        campoCnpj.enable(false);
        jTextFieldCod.enable(false);
        jTextFieldCod.setDocument(new DocumentoLimitado(4));
        campoCompl.enable(false);
        jTextFieldNome.enable(false);
        campoEndereco.enable(false);
        campoCaixaPostal.enable(false);
        campoCep.enable(false);
        campoDdd.enable(false);
        campoEmail.enable(false);
        campoEndereco.enable(false);
        campoFax.enable(false);
        campoCep.enable(false);
        campoFone.enable(false);
        campoMunicipio.enable(false);
        campoNumero.enable(false);
        campoUf.enable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        BotaListaPrimeiro = new javax.swing.JButton();
        BotaoListaAnterior = new javax.swing.JButton();
        BotaoListaProximo = new javax.swing.JButton();
        BotaoListaUltimo = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();
        campoCnpj = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoMunicipio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoUf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoCaixaPostal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoDdd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoCompl = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoFone = new javax.swing.JFormattedTextField();
        campoFax = new javax.swing.JFormattedTextField();
        campoCep = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Empresa");
        setModal(true);

        jLabel1.setText("Código:");

        jLabel2.setText("Razão Social:");

        jTextFieldCod.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCod.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        botaoCadastrar.setText("Incluir");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        BotaListaPrimeiro.setText("<<");
        BotaListaPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaListaPrimeiroActionPerformed(evt);
            }
        });

        BotaoListaAnterior.setText("<");
        BotaoListaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoListaAnteriorActionPerformed(evt);
            }
        });

        BotaoListaProximo.setText(">");
        BotaoListaProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoListaProximoActionPerformed(evt);
            }
        });

        BotaoListaUltimo.setText(">>");
        BotaoListaUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoListaUltimoActionPerformed(evt);
            }
        });

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        campoCnpj.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoCnpj.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        try{ 
            javax.swing.text.MaskFormatter cnpj = new javax.swing.text.MaskFormatter("##.###.###/####-##"); 
            campoCnpj = new javax.swing.JFormattedTextField(cnpj); 
        } 
        catch (Exception e){ 
        }
        campoCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCnpjActionPerformed(evt);
            }
        });

        jLabel3.setText("CNPJ: ");

        jLabel4.setText("Endereço:");

        campoEndereco.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel5.setText("Número:");

        campoNumero.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel6.setText("Município:");

        campoMunicipio.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel7.setText("UF:");

        campoUf.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel8.setText("CEP:");

        jLabel9.setText("Caixa Postal:");

        campoCaixaPostal.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel10.setText("DDD:");

        jLabel11.setText("Fone:");

        campoDdd.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel12.setText("Compl:");

        campoCompl.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel13.setText("Fax:");

        jLabel14.setText("e-mail:");

        campoEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        campoFone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoFone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        try{
            javax.swing.text.MaskFormatter fone = new javax.swing.text.MaskFormatter("####-####");
            campoFone = new javax.swing.JFormattedTextField(fone);
        }
        catch (Exception e){
        }
        campoFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFoneActionPerformed(evt);
            }
        });

        campoFax.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoFax.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        try{
            javax.swing.text.MaskFormatter fax = new javax.swing.text.MaskFormatter("####-####");
            campoFax = new javax.swing.JFormattedTextField(fax);
        }
        catch (Exception e){
        }
        campoFax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFaxActionPerformed(evt);
            }
        });

        campoCep.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoCep.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        try{
            javax.swing.text.MaskFormatter cep = new javax.swing.text.MaskFormatter("##.###-###");
            campoCep = new javax.swing.JFormattedTextField(cep);
        }
        catch (Exception e){
        }
        campoCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaListaPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoListaAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoListaProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoListaUltimo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoCancelar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(campoDdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campoFone, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(campoMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campoUf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campoFax, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14)
                                                .addGap(0, 1, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoCompl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNumero))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoCaixaPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(campoEmail)))
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaListaPrimeiro)
                    .addComponent(BotaoListaAnterior)
                    .addComponent(BotaoListaProximo)
                    .addComponent(BotaoListaUltimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(campoCompl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(campoUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(campoCaixaPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(campoFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoAtualizar)
                    .addComponent(botaoPesquisar)
                    .addComponent(botaoCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        botaoCadastrar.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
        if (!botaoCadastrar.getText().equals("Gravar")) {
            jTextFieldNome.requestFocus();
            jTextFieldNome.setText("");
            jTextFieldCod.enable(true);
            jTextFieldNome.enable(true);
            jTextFieldCod.setText(Integer.toString(listaEmpresas.size() + 1));
            botaoCadastrar.setText("Gravar");
        } else {
            listaEmpresas.add(new Empresa(listaEmpresas.size() + 1, this.jTextFieldNome.getText()));
            c.cadastrarEmpresa(this.jTextFieldCod.getText(), this.jTextFieldNome.getText());
            posicao++;
            botaoCadastrar.setText("Incluir");
            jTextFieldCod.enable(false);
            jTextFieldNome.enable(false);
        }

    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        c.deletaEmpresa(this.jTextFieldCod.getText());
        listaEmpresas.remove(posicao);
        posicao--;
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        CadastroEmpresa.this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        c.atualizaEmpresa(this.jTextFieldCod.getText(), this.jTextFieldNome.getText());
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
         String s = this.jTextFieldCod.getText();
        for (Empresa listaEmpresa : listaEmpresas) {
            if (listaEmpresa.getIdEmpresa() == Integer.parseInt(s)) {
                jTextFieldCod.setText(Integer.toString(listaEmpresa.getIdEmpresa()));
                jTextFieldNome.setText(listaEmpresa.getNomeEmpresa());
            }
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void BotaListaPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaListaPrimeiroActionPerformed
        jTextFieldCod.setText(Integer.toString(listaEmpresas.get(0).getIdEmpresa()));
        jTextFieldNome.setText(listaEmpresas.get(0).getNomeEmpresa());
        posicao = 0;
    }//GEN-LAST:event_BotaListaPrimeiroActionPerformed

    private void BotaoListaUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListaUltimoActionPerformed
        jTextFieldCod.setText(Integer.toString(listaEmpresas.get(listaEmpresas.size() - 1).getIdEmpresa()));
        jTextFieldNome.setText(listaEmpresas.get(listaEmpresas.size() - 1).getNomeEmpresa());
        posicao = listaEmpresas.size() - 1;
    }//GEN-LAST:event_BotaoListaUltimoActionPerformed

    private void BotaoListaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListaAnteriorActionPerformed
        if (posicao > 0) {
            jTextFieldCod.setText((Integer.toString(listaEmpresas.get(posicao - 1).getIdEmpresa())));
            jTextFieldNome.setText(listaEmpresas.get(posicao - 1).getNomeEmpresa());
            posicao--;
        }
    }//GEN-LAST:event_BotaoListaAnteriorActionPerformed

    private void BotaoListaProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListaProximoActionPerformed
        if (posicao < listaEmpresas.size() - 1) {
            jTextFieldCod.setText((Integer.toString(listaEmpresas.get(posicao + 1).getIdEmpresa())));
            jTextFieldNome.setText(listaEmpresas.get(posicao + 1).getNomeEmpresa());
            posicao++;
        }
    }//GEN-LAST:event_BotaoListaProximoActionPerformed

    private void campoCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCnpjActionPerformed
    }//GEN-LAST:event_campoCnpjActionPerformed

    private void campoFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFoneActionPerformed
    }//GEN-LAST:event_campoFoneActionPerformed

    private void campoFaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFaxActionPerformed
    }//GEN-LAST:event_campoFaxActionPerformed

    private void campoCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCepActionPerformed
    }//GEN-LAST:event_campoCepActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            CadastroEmpresa dialog = null;
            try {
                dialog = new CadastroEmpresa();

            } catch (SQLException ex) {
                Logger.getLogger(CadastroEmpresa.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaListaPrimeiro;
    private javax.swing.JButton BotaoListaAnterior;
    private javax.swing.JButton BotaoListaProximo;
    private javax.swing.JButton BotaoListaUltimo;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JTextField campoCaixaPostal;
    private javax.swing.JFormattedTextField campoCep;
    private javax.swing.JFormattedTextField campoCnpj;
    private javax.swing.JTextField campoCompl;
    private javax.swing.JTextField campoDdd;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JFormattedTextField campoFax;
    private javax.swing.JFormattedTextField campoFone;
    private javax.swing.JTextField campoMunicipio;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
