/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamentov2;

/**
 *
 * @author 040069
 */
public class ListaCarros 
{
    private Carro lista[];
    private int count;
    
    public ListaCarros(int capMax)
    {
        lista= new Carro[capMax];
        count= 0;
    }
    
    public boolean add(Carro c)
    {
        if(count >= lista.length) return false;
        lista[count]= c;
        count++;
        return true;
    }
    
    public boolean venderCarro(int index, String vendedor, double valorVenda)
    {
        if(index < 0 || index >= count) 
        {
            System.out.println("Índice inválido.");
            return false;
        }
        
        return lista[index].venderCarro(vendedor, valorVenda);
    }
    
    public void imprimeDados(int index)
    {
        if(index < 0 || index >= count) 
            System.out.println("Índice inválido.");
        else
            lista[index].imprimeDados();
    }
    
    public void listarCarros()
    {
        System.out.println("\nListagem geral ----------------------+");
        for(int i=0; i<count; i++)
            lista[i].imprimeDados();
    }

    public void listarDisponiveis()
    {
        System.out.println("\nCarros disponíveis ----------------------+");
        for(int i=0; i<count; i++)
            if(lista[i].disponivel())
                lista[i].imprimeDados();
    }
}
