/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.producto5.Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Israel
 */
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdCliente method, of class Cliente.
     */
    @Test
    public void testGetIdCliente() {
        System.out.println("getIdCliente");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.getIdCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCliente method, of class Cliente.
     */
    @Test
    public void testSetIdCliente() {
        System.out.println("setIdCliente");
        int idCliente = 0;
        Cliente instance = new Cliente();
        instance.setIdCliente(idCliente);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of tipoCliente method, of class Cliente.
     */
    @Test
    public void testTipoCliente() {
        System.out.println("tipoCliente");
        Cliente instance = new Cliente();
        String expResult =instance.tipoCliente(); 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcAnual method, of class Cliente.
     */
    @Test
    public void testCalcAnual() {
        System.out.println("calcAnual");
        Cliente instance = new Cliente();
        float expResult = 0.0F;
        float result = instance.calcAnual();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of descuentoEnv method, of class Cliente.
     */
    @Test
    public void testDescuentoEnv() {
        System.out.println("descuentoEnv");
        Cliente instance = new Cliente();
        float expResult = 0.0F;
        float result = instance.descuentoEnv();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Cliente.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Cliente instance = new Cliente();
        String expResult = instance.getEmail();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Cliente.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Cliente instance = new Cliente();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expResult = instance.getNombre();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDomicilio method, of class Cliente.
     */
    @Test
    public void testGetDomicilio() {
        System.out.println("getDomicilio");
        Cliente instance = new Cliente();
        instance.getDomicilio();
         
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDomicilio method, of class Cliente.
     */
    @Test
    public void testSetDomicilio() {
        System.out.println("setDomicilio");
        String domicilio = "";
        Cliente instance = new Cliente();
        instance.setDomicilio(domicilio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNif method, of class Cliente.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Cliente instance = new Cliente();
        String expResult = instance.getNif(); 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNif method, of class Cliente.
     */
    @Test
    public void testSetNif() {
        System.out.println("setNif");
        String nif = "";
        Cliente instance = new Cliente();
        instance.setNif(nif);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoCliente method, of class Cliente.
     */
    @Test
    public void testSetTipoCliente() {
        System.out.println("setTipoCliente");
        String tipoCliente = "";
        Cliente instance = new Cliente();
        instance.setTipoCliente(tipoCliente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCalcAnual method, of class Cliente.
     */
    @Test
    public void testSetCalcAnual() {
        System.out.println("setCalcAnual");
        float calcAnual = 0.0F;
        Cliente instance = new Cliente();
        instance.setCalcAnual(calcAnual);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescuentoEnv method, of class Cliente.
     */
    @Test
    public void testSetDescuentoEnv() {
        System.out.println("setDescuentoEnv");
        float descuentoEnv = 0.0F;
        Cliente instance = new Cliente();
        instance.setDescuentoEnv(descuentoEnv);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoCliente method, of class Cliente.
     */
    @Test
    public void testGetTipoCliente() {
        System.out.println("getTipoCliente");
        Cliente instance = new Cliente();
        String expResult = instance.getTipoCliente();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCalcAnual method, of class Cliente.
     */
    @Test
    public void testGetCalcAnual() {
        System.out.println("getCalcAnual");
        Cliente instance = new Cliente();
        float expResult = 0.0F;
        float result = instance.getCalcAnual();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescuentoEnv method, of class Cliente.
     */
    @Test
    public void testGetDescuentoEnv() {
        System.out.println("getDescuentoEnv");
        Cliente instance = new Cliente();
        float expResult = 0.0F;
        float result = instance.getDescuentoEnv();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente instance = new Cliente();
        String expResult = instance.toString();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
