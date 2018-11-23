package pootrabson;

import java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;
import static pootrabson.Grouphumans.listadegrupos;

/**
 *
 * @author Daniel Lacerda
 */
public class Pootrabson {

    public static ArrayList<Humans> humanos = new ArrayList();
    public static ArrayList<Grouphumans> grupodeamigos = new ArrayList();    
    public static void Consultahumans(String nome){
        if(humanos.isEmpty()){
            System.out.println("pessoa nao cadastrada: "+nome);
        }
        for (int i = 0 ; i < humanos.size();i++){
            if(humanos.get(i).getNome().equals(nome)){
                System.out.println(humanos.get(i).getNome()+" "+humanos.get(i).getAge());
                break;
            }
            else if(i==humanos.size()-1) {
                System.out.println("pessoa nao cadastrada: "+nome);
        }
    }
    }
    
    public static Humans Consultainsercao(String nome){
        for (int i = 0 ; i < humanos.size();i++){
            if(humanos.get(i).getNome().equals(nome)){
                System.out.println("pessoa jah cadastrada: "+humanos.get(i).getNome());
                return humanos.get(i);
            }
        }
        return null;
    }
    
    public static Humans Buscadorpessoa(String nome){
        for (int i = 0 ; i < humanos.size();i++){
            if(humanos.get(i).getNome().equals(nome)){
                return humanos.get(i);
            }
        }
        return null;
    }

    /*public static Grouphumans Buscadorgrupos(String nome){
        for (int i = 0 ; i < listadegrupos.size();i++){
            if(listadegrupos.get(i).getNome().equals(nome)){
                return listadegrupos.get(i);
            }
        }
        return null;
    }*/
    
    public static void Removehumano(String nome) { 
            for (int i = 0 ; i < humanos.size();i++){
                if(nome.equals(humanos.get(i).getNome())){
                    humanos.remove(humanos.get(i));
                    break;
                }
                else{
                    System.out.println("pessoa nao cadastrada: "+nome);
            }
        }
    }
    
    public static void Addhumano(String nome,int age) {
        Humans H1 = new Humans(nome, age);
        humanos.add(H1);
    }
    
    public static void main(String[] args) {
    
    String comando = null;
    while(!"e".equals(comando) ){
        Scanner teclado = new Scanner(System.in);
        comando = teclado.next();
        switch(comando){
            case "p":
                String nome = teclado.next();
                int age = Integer.parseInt(teclado.next());
                if(Pootrabson.Consultainsercao(nome)==null){
                    Pootrabson.Addhumano(nome, age);
                }
                break;
            case "c":
                nome = teclado.next();
                Pootrabson.Consultahumans(nome);
                break;
            case "r":
                nome = teclado.next();               
                Pootrabson.Removehumano(nome);
                System.out.println("fodeo");
                break;
            case "a":
                nome = teclado.next();
                String nomee = teclado.next();
                Humans.Criaramizade(nome, nomee);
                break;   
            case "q":
                String z = teclado.next();
                Humans H4 = new Humans("123", 13);
                H4 = Pootrabson.Buscadorpessoa(z);
                H4.Consultaamigos(H4);
                break;
            case "d":
                nome = teclado.next();
                nomee = teclado.next();
                Humans.Removeramizade(nome, nomee);
                break;                
            case "g":
                nome = teclado.next();
                Grouphumans.Criargrupo(nome);
                break;                
            case "i":
                nome = teclado.next();
                nomee = teclado.next();
                Grouphumans.Cadastrarpessoanogrupo(nome, nomee);
                break;                
            case "l":
                
                break;                
            case "h":
                
                break;                
            case "s":
                
                break;   
            case "u":
                
                break;                 
            case "v":
                
                break;                 
            case "e":
                
                break; 
            default:
                System.out.println("Os dados inseridos não correspondem a nenhuma das opções fornecidas.");
        }
        }
    }   
}
