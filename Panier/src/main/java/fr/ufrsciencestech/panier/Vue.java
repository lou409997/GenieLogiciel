/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

///pour mettre à jour sur gitub faire un 
    //git Add
    //git Commit
    //git remote fetch from upstream
    //git remote push from upstream
import java.util.Observable;

/**
 *
 * @author lf409997
 */
public interface Vue {
    public void update(Observable m, Object o);
}
