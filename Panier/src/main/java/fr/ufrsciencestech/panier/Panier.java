/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

///croudet80 sur github


package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import java.util.Observable;
/**
 *
 * @author lf409997
 */
public class Panier extends Observable{
     private ArrayList a;
     private int max;
     
     public ArrayList getFruits()
     {
         return a;
     }
     
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
         //tester que les paniers sont de memes tailles
         for(int i=0; i<a.size(); i++)
         {
             if(a.get(i) != p.a.get(i))
                 return false;
         }
         return true;
     }
    
     //a modifier pour ne plus avoir de paramètre
     public void ajoute(Orange o) throws PanierPleinException
     {
         if(estPlein()==false)
         {
             /*Orange o;
             if(estVide()==false)
                 o = a.get(a.size()-1);
             else
                 o = new Orange();*/
             a.add(o);
             setChanged();
             notifyObservers(this);
             
         }
         else
         {
             throw new PanierPleinException();
         }
     }
     
     //a modifier pour ne plus avoir de paramètre
     public void retire(Orange o) throws PanierVideException
     {
         if(estVide()==false)
         {
            for(int i=0; i<a.size(); i++)
            {
                if(a.get(i)==o)
                    a.remove(i);
            }
            setChanged(); //previent que le modele a changer
            notifyObservers(this); //donne les nouvelles valeurs et declenche les methodes update
         }
         else
         {
             throw new PanierVideException();
         }
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
                 try{retire(o);}
                 catch(PanierVideException e){}
         }
     }
}
