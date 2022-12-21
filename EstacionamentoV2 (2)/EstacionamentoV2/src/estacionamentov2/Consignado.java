/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamentov2;

/**
 *
 * @author 040069
 */
public class Consignado extends Carro
{
    private String nomeProp;
    private double valorProp;

    public Consignado(String placa, String modelo, int ano, String nomeProp, double valorProp) 
    {
        super(placa, modelo, ano);
        this.nomeProp = nomeProp;
        this.valorProp = valorProp;
    }

    @Override
    public boolean oferta(double valor)
    {
        return valor >= valorProp*1.05;
    }
    
    @Override
    public void imprimeDados()
    {
        super.imprimeDados();
        System.out.println("Nome do proprietário: " + nomeProp + "\n" +
                "Valor p/ o proprietário: " + valorProp);
    }
    
}////////////////////// Classe Consignado
