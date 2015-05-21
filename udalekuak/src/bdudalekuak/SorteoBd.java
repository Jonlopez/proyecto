
package bdudalekuak;

import static bdudalekuak.GenericoBd.conectarBD;
import static bdudalekuak.GenericoBd.stmt;
import javax.swing.JOptionPane;
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
}
