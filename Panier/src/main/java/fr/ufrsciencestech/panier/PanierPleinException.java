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
public class PanierPleinException extends Exception{
    public PanierPleinException()
    {
        super("Impossible d'ajouter une orange car le panier est plein !");
    }
    
}
