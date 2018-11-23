package Control;

import Model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Lacerda
 * @author João Victor Moura 
 */
public class ControlFuncionario{
    private static List<Funcionario> funcionarios = new ArrayList<>();
 

    
    public static Funcionario Consultainsercaofuncionario(String codigo){
        for (int i = 0 ; i < funcionarios.size();i++){
            if(funcionarios.get(i).getCodigo().equals(codigo)){
                System.err.println("Funcionario(a) já cadastrado(a): " 
                        + funcionarios.get(i).getNome() 
                        + " " + funcionarios.get(i).getCargo() 
                        + " " + funcionarios.get(i).getCodigo() 
                        + ".\n");
                return funcionarios.get(i);
            }
        }
        return null;
    }
        
    
    public static void Removefuncionario(String nome) { 
            for (int i = 0 ; i < funcionarios.size();i++){
                if(nome.equals(funcionarios.get(i).getNome())){
                    funcionarios.remove(funcionarios.get(i));
                    break;
                }
                else{
                    System.out.println("pessoa nao cadastrada: "+nome);
            }
        }
    }

        public static void Listarfuncionarios(){
        for(int j = 0; j < funcionarios.size(); j++){
            System.out.println("Nome: " + funcionarios.get(j).getNome());
            System.out.println("Codigo: " + funcionarios.get(j).getCodigo());
            System.out.println("Cargo: " + funcionarios.get(j).getCargo());
            System.out.println("Salario: " + funcionarios.get(j).getSalario());
            System.out.print("\n");
        }
    }
        
        
        public static void Addfuncionario(String codigo, String cargo, String nome, String salario) {
        Funcionario F1 = new Funcionario(codigo, cargo, nome, salario);
        funcionarios.add(F1);
    }
        
    
}
