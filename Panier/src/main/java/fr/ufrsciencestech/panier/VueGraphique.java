/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author lf409997
 */
public class VueGraphique extends JFrame implements Observer{
    private JButton inc, dec;
    private JLabel affiche;
    
    public JButton getInc()
    {
        return inc;
    }
    
    public JButton getDec()
    {
        return dec;
    }
    
    public VueGraphique()
    {
        inc = new JButton("+");
        dec = new JButton("-");
        affiche = new JLabel("0", JLabel.CENTER);
        add(inc,BorderLayout.NORTH);
        add(dec, BorderLayout.SOUTH);
        add(affiche, BorderLayout.CENTER);
    }

    public void addControleur(Controleur c)
    {
        inc.addActionListener(c);
        dec.addActionListener(c);
    }

    public void update(Observable m, Object o)
    {
         Panier p = (Panier) o;
        affiche.setText(((Integer)p.getFruits().size()).toString());
    }
    
    public int getValeur(ActionEvent e)
    {
        JButton b = (JButton) e.getSource();
        if( b!=getInc() && b!=getDec())
            return 0;
        else if(b==getInc())
            return 1;
        else 
            return -1;
    }
}
