/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class Vendas extends Funcionario
{
    private double totalVendas;

    public Vendas(int cod, String nome, String rg, double salBase) 
    {
        super(cod, nome, rg, salBase);
        totalVendas= 0;
    }

    public double getTotalVendas() 
    {
        return totalVendas;
    }
    
    

    @Override
     public double salarioLiquido()
     {
         return getSalBase() + totalVendas*0.03;
     }
    
    public void registrarVenda(double valor)
    {
        totalVendas+= valor;
    }
    
    @Override
    public void novoMes()
    {
        totalVendas= 0;
    }
         
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Total de vendas: " + totalVendas);
    }
}
