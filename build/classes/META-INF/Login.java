/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.ConnectionFactory;
import controller.LoginControlller;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import model.beans.Usuario;
import model.dao.UserDao;
import model.dao.UserDaoPg;



/**
 *
 * @author Gabriel 2
 */
public class Login extends javax.swing.JFrame {
    
   

    private final LoginControlller controller;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        controller = new LoginControlller(this);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textUsuario = new javax.swing.JTextField();
        textSenha = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisEcola Versão BETA ");
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 200, 30));

        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });
        textSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(textSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 200, 30));

        jButton2.setText("Entrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setMaximumSize(new java.awt.Dimension(51, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(51, 14));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 341, -1, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuário");
        jLabel4.setAlignmentX(0.5F);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 240, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/fonts/FONTT.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 660));

        setSize(new java.awt.Dimension(704, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

     UserDaoPg udao = new UserDaoPg();
    boolean result =  udao.verifyLogin(textUsuario, textSenha);
        
        if (result == true){
            
              JOptionPane.showMessageDialog(null, "Login successful");
            CadastroProfessor tela = new CadastroProfessor();
            tela.setVisible(true);
            dispose();
        }
        else{
            
          JOptionPane.showMessageDialog(null, "Senha ou Usuário invalido");
          textUsuario.setText("");
            textSenha.setText("");
        }
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSenhaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
      UserDaoPg udao = new UserDaoPg();
    boolean result =  udao.verifyLogin(textUsuario, textSenha);
        
        if (result == true){
            JOptionPane.showMessageDialog(null, "Login successful");
            CadastroProfessor tela = new CadastroProfessor();
            tela.setVisible(true);
            
            dispose();
            
        }
        else{
            
          JOptionPane.showMessageDialog(null, "Senha ou Usuário invalido");
          textUsuario.setText("");
            textSenha.setText("");
        }

        }
        
    }//GEN-LAST:event_textSenhaKeyPressed

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaActionPerformed

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
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
   /* public void verificaUser(){
        
        UserDao udao = new UserDao();
        
        
        
             if(textUsuario.getText().equals(udao.verifyLogin()) && textSenha.getText().equals(udao.verifySenha())){
            
            
            CadastroProfessor tela = new CadastroProfessor();
             tela.setVisible(true);//chama outra tela
             
             dispose();//fecha a tela atual
        }
        else{
            
            JOptionPane.showMessageDialog(rootPane, "Acesso negado!");
        }
   
    }*/

    public JPasswordField getTextSenha() {
        return textSenha;
    }

    public JTextField getTextUsuario() {
        return textUsuario;
    }

  
    
    
    
    
}
