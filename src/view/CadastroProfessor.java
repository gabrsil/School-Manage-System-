/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CadastroController;
import controller.CadastroControllerPg;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.text.MaskFormatter;
import model.beans.Aluno;
import model.beans.Pessoa;
import model.dao.AlunoDao;

/**
 *
 * @author Gabriel 2
 */
public final class CadastroProfessor extends javax.swing.JFrame {
    
    Boolean keyPres = false;
    BufferedImage imagem;

    /**
     * Creates new form CadastroAluno
     */
    public CadastroProfessor() {
        initComponents();
        
   
        initComps();
        getContentPane().setBackground(new Color(40,40,40));
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileCho = new javax.swing.JPanel();
        fileCho.setVisible(false);
        fileChol = new javax.swing.JFileChooser();
        fileChol.setVisible(false);
        MatriculaLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SexoLabel = new javax.swing.JLabel();
        NascLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NomeLabel = new javax.swing.JLabel();
        SerieLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CadLabel = new javax.swing.JLabel();
        DiscLabel = new javax.swing.JLabel();
        monthCB = new javax.swing.JComboBox<>();
        dayCB = new javax.swing.JComboBox<>();
        yearCB = new javax.swing.JComboBox<>();
        CadastroCpf = new javax.swing.JFormattedTextField();
        CadastroMatricula = new javax.swing.JTextField();
        CadastroNome = new javax.swing.JTextField();
        CadastroCad = new javax.swing.JTextField();
        CadastroDisciplina = new javax.swing.JTextField();
        serieComboBox = new javax.swing.JComboBox();
        vinculComboBox = new javax.swing.JComboBox();
        sexoComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        labelImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        fileCho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fileChol.setApproveButtonText("Selecionar");
        fileChol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileCholActionPerformed(evt);
            }
        });
        fileCho.add(fileChol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 510, 350));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisEcola Versão BETA ");
        setPreferredSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MatriculaLabel.setFont(new java.awt.Font("Nexa Bold", 1, 15)); // NOI18N
        MatriculaLabel.setForeground(new java.awt.Color(153, 153, 153));
        MatriculaLabel.setText("Matricula");
        getContentPane().add(MatriculaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 302, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nexa Bold", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Vínculo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 295, -1, -1));

        SexoLabel.setFont(new java.awt.Font("Nexa Bold", 1, 15)); // NOI18N
        SexoLabel.setForeground(new java.awt.Color(153, 153, 153));
        SexoLabel.setText("Sexo");
        getContentPane().add(SexoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 235, -1, -1));

        NascLabel.setFont(new java.awt.Font("Nexa Bold", 1, 15)); // NOI18N
        NascLabel.setForeground(new java.awt.Color(153, 153, 153));
        NascLabel.setText("Data de Nascimento");
        getContentPane().add(NascLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 175, -1, -1));

        jLabel6.setFont(new java.awt.Font("Nexa Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Foto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        NomeLabel.setFont(new java.awt.Font("Nexa Bold", 1, 15)); // NOI18N
        NomeLabel.setForeground(new java.awt.Color(153, 153, 153));
        NomeLabel.setText("Nome");
        getContentPane().add(NomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 175, -1, -1));

        SerieLabel.setFont(new java.awt.Font("Nexa Bold", 1, 15)); // NOI18N
        SerieLabel.setForeground(new java.awt.Color(153, 153, 153));
        SerieLabel.setText("Série");
        getContentPane().add(SerieLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Nexa Bold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("CPF");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 235, -1, -1));

        CadLabel.setFont(new java.awt.Font("Nexa Bold", 1, 15)); // NOI18N
        CadLabel.setForeground(new java.awt.Color(153, 153, 153));
        CadLabel.setText("Cad");
        getContentPane().add(CadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        DiscLabel.setFont(new java.awt.Font("Nexa Bold", 1, 15)); // NOI18N
        DiscLabel.setForeground(new java.awt.Color(153, 153, 153));
        DiscLabel.setText("Disciplina");
        DiscLabel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(DiscLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 360, -1, -1));

        monthCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        getContentPane().add(monthCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 200, 50, 27));

        dayCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        dayCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayCBActionPerformed(evt);
            }
        });
        getContentPane().add(dayCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 50, 27));

        yearCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));
        getContentPane().add(yearCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 200, 60, 27));

        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            CadastroCpf = new javax.swing.JFormattedTextField(cpf);

        }
        catch (Exception e){
        }
        CadastroCpf.setBackground(new java.awt.Color(81, 81, 81));
        CadastroCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CadastroCpf.setForeground(new java.awt.Color(156, 156, 156));
        CadastroCpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        getContentPane().add(CadastroCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 160, 30));

        CadastroMatricula.setBackground(new java.awt.Color(81, 81, 81));
        CadastroMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CadastroMatricula.setForeground(new java.awt.Color(156, 156, 156));
        CadastroMatricula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        CadastroMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 160, 30));

        CadastroNome.setBackground(new java.awt.Color(81, 81, 81));
        CadastroNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CadastroNome.setForeground(new java.awt.Color(153, 153, 153));
        CadastroNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        CadastroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroNomeActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 160, 30));

        CadastroCad.setBackground(new java.awt.Color(81, 81, 81));
        CadastroCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        CadastroCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroCadActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 160, 27));

        CadastroDisciplina.setBackground(new java.awt.Color(81, 81, 81));
        CadastroDisciplina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CadastroDisciplina.setForeground(new java.awt.Color(156, 156, 156));
        CadastroDisciplina.setToolTipText("");
        CadastroDisciplina.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        CadastroDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroDisciplinaActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 390, 160, 30));

        serieComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "1", "2", "3" }));
        serieComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serieComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(serieComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 390, 90, 27));

        vinculComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Aluno", "Professor", "Direção" }));
        vinculComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vinculComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(vinculComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 320, 90, 27));

        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "M", "F" }));
        sexoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(sexoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 260, 90, 27));
        //sexoComboBox.setRenderer(new CBRenderer());

        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Cadastrar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 130, 30));
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);

        jButton1.setBackground(new Color(40,40,40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Selecionar arquivo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);

        jButton2.setBackground(new Color(40,40,40));
        getContentPane().add(labelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jMenuBar1.setBorder(null);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(60, 28));

        jMenu1.setText("File");

        jMenuItem2.setText("Consultar Cadastros");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(613, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroMatriculaActionPerformed

    private void CadastroCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroCadActionPerformed

    private void CadastroDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroDisciplinaActionPerformed

    private void serieComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serieComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serieComboBoxActionPerformed

    private void vinculComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vinculComboBoxActionPerformed

        // TODO add your handling code here:
        
        
        String aluno = "Aluno";
        String professor = "Professor";
         String direcao = "Direção";
         
             if(vinculComboBox.getSelectedItem().equals(direcao) ){
                 
                   CadastroMatricula.setEnabled(false);
            serieComboBox.setEnabled(false);
            sexoComboBox.setEnabled(false);
           CadastroNome.setEnabled(false);
           CadastroCpf.setEnabled(false);
         dayCB.setEnabled(false);
            monthCB.setEnabled(false);
            yearCB.setEnabled(false);
            CadastroCad.setEnabled(false);
            CadastroDisciplina.setEnabled(false);
     
                 
                 
                 
             }
        
        
        
        
       
        if(vinculComboBox.getSelectedItem() == aluno ){
            
            CadastroMatricula.setVisible(true);
            serieComboBox.setVisible(true);
            MatriculaLabel.setVisible(true);
            SerieLabel.setVisible(true);
            
            CadastroCad.setVisible(false);
            CadastroDisciplina.setVisible(false);
            CadLabel.setVisible(false);
            DiscLabel.setVisible(false);
        }
        
        else if(vinculComboBox.getSelectedItem() == professor){
            
            CadastroMatricula.setVisible(false);
            serieComboBox.setVisible(false);
            MatriculaLabel.setVisible(false);
            SerieLabel.setVisible(false);
            
            CadastroCad.setVisible(true);
            CadastroDisciplina.setVisible(true);
            CadLabel.setVisible(true);
            DiscLabel.setVisible(true);
            
        }
        
        if(vinculComboBox.getSelectedIndex() == 0){
            
             CadastroMatricula.setVisible(false);
            serieComboBox.setVisible(false);
            MatriculaLabel.setVisible(false);
            SerieLabel.setVisible(false);
            
            CadastroCad.setVisible(false);
            CadastroDisciplina.setVisible(false);
            CadLabel.setVisible(false);
            DiscLabel.setVisible(false);
            
            
            
        }
       
      
            
        
       
        
    }//GEN-LAST:event_vinculComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          /*Aluno p =  new Aluno();
         AlunoDao dao = new AlunoDao();
           p.setName(CadastroNome.getText());
           p.setSexo(sexoComboBox.getSelectedItem()+"");
           p.setVinculo(vinculComboBox.getSelectedItem()+"");
            p.setSerie(Integer.parseInt(serieComboBox.getSelectedItem()+""));
             p.setNascimento(CadastroNasc.getText());
             p.setNacionalidade((String) CadastroNacionalidade.getText());
          p.setMatricula(CadastroMatricula.getText());
            try {
                dao.create(p);
        } catch (Exception ex) {
            Logger.getLogger(CadastroProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }*/
          
           int zero = 0;
            if (vinculComboBox.getSelectedIndex() == zero || dayCB.getSelectedIndex() == zero || sexoComboBox.getSelectedIndex() == zero || "".equals(CadastroNome.getText())){
                
                JOptionPane.showMessageDialog(null, "Prencha todos os campos");
                
            }
       
            else{
            CadastroControllerPg cad = new CadastroControllerPg();
            
            if(vinculComboBox.getSelectedItem().equals("Professor")){
                
                cad.cadastrarProf(this);
                
            }
            else if(vinculComboBox.getSelectedItem().equals("Aluno")){
            
                
            cad.cadastrarAluno(this, imagem);
            
            }
            }
           // || serieComboBox.setSelectedIndex() == 0
            
          
    
    

        
       
        
        
            
            
            
        
    
          
          
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
         Consulta tela = null;
        try {
            tela = new Consulta();
        } catch (Exception ex) {
            Logger.getLogger(CadastroProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
             tela.setVisible(true);//chama outra tela
             
             dispose();//fecha a tela atual
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        Login login = new Login();
        login.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void sexoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoComboBoxActionPerformed

    private void dayCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayCBActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        Color oldColor = jButton1.getBackground();
       
        
                
                 jButton1.setBackground(new Color(110,110,110));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
         Color oldColor = new Color(40,40,40);
                //só inserir aqui o código
                 jButton1.setBackground(oldColor);
    }//GEN-LAST:event_jButton1MouseExited

    private void CadastroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroNomeActionPerformed

    private void fileCholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileCholActionPerformed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_fileCholActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
            Color oldColor = jButton2.getBackground();
       
        
                
                 jButton2.setBackground(new Color(110,110,110));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
              Color oldColor = new Color(40,40,40);
                //só inserir aqui o código
                 jButton2.setBackground(oldColor);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    
       
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         /*  Filechoser tela = new Filechoser();
       tela.setVisible(true);
       this.setEnabled(false);*/
         
         JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);
        
        if(res == JFileChooser.APPROVE_OPTION){
            
            File arquivo = fc.getSelectedFile();
                 try {
                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(),86, 83);

                labelImg.setIcon(new ImageIcon(imagem));

            } catch (Exception ex) {
               // System.out.println(ex.printStackTrace().toString());
            }
            
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Você não selecionou um arquivo");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProfessor().setVisible(true);
            }
        });
        
        
        
        
        
        
        
        
        
        
    }
    

private final javax.swing.JFormattedTextField tft2 = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));

    


    
    public final void initComps(){
             CadastroMatricula.setVisible(false);
            serieComboBox.setVisible(false);
            MatriculaLabel.setVisible(false);
            SerieLabel.setVisible(false);
     
            CadastroCad.setVisible(false);
            CadastroDisciplina.setVisible(false);
            CadLabel.setVisible(false);
            DiscLabel.setVisible(false);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CadLabel;
    private javax.swing.JTextField CadastroCad;
    private javax.swing.JTextField CadastroCpf;
    private javax.swing.JTextField CadastroDisciplina;
    private javax.swing.JTextField CadastroMatricula;
    private javax.swing.JTextField CadastroNome;
    private javax.swing.JLabel DiscLabel;
    private javax.swing.JLabel MatriculaLabel;
    private javax.swing.JLabel NascLabel;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JLabel SerieLabel;
    private javax.swing.JLabel SexoLabel;
    private javax.swing.JComboBox<String> dayCB;
    private javax.swing.JPanel fileCho;
    private javax.swing.JFileChooser fileChol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel labelImg;
    private javax.swing.JComboBox<String> monthCB;
    private javax.swing.JComboBox serieComboBox;
    private javax.swing.JComboBox sexoComboBox;
    private javax.swing.JComboBox vinculComboBox;
    private javax.swing.JComboBox<String> yearCB;
    // End of variables declaration//GEN-END:variables



    
    public JLabel getCadLabel() {
        return CadLabel;
    }

    public JTextField getCadastroCad() {
        return CadastroCad;
    }

    public JTextField getCadastroDisciplina() {
        return CadastroDisciplina;
    }

    public JTextField getCadastroMatricula() {
        return CadastroMatricula;
    }

    public JTextField getCadastroCpf() {
        return CadastroCpf;
    }



    public JTextField getCadastroNome() {
        return CadastroNome;
    }

    public JComboBox getSerieComboBox() {
        return serieComboBox;
    }

    public JComboBox getSexoComboBox() {
        return sexoComboBox;
    }

    public JComboBox getVinculComboBox() {
        return vinculComboBox;
    }

    public JComboBox<String> getDayCB() {
        return dayCB;
    }

    public JComboBox<String> getMonthCB() {
        return monthCB;
    }

    public JComboBox<String> getYearCB() {
        return yearCB;
    }
    
    
    
    
    
    
     public void limparTelaAluno(){
        
        CadastroNome.setText("");
      sexoComboBox.setSelectedIndex(0);
       vinculComboBox.setSelectedIndex(0);
       serieComboBox.setSelectedIndex(0);
       dayCB.setSelectedIndex(0);
       monthCB.setSelectedIndex(0);
       yearCB.setSelectedIndex(0);
       CadastroCpf.setText("");
        CadastroMatricula.setText("");
        labelImg.setIcon(null);
    }
    
    public MaskFormatter Mascara(String Mascara){
        
  
             MaskFormatter F_Mascara = new MaskFormatter();
        
     
        
   
        try{
            F_Mascara.setMask(Mascara); //Atribui a mascara
            F_Mascara.setPlaceholderCharacter(' '); //Caracter para preencimento 
        }
        catch (Exception excecao) {
        excecao.printStackTrace();
        } 
        
        
        
        return F_Mascara;
        
        
        
        
 }
    
    
    
    
    


}






