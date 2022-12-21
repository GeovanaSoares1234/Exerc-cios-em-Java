/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class ListaFunc 
{
    private Funcionario lista[];
    private int count;
    
    public ListaFunc(int capMax)
    {
        lista= new Funcionario[capMax];
        count= 0;
    }
    
    public int buscarFunc(int cod)
    {
        for(int i=0; i<count; i++)
        {
            if(lista[i].getCod() == cod)
                return i;
        }
        
        return -1;
    }
    
    public boolean addFunc(Funcionario f)
    {
        if(count >= lista.length) // Lista lotada
            return false;
        
        if(buscarFunc(f.getCod()) >= 0) // Código já existe
            return false;
        
        lista[count]= f;
        count++;
        return true;
    }
    
    public void relatorioAdministracao()
    {
        double sal= 0;
        System.out.println("\nFuncionários da Administração --------+");
        for(int i=0; i<count; i++)
        {
            if(lista[i] instanceof Administracao)
            {
                lista[i].hollerith();
                sal+= lista[i].salarioLiquido();
            }
        }
        
        System.out.println("Total dos salários: " + sal);
    }
    
    public void relatorioVendas()
    {
        double totVendas= 0;
        System.out.println("\nFuncionários de Vendas -------+");
        for(int i=0; i<count; i++)
            if(lista[i] instanceof Vendas)
            {
                lista[i].hollerith();
                Vendas v= (Vendas)lista[i];
                totVendas+= v.getTotalVendas();
            }
        
        System.out.println("Total de vendas: " + totVendas);
        
    }
    
    public void registrarVenda(int cod, double valor)
    {
        int index= buscarFunc(cod);
        if(index < 0)
        {
            System.out.println("O código não existe.");
            return;
        }
        if(lista[index] instanceof Vendas)
        {
            Vendas v= (Vendas)lista[index];
            v.registrarVenda(valor);
        }
        else 
            System.out.println("O funcionário não é vendedor.");
    }
    
    public void registrarFalta(int cod)
    {
        int index= buscarFunc(cod);
        if(index < 0) 
        {
            System.out.println("O código não existe.");
            return;
        }
        if(lista[index] instanceof Administracao)
            ((Administracao) lista[index]).registrarFalta();
        else
            System.out.println("O funcionário não é administrativo.");
    }
    
    public void registrarHorasDiurnas(int cod, int horas)
    {
        int index= buscarFunc(cod);
        if(index < 0) 
        {
            System.out.println("O código não existe.");
            return;
        }
        if(lista[index] instanceof Producao)
            ((Producao) lista[index]).registrarHorasDiurnas(horas);
        else
            System.out.println("O funcionário não é da produção.");
    }
}
