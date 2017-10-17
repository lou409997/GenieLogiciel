/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author lf409997
 */
public class VueConsole implements Observer, Vue{
    private String trace;
    
    public void setTrace(String trace)
    {
        this.trace = trace;
    }
    
    public VueConsole()
    {
        trace = "contenance initiale : " +0;
        System.out.println("Contenance initiale : " + 0); 
    }
    
    public void update(Observable o, Object arg)
    {
        Panier p = (Panier) arg;
        Integer nb = (Integer) p.getFruits().size();
        setTrace("Nouvelle contenance : " + nb.toString());
        System.out.println("Nouvelle contenance : " + nb.toString());
    }
}
