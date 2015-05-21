/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udalekuak;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDialog;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uml.CentroEd;
import uml.Inscripcion;
import uml.Menor;
import uml.Solicitud;
import uml.Sorteo;
import uml.Tutor;

/**
 *
 * @author Jon
 */
public class ControlTest {
    
    public ControlTest() {
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
     * Test of main method, of class Control.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Control.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logIn method, of class Control.
     */
    @Test
    public void testLogIn() {
        System.out.println("logIn");
        String user = "";
        String pass = "";
        JDialog d = null;
        Control.logIn(user, pass, d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarParametros method, of class Control.
     */
    @Test
    public void testCargarParametros() {
        System.out.println("cargarParametros");
        Sorteo expResult = null;
        Sorteo result = Control.cargarParametros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarparametros method, of class Control.
     */
    @Test
    public void testGuardarparametros() {
        System.out.println("guardarparametros");
        Date fIni = null;
        Date fFin = null;
        Date fsor = null;
        JDialog d = null;
        Control.guardarparametros(fIni, fFin, fsor, d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutarSorteo method, of class Control.
     */
    @Test
    public void testEjecutarSorteo() {
        System.out.println("ejecutarSorteo");
        Control.ejecutarSorteo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarSorteo method, of class Control.
     */
    @Test
    public void testBorrarSorteo() {
        System.out.println("borrarSorteo");
        Control.borrarSorteo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCentrosCB method, of class Control.
     */
    @Test
    public void testBuscarCentrosCB() {
        System.out.println("buscarCentrosCB");
        boolean alava = false;
        ArrayList<CentroEd> expResult = null;
        ArrayList<CentroEd> result = Control.buscarCentrosCB(alava);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creaSolicitud method, of class Control.
     */
    @Test
    public void testCreaSolicitud() {
        System.out.println("creaSolicitud");
        Solicitud expResult = null;
        Solicitud result = Control.creaSolicitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalizarSolicitud method, of class Control.
     */
    @Test
    public void testFinalizarSolicitud() throws Exception {
        System.out.println("finalizarSolicitud");
        Solicitud sol = null;
        Control.finalizarSolicitud(sol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeMenor method, of class Control.
     */
    @Test
    public void testExisteMenor() {
        System.out.println("existeMenor");
        Menor m = null;
        boolean expResult = false;
        boolean result = Control.existeMenor(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerSolicitud method, of class Control.
     */
    @Test
    public void testObtenerSolicitud() {
        System.out.println("obtenerSolicitud");
        String dni = "";
        Date fecha = null;
        Control.obtenerSolicitud(dni, fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerListSorteo method, of class Control.
     */
    @Test
    public void testObtenerListSorteo() {
        System.out.println("obtenerListSorteo");
        ArrayList<Solicitud> expResult = null;
        ArrayList<Solicitud> result = Control.obtenerListSorteo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerListPosterior method, of class Control.
     */
    @Test
    public void testObtenerListPosterior() {
        System.out.println("obtenerListPosterior");
        ArrayList<Solicitud> expResult = null;
        ArrayList<Solicitud> result = Control.obtenerListPosterior();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creaInscripcion method, of class Control.
     */
    @Test
    public void testCreaInscripcion() {
        System.out.println("creaInscripcion");
        Inscripcion expResult = null;
        Inscripcion result = Control.creaInscripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaTutor method, of class Control.
     */
    @Test
    public void testBuscaTutor() {
        System.out.println("buscaTutor");
        String dni = "";
        Tutor expResult = null;
        Tutor result = Control.buscaTutor(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
