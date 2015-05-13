
package udalekuak;

import bdudalekuak.UsuarioBd;
import java.util.Date;
import vista.ControlVistas;
import javax.swing.JDialog;
import uml.Sorteo;
import java.util.ArrayList;
import uml.Inscripcion;
import uml.Solicitud;
import uml.Usuario;

/**
 *
 * @author javi&Jon 
 */
public class Control {

    private static Sorteo sorteo;
    private static ArrayList<Solicitud>solicitudes;
    private static ArrayList<Inscripcion>inscripciones;
    private static Solicitud solicitud;
    private static Inscripcion inscripcion;
    private static Usuario usuario;
    
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
        usuario = new Usuario(user, pass);
        usuario = UsuarioBd.consultarUsuario(usuario);
        if(usuario == null)
            throw new NullPointerException();   
        
        ControlVistas.habilitarAdmin(usuario,d); 
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
 * comprobamos el id de la ultima Solicitud
 * para generar uno nuevo a la siguiente
 */    
    public static int consultarIdSolicitud()throws Exception{
        return bdudalekuak.SolicitudBd.consultaSolicitudId();
    }
/**
 * Guarda los datos de la solicitud y muestra mensaje 
 * de información
 * @param d 
 */    
    public static void finalizarSolicitud(JDialog d,Inscripcion ins, Solicitud sol)throws Exception{
        guardarInscripcion(ins);
        bdudalekuak.SolicitudBd.insertarSolicitud(sol);
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
 * Genera un array de inscripciones donde 
 * ir coservando cada una hasta que finalice la solicitud
 */    
    public static void guardarInscripcion(Inscripcion insc){
        inscripcion = new Inscripcion();
        inscripciones = new ArrayList();
        for (int i = 0; i < inscripciones.size(); i++) {
            inscripcion = insc;
            inscripciones.add(insc);            
        }
        
    }
}
