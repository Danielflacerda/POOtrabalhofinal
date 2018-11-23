package Model;


public class Aluno {
    private String matricula;
    private String nome;   
    private String idade;
    
    public Aluno(String matricula, String nome, String idade ) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
      
    }
    
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(String idade) {
        this.idade = idade;
        
    }

}//FIM ALUNO
