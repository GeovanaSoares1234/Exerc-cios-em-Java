/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 040069
 */
public class Ponto extends Object
{
    private double x, y;
    
    // Construtor parametrizado

    public Ponto(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    
    // Contrutor padrão
    public Ponto()
    {
        this(0,0);
    }
    
    // Construtor de cópia
    public Ponto(Ponto p)
    {
        this(p.x, p.y);
    }
    
    // Getters e setters

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    // Métodos
    public void setXY(double x, double y)
    {
        this.x= x;
        this.y= y;
    }
    
    public void assign(Ponto p)
    {
        x= p.x;
        y= p.y;
    }
    
    public double deltaX(double vX)
    {
        return vX-x;
    }
    
    public double deltaY(double vY)
    {
        return vY-y;
    }
    
    public double distance(double posX, double posY)
    {
        double dx= deltaX(posX);
        double dy= deltaY(posY);
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public double distance()
    {
        return distance(0,0);
    }
    
    public double distance(Ponto p)
    {
        return distance(p.x, p.y);
    }
    
    public void desloc(double dX, double dY)
    {
        x += dX;
        y += dY;
    }
    
    public void scale(double factor)
    {
        x *= factor;
        y *= factor;
    }
    
    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    
    public void print()
    {
        System.out.println(toString());
    }
            
    public void print(String caption)
    {
        System.out.print(caption);
        print();                
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ponto other = (Ponto) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        return Double.doubleToLongBits(this.y) == Double.doubleToLongBits(other.y);
    }
            
    
            
}
