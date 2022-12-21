/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bib;

/**
 *
 * @author 040069
 */
public class TotalizableList 
{
    private TotalizableItem list[];
    private int count;
    
    public TotalizableList(int capMax)
    {
        list= new TotalizableItem[capMax];
        count= 0;
    }
    
    public boolean add(TotalizableItem item)
    {
        if(count >= list.length) return false;
        list[count]= item;
        count++;
        return true;
    }
    
    public void sort()
    {
        for(int i=0; i<count-1; i++)
            for(int j=i+1; j<count; j++)
            {
                if(list[i].valueToSort() > list[j].valueToSort())
                {
                    TotalizableItem tmp= list[i];
                    list[i]= list[j];
                    list[j]= tmp;
                }
            }
    }
    public void printList(String title, String totalCaption)
    {
        System.out.println("\n" + title + "\n");
        double total= 0;
        for(int i=0; i<count; i++)
        {
            list[i].printItem();
            total+= list[i].valueToTotal();
        }
        
        System.out.println(totalCaption + total);
    }

}