/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_tecnightsenai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author lahra
 */
public class tela_login extends javax.swing.JFrame {

    /**
     * Creates new form tela_login
     */
    public tela_login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_login_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_login_senha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1363, 6, -1, 622));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E-mail:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));
        getContentPane().add(txt_login_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 350, 34));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, -1, -1));
        getContentPane().add(txt_login_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 350, 34));

        jButton1.setBackground(new java.awt.Color(143, 198, 144));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Novo Funcionario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 20, -1, -1));

        btn_login.setBackground(new java.awt.Color(27, 202, 63));
        btn_login.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Entrar");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 630, -1, -1));

        jButton2.setText("Esqueci minha senha");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 700, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lsnunes\\Documents\\GitHub\\TecNight_SistemaCadastro_PCD\\Projeto_TecNightSenai\\src\\main\\java\\icones\\BACKGROUND_LOGIN.png")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(2000, 1500));
        jLabel2.setMinimumSize(new java.awt.Dimension(2000, 1500));
        jLabel2.setPreferredSize(new java.awt.Dimension(2000, 1500));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 960));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 6, 1520, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      tela_login.this.dispose();
      tela_novo_cadastro objeto2 = new tela_novo_cadastro();
      objeto2.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
   
        
        try{
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projeto_AcessaMais","root","admin");
            
         
            
            String email = txt_login_email.getText();
            String senha = txt_login_senha.getText();
            
            Statement stm = con.createStatement();
            
           String sql = "SELECT * FROM usuario WHERE email_usuario= ? AND senha_usuario= ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                dispose();
              tela_cadastro_civil cad = new tela_cadastro_civil();
              cad.show();
            }else{
                JOptionPane.showMessageDialog(this, "E-mail ou senha incorretos");
                txt_login_email.setText("");
                txt_login_senha.setText("");
            }
            
            con.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    // JPasswordField senhaField = new JPasswordField();

      
      //  int option = JOptionPane.showConfirmDialog(null, senhaField, "Atualize sua senha!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

       
    //    if (option == JOptionPane.OK_OPTION) {
        //    tela_login.this.dispose();
         //   tela_cadastro_civil objeto2 = new tela_cadastro_civil();
          //  objeto2.setVisible(true);
                 // TODO add your handling code here:
    }//GEN-LAST:event_btn_loginActionPerformed
    //}
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
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_login_email;
    private javax.swing.JPasswordField txt_login_senha;
    // End of variables declaration//GEN-END:variables
}
