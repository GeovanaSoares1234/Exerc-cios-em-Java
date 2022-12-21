/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 040069
 */
public class Poligono 
{
    private Ponto list[];
    private int count;
    
    public Poligono()
    {
        list= new Ponto[50];
        count= 0;
    }
    
    public boolean ptExist(Ponto pt)
    {
        for(int i=0; i<count; i++)
        {
            if(pt.equals(list[i]))
                return true;
        }
        
        return false;
    }
    
    public boolean addVertex(Ponto pt)
    {
        if(count >= 50) return false;
        if(ptExist(pt)) return false;
        list[count]= pt;
        count++;
        return true;
    }
    
    public boolean isValid()
    {
        return count >= 3;
    }
    
    public double perimeter()
    {
        if(!isValid()) return -1;
        
        double per=0;
        for(int i=0; i<count-1; i++)
            per+= list[i].distance(list[i+1]);
        
        per+= list[count-1].distance(list[0]);
        
        return per;
    }
    
    public Ponto geoCenter()
    {
        double mx= 0, my=0;
        for(int i=0; i<count; i++)
        {
            mx+= list[i].getX();
            my+= list[i].getY();
        }
        
        return new Ponto(mx/count, my/count);
    }

    public double distance(Poligono plg)
    {
        return geoCenter().distance(plg.geoCenter());
    }
    
    public void desloc(double dx, double dy)
    {
        for(int i=0; i<count; i++)
            list[i].desloc(dx, dy);
    }
    
    public void scale(double factor)
    {
        for(int i=0; i<count; i++)
            list[i].scale(factor);
    }
    
    public void print()
    {
        for(int i=0; i<count; i++)
            list[i].print();
    }
    
}   
