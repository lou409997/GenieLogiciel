package fr.ufrsciencestech.panier;

import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Orange orange1 = new Orange(4,"France");
        Orange orange2 = new Orange(-2,"France");
        Orange orange3 = new Orange(5,"France");
        /*System.out.println("Origine orange 1 : "+orange1.getOrigine());
        System.out.println("Prix orange 1 : "+orange1.getPrix());
        System.out.println("Origine orange 2 : "+orange2.getOrigine());
        System.out.println("Prix orange 2 : "+orange2.getPrix());
        System.out.println(orange1.toString());
        System.out.println(orange2.toString());
        System.out.println(orange1.equals(orange3));*/
        
        Panier panier1 = new Panier(3);
        Panier panier2 = new Panier(5);
        panier1.ajoute(orange1);
        panier1.ajoute(orange2);
        panier2.ajoute(orange1);
        panier2.ajoute(orange3);
        panier1.retire(orange1);
        System.out.println(panier1.toString());
        System.out.println(panier2.toString());
        System.out.println(panier1.equals(panier2));
        System.out.println("Total du panier : "+panier2.getPrix());
        
        Panier b = new Panier();
        b.ajoute(new Orange(0.80, "France"));
        b.ajoute(new Orange(0.80, "Espagne"));
        b.ajoute(new Orange(0.90, "Floride"));
        System.out.println(b.toString());
        b.boycotteOrigine("France");
        System.out.println(b.toString());
    }
}
