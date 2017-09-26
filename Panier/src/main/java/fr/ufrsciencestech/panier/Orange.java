/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package fr.ufrsciencestech.panier;

/**
 *
 * @author lf409997
 */
public class Orange {
    private double prix;
    private String origine;
    
    public Orange( double p, String o)
    {
        if(p>=0)
            prix = p;
        else 
            System.out.println("Vous ne pouvez entrer un prix négatif.");
        origine = o;
    }
    
    public double getPrix()
    {
        return prix;
    }
    
    public String getOrigine()
    {
        return origine;
    }
    
    @Override     
    public String toString()
    {
        return "Prix : " + getPrix() + ", origine : " + getOrigine();
    }
    
    @Override
    public boolean equals(Object other)
    {
        if(other == null)
            return false;
        Orange o = (Orange)other;
        if(o.getPrix()!=prix || o.getOrigine()!=origine)
            return false;
        return true;
        }
}
