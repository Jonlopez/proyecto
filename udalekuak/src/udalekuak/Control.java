
package udalekuak;

import bdudalekuak.UsuarioBd;
import java.util.Date;
import vista.ControlVistas;
import javax.swing.JDialog;
import uml.Sorteo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import uml.Inscripcion;
import uml.Solicitud;
import uml.Tutor;
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
    public static Inscripcion inscripcion;
    private static Usuario usuario;
    
    public static void main(String[] args) {
        //ordena a control vistas que inicie la parte grafica
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
 * Creamos un objeto solicitud al que le asignamos un nº
 * identificador 
 */    
    public static Solicitud creaSolicitud(){ 
      Solicitud sol = new Solicitud();
      try
      {          
          int id = bdudalekuak.SolicitudBd.consultaSolicitudId();          
          sol.setIdSolicitud(id+1);
      }
      catch (Exception e)
      {
            ControlVistas.enviarMensaje("Fallo al consultar id de solicitud");
      }
      return sol;
    }

/**
 * Guarda los datos de la solicitud y muestra mensaje 
 * de información
 * @param d 
 */    
    public static void finalizarSolicitud(Inscripcion ins, Solicitud sol)throws Exception{
        //confirma los datos(manda a un JConfirm) de la solicitud que se van a insertar
        if (JOptionPane.showConfirmDialog(ControlVistas.vSi, "Vas a dar de alta una solicitud con los siguientes datos:\n") == JOptionPane.YES_OPTION){}
        //si se aceptan los datos:
            //inserta solicitud
            bdudalekuak.SolicitudBd.insertarSolicitud(sol);
            //inserta tutor y guarda su nuevo id
            
            //inserta menor y guarda su nuevo id
            
            //inserta inscripcion con: id dtutor, id menor, direccion, telefonos, solicitud
            ControlVistas.mostrarMensajesIns();
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

   
    public static Inscripcion creaInscripcion()
    {
        return new Inscripcion();
    }
    
    public static Tutor buscaTutor(String dni)
    {
        Tutor t = null;
        
        //consulta el ide tutor con el dni
        //si existe crea un tutor en la variable t
        
        //devolvemos t
        return t;
    }
    
}
