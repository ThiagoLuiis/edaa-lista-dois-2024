/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public class Suporte extends Funcionario{
    double SalarioSup = (SalarioBase/100*5);

    public Suporte(int id, String nome,double salarioBase) {
        super(id, nome,salarioBase);
    }

    @Override
    public String toString() {
        return "\nId:" +id + "\nNome: " +nome + "\nSalario: " + this.calcularSalario();
    }

    @Override
    public double calcularSalario() {
     return Funcionario.SalarioBase + (Funcionario.SalarioBase/100*5);
    }
    
}
