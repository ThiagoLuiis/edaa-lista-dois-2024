/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public class Gerente extends Funcionario{
    //Gerente: Recebe um bônus de 20% sobre o salarioBase mais um adicional fixo de R$ 1000.


    public Gerente(int id, String nome,double salarioBase) {
        super(id, nome,salarioBase);
    }

    @Override
    public String toString(){
   return "\nId:" + id +"\nNome:" + nome + "\nSalario:" + this.calcularSalario();
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        return Funcionario.SalarioBase + (Funcionario.SalarioBase/100*20) + 1000;
    }
}
