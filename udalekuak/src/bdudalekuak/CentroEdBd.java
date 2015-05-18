
package bdudalekuak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import uml.CentroEd;
import umldirecciones.Provincia;

/**
 *
 * @author javi&Jon
 */
public class CentroEdBd extends GenericoBd{
    private static ArrayList listadoCentros;
    private static CentroEd centro;
    private static String plantilla;
    private static PreparedStatement sentenciaCon;
    private static ResultSet resultado;
    
/**
 * Devuelve todos los centros de Álava 
 * o de fuera de esta
 */    
    public static ArrayList<CentroEd> consultarCentrosAlava(int p)throws Exception{
         
        listadoCentros = new ArrayList();
        conectarBD();
            plantilla = "select id_centro, nombre_ced from centro_ed where cprov = ? ";
            sentenciaCon.setInt(1, p);
            resultado = sentenciaCon.executeQuery();            
            while(resultado.next()){
                centro = new CentroEd();
                centro.setIdCentro(resultado.getInt("id_centro"));
                centro.setNombreCtr(resultado.getString("nombre_ced"));
            }
            resultado.close();
            desconectarBD();
            
        return listadoCentros;
    
    }
    
    public static ArrayList<CentroEd> consultarCentrosFuera(int p, int pr)throws Exception{
         
        listadoCentros = new ArrayList();
        conectarBD();
            plantilla = "select id_centro, nombre_ced from centro_ed where cprov = (?,?) ";
            sentenciaCon.setInt(1, p);
            sentenciaCon.setInt(2, pr);
            resultado = sentenciaCon.executeQuery();            
            while(resultado.next()){
                centro = new CentroEd();
                centro.setIdCentro(resultado.getInt("id_centro"));
                centro.setNombreCtr(resultado.getString("nombre_ced"));
            }
            resultado.close();
            desconectarBD();
            
        return listadoCentros;
    
    }
}
