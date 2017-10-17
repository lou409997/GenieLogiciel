package fr.ufrsciencestech.panier;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Partie 2
        /*System.out.println( "Hello World!" );
        Orange orange1 = new Orange(4,"France");
        Orange orange2 = new Orange(-2,"France");
        Orange orange3 = new Orange(5,"France");*/
        /*System.out.println("Origine orange 1 : "+orange1.getOrigine());
        System.out.println("Prix orange 1 : "+orange1.getPrix());
        System.out.println("Origine orange 2 : "+orange2.getOrigine());
        System.out.println("Prix orange 2 : "+orange2.getPrix());
        System.out.println(orange1.toString());
        System.out.println(orange2.toString());
        System.out.println(orange1.equals(orange3));*/
        
        /*Panier panier1 = new Panier(3);
        Panier panier2 = new Panier(5);
        Panier panier3 = new Panier(5);
        panier1.ajoute(orange1);
        panier1.ajoute(orange2);
        panier2.ajoute(orange1);
        panier2.ajoute(orange3);
        panier3.ajoute(orange1);
        panier3.ajoute(orange3);
        panier1.retire(orange1);
        System.out.println(panier1.toString());
        System.out.println(panier2.toString());
        System.out.println(panier1.equals(panier2));
        System.out.println(panier2.equals(panier3));
        System.out.println("Total du panier : "+panier2.getPrix());
        
        Panier b = new Panier();
        b.ajoute(new Orange(0.80, "France"));
        b.ajoute(new Orange(0.80, "Espagne"));
        b.ajoute(new Orange(0.90, "Floride"));
        System.out.println(b.toString());
        b.boycotteOrigine("France");
        System.out.println(b.toString());*/
        
        //partie 3
        /*JFrame fenetre = new JFrame();
        fenetre.setTitle("Panier d'orange");
        fenetre.setSize(400,100);
        fenetre.setLocationRelativeTo(null);
        
        JPanel pan = new JPanel();
        pan.setBackground(Color.WHITE);
        fenetre.setContentPane(pan);
        
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);*/
        
        Panier p = new Panier();
        VueConsole vc = new VueConsole();
        VueGraphique vg = new VueGraphique();
        Controleur c = new Controleur();
        p.addObserver(vc);
        p.addObserver(vg);
        c.setPanier(p);
        c.setVue(vg);
        vg.addControleur(c);
        vg.setSize(100, 100);
        vg.setVisible(true);
        
        
    }
}
