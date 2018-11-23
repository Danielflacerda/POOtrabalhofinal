package View;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Formatter;
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

public class TelaCadastroTurma extends javax.swing.JInternalFrame {

     String barra = File.separator;
     String local = System.getProperty("user.dir") + barra + "Dados_Turma"+barra;
     String local2 = System.getProperty("user.dir") + barra + "Dados_Professor"+barra;
    
     String local_aluno = System.getProperty("user.dir") + barra + "Dados_Aluno"+barra;
     
     int qtdlinhas;
        File pasta = new File(local_aluno);
        File [] registros = pasta.listFiles();
        
        String [] colunas = {"Matricula","Nome","Idade"};
        //String [] colunas = {"Cod. Turma","Cod. Professor","Matricula Aluno"};
    DefaultTableModel dtm = new DefaultTableModel (null,colunas){
        @Override
        public boolean isCellEditable(int row, int column) {
               return false;
        }
     };
        TableRowSorter tb;
    /**
     * Creates new form TelaCadastroTurma
     */
    public TelaCadastroTurma() {
        initComponents();
        DadosTabelaAluno();
    }

     public void CriarArquivo(){
        String arquivo = tfCodigoTurma.getText()+".txt";
        String arquivo2 = tfCodigoPro.getText()+".txt";
        File criar_local = new File(local);
        File criar_arquivo = new File(local+arquivo);
        File verifica_prof = new File(local2+arquivo2);
       
        
         if(tfCodigoTurma.getText().equals(null)||tfCodigoPro.getText().equals(null)||tfDisciplina.getText().equals(null) ||tfCodigoPro.getText().equals("")||tfCodigoTurma.getText().equals("")
                 || tfDisciplina.getText().equals("")){ 
            JOptionPane.showMessageDialog(null, "Dados inválidos ou em Branco, por favor, tente novamente.");
        }else {
        try {
        //VERIFICA SE PROFESSOR EXISTE
            if(!verifica_prof.exists()){
              JOptionPane.showMessageDialog(rootPane, "Não existe Professor com Codigo: " +tfCodigoPro.getText());
        
            }else{
           
        if(criar_arquivo.exists()){
            JOptionPane.showMessageDialog(rootPane, "Já existe um Registro de Turma com esse Codigo: " +tfCodigoTurma.getText());
        }else
            {
                criar_local.mkdirs();
              
            try (FileWriter fw = new FileWriter(criar_arquivo, true)) {
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("\n_______DADOS DA TURMA______\n\r"+
                        "\r\n Codigo da Turma: "+tfCodigoTurma.getText()+"\n"+
                                "\r\n Codigo do Professor: "+tfCodigoPro.getText()+"\n\r"+
                                        "\r\n Disciplina: "+tfDisciplina.getText()+"\n\r");
                bw.newLine();
                
            
                Registro();
                bw.close();
                    }
                JOptionPane.showMessageDialog(null, "Turma Cadastrada: ");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Não foi Possivel Cadastrar");
        }
    }
}
     
    
    public void DadosTabelaAluno(){

        for(int i = 0; i < registros.length; i++){
            
            File url = new File(local_aluno+registros[i].getName());
        
            try{
            FileInputStream fis = new FileInputStream(url);
            Properties mostrar = new Properties();
            mostrar.load(fis);
                  
            String [] linhas = {registros[i].getName().replace(".txt",""),
                mostrar.getProperty("Nome"),
                mostrar.getProperty("Idade")
            };
            
                dtm.addRow(linhas);
                
        
            }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro");
            }  
          
        
        }//FIM FOR 
        
        JTAluno.setModel(dtm);
        qtdlinhas = dtm.getRowCount();
    }    
     
    public void Registro(){
            String arquivo = tfCodigoTurma.getText()+".txt";
            File criar_local = new File(local);
            File criar_arquivo = new File(local+arquivo);
        
        if(tfCodigoTurma.getText().equals("")||tfCodigoTurma.getText().equals("null")){ 
            JOptionPane.showMessageDialog(null, "Dados inválidos ou em Branco, por favor, tente novamente.");
        }else{ 
 
        if(criar_arquivo.exists()){
           try{
                    criar_local.mkdirs();
                                        
                    for(int i = 0; i < JTAluno.getRowCount(); i++){
            
                        File url = new File(local_aluno+registros[i].getName());
        
                        try{
                            FileInputStream fis = new FileInputStream(url);
                            Properties mostrar = new Properties();
                            mostrar.load(fis);
                                    
                                    FileWriter fw = new FileWriter(criar_arquivo, true);
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    bw.write("\n_______DADOS DO ALUNO______\n\r"+
                                    "\r\n Matrícula: "+JTAluno.getValueAt(i, 0)+"\n"+
                                    "\r\n Nome: "+JTAluno.getValueAt(i, 1)+"\n\r"+
                                    "\r\n Idade: "+JTAluno.getValueAt(i, 2)+"\n\r");
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
            }else
                {
                JOptionPane.showMessageDialog(rootPane, "Não existe um Relatório com esse Nome(a) \n"
                    +"  -Relatorio: "+tfCodigoTurma.getText());
                }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfDisciplina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfFiltro = new javax.swing.JTextField();
        tfCodigoPro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfCodigoTurma = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTAluno = new javax.swing.JTable();

        setTitle("Cadastro Turmas");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Codigo Professor:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Disciplina: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Matricula do Aluno:");

        tfFiltro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFiltroActionPerformed(evt);
            }
        });
        tfFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfFiltroKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Codigo da Turma:");

        JTAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JTAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTAlunoMouseClicked(evt);
            }
        });
        JTAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTAlunoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(JTAluno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(112, 112, 112))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(tfCodigoTurma)
                                            .addGap(52, 52, 52)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(tfDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfCodigoPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(tfFiltro, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CriarArquivo();
       
        //ControlTurma.Addturma(professor, alunos, tfDisciplina.getText());
        //ZERAR CAMPOS
        tfFiltro.setText("");
        tfCodigoTurma.setText("");
        tfCodigoPro.setText("");
        tfDisciplina.setText("");

        tfCodigoTurma.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTAlunoMouseClicked

        int indice_linha = JTAluno.getSelectedRow();
        tfFiltro.setText(String.valueOf(JTAluno.getValueAt(indice_linha, 0)));
        // tfFiltro.setText((String) jTable1.getValueAt(indice_linha, 0)); */
    }//GEN-LAST:event_JTAlunoMouseClicked

    private void JTAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTAlunoKeyReleased
        int indice_linha = JTAluno.getSelectedRow();
        tfFiltro.setText(String.valueOf(JTAluno.getValueAt(indice_linha, 0)));
    }//GEN-LAST:event_JTAlunoKeyReleased

    private void tfFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFiltroActionPerformed

    }//GEN-LAST:event_tfFiltroActionPerformed

    private void tfFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltroKeyTyped
        tfFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                //  super.keyReleased(e);
                tb.setRowFilter(RowFilter.regexFilter(tfFiltro.getText(), 0));

            }

        });
        tb = new TableRowSorter(dtm);
        JTAluno.setRowSorter(tb);
    }//GEN-LAST:event_tfFiltroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTAluno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tfCodigoPro;
    private javax.swing.JTextField tfCodigoTurma;
    private javax.swing.JTextField tfDisciplina;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
