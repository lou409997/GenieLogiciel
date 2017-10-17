/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lf409997
 */
public class Controleur implements ActionListener{
    private Panier p;
    private VueGraphique vg;
    private Orange o = new Orange(0.50,"France"); // a enlever
    
    public void actionPerformed(ActionEvent e)
    {
        if(vg.getValeur(e) == 1)
        {
            try{ p.ajoute(o);} 
            catch (PanierPleinException ex){}
        }
        else
        {
            try{ p.retire(o);}
            catch(PanierVideException ex){};
        }
    }
    
    public void setPanier(Panier p)
    {
        this.p = p;
    }
    
    public void setVue(VueGraphique vg)
    {
        this.vg = vg;
    }
}
