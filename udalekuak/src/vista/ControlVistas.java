
package vista;

import javax.swing.JOptionPane;
import javax.swing.JDialog;
import uml.Solicitud;

/**
 *
 * @author javi&Jon
 */
public class ControlVistas {
    private static Vprincipal vP;

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
 * @param d 
 */    
    public static void habilitarAdmin(JDialog d){        
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
        Admin frmdialog2 = new Admin(p, true);        
        frmdialog2.setVisible(true);
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
        Parametros frmdialog2 = new Parametros(p, true);        
        frmdialog2.setVisible(true);        
    }
/**
 * Muestra la ventana donde se ejecuta el sorteo
 * con opción a borrar si ya se ha realizado
 * @param p
 * @param modal 
 */            
    public static void muestraSorteo(java.awt.Frame p, boolean modal){
        Sorteo frmdialog2 = new Sorteo(p, true);        
        frmdialog2.setVisible(true);        
    }
/**
 * Muestra la ventana de inscripción
 * @param p
 * @param modal 
 */    
    public static void muestraInscripcion(java.awt.Frame p, boolean modal){
        Sinscripcion frmdialog2 = new Sinscripcion(p, true);        
        frmdialog2.setVisible(true);        
    }
/**
 * Muestra la ventana para consultar la inscripción
 * @param p
 * @param modal 
 */    
    public static void muestraConsultaSol(java.awt.Frame p, boolean modal){
        Csolicitud frmdialog2 = new Csolicitud(p, true);        
        frmdialog2.setVisible(true);        
    }
    /**
 * Muestra el listado previo al soreto de las inscripciones
 * @param p
 * @param modal 
 */    
    public static void muestraListadoPrevio(java.awt.Frame p, boolean modal){
        Lprevio frmdialog2 = new Lprevio(p, true);        
        frmdialog2.setVisible(true);        
    }
/**
 * Muestra el listado posterior al sorteo de las inscripciones
 * ordenad por el número asignado por este
 * @param p
 * @param modal 
 */    
    public static void muestraListadoPosterior(java.awt.Frame p, boolean modal){
        Lposterior frmdialog2 = new Lposterior(p, true);        
        frmdialog2.setVisible(true);        
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
        Dsolicitud frmdialog2 = new Dsolicitud(p, true);        
        frmdialog2.setVisible(true);
        
    }
/**
 * Finaliza la aplicación
 */    
    public static void salir(){
        System.exit(0);
    }
}
