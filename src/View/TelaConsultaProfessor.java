/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Daniel Lacerda
 * @author João Victor Moura
 */
public class TelaConsultaProfessor extends javax.swing.JInternalFrame {
    
    TableRowSorter tb;
    
    String barra = File.separator;
    String local = System.getProperty("user.dir") + barra + "Dados_Professor"+barra;
    String local2 = System.getProperty("user.dir") + barra + "Relatorio_Professor"+barra;
    
    File pasta = new File(local);
    File [] registros = pasta.listFiles();
    
     String [] colunas = {"Codigo","Nome","Salario"};
     DefaultTableModel dtm = new DefaultTableModel (null,colunas){
        @Override
        public boolean isCellEditable(int row, int column) {
               return false;
        }
     };
 
    public TelaConsultaProfessor() {
        initComponents();
        DadosTabela();
       
    }
     
    public void DadosTabela(){

        for(int i = 0; i < registros.length; i++){
            
            File url = new File(local+registros[i].getName());
        try{
            FileInputStream fis = new FileInputStream(url);
            Properties mostrar = new Properties();
            mostrar.load(fis);
                  
            String linhas [] = { registros[i].getName().replace(".txt",""),
                 mostrar.getProperty("Nome"),
                 mostrar.getProperty("Salario")
            
            };
            
                dtm.addRow(linhas);
        
            }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro");
            }  
          
        
        }//FIM FOR 
        
        JTProfessor.setModel(dtm);
        
    }    
    
    public void Registro(){
            String arquivo = tfRelatorio.getText()+".txt";
            File criar_local = new File(local2);
            File criar_arquivo = new File(local2+arquivo);
        
        if(tfRelatorio.getText().equals("")||tfRelatorio.getText().equals("null")){ 
            JOptionPane.showMessageDialog(null, "Dados inválidos ou em Branco, por favor, tente novamente.");
        }else{ 
 
        if(criar_arquivo.exists()){
            JOptionPane.showMessageDialog(rootPane, "Já existe um Relatório com esse Nome(a) \n"
                    +"  -Relatorio: "+tfRelatorio.getText());
            }else
                {
                try{
                    criar_local.mkdirs();
                                        
                    for(int i = 0; i < JTProfessor.getRowCount(); i++){
            
                        File url = new File(local+registros[i].getName());
        
                        try{
                            FileInputStream fis = new FileInputStream(url);
                            Properties mostrar = new Properties();
                            mostrar.load(fis);
                                    
                                    FileWriter fw = new FileWriter(criar_arquivo, true);
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    bw.write("\n_______DADOS DO PROFESSOR______\n\r"+
                                    "\r\n Codigo: "+JTProfessor.getValueAt(i, 0)+"\n"+
                                    "\r\n Nome: "+JTProfessor.getValueAt(i, 1)+"\n\r"+
                                    "\r\n Salario: "+JTProfessor.getValueAt(i, 2)+"\n\r");
                                    bw.newLine();
                                    bw.close();
                                    fw.close();
                                    
                                    

                            }catch (Exception e) {
                            JOptionPane.showMessageDialog(rootPane, "Não foi Possivel adicionar >>"+dtm.getDataVector().elementAt(i)+"<<no Arquivo");
                            }
                    }//fim for
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(rootPane, "Não foi Possivel Criar Arquivo2");
                    }
                }
            }
       
       JOptionPane.showMessageDialog(rootPane, "Relatório Gerado! ");
       }  
    
    public void Excluir(){
      
        File url = new File(local+tfFiltro.getText()+".txt");
        
        String btn [] = {"Excluir","Cancelar"};
        
        if(tfFiltro.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Indique o Codigo do Funcionario(a) para Excluir");
        }else{
            if(url.exists()){
            try{
                FileInputStream fechar = new FileInputStream(url);
                fechar.close();
                System.gc();
                int verificaEx = JOptionPane.showOptionDialog(rootPane,
                        "Deseja Realmente excluir esse Registro: \n"+
                                "  -Codigo: "+tfFiltro.getText(),
                        "Excluir", 0, 0, null, btn, null);
                
                if(verificaEx == JOptionPane.YES_OPTION){
                   url.delete();
                   JOptionPane.showMessageDialog(rootPane, "Registro Excluido");
               
                } else
                    if(verificaEx == JOptionPane.NO_OPTION){
                
                }
                
                
            }catch(Exception e)  {
            
            }  
            
            
            }else{
            JOptionPane.showMessageDialog(rootPane, "Esse arquivo não Existe");
            }
        }
        
    }
    
    public void AtualizarTabela(){
        registros = pasta.listFiles();
        dtm.setRowCount(0);
        DadosTabela();
        }
    
    
    
    public void removeRow(){
    ((DefaultTableModel) JTProfessor.getModel()).removeRow(JTProfessor.getSelectedRow());
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfFiltro = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTProfessor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tfRelatorio = new javax.swing.JTextField();

        setTitle("Consulta Professor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Matricula:");

        tfFiltro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfFiltroKeyTyped(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Excluir");
        jButton3.setMaximumSize(new java.awt.Dimension(85, 25));
        jButton3.setMinimumSize(new java.awt.Dimension(85, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Gerar Arquivo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        JTProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JTProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTProfessorMouseClicked(evt);
            }
        });
        JTProfessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTProfessorKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(JTProfessor);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome do Relatorio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tfRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AtualizarTabela();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      Excluir();
      AtualizarTabela();
     
      tfFiltro.setText("");
      tfFiltro.requestFocus();
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JTProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTProfessorMouseClicked
       int indice_linha = JTProfessor.getSelectedRow();
        tfFiltro.setText(String.valueOf(JTProfessor.getValueAt(indice_linha, 0)));
    }//GEN-LAST:event_JTProfessorMouseClicked

    private void JTProfessorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTProfessorKeyReleased
       int indice_linha = JTProfessor.getSelectedRow();
        tfFiltro.setText(String.valueOf(JTProfessor.getValueAt(indice_linha, 0)));
    }//GEN-LAST:event_JTProfessorKeyReleased

    private void tfFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltroKeyTyped
         tfFiltro.addKeyListener(new KeyAdapter() {
           @Override
           public void keyReleased(KeyEvent e) {
             //  super.keyReleased(e); 
             tb.setRowFilter(RowFilter.regexFilter(tfFiltro.getText(), 0));
           
           }
        
       });
       tb = new TableRowSorter(dtm);
       JTProfessor.setRowSorter(tb);
    }//GEN-LAST:event_tfFiltroKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      Registro();
      AtualizarTabela();
     
      tfFiltro.setText("");
      tfFiltro.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTProfessor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tfFiltro;
    private javax.swing.JTextField tfRelatorio;
    // End of variables declaration//GEN-END:variables
}
