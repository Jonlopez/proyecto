
package bddirecciones;

import direcciones.Control;
import java.util.ArrayList;
import uml.direcciones.Municipio;

/**
 *
 * @author javier_nogales
 */

public abstract class MunicipioBD extends GenericoBD{
    
    public static ArrayList<Municipio> getMunicipios(String municipio, int cpro)
    {        
        ArrayList<Municipio> listado = new ArrayList();
        String query = "SELECT * FROM ine_municipios WHERE cpro = ? AND lower(nmun) LIKE '%"+municipio+"%'";
        try
        {
           conectarBD();
           pstmt = con.prepareStatement(query);
           pstmt.setInt(1, cpro);
           //pstmt.setString(2, municipio);
           rs = pstmt.executeQuery();
           if (rs!=null)
           {
               Municipio m;
               int cmun;
               String nmun;
               while(rs.next())
               {
                   cmun = rs.getInt("cmun");
                   nmun = rs.getString("nmun");
                   m = new Municipio(null, cmun, nmun);
                   listado.add(m);
               }//END WHILE
               
           }else{System.out.println("la tabla municipios esta bacía o no da resultados");}
           
           con.close();
           
        }//END TRY//END TRY
        
        catch(Exception e)
        {
            System.out.println("Problemas con la carga de municipios: " +
                                e.getMessage() + e.getLocalizedMessage());
        }
        
        finally
        {
            desconectarBD();
        }        
        
        return listado;
        
    }
    
}
