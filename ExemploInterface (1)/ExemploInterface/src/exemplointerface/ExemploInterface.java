/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplointerface;

import bib.*;

/**
 *
 * @author 040069
 */
public class ExemploInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        TotalizableList tl= new TotalizableList(10);
        
        tl.add(new Funcionario("João", "456456-7", 10000));
        tl.add(new Funcionario("Jose", "789456-7", 5000));
        tl.add(new Funcionario("Maria", "321456-7", 3000));
        tl.add(new Funcionario("Rita", "178956-7", 7000));
        tl.add(new Funcionario("Fernando", "543456-7", 15000));
        tl.add(new Funcionario("Cláudia", "187556-7", 13000));
        
        tl.sort();
        
        tl.printList("Lista de funcionários", "Total de salários : ");
    }
    
}
