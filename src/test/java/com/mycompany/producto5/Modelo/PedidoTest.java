/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.producto5.Modelo;

import java.util.Date;
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
public class PedidoTest {
    
    public PedidoTest() {
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
     * Test of getIdPedido method, of class Pedido.
     */
    @Test
    public void testGetIdPedido() {
        System.out.println("getIdPedido");
        Pedido instance = new Pedido();
        int expResult = 0;
        int result = instance.getIdPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPedido method, of class Pedido.
     */
    @Test
    public void testSetIdPedido() {
        System.out.println("setIdPedido");
        int idPedido = 0;
        Pedido instance = new Pedido();
        instance.setIdPedido(idPedido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCliente method, of class Pedido.
     */
    @Test
    public void testGetIdCliente() {
        System.out.println("getIdCliente");
        Pedido instance = new Pedido();
        int expResult = 0;
        int result = instance.getIdCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCliente method, of class Pedido.
     */
    @Test
    public void testSetIdCliente() {
        System.out.println("setIdCliente");
        int idCliente = 0;
        Pedido instance = new Pedido();
        instance.setIdCliente(idCliente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdClaseArticulo method, of class Pedido.
     */
    @Test
    public void testGetIdClaseArticulo() {
        System.out.println("getIdClaseArticulo");
        Pedido instance = new Pedido();
        String expResult = "";
         instance.getIdClaseArticulo();
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdClaseArticulo method, of class Pedido.
     */
    @Test
    public void testSetIdClaseArticulo() {
        System.out.println("setIdClaseArticulo");
        String idClaseArticulo = "";
        Pedido instance = new Pedido();
        instance.setIdClaseArticulo(idClaseArticulo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEnviado method, of class Pedido.
     */
    @Test
    public void testIsEnviado() {
        System.out.println("isEnviado");
        Pedido instance = new Pedido();
        boolean expResult = false;
        boolean result = instance.isEnviado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEnviado method, of class Pedido.
     */
    @Test
    public void testSetEnviado() {
        System.out.println("setEnviado");
        boolean enviado = false;
        Pedido instance = new Pedido();
        instance.setEnviado(enviado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getidPedido method, of class Pedido.
     */
    @Test
    public void testGetidPedido() {
        System.out.println("getidPedido");
        Pedido instance = new Pedido();
        int expResult = 0;
        int result = instance.getidPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setidPedido method, of class Pedido.
     */
    @Test
    public void testSetidPedido() {
        System.out.println("setidPedido");
        int idPedido = 0;
        Pedido instance = new Pedido();
        instance.setidPedido(idPedido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroPedido method, of class Pedido.
     */
    @Test
    public void testGetNumeroPedido() {
        System.out.println("getNumeroPedido");
        Pedido instance = new Pedido();
        int expResult = 0;
        int result = instance.getNumeroPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroPedido method, of class Pedido.
     */
    @Test
    public void testSetNumeroPedido() {
        System.out.println("setNumeroPedido");
        int numeroPedido = 0;
        Pedido instance = new Pedido();
        instance.setNumeroPedido(numeroPedido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getidCliente method, of class Pedido.
     */
    @Test
    public void testGetidCliente() {
        System.out.println("getidCliente");
        Pedido instance = new Pedido();
        int expResult = 0;
        int result = instance.getidCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setidCliente method, of class Pedido.
     */
    @Test
    public void testSetidCliente() {
        System.out.println("setidCliente");
        int idCliente = 0;
        Pedido instance = new Pedido();
        instance.setidCliente(idCliente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getidClaseArticulo method, of class Pedido.
     */
    @Test
    public void testGetidClaseArticulo() {
        System.out.println("getidClaseArticulo");
        Pedido instance = new Pedido();
        
        instance.getidClaseArticulo();
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setidClaseArticulo method, of class Pedido.
     */
    @Test
    public void testSetidClaseArticulo() {
        System.out.println("setidClaseArticulo");
        String idClaseArticulo = "";
        Pedido instance = new Pedido();
        instance.setidClaseArticulo(idClaseArticulo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class Pedido.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Pedido instance = new Pedido();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class Pedido.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Pedido instance = new Pedido();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaHoraPedido method, of class Pedido.
     */
    @Test
    public void testGetFechaHoraPedido() {
        System.out.println("getFechaHoraPedido");
        Pedido instance = new Pedido();
        Date expResult = null;
        Date result = instance.getFechaHoraPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaHoraPedido method, of class Pedido.
     */
    @Test
    public void testSetFechaHoraPedido() {
        System.out.println("setFechaHoraPedido");
        Date fechaHoraPedido = null;
        Pedido instance = new Pedido();
        instance.setFechaHoraPedido(fechaHoraPedido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pedido.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pedido instance = new Pedido();
        String expResult = "";
        instance.toString();
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
