/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 040069
 */
public class Segmento 
{
    private Ponto p1, p2;
    
    public Segmento()
    {
        p1= new Ponto();
        p2= new Ponto(0, 1);
    }

    public Segmento(Ponto p1, Ponto p2) 
    {
        this.p1 = new Ponto(p1);
        this.p2 = new Ponto(p2);
    }
    
    
    
    public Segmento(double x1, double y1, double x2, double y2)
    {
        p1= new Ponto(x1, y1);
        p2= new Ponto(x2, y2);
    }
    
    public Segmento(Segmento s)
    {
        p1= new Ponto(s.p1);
        p2= new Ponto(s.p2);
    }
    
    public void assign(Segmento s)
    {
        p1.assign(s.p1);
        p2.assign(s.p2);
    }
    
    public void desloc(double dX, double dY)
    {
        p1.desloc(dX, dY);
        p2.desloc(dX, dY);
    }
    
    public void scale(double factor)
    {
        p1.scale(factor);
        p2.scale(factor);
    }
    
    @Override
    public String toString()
    {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
    }
    
    public double length()
    {
        return p1.distance(p2);
    }
    
    public boolean isValid()
    {
        if(p1==null || p2==null) return false;
        return (p1.getX() != p2.getX()) || (p1.getY()!=p2.getY());
        
    }
    
    public Ponto midPoint()
    {
        double xm= (p1.getX() + p2.getX())/2;
        double ym= (p1.getY() + p2.getY())/2;
        return new Ponto(xm, ym);
    }
    
    public void print(String caption)
    {
        System.out.println(caption + toString());
    }
}
