
package Model;

import java.util.ArrayList;
import java.util.List;


public class Turma {
    private Funcionario professor;
    private List<Aluno> alunosdaturma;
    private String codigo;
    public Turma(Funcionario professor, List<Aluno> alunos, String codigo) {
        this.professor = professor;
        this.alunosdaturma = alunos;
        this.codigo = codigo;
    }  
    /**
     * @return the professor
     */
    public Funcionario getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Funcionario professor) {
        this.professor = professor;
    }

    /**
     * @return the alunos
     */
    public List<Aluno> getAlunos() {
        return alunosdaturma;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(List<Aluno> alunos) {
        this.alunosdaturma = alunos;
    }

    /**
     * @return the nome
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the nome to set
     */
    public void setNome(String codigo) {
        this.codigo = codigo;
    }
    
}
