/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import View.TelaCadastroAluno;
/**
 *
 * @author Daniel Lacerda
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceCadastroAluno
     */
    public Interface() {
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
        PainelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        turma = new javax.swing.JMenu();
        Cadturma = new javax.swing.JMenuItem();
        Consturma = new javax.swing.JMenuItem();
        aluno = new javax.swing.JMenu();
        Cadaluno = new javax.swing.JMenuItem();
        Consaluno = new javax.swing.JMenuItem();
        professor = new javax.swing.JMenu();
        Cadprofessor = new javax.swing.JMenuItem();
        Consprofessor = new javax.swing.JMenuItem();
        funcionario = new javax.swing.JMenu();
        Cadfuncionario = new javax.swing.JMenuItem();
        Consfuncionario = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal)
        );

        PainelPrincipal.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        turma.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        turma.setText("Turma");

        Cadturma.setText("Cadastro Turma");
        Cadturma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadturmaActionPerformed(evt);
            }
        });
        turma.add(Cadturma);

        Consturma.setText("Consulta Turma");
        Consturma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsturmaActionPerformed(evt);
            }
        });
        turma.add(Consturma);

        jMenuBar1.add(turma);

        aluno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        aluno.setText("Aluno");
        aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoActionPerformed(evt);
            }
        });

        Cadaluno.setText("Cadastro Aluno");
        Cadaluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadalunoMouseClicked(evt);
            }
        });
        Cadaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadalunoActionPerformed(evt);
            }
        });
        aluno.add(Cadaluno);

        Consaluno.setText("Consulta Aluno");
        Consaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsalunoActionPerformed(evt);
            }
        });
        aluno.add(Consaluno);

        jMenuBar1.add(aluno);

        professor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        professor.setText("Professor");

        Cadprofessor.setText("Cadastro Professor");
        Cadprofessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadprofessorActionPerformed(evt);
            }
        });
        professor.add(Cadprofessor);

        Consprofessor.setText("Consulta Professor");
        Consprofessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsprofessorActionPerformed(evt);
            }
        });
        professor.add(Consprofessor);

        jMenuBar1.add(professor);

        funcionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        funcionario.setText("Funcionário");

        Cadfuncionario.setText("Cadastro Funcionário");
        Cadfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadfuncionarioActionPerformed(evt);
            }
        });
        funcionario.add(Cadfuncionario);

        Consfuncionario.setText("Consulta Funcionário");
        Consfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsfuncionarioActionPerformed(evt);
            }
        });
        funcionario.add(Consfuncionario);

        jMenuBar1.add(funcionario);

        sobre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sobre.setText("Sobre");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        sobre.add(jMenuItem1);

        jMenuBar1.add(sobre);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadprofessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadprofessorActionPerformed
       TelaCadastroProfessor cadprof = new TelaCadastroProfessor();
       PainelPrincipal.add(cadprof);
       cadprof.setVisible(true);
    }//GEN-LAST:event_CadprofessorActionPerformed

    private void CadfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadfuncionarioActionPerformed
       TelaCadastroFuncionario cadfuncionarios = new TelaCadastroFuncionario();
       PainelPrincipal.add(cadfuncionarios);
       cadfuncionarios.setVisible(true);
    }//GEN-LAST:event_CadfuncionarioActionPerformed

    private void ConsfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsfuncionarioActionPerformed
       TelaConsultaFuncionario consfuncionario = new TelaConsultaFuncionario();
       PainelPrincipal.add(consfuncionario);
       consfuncionario.setVisible(true);
    }//GEN-LAST:event_ConsfuncionarioActionPerformed

    private void ConsalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsalunoActionPerformed
       TelaConsultaAluno consaluno = new TelaConsultaAluno();
       PainelPrincipal.add(consaluno);
       consaluno.setVisible(true);
    }//GEN-LAST:event_ConsalunoActionPerformed

    private void CadalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadalunoActionPerformed
       TelaCadastroAluno cadaluno = new TelaCadastroAluno();
       PainelPrincipal.add(cadaluno);
       cadaluno.setVisible(true);
    }//GEN-LAST:event_CadalunoActionPerformed

    private void CadalunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadalunoMouseClicked
        //IGNORA ISSO AQUI, NÃO CONSEGUI TIRAR
    }//GEN-LAST:event_CadalunoMouseClicked

    private void alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoActionPerformed
        //IGNORA ISSO AQUI, NÃO CONSEGUI TIRAR
    }//GEN-LAST:event_alunoActionPerformed

    private void ConsturmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsturmaActionPerformed
       TelaConsultaTurma consturma = new TelaConsultaTurma();
       PainelPrincipal.add(consturma);
       consturma.setVisible(true);
    }//GEN-LAST:event_ConsturmaActionPerformed

    private void ConsprofessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsprofessorActionPerformed
       TelaConsultaProfessor consprofessor = new TelaConsultaProfessor();
       PainelPrincipal.add(consprofessor);
       consprofessor.setVisible(true);
    }//GEN-LAST:event_ConsprofessorActionPerformed

    private void CadturmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadturmaActionPerformed
       TelaCadastroTurma cadturma = new TelaCadastroTurma();
       PainelPrincipal.add(cadturma);
       cadturma.setVisible(true);
    }//GEN-LAST:event_CadturmaActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
    
    }//GEN-LAST:event_sobreActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       TelaSobre sobre = new TelaSobre();
       PainelPrincipal.add(sobre);
       sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cadaluno;
    private javax.swing.JMenuItem Cadfuncionario;
    private javax.swing.JMenuItem Cadprofessor;
    private javax.swing.JMenuItem Cadturma;
    private javax.swing.JMenuItem Consaluno;
    private javax.swing.JMenuItem Consfuncionario;
    private javax.swing.JMenuItem Consprofessor;
    private javax.swing.JMenuItem Consturma;
    private javax.swing.JDesktopPane PainelPrincipal;
    private javax.swing.JMenu aluno;
    private javax.swing.JMenu funcionario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu professor;
    private javax.swing.JMenu sobre;
    private javax.swing.JMenu turma;
    // End of variables declaration//GEN-END:variables
}
