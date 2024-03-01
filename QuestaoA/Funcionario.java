/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public abstract class Funcionario {



    int id;
    String nome;
    static double SalarioBase = 1000;
    double SalarioTotal = calcularSalario();

        public Funcionario(int id, String nome,double salarioBase) {
        this.id = id;
        this.nome = nome;
        Funcionario.SalarioBase = salarioBase;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        Funcionario.SalarioBase = SalarioBase;
    }
    
    public abstract double calcularSalario();

}
