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
        /*System.out.println("Origine orange 1 : "+orange1.getOrigine());
        System.out.println("Prix orange 1 : "+orange1.getPrix());
        System.out.println("Origine orange 2 : "+orange2.getOrigine());
        System.out.println("Prix orange 2 : "+orange2.getPrix());*/
        System.out.println(orange1.toString());
        System.out.println(orange2.toString());
        
    }
}
