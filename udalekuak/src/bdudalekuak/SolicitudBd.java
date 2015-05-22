
package bdudalekuak;

import javax.swing.JOptionPane;
import uml.Solicitud;


public class SolicitudBd extends GenericoBd{
    
    
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
 * @return devuelve numerico
 */     
    public static int consultaUltimoId(){
        int id = 0;
        try
        {   
            conectarBD();
            String query = "SELECT NVL(MAX(id_solicitud), 0) AS id_solicitud FROM solicitud";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if(rs.next())
                id = rs.getInt("id_solicitud");
            rs.close();
            desconectarBD();
        }
        catch (Exception e)
        {
              JOptionPane.showMessageDialog(null, "Fallo al consultar id de solicitud -->  " + e.getMessage());
        }
        return id;
    }
/**
 * Devuelve los datos de una solicitud
 */     
    public static void consultaSolicitud(){
        
    }
/**
 * Inserta las inscripciones de una solicitud
     * @param sol pasa solicitud
 */    
    public static void insertarSolicitud(Solicitud sol){        
        try
        {
            conectarBD();        
            String query = "INSERT INTO solicitud (id_solicitud, id_sorteo) VALUES (?,?)";
            pstmt = con.prepareStatement(query);        
            pstmt.setInt(1, sol.getIdSolicitud());        
            pstmt.setInt(2, sol.getIdSorteo());
            rs = pstmt.executeQuery();             
            desconectarBD();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Fallo al insertar id solicitud -->  " + e.getMessage());
        }
    }
}
