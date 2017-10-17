/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import junit.framework.TestCase;

/**
 *
 * @author lf409997
 */
public class PanierTest extends TestCase {
    
    private Orange o1;
    private Orange o2; 
    private Orange o3;
    
    private Panier p1;
    private Panier p2;
    private Panier p3;
    private Panier p4;
    
    public PanierTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        o1 = new Orange(0.50,"France");
        o2 = new Orange(0.50,"Espagne");
        o3 = new Orange(0.80,"Portugal");
        p1 = new Panier();
        p2 = new Panier(10);
        p3 = new Panier();
        p4 = new Panier(2);
        
        p4.ajoute(o1);
        p4.ajoute(o2);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    public void testEstPlein() {
        System.out.println("estPlein");
        boolean expResult1 = true;
        boolean result1 = p4.estPlein();
        assertEquals(expResult1, result1);
        boolean expResult2 = false;
        boolean result2 = p1.estPlein();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of estVide method, of class Panier.
     */
    public void testEstVide() {
        System.out.println("estVide");
        boolean expResult1 = true;
        boolean result1 = p1.estVide();
        assertEquals(expResult1, result1);
        boolean expResult2 = false;
        boolean result2 = p4.estVide();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of toString method, of class Panier.
     */
    public void testToString() {
        System.out.println("toString");
        Panier instance = new Panier();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Panier.
     */
    public void testEquals() {
        System.out.println("equals");
        boolean expResult1 = true;
        boolean result1 = p1.equals(p2);
        assertEquals(expResult1, result1);
        boolean expResult2 = true;
        boolean result2 = p1.equals(p3);
        assertEquals(expResult2, result2);
        boolean expResult3 = false;
        boolean result3 = p1.equals(p4);
        assertTrue(expResult3==result3);
        boolean expResult4 = false;
        boolean result4 = p2.equals(p4);
        assertEquals(expResult4, result4);
    }

    /**
     * Test of ajoute method, of class Panier.
     */
    
    //ce ne sont plus des booleens
    public void testAjoute() {
        System.out.println("ajoute");
        boolean expResult1 = true;
        boolean result1 = p3.ajoute(o1);
        assertEquals(expResult1, result1);
        boolean expResult2 = false;
        boolean result2 = p4.ajoute(o3);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of retire method, of class Panier.
     */
    
    //ce ne sont plus des booleens
    public void testRetire() {
        System.out.println("retire");
        boolean expResult1 = true;
        boolean result1 = p4.retire(o1);
        assertEquals(expResult1, result1);
        boolean expResult2 = false;
        boolean result2 = p3.retire(o1);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    public void testGetPrix() {
        System.out.println("getPrix");
        double expResult1 = 0.0;
        double result1 = p1.getPrix();
        assertEquals(expResult1, result1, 0.0);
        double expResult2 = 1.0;
        double result2 = p4.getPrix();
        assertEquals(expResult2, result2, 0.0);
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    public void testBoycotteOrigine() {
        System.out.println("boycotteOrigine");
        p4.boycotteOrigine("Portugal");
        p1.ajoute(o1);
        p1.ajoute(o2);
        boolean expResult1 = true;
        boolean result1 = p4.equals(p1);
        assertEquals(expResult1, result1);
        /*boolean expResult2 = false;
        boolean result2 = p2.equals(p4);
        assertEquals(expResult2, result2); */       
    }
    
}
