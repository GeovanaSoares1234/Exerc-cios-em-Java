/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamentov2;

/**
 *
 * @author 040069
 */
public class EstacionamentoV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ListaCarros lc= new ListaCarros(10);
        
        lc.add(new Proprio("ABC 1234", "Tesla", 2022, "10/10/22", 500000));
        lc.add(new Proprio("BCD 1234", "Tesla", 2021, "10/10/22", 450000));
        lc.add(new Consignado("ASD 2345", "HB20", 2020, "12/12/21", 50000));
        
        lc.listarCarros();
        
        lc.venderCarro(1, "Joao", 520000);
        
        lc.listarDisponiveis();
        
        
        
    }
    
}
