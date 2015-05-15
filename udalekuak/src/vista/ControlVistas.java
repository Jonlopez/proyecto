
package vista;

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
    private static Admin vA;
    private static Csolicitud vCs;
    private static Dsolicitud vDc;
    private static Lposterior vLps;
    private static Lprevio vLpr;
    private static Parametros vPa;
    private static Sinscripcion vSi;
    private static Sorteo vSor;

/**
 * Se incializa el programa mosntrando la
 * ventana principal
 */    
    public static void inicializa(){
        vP = new Vprincipal();
        vP.setVisible(true);
    }
/**
 * Si nos logeamos como administrador se
 * habilitan todas sus funciones
 * @param user
 * @param d 
 */    
    public static void habilitarAdmin(Usuario user, JDialog d){     
        vP.habilitarMenus();
        enviarMensaje("Bienvenido/a: " + user.getNombre());
        cerrarDialogo(d);
        
    }
/**
 * Este metodo se reutiliza para enviar
 * diferentes mensajes a traves de un parametro
 * @param mensaje 
 */    
    public static void enviarMensaje(String mensaje){        
        JOptionPane.showMessageDialog(vP, mensaje);
    }
/**
 * Este metodo se reutiliza para cerrar diferentes
 * JDialog
 * @param dialogo 
 */    
    public static void cerrarDialogo(javax.swing.JDialog dialogo){
        dialogo.dispose();
    }
/**
 * Muestra la ventana para inciar sesión
 * como usuario Administrador
 * @param p
 * @param modal 
 */    
    public static void muestraLogin(java.awt.Frame p, boolean modal){
        vA = new Admin(p, true);        
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
  * @param p
  * @param modal 
  */   
    public static void muestraConfig(java.awt.Frame p, boolean modal){
        vPa = new Parametros(p, true);        
        vPa.setVisible(true);        
    }
/**
 * Muestra la ventana donde se ejecuta el sorteo
 * con opción a borrar si ya se ha realizado
 * @param p
 * @param modal 
 */            
    public static void muestraSorteo(java.awt.Frame p, boolean modal){
        vSor = new Sorteo(p, true);        
        vSor.setVisible(true);        
    }
/**
 * Muestra la ventana de inscripción
 * @param p
 * @param modal 
 */    
    public static void muestraInscripcion(java.awt.Frame p, boolean modal){
        vSi = new Sinscripcion(p, true);        
        vSi.setVisible(true);        
    }
/**
 * Muestra la ventana para consultar la inscripción
 * @param p
 * @param modal 
 */    
    public static void muestraConsultaSol(java.awt.Frame p, boolean modal){
        vCs = new Csolicitud(p, true);        
        vCs.setVisible(true);        
    }
    /**
 * Muestra el listado previo al soreto de las inscripciones
 * @param p
 * @param modal 
 */    
    public static void muestraListadoPrevio(java.awt.Frame p, boolean modal){
        vLpr = new Lprevio(p, true);        
        vLpr.setVisible(true);        
    }
/**
 * Muestra el listado posterior al sorteo de las inscripciones
 * ordenad por el número asignado por este
 * @param p
 * @param modal 
 */    
    public static void muestraListadoPosterior(java.awt.Frame p, boolean modal){
        vLps = new Lposterior(p, true);        
        vLps.setVisible(true);        
    }
/**
 * Muestra un pequeño resumen de la solicitud recien insertada
 * y el numero de Solicitud que pertenece a esta
 */    
    public static void mostrarMensajesIns(){
        
    }
/**
 * Llama y llena con datos la venta Detalle de solicitud 
 * (Falta sobrecargar el constructor de Dsolicitud)
 * @param p
 * @param modal
 * @param solicitud 
 */    
    public static void muestraDetalleSolicitud(java.awt.Frame p, boolean modal, Solicitud solicitud){
        vDc = new Dsolicitud(p, true);        
        vDc.setVisible(true);
        
    }
    
/**
 * Finaliza la aplicación
 */    
    public static void salir(){
        System.exit(0);
    }
}
