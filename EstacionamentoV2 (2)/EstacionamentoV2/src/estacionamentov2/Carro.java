/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamentov2;

/**
 *
 * @author 040069
 */
public abstract class Carro 
{
    private String placa, modelo;
    private int ano;
    private boolean disp;
    private String vendedor;

    public Carro(String placa, String modelo, int ano) 
    {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        disp= true;
        vendedor= "";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public boolean disponivel()
    {
        return disp;
    }
    
    public void imprimeDados()
    {
        System.out.println("\nPlaca: " + placa + "\n" +
                "Modelo: " + modelo + "\n" + 
                "Ano: " + ano + "\n" +
                "Disponível para venda: " + (disp?"Sim":"Não"));
        if(!disp)
            System.out.println("Vendedor: " + vendedor);
    }
    
    public abstract boolean oferta(double valor);
    
    public boolean venderCarro(String vendedor, double valorVenda)
    {
        if(!disp) return false;
        if(!oferta(valorVenda)) return false;
        disp= false;
        this.vendedor= vendedor;
        return true;
    }
    
}  ////////////////  Classe Carro
