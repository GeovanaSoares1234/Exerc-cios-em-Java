/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 040069
 */
public class Cartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//        Ponto p1= new Ponto(3,4);
//        Ponto p2= new Ponto();
//        Ponto p3= new Ponto(p1);
//        
//        p1.print("p1");
//        p2.print("p2");
//        p3.print("p3");
//        
//        System.out.println("Dist: p1->(0,0): " + p1.distance(0,0));

        
//        Segmento s1= new Segmento();
//        Segmento s2= new Segmento(1,2, 3,4);
//        Segmento s3= new Segmento(s2);
//        
//        s1.print("s1");
//        s2.print("s2");
//        s3.print("s3");
//        
//        s3.assign(s1);
//        s3.print("s3");
//        
//        s3.desloc(1, 1);
//        s3.print("s3");
//        
//        s3.scale(2);
//        s3.print("s3");
//        
//        System.out.println("s3.length(): " + s3.length());
//        System.out.println("s3.isValid(): " + s3.isValid());
//        
//        s2.midPoint().print("s2.midPoint()");
//        
//        Ponto p1= new Ponto(2, 3);
//        Ponto p2= new Ponto(5, 6);
//        Segmento s4= new Segmento(p1, p2);
//        s4.print("s4");
//        
//        p1.scale(4);
//        s4.print("s4");

//        Circulo c1= new Circulo();
//        Circulo c2= new Circulo(3,4, 2);
//        Circulo c3= new Circulo(c2);
//        
//        c1.print("c1");
//        c2.print("c2");
//        c3.print("c3");
//        
//        c2.desloc(1, 1);
//        c2.print("c2");
//        c2.scale(2);
//        c2.print("c2");
        
        Poligono pl= new Poligono();
        
        pl.addVertex(new Ponto(0,0));
        pl.addVertex(new Ponto(0,10));
        pl.addVertex(new Ponto(10,10));
        pl.addVertex(new Ponto(10,0));
        
        System.out.println("Perimetro: " + pl.perimeter());
        
        pl.print();
        pl.geoCenter().print("Centro pl:");

        Poligono pl2= new Poligono();
        
        pl2.addVertex(new Ponto(0,0));
        pl2.addVertex(new Ponto(0,10));
        pl2.addVertex(new Ponto(10,10));
        pl2.addVertex(new Ponto(10,0));
        
        pl2.desloc(20, 0);
        pl2.print();
        
        pl2.geoCenter().print("Centro pl2:");
        System.out.println("Distancia: " + pl.distance(pl2));
    }
    
}
