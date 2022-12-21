/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bib;

/**
 *
 * @author 040069
 */
public interface TotalizableItem extends PrintableItem
{
    // Retorna o valor que será totalizado
    double valueToTotal();  
    // Retorna o valor que será usado para a ordenação
    double valueToSort();
}
