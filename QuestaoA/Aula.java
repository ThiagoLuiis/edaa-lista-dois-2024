/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public class Aula {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double salarioBase = 1000;
        Desenvolvedor desenvolvedor = new Desenvolvedor(1, "Thiago",salarioBase);
        Gerente gerente = new Gerente(2, "Joao",salarioBase);
        Suporte suporte = new Suporte(3, "Augusto", salarioBase);
        // System.out.println(desenvolvedor);
        // System.out.println(gerente);
        // System.out.println(suporte);
  
    
    Empresa empresa = new Empresa();

    Empresa.adicionarFuncionario(desenvolvedor);
    Empresa.adicionarFuncionario(gerente);
    Empresa.adicionarFuncionario(suporte);

    System.out.println(empresa);
    System.out.println("Folha Salarial Total: R$ " + empresa.calcularFolhaSalarial());


    

    }
}