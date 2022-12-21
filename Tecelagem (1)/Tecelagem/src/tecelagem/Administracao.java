/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class Administracao extends Funcionario
{
    private int faltas;

    public Administracao(int cod, String nome, String rg, double salBase) 
    {
        super(cod, nome, rg, salBase);
        faltas= 0;
    }
    
    public void registrarFalta()
    {
        faltas++;
    }
    
    @Override
    public void novoMes()
    {
        faltas= 0;
    }
    
    @Override
    public double salarioLiquido()
    {
        return getSalBase() - (getSalBase()/30)*faltas;
    }
    
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Faltas: " + faltas);
    }
}
