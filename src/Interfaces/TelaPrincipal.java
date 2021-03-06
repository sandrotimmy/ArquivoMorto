/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import arquivomorto.ConexaoBanco;
import arquivomorto.Empresa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class TelaPrincipal extends javax.swing.JFrame {

    public Empresa empresaAtual;
    public Statement s;

    public TelaPrincipal() throws SQLException {
        initComponents();
        setSize(600, 800);
        this.s = ConexaoBanco.getStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM EMPRESA ORDER BY IDEMPRESA");
        rs.next();
        SelecaoEmpresaCod.setText(rs.getString("IDEMPRESA"));
        SelecaoEmpresaNome.setText(rs.getString("NOMEEMPRESA"));
        empresaAtual = new Empresa(Integer.parseInt(rs.getString("IDEMPRESA")), rs.getString("NOMEEMPRESA"));
        SelecaoEmpresaCod.enable(false);
        SelecaoEmpresaNome.enable(false);
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
    }

    public Empresa getEmpresaAtual() {
        return empresaAtual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        SelecaoEmpresaNome = new javax.swing.JTextField();
        SelecaoEmpresaCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastroEmpresa = new javax.swing.JMenu();
        cadastroEmpresas = new javax.swing.JMenuItem();
        cadastroCaixas = new javax.swing.JMenuItem();
        CadastroUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        LancamentosCaixas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        relCadastraisEmpresas = new javax.swing.JMenuItem();
        relCadastraisCaixas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SelecaoEmpresaNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        SelecaoEmpresaCod.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel2.setText("Código:");

        jLabel3.setText("Empresa:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Empresa:"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cadastroEmpresa.setText("Cadastro");
        cadastroEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEmpresaActionPerformed(evt);
            }
        });

        cadastroEmpresas.setText("Empresas");
        cadastroEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEmpresasActionPerformed(evt);
            }
        });
        cadastroEmpresa.add(cadastroEmpresas);

        cadastroCaixas.setText("Caixas");
        cadastroCaixas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCaixasActionPerformed(evt);
            }
        });
        cadastroEmpresa.add(cadastroCaixas);

        CadastroUsuarios.setText("Usuarios");
        CadastroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroUsuariosActionPerformed(evt);
            }
        });
        cadastroEmpresa.add(CadastroUsuarios);

        jMenuBar1.add(cadastroEmpresa);

        jMenu2.setText("Lançamentos");

        LancamentosCaixas.setText("Caixas");
        LancamentosCaixas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LancamentosCaixasActionPerformed(evt);
            }
        });
        jMenu2.add(LancamentosCaixas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        jMenu4.setText("Cadastais");

        relCadastraisEmpresas.setText("Empresas");
        relCadastraisEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relCadastraisEmpresasActionPerformed(evt);
            }
        });
        jMenu4.add(relCadastraisEmpresas);

        relCadastraisCaixas.setText("Caixas");
        relCadastraisCaixas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relCadastraisCaixasActionPerformed(evt);
            }
        });
        jMenu4.add(relCadastraisCaixas);

        jMenu3.add(jMenu4);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Sair");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(241, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelecaoEmpresaCod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelecaoEmpresaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SelecaoEmpresaCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(SelecaoEmpresaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroEmpresaActionPerformed
    }//GEN-LAST:event_cadastroEmpresaActionPerformed

    private void cadastroEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroEmpresasActionPerformed
        JDialog d = null;
        try {
            d = new CadastroEmpresa();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setModal(true);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
        d = null;
    }//GEN-LAST:event_cadastroEmpresasActionPerformed

    private void cadastroCaixasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCaixasActionPerformed
        JDialog d = null;
        try {
            d = new CadastroCaixa();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setModal(true);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_cadastroCaixasActionPerformed

    private void relCadastraisEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relCadastraisEmpresasActionPerformed

        try {
            Statement stmt = ConexaoBanco.getStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMPRESA ORDER BY IDEMPRESA");
            JRResultSetDataSource jrRs = new JRResultSetDataSource(rs);
            JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile("./Relatorios/RelEmpresa.jasper");
            JasperPrint print = JasperFillManager.fillReport(relatorio, null, jrRs);
            JasperViewer viwer = new JasperViewer(print, false);
            viwer.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, "O relatório não pode ser impresso!" + ex);
        }
    }//GEN-LAST:event_relCadastraisEmpresasActionPerformed
    private void relCadastraisCaixasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relCadastraisCaixasActionPerformed
        // TODO add your handling code here:
        try {
            Statement stmt = ConexaoBanco.getStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CAIXA ORDER BY IDCAIXA");
            JRResultSetDataSource jrRs = new JRResultSetDataSource(rs);
            JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile("./Relatorios/RelCaixa.jasper");
            JasperPrint print = JasperFillManager.fillReport(relatorio, null, jrRs);
            JasperViewer viwer = new JasperViewer(print, false);
            viwer.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, "O relatório não pode ser impresso!" + ex);
        }

    }//GEN-LAST:event_relCadastraisCaixasActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void LancamentosCaixasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LancamentosCaixasActionPerformed
        JFrame d = null;
        try {
            d = new InserirCaixas();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_LancamentosCaixasActionPerformed

    private void CadastroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroUsuariosActionPerformed
        JFrame d = null;
        try {
            d = new CadastroUsuarios();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_CadastroUsuariosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new TelaPrincipal().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastroUsuarios;
    private javax.swing.JMenuItem LancamentosCaixas;
    private javax.swing.JTextField SelecaoEmpresaCod;
    private javax.swing.JTextField SelecaoEmpresaNome;
    private javax.swing.JMenuItem cadastroCaixas;
    private javax.swing.JMenu cadastroEmpresa;
    private javax.swing.JMenuItem cadastroEmpresas;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenuItem relCadastraisCaixas;
    private javax.swing.JMenuItem relCadastraisEmpresas;
    // End of variables declaration//GEN-END:variables
}
