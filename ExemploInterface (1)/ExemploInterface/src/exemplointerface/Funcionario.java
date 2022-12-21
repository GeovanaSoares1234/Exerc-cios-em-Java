/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface;

import bib.*;

/**
 *
 * @author 040069
 */
public class Funcionario implements TotalizableItem
{
    private String nome, rg;
    private double salario;

    public Funcionario(String nome, String rg, double salario) 
    {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double valueToTotal() 
    {
        return salario;
    }

    @Override
    public double valueToSort() 
    {
        return salario;
    }

    @Override
    public void printItem() 
    {
        System.out.format("%-10s %-16s %10.2f\n", rg,  nome, salario);
        
    }
    
    
    
}
