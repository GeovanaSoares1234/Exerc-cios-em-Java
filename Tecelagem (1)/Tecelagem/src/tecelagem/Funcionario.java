/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public abstract class Funcionario 
{
    private int cod;
    private String nome, rg;
    private double salBase;

    public Funcionario(int cod, String nome, String rg, double salBase) 
    {
        this.cod= cod;
        this.nome = nome;
        this.rg = rg;
        this.salBase = salBase;
    }

    public int getCod() 
    {
        return cod;
    }

    public void setCod(int cod) 
    {
        this.cod = cod;
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

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
    public abstract double salarioLiquido();
    public abstract void novoMes();
    
    public void hollerith()
    {
        System.out.println("\nCódigo : " + cod + "\n" + 
                "Nome: " + nome + "\n" +
                "Rg: " + rg + "\n" + 
                "Salário base: " + salBase + "\n" +
                "Salário líquido: " + salarioLiquido());
    }
}
