
package Control;

import Model.Aluno;
import Model.Funcionario;
import Model.Turma;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Lacerda
 * @author João Victor Moura
 */
public class ControlTurma {
    private static List<Turma> turmas = new ArrayList<>();
    
    
    
    //___LISTAR TURMA___//
    public static void Listarturma(){
        for(int j = 0; j < turmas.size(); j++){
            System.out.println(turmas.get(j).getCodigo());                
        }
    }
    //___FIM LISTAR TURMA
    
   
    

//___ ADICIONA TURMA___//
        public static void Addturma(Funcionario professor, List<Aluno> alunos, String codigo) {
        Turma T1 = new Turma(professor, alunos, codigo);
        if (professor.getCargo()=="Professor"){
        turmas.add(T1);
        }
        else{
            System.err.println("Este Funcionario não é um professor.");
        }
    }   
    //___FIM ADICIONA TURMA___//    
    
}//FIM CONTROL TURMA
