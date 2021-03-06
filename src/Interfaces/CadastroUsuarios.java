/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import arquivomorto.CRUD;
import arquivomorto.ConexaoBanco;
import arquivomorto.Usuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class CadastroUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form CadastroUsuarios
     */
    public ArrayList<Usuarios> listaUsuarios;
    public Statement s;
    public CRUD c;
    public int posicao;//controla o caminhamento do cadastro
    public int last;//será sempre o codigo da ação "cadastrar

    public CadastroUsuarios() throws SQLException {
        initComponents();
        this.listaUsuarios = new ArrayList();
        this.s = ConexaoBanco.getStatement();
        Usuarios e = new Usuarios();
        try {
            s.execute("SELECT * FROM USUARIOS ORDER BY IDUSUARIO");
            ResultSet rs = s.getResultSet();
            while (rs.next()) {
                listaUsuarios.add(new Usuarios(Integer.parseInt(rs.getString("IDUSUARIO")), rs.getString("NOMEUSUARIO"), rs.getString("NICKUSUARIO"), rs.getString("SENHAUSUARIO")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.c = new CRUD();
        if (!listaUsuarios.isEmpty()) {
            campoCodigo.setText(Integer.toString(listaUsuarios.get(listaUsuarios.size() - 1).getIdUsuario()));
            campoNomeUsuario.setText(listaUsuarios.get(listaUsuarios.size() - 1).getNomeUsuario());
            campoNickUsuario.setText(listaUsuarios.get(listaUsuarios.size() - 1).getNickUsuario());
            campoSenha.setText(listaUsuarios.get(listaUsuarios.size() - 1).getSenhaUsuario());
            posicao = listaUsuarios.size() - 1;
        }
        
        campoCodigo.enable(false);
        campoNomeUsuario.enable(false);
        campoNickUsuario.enable(false);
        campoSenha.enable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoNomeUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoNickUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        botaoCadastrar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JToggleButton();
        botaoCancelar = new javax.swing.JToggleButton();
        BotaListaPrimeiro = new javax.swing.JButton();
        BotaoListaAnterior = new javax.swing.JButton();
        BotaoListaProximo = new javax.swing.JButton();
        BotaoListaUltimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");

        jLabel1.setText("Codigo:");

        campoCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel2.setText("Nome do Usuário:");

        campoNomeUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel3.setText("Username:");

        campoNickUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel4.setText("Senha:");

        campoSenha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeUsuario)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaListaPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoListaAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoListaProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoListaUltimo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(campoNickUsuario)
                                .addComponent(jLabel4)
                                .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotaListaPrimeiro)
                        .addComponent(BotaoListaAnterior)
                        .addComponent(BotaoListaProximo)
                        .addComponent(BotaoListaUltimo)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNickUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoAtualizar)
                    .addComponent(botaoCancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaListaPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaListaPrimeiroActionPerformed
        // TODO add your handling code here:
        campoCodigo.setText(Integer.toString(listaUsuarios.get(0).getIdUsuario()));
        campoNomeUsuario.setText(listaUsuarios.get(0).getNomeUsuario());
        campoNickUsuario.setText(listaUsuarios.get(0).getNickUsuario());
        campoSenha.setText(listaUsuarios.get(0).getSenhaUsuario());
        posicao = 0;
    }//GEN-LAST:event_BotaListaPrimeiroActionPerformed

    private void BotaoListaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListaAnteriorActionPerformed
        // TODO add your handling code here:
        if (posicao > 0) {
            campoCodigo.setText((Integer.toString(listaUsuarios.get(posicao - 1).getIdUsuario())));
            campoNomeUsuario.setText(listaUsuarios.get(posicao - 1).getNomeUsuario());
            campoNickUsuario.setText(listaUsuarios.get(posicao - 1).getNickUsuario());
            campoSenha.setText(listaUsuarios.get(posicao - 1).getSenhaUsuario());
            posicao--;
        }
    }//GEN-LAST:event_BotaoListaAnteriorActionPerformed

    private void BotaoListaProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListaProximoActionPerformed
        // TODO add your handling code here:
        if (posicao < listaUsuarios.size() - 1) {
            campoCodigo.setText((Integer.toString(listaUsuarios.get(posicao + 1).getIdUsuario())));
            campoNomeUsuario.setText(listaUsuarios.get(posicao + 1).getNomeUsuario());
            campoNickUsuario.setText(listaUsuarios.get(posicao + 1).getNickUsuario());
            campoSenha.setText(listaUsuarios.get(posicao + 1).getSenhaUsuario());
            posicao++;
        }
    }//GEN-LAST:event_BotaoListaProximoActionPerformed

    private void BotaoListaUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoListaUltimoActionPerformed
        // TODO add your handling code here:
        campoCodigo.setText(Integer.toString(listaUsuarios.get(listaUsuarios.size() - 1).getIdUsuario()));
        campoNomeUsuario.setText(listaUsuarios.get(listaUsuarios.size() - 1).getNomeUsuario());
        campoNickUsuario.setText(listaUsuarios.get(listaUsuarios.size() - 1).getNickUsuario());
        campoSenha.setText(listaUsuarios.get(listaUsuarios.size() - 1).getSenhaUsuario());
        posicao = listaUsuarios.size()-1;
    }//GEN-LAST:event_BotaoListaUltimoActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
        CadastroUsuarios.this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        // TODO add your handling code here:
        if (!botaoCadastrar.getText().equals("Gravar")) {
            campoNomeUsuario.setText("");
            campoNickUsuario.setText("");
            campoSenha.setText("");
            
            campoCodigo.enable(true);
            campoNomeUsuario.enable(true);
            campoNickUsuario.enable(true);
            campoSenha.enable(true);
            campoCodigo.setText(Integer.toString(listaUsuarios.size() + 1));
            botaoCadastrar.setText("Gravar");
        } else {
            listaUsuarios.add(new Usuarios(listaUsuarios.size() + 1, this.campoNomeUsuario.getText(), this.campoNickUsuario.getText(), this.campoSenha.getText()));
            c.cadastrarUsuario(this.campoCodigo.getText(), this.campoNomeUsuario.getText(), this.campoNickUsuario.getText(), this.campoSenha.getText());
            posicao++;
            botaoCadastrar.setText("Incluir");
            campoCodigo.enable(false);
            campoNomeUsuario.enable(false);
            campoNickUsuario.enable(false);
            campoSenha.enable(false);
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        c.deletaUsuario(campoCodigo.getText());
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getIdUsuario() == Integer.parseInt(campoCodigo.getText())){
                if (i == listaUsuarios.size()-1) {
                    campoCodigo.setText(Integer.toString(listaUsuarios.get(i-1).idUsuario));
                    campoNomeUsuario.setText(listaUsuarios.get(i-1).getNomeUsuario());
                    campoNickUsuario.setText(listaUsuarios.get(i-1).getNickUsuario());
                    campoSenha.setText(listaUsuarios.get(i-1).getSenhaUsuario());
                    posicao = i-1;
                } else {
                    campoCodigo.setText(Integer.toString(listaUsuarios.get(i+1).idUsuario));
                    campoNomeUsuario.setText(listaUsuarios.get(i+1).getNomeUsuario());
                    campoNickUsuario.setText(listaUsuarios.get(i+1).getNickUsuario());
                    campoSenha.setText(listaUsuarios.get(i+1).getSenhaUsuario());
                    posicao = i+1;
                }
                listaUsuarios.remove(i);
            }
            
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroUsuarios().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaListaPrimeiro;
    private javax.swing.JButton BotaoListaAnterior;
    private javax.swing.JButton BotaoListaProximo;
    private javax.swing.JButton BotaoListaUltimo;
    private javax.swing.JToggleButton botaoAtualizar;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JToggleButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoNickUsuario;
    private javax.swing.JTextField campoNomeUsuario;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
