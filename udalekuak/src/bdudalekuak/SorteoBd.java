
package bdudalekuak;

import static bdudalekuak.GenericoBd.conectarBD;
import static bdudalekuak.GenericoBd.stmt;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import udalekuak.Control;
import uml.Sorteo;

/**
 *
 * @author javi&Jon
 */
public class SorteoBd extends GenericoBd{

    
    
/**
 * consulta las fechas de configuración de la aplicación
 */    
    public static Sorteo consultaSorteo(){
       Sorteo sorteo = null;
        try
        {   
            conectarBD();
            String query = "SELECT f_ini_ins, f_fin_ins, f_sorteo FROM sorteo WHERE id_sorteo = TO_NUMBER(SYSDATE, 'year')";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if(rs.next()){
               sorteo = new Sorteo(); 
                sorteo.setIdSorteo(rs.getInt("id_solicitud"));
                sorteo.setfIniInsc(new java.util.Date(rs.getDate("f_ini_ins").getTime()));
                sorteo.setfFinInsc(new java.util.Date(rs.getDate("f_fin_ins").getTime()));
                
                rs.close();            
            }
            desconectarBD();     
        }
        catch (Exception e)
        {
              JOptionPane.showMessageDialog(null, "Fallo al consultar fechas sorteo -->  " + e.getMessage());
        } 
       return sorteo;
    }
/**
 * Modifica las fechas de configuración de la aplicación
 */    
    public static void modificarFechas(){
        
    }



    public static void ejecutaSorteo()
    {
        conectarBD();
        //creamos la cadena 
        //String sql ="{call paquete_sorteo.ejecuta_sorteo (?,?,?,?)}";
        try
        {
            
            //creamos el callable stmt. (no lo ponemos en genericoBD porque solo se utiliza aqui)
            CallableStatement cstmt = con.prepareCall("{call paquete_sorteo.ejecuta_sorteo (?,TO_DATE('30/05/2015', 'dd/mm/yyyy'),?,?)}");
            
            //cargamos los datos de netrada
            cstmt.setInt(1, 2015);/*Control.sorteo.getIdSorteo()*/
            //cstmt.setDate(2, new java.sql.Date(Control.sorteo.getfSorteo().getTime()));
            
            //cargamos los datos de salida
            cstmt.registerOutParameter(2, java.sql.Types.NUMERIC);
            cstmt.registerOutParameter(3, java.sql.Types.NUMERIC);
            
            //ejecutamos
            cstmt.execute();
            
            //recogemos los parametros de salida en dos variables
            int numeroSorteo;
            int numeroParticipantes;
            numeroSorteo = cstmt.getInt("p_num_sorteo");
            numeroParticipantes = cstmt.getInt("p_num_solicitud");
            
            
            //lanzamos dos mensajes con los dos datos de salida
            JOptionPane.showMessageDialog(null, "Numero de solicitudes participantes en el sorteo:  " + numeroParticipantes);
            JOptionPane.showMessageDialog(null, "El número del sorteo ha sido el:       " + numeroSorteo);
        
        }
        catch (SQLException e)
        {
            //recogemos la exception de SQL
            Logger.getLogger(SorteoBd.class.getName()).log(Level.SEVERE, null, e);
        }
        catch (HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "Error al ejecutar el sorteo --> " + e.getMessage());
        }
        finally
        {
            desconectarBD();
        }

    }
    
    public static void borraSorteo()
    {
        //este metodo, logicamente es de sorteo, pero realmente tendria que estar en solicitud ya que actua sobre su tabla en oracle
        try
        {   
            conectarBD();
            String query = "UPDATE solicitud " +
                           "SET p_sorteo = null, " +
                               "f_elc = null " +
                           "WHERE id_sorteo = 2015";//esto hay que cambiarlo, hay que sustituir 2015 por el parametro del objeto sorteo
            stmt = con.createStatement();
            if(stmt.execute(query))
                JOptionPane.showMessageDialog(null, "las citas asignadas han sido eliminadas");
            else
                JOptionPane.showMessageDialog(null, "no se ha eliminado ninguna cita");   
        }
        catch (Exception e)
        {
              JOptionPane.showMessageDialog(null, "Fallo al consultar fechas sorteo -->  " + e.getMessage());
        }
        finally
        {
            desconectarBD();
        }
    }

}
