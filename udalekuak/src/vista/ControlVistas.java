
package vista;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import uml.Solicitud;
import uml.Usuario;

/**
 *
 * @author javi&Jon
 */
public class ControlVistas {
    private static Vprincipal vP;
    private static PanelFondo pF;
    private static Admin vA;
    private static Csolicitud vCs;
    private static Dsolicitud vDc;
    private static Lposterior vLps;
    private static Lprevio vLpr;
    private static Parametros vPa;
    public static Sinscripcion vSi;
    private static Sorteo vSor;

/**
 * Se incializa el programa mosntrando la
 * ventana principal al que añadimos un panel
 * con un fondo
 */    
    public static void inicializa(){
        vP = new Vprincipal();        
        
        pF = new PanelFondo();
        vP.add(pF, BorderLayout.CENTER);
        vP.pack();
        vP.setVisible(true);
    }
    
    public static void vuelveVprincipal()
    {
        vA.dispose();
        vCs.dispose();
        vDc.dispose();
        vLps.dispose();
        vLpr.dispose();
        vPa.dispose();
        vSi.dispose();
        vSor.dispose();
    }
/**
 * Si nos logeamos como administrador se
 * habilitan todas sus funciones
 * @param user usuario
 * @param d dialogo
 */    
    public static void habilitarAdmin(Usuario user, JDialog d){     
        vP.habilitarMenus();
        enviarMensaje("Bienvenido/a: " + user.getNombre());
        cerrarDialogo(d);
        
    }
/**
 * Este metodo se reutiliza para enviar
 * diferentes mensajes a traves de un parametro
 * @param mensaje mensaje
 */    
    public static void enviarMensaje(String mensaje){        
        JOptionPane.showMessageDialog(vP, mensaje);
    }
/**
 * Este metodo se reutiliza para cerrar diferentes
 * JDialog
 * @param dialogo dialogo
 */    
    public static void cerrarDialogo(javax.swing.JDialog dialogo){
        dialogo.dispose();
    }
/**
 * Muestra la ventana para inciar sesión
 * como usuario Administrador
 * 
 */    
    public static void muestraLogin(){
        vA = new Admin(vP, true);        
        vA.setVisible(true);
    }    
 /**
  * Cierra la sesión de administrador
  */
    public static void logOut(){
        
    }
 /**
  * Muestra la ventana de parametros
  * (Falta cargar datos)
  * 
  */   
    public static void muestraConfig(){
        vPa = new Parametros(vP, true);        
        vPa.setVisible(true);        
    }
/**
 * Muestra la ventana donde se ejecuta el sorteo
 * con opción a borrar si ya se ha realizado
 */            
    public static void muestraSorteo(){
        vSor = new Sorteo(vP, true);        
        vSor.setVisible(true);        
    }
/**
 * Muestra la ventana de inscripción
 * 
 */    
    public static void muestraInscripcion(){
        vSi = new Sinscripcion(vP, true);        
        vSi.setVisible(true);        
    }
/**
 * Muestra la ventana para consultar la inscripción
 *  
 */    
    public static void muestraConsultaSol(){
        vCs = new Csolicitud(vP, true);        
        vCs.setVisible(true);        
    }
    /**
 * Muestra el listado previo al soreto de las inscripciones
 * 
 */    
    public static void muestraListadoPrevio(){
        vLpr = new Lprevio(vP, true);        
        vLpr.setVisible(true);        
    }
/**
 * Muestra el listado posterior al sorteo de las inscripciones
 * ordenad por el número asignado por este
 * 
 */    
    public static void muestraListadoPosterior(){
        vLps = new Lposterior(vP, true);        
        vLps.setVisible(true);        
    }
/**
 * Muestra un pequeño resumen de la solicitud recien insertada
 * y el numero de Solicitud que pertenece a esta
 */    
    public static void mostrarResumenSol(){
        
    }
/**
 * Llama y llena con datos la venta Detalle de solicitud 
 * (Falta sobrecargar el constructor de Dsolicitud)
 * 
 * @param solicitud solicitud
 */    
    public static void muestraDetalleSolicitud(Solicitud solicitud){
        vDc = new Dsolicitud(vP, true);        
        vDc.setVisible(true);
    }
    
/**
 * Finaliza la aplicación
 */    
    public static void salir(){
        System.exit(0);
    }
}
