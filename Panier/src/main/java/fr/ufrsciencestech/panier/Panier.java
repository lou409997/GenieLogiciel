/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
/**
 *
 * @author lf409997
 */
public class Panier {
     private ArrayList a;
     private int max;
     
     public Panier()
     {
         a = new ArrayList();
         max = 10;
     }
     
     public Panier(int m)
     {
         a = new ArrayList();
         max = m;
     }
     
     public boolean estPlein()
     {
         if(a.size()==max)
             return true;
         else 
             return false;
     }
     
     public boolean estVide()
     {
        if(a.size()==0)
            return true;
        else
            return false;
     }
     
     @Override
     public String toString()
     {
         String tot = "";
         for(int i=0; i<a.size(); i++)
         {
             tot= tot + "Propriete de l'orange : " + a.get(i)+"\n";
         }
         return "Panier : \n" + tot;
     }
     
     @Override
     public boolean equals(Object other)
     {
         if(other == null)
             return false;
         Panier p = (Panier)other;
         for(int i=0; i<a.size(); i++)
         {
             if(a.get(i) != p.a.get(i))
                 return false;
         }
         return true;
     }
    
     
     public void ajoute(Orange o)
     {
         if(estPlein()==false)
            a.add(o);
         else
             System.out.println("Le panier est plein.");
                     
     }
     
     public void retire(Orange o)
     {
         if(estVide()==false)
            for(int i=0; i<a.size(); i++)
            {
                if(a.get(i)==o)
                    a.remove(i);
            }
         else
             System.out.println("Le panier est vide.");
     }
     
     public double getPrix()
     {
         double total = 0;
         Orange o;
         for( int i=0; i<a.size(); i++)
         {
             o = (Orange)a.get(i);
             total = total + o.getPrix();
         }
         return total;
     }
     
     public void boycotteOrigine(String pays)
     {
         for(int i=0; i<a.size(); i++)
         {
             Orange o = (Orange) a.get(i);
             if(o.getOrigine()==pays)
                 retire(o);
         }
     }
}
