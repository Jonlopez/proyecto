
package udalekuak;

import bdudalekuak.UsuarioBd;
import java.util.Date;
import vista.ControlVistas;
import javax.swing.JDialog;
import uml.Sorteo;
import java.util.ArrayList;
import uml.Solicitud;

/**
 *
 * @author javi&Jon 
 */
public class Control {

    private static Sorteo sorteo;
    private static ArrayList<Solicitud>solicitudes;
    private static Solicitud solicitud;
    
    public static void main(String[] args) {
        vista.ControlVistas.inicializa();       
    }
/**
 * Validación del usuario administrador
 * @param user
 * @param pass
 * @param d 
 */    
    public static void logIn(String user, String pass, JDialog d)throws Exception{        
        boolean validar = UsuarioBd.consultarUsuario(user, pass);
        if(validar)
            ControlVistas.habilitarAdmin(d);        
        else ControlVistas.enviarMensaje("Usuario no valido");
    }
/**
 * Devuelve las fechas de la configuración de la aplicación
 */
    public static Sorteo cargarParametros(){        
        sorteo = new Sorteo();
        return sorteo;
    }
/**
 * Modifica las fechas de configuración de la aplicación
 * @param fIni
 * @param fFin
 * @param fsor
 * @param d 
 */    
    public static void guardarparametros(Date fIni, Date fFin, Date fsor,JDialog d){
        ControlVistas.cerrarDialogo(d);
    }
/**
 * Ejecuta el paquete Pl-Sql que realiza la mecanica 
 * del sorteo
 */  
    public static void ejecutarSorteo(){
        
    }
/**
 * Borra el resultado del Pl-Sql que realiza el sorteo
 */    
    public static void borrarSorteo(){
        
    }
/**
 * Retorna valor true para los centros que se encuentren 
 * en Álava o false para los que esten fuera de esta
 * @return 
 */    
    public static boolean obtenerCentros(){
        return true;
    }
/**
 * Guarda los datos de la solicitud y muestra mensaje 
 * de información
 * @param d 
 */    
    public static void finalizarSolicitud(JDialog d){
        bdudalekuak.InscripcionBd.insertarInscripcion();
        bdudalekuak.SolicitudBd.insertarSolicitud();
        ControlVistas.mostrarMensajesIns();
        ControlVistas.cerrarDialogo(d);
    }
/**
 * Devuelve los datos de una solicitud
 * @param dni
 * @param fecha
 * @return
 */    
    public static void obtenerSolicitud(String dni, Date fecha){
        solicitud = new Solicitud();
        bdudalekuak.SolicitudBd.consultaSolicitud();
        ControlVistas.muestraDetalleSolicitud(null, true, solicitud);
    }
/**
 * Devuelve el listado previo al sorteo
 * @return 
 */    
    public static ArrayList<Solicitud> obtenerListSorteo(){
        solicitudes = new ArrayList();
        bdudalekuak.SolicitudBd.consultaListSolicitud();
        return solicitudes;
    }
/**
 * Devuelve el listado posterior al sorteo ordenado
 * por el orden que espicifica el sorteo
 * @return 
 */    
    public static ArrayList<Solicitud>obtenerListPosterior(){
        solicitudes = new ArrayList();
        bdudalekuak.SolicitudBd.consultaListSolicitudBySorteo();
        return solicitudes;
    }
/**
 * Guarda las inscripciones de una en una
 */    
    public static void guardarInscripcion(){
        bdudalekuak.InscripcionBd.insertarInscripcion();
    }
}
