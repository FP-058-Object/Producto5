
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
public class ArticuloTest {
    
    public ArticuloTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    


    /**
     * Test of getIdArticulo method, of class Articulo.
     */
    @org.junit.Test
    public void testGetIdArticulo() {
        System.out.println("getIdArticulo");
        Articulo instance = new Articulo();
        int expResult = 0;
        int result = instance.getIdArticulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setIdArticulo method, of class Articulo.
     */
    @org.junit.Test
    public void testSetIdArticulo() {
        System.out.println("setIdArticulo");
        int idArticulo = 0;
        Articulo instance = new Articulo();
        instance.setIdArticulo(idArticulo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Articulo.
     */
    @org.junit.Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Articulo instance = new Articulo();
        
        String expResult = instance.getCodigo();
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Articulo.
     */
    @org.junit.Test
    public void testSetCodigo() {
        Articulo instance = new Articulo();
        System.out.println("setCodigo");
        String codigo = "ok";
        
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Articulo.
     */
    @org.junit.Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Articulo instance = new Articulo();
        String expResult = instance.getDescripcion();
       
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Articulo.
     */
    @org.junit.Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Articulo instance = new Articulo();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioVenta method, of class Articulo.
     */
    @org.junit.Test
    public void testGetPrecioVenta() {
        System.out.println("getPrecioVenta");
        Articulo instance = new Articulo();
        double expResult = 0.0;
        double result = instance.getPrecioVenta();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioVenta method, of class Articulo.
     */
    @org.junit.Test
    public void testSetPrecioVenta() {
        System.out.println("setPrecioVenta");
        double precioVenta = 0.0;
        Articulo instance = new Articulo();
        instance.setPrecioVenta(precioVenta);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getGastosEnvio method, of class Articulo.
     */
    @org.junit.Test
    public void testGetGastosEnvio() {
        System.out.println("getGastosEnvio");
        Articulo instance = new Articulo();
        double expResult = 0.0;
        double result = instance.getGastosEnvio();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setGastosEnvio method, of class Articulo.
     */
    @org.junit.Test
    public void testSetGastosEnvio() {
        System.out.println("setGastosEnvio");
        double gastosEnvio = 0.0;
        Articulo instance = new Articulo();
        instance.setGastosEnvio(gastosEnvio);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getTiempoPreparacionMinutos method, of class Articulo.
     */
    @org.junit.Test
    public void testGetTiempoPreparacionMinutos() {
        System.out.println("getTiempoPreparacionMinutos");
        Articulo instance = new Articulo();
        int expResult = 0;
        int result = instance.getTiempoPreparacionMinutos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTiempoPreparacionMinutos method, of class Articulo.
     */
    @org.junit.Test
    public void testSetTiempoPreparacionMinutos() {
        System.out.println("setTiempoPreparacionMinutos");
        int tiempoPreparacionMinutos = 0;
        Articulo instance = new Articulo();
        instance.setTiempoPreparacionMinutos(tiempoPreparacionMinutos);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Articulo.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Articulo instance = new Articulo();
        String expResult =instance.toString(); 
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
