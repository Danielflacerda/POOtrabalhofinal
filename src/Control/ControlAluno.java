
package Control;

import Model.Aluno;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Daniel Lacerda
 * @author João Victor Moura
 */
public class ControlAluno {
    private static List<Aluno> alunos = new ArrayList<>();
    
  
     //___ VERIFICA ALUNO ___//
    public static Aluno Consultainsercaoaluno(String nome){
        for (int i = 0 ; i < getAlunos().size();i++){
            if(getAlunos().get(i).getNome().equals(nome)){
                System.out.println("Aluno já cadastrado: "+getAlunos().get(i).getNome());
                return getAlunos().get(i);
            }
        }
        return null;
    }
 //___ FIM VERIFICA ALUNO ___//    
    

//___ REMOVE ALUNO ___//
     public static void Removealuno(String nome) { 
            for (int i = 0 ; i < getAlunos().size();i++){
                if(nome.equals(getAlunos().get(i).getNome())){
                    getAlunos().remove(getAlunos().get(i));
                    break;
                }
                else{
                    System.out.println("Aluno nao cadastrado: "+nome);
            }
        }
    }
    //___ FIM REMOVE ALUNO ___//
    
    
     public ArrayList<Aluno> retornaLista(){
       
        return (ArrayList<Aluno>) getAlunos();
     }
     
    //___ LISTAR ALUNOS___//
     public static void Listaralunos(){
        for(int j = 0; j < getAlunos().size(); j++){
            System.out.println("Nome: "+getAlunos().get(j).getNome());
            System.out.println("Matricula: "+getAlunos().get(j).getMatricula());
            System.out.print("\n");
        }
    }
    //___ FIM LISTAR ALUNOS__//
       
     //___ADICIONA ALUNO___//
       public static void Addaluno(String matricula,String nome, String idade) {
        Aluno A1 = new Aluno(matricula, nome, idade);
        getAlunos().add(A1);
       
      }
    //__ FIM ADICIONA ALUNO__//

       public static void Removealuno(String matricula,String nome, String idade){
           
          // getAlunos().remove(Aluno)
       }

    /**
     * @return the alunos
     */
    public static List<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param aAlunos the alunos to set
     */
    public static void setAlunos(List<Aluno> aAlunos) {
        alunos = aAlunos;
    }
  
    
    
    public void salvarAluno(){
        try{
            FileOutputStream out = new FileOutputStream("Registro_Aluno");
            ObjectOutputStream objOUT = new ObjectOutputStream(out);
            
            objOUT.writeObject(alunos);  
            objOUT.close();    
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
            }    

    }
    
       
   
       
}//FIM CONTROL ALUNO
