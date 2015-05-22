
package bdudalekuak;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import uml.CentroEd;


public class CentroEdBd extends GenericoBd{
    private static ArrayList listadoCentros;
    private static CentroEd centro;
    
/**
 * Devuelve todos los centros de Álava 
 * o de fuera de esta
 * @param alava centros de alava
 * @return devuelve los centros
 */    
    public static ArrayList<CentroEd> consultarCentros(boolean alava){
         
        listadoCentros = new ArrayList();
        String query;
        try{
            conectarBD();
                if(alava)
                    query = "select id_centro, nombre_ced from centro_ed where cpro = 01 ";
                else
                    query = "select id_centro, nombre_ced from centro_ed where cpro = 20 OR cpro = 48";
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                while(rs.next()){
                    centro = new CentroEd();
                    centro.setIdCentro(rs.getInt("id_centro"));
                    centro.setNombreCtr(rs.getString("nombre_ced"));
                    listadoCentros.add(centro);
                }
                rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error en la consulta de centros --> " + e.getMessage());
        }
        finally
        {
            desconectarBD();
        }           
        return listadoCentros;
    
    }
    
    
}
