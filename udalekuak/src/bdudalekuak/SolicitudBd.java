
package bdudalekuak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import uml.Solicitud;

/**
 *
 * @author javi&Jon
 */
public class SolicitudBd extends GenericoBd{
    
    private static PreparedStatement sentenciaCon;
    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
/**
 * Devuelve las solicitudes por orden de sorteo
 */    
    public static void consultaListSolicitudBySorteo(){
        
    }
/**
 * Devuelve un listado de todas las solicitudes
 * antes del sorteo
 */    
    public static void consultaListSolicitud(){
       
    }
/**
 * Devuelve el id de la ultima solicitud
 */     
    public static int consultaSolicitudId()throws Exception{
        conectarBD();
        sentencia = getCon().createStatement();
        resultado = sentencia.executeQuery("select MAX(id_solicitud) from solicitud ");
        
        int id = resultado.getInt("id_solicitud");
        
        resultado.close();
        desconectarBD();
        
        return id;
    }
/**
 * Devuelve los datos de una solicitud
 */     
    public static void consultaSolicitud(){
        
    }
/**
 * Inserta las inscripciones de una solicitud
 */    
    public static void insertarSolicitud(Solicitud sol)throws Exception{        
        conectarBD();        
        plantilla = "INSERT INTO solicitud (id_solicitud) VALUES (?)";
        sentenciaCon = getCon().prepareStatement(plantilla);        
        sentenciaCon.setInt(1, sol.getIdSolicitud());
        
            sentenciaCon.executeUpdate();
             
        desconectarBD();        
    }
}
