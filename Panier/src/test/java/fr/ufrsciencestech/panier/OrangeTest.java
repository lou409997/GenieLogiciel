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
public class OrangeTest extends TestCase {
    
    private Orange o1;
    private Orange o2;
    private Orange o3;
    
    public OrangeTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        o1 = new Orange(0.50,"France");
        o2 = new Orange(0.50,"France");
        o3 = new Orange(0.50,"Espagne");
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getPrix method, of class Orange.
     */
    public void testGetPrix() {
        System.out.println("getPrix");
        double expResult1 = 0.50;
        double result1 = o1.getPrix();
        assertEquals(expResult1, result1, 0.0);
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    public void testGetOrigine() {
        System.out.println("getOrigine");
        String expResult1 = "France";
        String result1 = o1.getOrigine();
        assertEquals(expResult1, result1);
        String expResult2 = "Espagne";
        String result2 = o3.getOrigine();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of toString method, of class Orange.
     */
    public void testToString() {
        System.out.println("toString");
        String expResult1 = "Prix : "+o1.getPrix()+", origine : "+o1.getOrigine();
        String result1 = o1.toString();
        assertEquals(expResult1, result1);
        String expResult2 = "Prix : "+o3.getPrix()+", origine : "+o3.getOrigine();
        String result2 = o3.toString();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of equals method, of class Orange.
     */
    public void testEquals() {
        System.out.println("equals");
        boolean expResult1 = false;
        boolean result1 = o1.equals(o3);
        assertEquals(expResult1, result1);
        boolean expResult2 = true;
        boolean result2 = o1.equals(o2);
        assertEquals(expResult2, result2);
        Orange o = null;
        boolean expResult3 = false;
        boolean result3 = o1.equals(o);
        assertEquals(expResult3, result3);
    }
    
}
