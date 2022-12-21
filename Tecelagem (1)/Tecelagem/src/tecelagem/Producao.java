/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class Producao extends Funcionario
{
    private int hrDiurna, hrNoturna;

    public Producao(int cod, String nome, String rg, double salBase) 
    {
        super(cod, nome, rg, salBase);
        hrDiurna= 0;
        hrNoturna= 0;
    }
    
    public void registrarHorasDiurnas(int horas)
    {
        hrDiurna+= horas;
    }
    
    public void registrarHorasNoturnas(int horas)
    {
        hrNoturna+= horas;
    }
    
    @Override
    public void novoMes()
    {
        hrDiurna= 0;
        hrNoturna= 0;
    }
    
    @Override
    public double salarioLiquido()
    {
        return (getSalBase()*hrDiurna) + (getSalBase()*hrNoturna)*1.3;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Horas diurnas: " + hrDiurna + "\n" + 
                "Horas noturnas: " + hrNoturna);
    }
}
