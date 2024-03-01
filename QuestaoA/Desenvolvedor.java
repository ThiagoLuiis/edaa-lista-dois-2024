/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(int id, String nome,double salarioBase) {
        super(id, nome,salarioBase);
    }
    
@Override
    public String toString(){
   return "\nId:" + id +"\nNome:" + nome + "\nSalario:" + this.calcularSalario();
    }
    
    /*
        public String toString() {
        return "Título: " + titulo 
        + "\nAutor: " + autor 
        + "\nData 1ª Publicação: " + dataPublicacao 
        + "\nPreço: R$" + preco;
    }*/

    @Override
    public double calcularSalario() {
     return Funcionario.SalarioBase + (Funcionario.SalarioBase/100*10);
    }
    
    
}
