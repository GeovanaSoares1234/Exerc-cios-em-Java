/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamentov2;

/**
 *
 * @author 040069
 */
public class Proprio extends Carro
{
    private String dataCompra;
    private double valCompra;

    public Proprio(String placa, String modelo, int ano, String dataCompra, double valCompra) 
    {
        super(placa, modelo, ano);
        this.dataCompra = dataCompra;
        this.valCompra = valCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValCompra() {
        return valCompra;
    }

    public void setValCompra(double valCompra) {
        this.valCompra = valCompra;
    }
    
    @Override
    public boolean oferta(double valor)
    {
        return valor >= valCompra*1.1;
    }
    
    @Override
    public void imprimeDados()
    {
        super.imprimeDados();
        System.out.println("Data de compra: " + dataCompra + "\n" +
                "Valor de compra: " + valCompra);
    }
    
}////////////////////  Classe Proprio
