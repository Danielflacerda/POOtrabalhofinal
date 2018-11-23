
package View;

import Control.ControlAluno;
import java.io.File;
import java.util.Formatter;
import javax.swing.JOptionPane;


/**
 *
 * @author Daniel Lacerda
 * @author João Victor Moura
 */
public class TelaCadastroAluno extends javax.swing.JInternalFrame {
    
    String barra = File.separator;
    String local = System.getProperty("user.dir") + barra + "Dados_Aluno"+barra;
    
  
    public TelaCadastroAluno() {
        initComponents();
    }
    
    public void CriarArquivo(){
        String arquivo = matriculaalun.getText()+".txt";
        File criar_local = new File(local);
        File criar_arquivo = new File(local+arquivo);
        String idade = (String) idadealun.getSelectedItem();
        
         if(matriculaalun.getText().equals(null)||nomealun.getText().equals(null)||nomealun.getText().equals("")||matriculaalun.getText().equals("")||idadealun.getSelectedItem().equals("")){ 
            JOptionPane.showMessageDialog(null, "Dados inválidos ou em Branco, por favor, tente novamente.");
        }else{ 
        try {
           
        if(criar_arquivo.exists()){
            JOptionPane.showMessageDialog(rootPane, "Já existe um Registro de Aluno(a) \n"
                    +"  -Matricula: "+matriculaalun.getText());
        }else
            {
                criar_local.mkdirs();
                Formatter criar = new Formatter(local+arquivo);
                               
                criar.format("%s\r\n %s\r\n %s\r\n %s\r\n ","_______DADOS DO ALUNO______"
                ,"Matrícula: "+matriculaalun.getText()
                ,"Nome: "+nomealun.getText()
                ,"Idade: "+idade);
                        
                criar.close();
            
            JOptionPane.showMessageDialog(null, "Aluno(a) cadastrado{a):"+
            "\n  -Matrícula: "+matriculaalun.getText()+
            "\n  -Nome: "+nomealun.getText()+
            "\n  -Idade: "+idadealun.getSelectedItem());
            
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Não foi Possivel Criar Arquivo");
        }
    }
 } 
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        matriculaalun = new javax.swing.JTextField();
        nomealun = new javax.swing.JTextField();
        idadealun = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("Cadastro Aluno");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Matrícula:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Idade:");

        matriculaalun.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        nomealun.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        idadealun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85" }));
        idadealun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadealunActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 140, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(matriculaalun)
                                .addComponent(nomealun, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(idadealun, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 131, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(matriculaalun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(nomealun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(idadealun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        matriculaalun.getAccessibleContext().setAccessibleName("matriculaalun");
        nomealun.getAccessibleContext().setAccessibleName("nomealun");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String idade = (String) idadealun.getSelectedItem();
        CriarArquivo();
        ControlAluno.Addaluno(matriculaalun.getText(),nomealun.getText() ,idade);
        
//ZERAR CAMPOS
        matriculaalun.setText("");
        nomealun.setText("");
        idadealun.setSelectedIndex(0);
        
        matriculaalun.requestFocus();
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idadealunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadealunActionPerformed
      
    }//GEN-LAST:event_idadealunActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();  
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> idadealun;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField matriculaalun;
    private javax.swing.JTextField nomealun;
    // End of variables declaration//GEN-END:variables
}
