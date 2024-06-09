

package com.mycompany.projeto_tecnightsenai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lnunes
 */
public class tela_consulta_daddos extends javax.swing.JFrame {

    /**
     * Creates new form atividade_02
     */
    public tela_consulta_daddos() {
        initComponents();
    }

    
    public void PopularJTable(String sql){
        
        try {
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/projeto_AcessaMais", "root", "");
            PreparedStatement banco = (PreparedStatement)con.prepareStatement(sql);
            banco.execute();
            ResultSet resultado = banco.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel)tbl_users.getModel();
            model.setNumRows(0);
            
            while(resultado.next())
            {
                model.addRow(new Object[]
                {
                    resultado.getString("id_civil"),
                     resultado.getString("nome_civil"),
                     resultado.getString("cpf_civil"),
                     resultado.getString("possui_deficiencia"),
                     resultado.getString("tipo_deficiencia"),
                     resultado.getString("bairro_civil"),
                    
                });
                
                
            }
            banco.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(tela_consulta_daddos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_add_civil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_users = new javax.swing.JTable();
        menu_decima = new javax.swing.JPanel();
        label_cadastro_civil = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        label_img_consulta_preto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tx_filtro_bairro = new javax.swing.JTextField();
        tx_filtro_nome = new javax.swing.JTextField();
        label_filtro_bairro = new javax.swing.JLabel();
        label_filtro_nome = new javax.swing.JLabel();
        label_filtro_tipo_def = new javax.swing.JLabel();
        tx_filtro_tipo_def = new javax.swing.JTextField();
        menu_lateral = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tela_cadastro_civil = new javax.swing.JLabel();
        label_img_consulta_branco = new javax.swing.JLabel();
        label_sair = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_pesquisa = new javax.swing.JButton();
        btn_pesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1711, 954));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_add_civil.setBackground(new java.awt.Color(30, 101, 40));
        btn_add_civil.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_add_civil.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_civil.setText("+ ADICIONAR");
        btn_add_civil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_civilActionPerformed(evt);
            }
        });

        tbl_users.setBackground(new java.awt.Color(226, 226, 226));
        tbl_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Cpf", "Possui deficiência", "Tipo deficiência", "Bairro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_users.setToolTipText("");
        jScrollPane1.setViewportView(tbl_users);

        menu_decima.setBackground(new java.awt.Color(255, 255, 255));
        menu_decima.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_decima.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                menu_decimaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        label_cadastro_civil.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label_cadastro_civil.setText("Consulta de dados");
        label_cadastro_civil.setMaximumSize(new java.awt.Dimension(200, 47));
        label_cadastro_civil.setMinimumSize(new java.awt.Dimension(100, 16));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Olá, Fulano Silva!");

        javax.swing.GroupLayout menu_decimaLayout = new javax.swing.GroupLayout(menu_decima);
        menu_decima.setLayout(menu_decimaLayout);
        menu_decimaLayout.setHorizontalGroup(
            menu_decimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_decimaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(label_img_consulta_preto)
                .addGap(24, 24, 24)
                .addGroup(menu_decimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(label_cadastro_civil, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(29, 29, 29))
        );
        menu_decimaLayout.setVerticalGroup(
            menu_decimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_decimaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(menu_decimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_decimaLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGroup(menu_decimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menu_decimaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_decimaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(14, 14, 14))))
                    .addComponent(label_img_consulta_preto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_cadastro_civil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tx_filtro_bairro.setText("Bairro 1");

        tx_filtro_nome.setText("Fulano de ciclano");

        label_filtro_bairro.setText("Filtrar por bairro:");

        label_filtro_nome.setText("Filtrar por nome:");

        label_filtro_tipo_def.setText("Filtrar por tipo de deficiência:");

        tx_filtro_tipo_def.setText("Deficiencia X");

        menu_lateral.setBackground(new java.awt.Color(30, 101, 40));

        tela_cadastro_civil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tela_cadastro_civilMouseClicked(evt);
            }
        });

        label_img_consulta_branco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_img_consulta_brancoMouseClicked(evt);
            }
        });

        label_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_sairMouseClicked(evt);
            }
        });

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menu_lateralLayout = new javax.swing.GroupLayout(menu_lateral);
        menu_lateral.setLayout(menu_lateralLayout);
        menu_lateralLayout.setHorizontalGroup(
            menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_lateralLayout.createSequentialGroup()
                .addGroup(menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_lateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(menu_lateralLayout.createSequentialGroup()
                                    .addGroup(menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel15))
                                    .addGap(67, 67, 67))
                                .addGroup(menu_lateralLayout.createSequentialGroup()
                                    .addComponent(label_sair)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20))))
                            .addComponent(jLabel17)
                            .addGroup(menu_lateralLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel18)
                                    .addComponent(label_img_consulta_branco)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))))
                    .addGroup(menu_lateralLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tela_cadastro_civil))
                    .addGroup(menu_lateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_lateralLayout.setVerticalGroup(
            menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_lateralLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_cadastro_civil)
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel16)
                .addGap(60, 60, 60)
                .addComponent(label_img_consulta_branco)
                .addGap(69, 69, 69)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(72, 72, 72)
                .addComponent(jLabel9)
                .addGap(69, 69, 69)
                .addComponent(label_sair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(107, 107, 107)
                .addComponent(jLabel20)
                .addGap(124, 124, 124))
        );

        btn_pesquisa.setText("pesquisa");
        btn_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisaActionPerformed(evt);
            }
        });

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_decima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_filtro_bairro)
                                    .addComponent(tx_filtro_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_filtro_tipo_def)
                                    .addComponent(tx_filtro_tipo_def, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tx_filtro_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_pesquisar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_add_civil))
                                    .addComponent(label_filtro_nome))))
                        .addGap(0, 118, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menu_decima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_filtro_bairro)
                            .addComponent(label_filtro_tipo_def)
                            .addComponent(label_filtro_nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_filtro_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tx_filtro_tipo_def, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tx_filtro_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add_civil)
                            .addComponent(btn_pesquisar))
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addComponent(menu_lateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_civilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_civilActionPerformed
       
        
      tela_consulta_daddos.this.dispose();
      tela_cadastro_civil objeto2 = new tela_cadastro_civil();
      objeto2.setVisible(true);
    // TODO add your handling code here:
    }//GEN-LAST:event_btn_add_civilActionPerformed

    private void menu_decimaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_menu_decimaAncestorAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_menu_decimaAncestorAdded

    private void tela_cadastro_civilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tela_cadastro_civilMouseClicked

        tela_consulta_daddos.this.dispose();
        tela_cadastro_civil objeto = new tela_cadastro_civil();
        objeto.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_tela_cadastro_civilMouseClicked

    private void label_img_consulta_brancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_img_consulta_brancoMouseClicked

          tela_consulta_daddos.this.dispose();
        tela_consulta_daddos objeto = new tela_consulta_daddos();
        objeto.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_label_img_consulta_brancoMouseClicked

    private void label_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_sairMouseClicked

        JOptionPane.showMessageDialog(null, "Você saiu do sistema!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        // TODO add your handling code here:
    }//GEN-LAST:event_label_sairMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

      tela_consulta_daddos.this.dispose();
      tela_dashbord objeto2 = new tela_dashbord();
      objeto2.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisaActionPerformed

                        this.PopularJTable("SELECT * FROM cadastro_civil");
                    
                    

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pesquisaActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed

      this.PopularJTable("SELECT * FROM cadastro_civil");
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(tela_consulta_daddos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_consulta_daddos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_consulta_daddos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_consulta_daddos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_consulta_daddos().setVisible(true);
            }
        });
        
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_civil;
    private javax.swing.JButton btn_pesquisa;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_cadastro_civil;
    private javax.swing.JLabel label_filtro_bairro;
    private javax.swing.JLabel label_filtro_nome;
    private javax.swing.JLabel label_filtro_tipo_def;
    private javax.swing.JLabel label_img_consulta_branco;
    private javax.swing.JLabel label_img_consulta_preto;
    private javax.swing.JLabel label_sair;
    private javax.swing.JPanel menu_decima;
    private javax.swing.JPanel menu_lateral;
    private javax.swing.JTable tbl_users;
    private javax.swing.JLabel tela_cadastro_civil;
    private javax.swing.JTextField tx_filtro_bairro;
    private javax.swing.JTextField tx_filtro_nome;
    private javax.swing.JTextField tx_filtro_tipo_def;
    // End of variables declaration//GEN-END:variables
}
