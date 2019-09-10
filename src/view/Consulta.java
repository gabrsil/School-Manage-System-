/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.beans.Aluno;
import model.dao.AlunoDao;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import model.beans.Pessoa;
import model.beans.Professor;
import model.dao.AlunoDaoPg;
import model.dao.ProfessorDaoPg;

/**
 *
 * @author gabri
 */
public class Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Consulta
     */
    
    int keyp = 0;
    public Consulta() throws Exception {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        getContentPane().setBackground(new Color(40,40,40));
        alinhaTableCentro(jTable1, jTable1.getSelectedRows());
        
    
        

                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchTex = new javax.swing.JTextField();
        labelImg = new javax.swing.JLabel();
        showButton = new javax.swing.JButton();
        searchButton1 = new javax.swing.JButton();
        deleteIco = new javax.swing.JButton();
        refreshIco = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisEcola Versão BETA ");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 800, 800));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 800));

        jScrollPane1.setBackground(new java.awt.Color(40, 40, 40));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setRequestFocusEnabled(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(40, 40, 40));
        jTable1.setSelectionBackground(new java.awt.Color(94, 94, 94));
        jTable1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID", "Nome", "Data de Nascimento", "Sexo", "Cpf", "Vínculo", "Matricula", "Série", "Disciplina", "Cad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAlignmentX(1.0F);
        jTable1.setAlignmentY(1.0F);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionBackground(new java.awt.Color(94, 94, 94));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTable1MouseMoved(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(25,25,25));
        headerRenderer.setForeground(Color.white);
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);

        }

        int maxHeaderHeight = 30;
        Dimension d = new Dimension(jTable1.getTableHeader().getPreferredSize().width, maxHeaderHeight);
        jTable1.getTableHeader().setPreferredSize(d);

        TableCellRenderer baseRenderer = jTable1.getTableHeader().getDefaultRenderer();
        jTable1.getTableHeader().setDefaultRenderer(new TableHeaderRenderer(baseRenderer));
        jTable1.setShowGrid(true);

        jTable1.setAlignmentX(50);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jTable1.setRowSelectionAllowed(true);
        alinhaTableCentro(jTable1, jTable1.getSelectedColumns());

        CellRenderer cell = new CellRenderer();
        //cell.getTableCellRendererComponent(jTable1, jTable1.getModel(), jTable1.isColumnSelected(i), hasFocus, row, column);

        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {

            cell.getTableCellRendererComponent(jTable1, jTable1.getModel(), jTable1.isCellSelected(i, 0), jTable1.hasFocus(), jTable1.getRowCount(), jTable1.getColumnCount());
            jTable1.getColumnModel().getColumn(i).setCellRenderer(cell);

        }

        searchTex.setBackground(new java.awt.Color(102, 102, 102));
        searchTex.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        searchTex.setForeground(new java.awt.Color(153, 153, 153));
        searchTex.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchTex.setText("Digite algum nome");
        searchTex.setBorder(null);
        searchTex.setName(""); // NOI18N
        searchTex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTexMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchTexMouseEntered(evt);
            }
        });
        searchTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTexActionPerformed(evt);
            }
        });
        searchTex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTexKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTexKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchTexKeyTyped(evt);
            }
        });

        labelImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        showButton.setBackground(new java.awt.Color(255, 255, 255));
        showButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        showButton.setForeground(new java.awt.Color(153, 153, 153));
        showButton.setText("Mostrar Todos");
        showButton.setBorder(null);
        showButton.setBorderPainted(false);
        showButton.setFocusPainted(false);
        showButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showButtonMouseExited(evt);
            }
        });
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        searchButton1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        searchButton1.setForeground(new java.awt.Color(153, 153, 153));
        searchButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Seaarch.png"))); // NOI18N
        searchButton1.setText("Pesquisar");
        searchButton1.setBorderPainted(false);
        searchButton1.setFocusPainted(false);
        searchButton1.setMargin(new java.awt.Insets(2, -1, 2, 20));
        searchButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchButton1MouseExited(evt);
            }
        });
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });

        deleteIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Webp.net-resizeimage (2).png"))); // NOI18N
        deleteIco.setFocusPainted(false);
        deleteIco.setMargin(new java.awt.Insets(4, 14, 4, 14));
        deleteIco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteIcoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteIcoMouseExited(evt);
            }
        });
        deleteIco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteIcoActionPerformed(evt);
            }
        });

        refreshIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Webp.net-resizeimage.png"))); // NOI18N
        refreshIco.setFocusPainted(false);
        refreshIco.setMargin(new java.awt.Insets(4, 14, 4, 14));
        refreshIco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshIcoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshIcoMouseExited(evt);
            }
        });
        refreshIco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshIcoActionPerformed(evt);
            }
        });

        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 28));

        jMenu1.setText("File");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(searchButton1)
                        .addGap(18, 18, 18)
                        .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                        .addComponent(refreshIco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteIco, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(searchTex)
                        .addGap(15, 15, 15)))
                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(searchTex, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deleteIco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshIco, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
        );

        jScrollPane1.getViewport().setBackground(new Color(40,40,40));
        showButton.setContentAreaFilled(false);
        showButton.setOpaque(true);

        showButton.setBackground(new Color(60,60,60));
        searchButton1.setContentAreaFilled(false);
        searchButton1.setOpaque(true);

        searchButton1.setBackground(new Color(60,60,60));
        deleteIco.setContentAreaFilled(false);
        deleteIco.setOpaque(true);
        deleteIco.setBackground(new Color(40,40,40));
        refreshIco.setContentAreaFilled(false);
        refreshIco.setOpaque(true);
        refreshIco.setBackground(new Color(40,40,40));

        setSize(new java.awt.Dimension(837, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
         Login tela = new Login();
             tela.setVisible(true);//chama outra tela
             
             dispose();//fecha a tela atual
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void searchTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTexActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        // TODO add your handling code here:
         DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
           modelo.setRowCount(0);
        readJtablePg();
        
     
          
       
        
    }//GEN-LAST:event_showButtonActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        // TODO add your handling code here:
        
              DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
         modelo.setRowCount(0);
      
      if(searchTex.getText().equals("")){
          
          
          
      }
      else{

                  try {
                      searchJtablePg(searchTex.getText());
                  } catch (Exception ex) {
                      JOptionPane.showMessageDialog(null, "ERRO");
                  }
        
      }
      searchTex.setText("");
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void searchButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButton1MouseEntered

         Color oldColor = searchButton1.getBackground();
       
        
                
                 searchButton1.setBackground(new Color(120,120,120));
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButton1MouseEntered

    private void searchButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButton1MouseExited
        // TODO add your handling code here:
           Color oldColor = new Color(54,54,54);
                //só inserir aqui o código
                 searchButton1.setBackground(oldColor);
     
    }//GEN-LAST:event_searchButton1MouseExited

    private void showButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showButtonMouseEntered
        // TODO add your handling code here:
            Color oldColor = showButton.getBackground();
       
        
                
                 showButton.setBackground(new Color(120,120,120));
    }//GEN-LAST:event_showButtonMouseEntered

    private void showButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showButtonMouseExited
        // TODO add your handling code here:
      Color oldColor = new Color(54,54,54);
                //só inserir aqui o código
                 showButton.setBackground(oldColor);
    }//GEN-LAST:event_showButtonMouseExited

    private void searchTexMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTexMouseEntered
        // TODO add your handling code here:
        
   
        
    }//GEN-LAST:event_searchTexMouseEntered

    private void searchTexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTexMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTexMouseClicked

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
 
    }//GEN-LAST:event_jTable1AncestorAdded

    private void deleteIcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteIcoMouseEntered
        // TODO add your handling code here:
         deleteIco.setBackground(new Color(55,55,55));
        
    }//GEN-LAST:event_deleteIcoMouseEntered

    private void deleteIcoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteIcoMouseExited
        // TODO add your handling code here:
        Color oldColor = new Color(40,40,40);
                //só inserir aqui o código
                deleteIco.setBackground(oldColor);
    }//GEN-LAST:event_deleteIcoMouseExited

    private void searchTexKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTexKeyPressed
        // TODO add your handling code here:
      if(keyp == 0){
          
          searchTex.setText("");
          keyp++;
      }
        
    }//GEN-LAST:event_searchTexKeyPressed

    private void searchTexKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTexKeyReleased
        // TODO add your handling code here
       
    }//GEN-LAST:event_searchTexKeyReleased

    private void searchTexKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTexKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_searchTexKeyTyped

    private void deleteIcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteIcoActionPerformed
        // TODO add your handling code here:
      
         
        AlunoDaoPg adao = new AlunoDaoPg();
        ProfessorDaoPg pdao = new ProfessorDaoPg();
          Aluno p = new Aluno();
          Professor pro = new Professor();
        if(jTable1.getSelectedRow() != -1 ){
            
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 5).equals("Aluno")){
          
            p.setName((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1));
          /*  p.setName((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1));
            p.setNascimento((String) jTable1.getValueAt(jTable1.getSelectedRow(), 2));
             p.setSexo((String) jTable1.getValueAt(jTable1.getSelectedRow(), 3));
            p.setCpf((String) jTable1.getValueAt(jTable1.getSelectedRow(), 4));
           p.setVinculo((String) jTable1.getValueAt(jTable1.getSelectedRow(), 5));*/
             try {
                 adao.delete(p);
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro");
             }
            }
             if(jTable1.getValueAt(jTable1.getSelectedRow(), 5).equals("Professor")){
                 
             pro.setName((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1));
                     try {
                 pdao.delete(pro);
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro");
             }
                 
             }
             
             
             
            
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Selecione um aluno para excluir");
            
        }
         DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
           modelo.setRowCount(0);
        readJtablePg();
              labelImg.setIcon(null);
        //adao.delete(jTable1.getsele);
        
    }//GEN-LAST:event_deleteIcoActionPerformed

    private void refreshIcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshIcoMouseEntered
        // TODO add your handling code here:
          refreshIco.setBackground(new Color(55,55,55));
    }//GEN-LAST:event_refreshIcoMouseEntered

    private void refreshIcoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshIcoMouseExited
        // TODO add your handling code here:
            // TODO add your handling code here:
        Color oldColor = new Color(40,40,40);
                //só inserir aqui o código
                refreshIco.setBackground(oldColor);
        
    }//GEN-LAST:event_refreshIcoMouseExited

    private void refreshIcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshIcoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
           modelo.setRowCount(0);
        readJtablePg();
         searchTex.setText("");
         labelImg.setIcon(null);
    }//GEN-LAST:event_refreshIcoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        CadastroProfessor tela = new CadastroProfessor();
        tela.setVisible(true);//chama outra tela

        dispose();//fecha a tela atual
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            // TODO add your handling code here:
      
        } catch (Exception ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
     
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseMoved
        try {
            // TODO add your handling code here:
     
        } catch (Exception ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseMoved

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
               try {
            // TODO add your handling code here:
            exibeImg();
        } catch (Exception ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MousePressed

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Consulta().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteIco;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelImg;
    private javax.swing.JButton refreshIco;
    private javax.swing.JButton searchButton1;
    private javax.swing.JTextField searchTex;
    private javax.swing.JButton showButton;
    // End of variables declaration//GEN-END:variables


 public void readJtablePg(){
        
         
         DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
         
        
         
        AlunoDaoPg adao = new AlunoDaoPg();
        ProfessorDaoPg pdao = new ProfessorDaoPg();




        for(Aluno a: adao.read()){
            
           
           
     
            modelo.addRow(new Object[]{
                

                
                a.getId(),
               a.getName(),
                a.getNascimento(),
                 a.getSexo(),
                 a.getCpf(),
                 a.getVinculo(),
                 
                 a.getMatricula(),
                 a.getSerie(),
                 ("--"),
                 ("--"),
              
            } );
        
            
            }
             for(Professor a: pdao.read()){
            
           
           
     
            modelo.addRow(new Object[]{
                

                
                a.getId(),
               a.getName(),
                a.getNascimento(),
                 a.getSexo(),
                 a.getCpf(),
                 a.getVinculo(),
                 ("--"),
                 ("--"),
                 a.getDisciplina(),
                 a.getCad(),
              
            } );
            
            
            
            
            }
             
        
        

        }
 public void exibeImg() throws Exception{
     
        if(jTable1.getSelectedRow() != -1){
         

            
                
          //  ManipularImagem.exibirImagemLabel(a.getImg(), labelImg);
          AlunoDaoPg pdao = new AlunoDaoPg();
       byte[] resu;
       resu = pdao.searchimg((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1));
            
             ManipularImagem.exibirImagemLabel(resu, labelImg);
  
              
             
             
            
            
        }

     
     
     
     
     
 }

    
    
 
  
  public void searchJtablePg(String search) throws Exception{
        
         DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
         
        
         
         
         
        AlunoDaoPg adao = new AlunoDaoPg();
        ProfessorDaoPg pdao = new ProfessorDaoPg();
         
        for(Aluno al: adao.search(search)){
            
      
                
            modelo.addRow(new Object[]{
                
                al.getId(),
                al.getName(),
                al.getNascimento(),
                 al.getSexo(),
                 al.getCpf(),
                 al.getVinculo(),
                 al.getMatricula(),
                 al.getSerie(),
                  ("--"),
                 ("--"),
                 
                 
                
            } );

            }
        
         for(Professor al: pdao.search(search)){
            
           // Pessoa p = (Pessoa) a;
            
     
             
           //     Professor al = (Professor) p;
                
            modelo.addRow(new Object[]{
                
                al.getId(),
                al.getName(),
                al.getNascimento(),
                 al.getSexo(),
                 al.getCpf(),
                 al.getVinculo(),
                  ("--"),
                 ("--"),
                 al.getDisciplina(),
                 al.getCad(),
                 
                 
                
            } );

            }
    
            
        }
        
    public static void alinhaTableCentro(JTable table, int[] posicoesDireita) {

	DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
	cellRender.setHorizontalAlignment(SwingConstants.CENTER);

	for (int numCol = 0; numCol < table.getColumnCount(); numCol++) {

		for (int i = 0; i < posicoesDireita.length; i++) {

			if (numCol == posicoesDireita[i]) {

				table.getColumnModel().getColumn(numCol).setCellRenderer(
						cellRender);
			}
		}
	}
}
    
    
    
    
    
    
    
    }

    
    
    
