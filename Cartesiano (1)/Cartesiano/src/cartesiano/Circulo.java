/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 040069
 */
public class Circulo extends Ponto
{
    private double raio;
    
    public Circulo()
    {
        super();
        raio= 1;
    }
    
    public Circulo(double x, double y, double raio)
    {
        super(x, y);
        this.raio= raio;
    }
    
    public Circulo(Circulo c)
    {
        super(c);
        raio= c.raio;
    }
    
    public void assign(Circulo c)
    {
        super.assign(c);
        raio= c.raio;
    }
    
    @Override
    public void scale(double factor)
    {
        super.scale(factor);
        raio*= factor;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + ":" + raio;
    }
    
    public boolean isValid()
    {
        return raio>0;
    }
    
    public double perimeter()
    {
        return 2*Math.PI*raio;
    }
    
    public double area()
    {
        return Math.PI*raio*raio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circulo other = (Circulo) obj;
        return Double.doubleToLongBits(this.raio) == Double.doubleToLongBits(other.raio);
    }

   
   
    
}
