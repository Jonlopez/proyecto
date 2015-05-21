
package bddirecciones;

import controldirecciones.Control;
import java.util.ArrayList;
import umldirecciones.Municipio;

/**
 *
 * @author javier_nogales
 */

public abstract class MunicipioBD extends GenericoBD{
    
    /**
     * busca en la tabla ine_municipios por codigo de provincia.
     * recive como parametros:
     * @param municipio
     * @param cpro
     * retorna un arraylist con todos los municipios que ha encontrado.
     * @return 
     */
    public static ArrayList<Municipio> getMunicipios(String municipio, int cpro)
    {        
        ArrayList<Municipio> listado = new ArrayList();
        String query = "SELECT cmun, nmun FROM ine_municipios WHERE cpro = ? AND lower(nmun) LIKE lower('%"+ municipio + "%')";
        //Nota: La razon de utilizar DISTINCT es porque la tabla, los municipios estan repetidos
        //      la tabla hace referencia a nucleos poblacionales que 
        try
        {
           conectarBD();
           
           pstmt = con.prepareStatement(query);
           pstmt.setInt(1, cpro);
           
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
               }               
           }else{System.out.println("la tabla municipios esta bacía o no da resultados");}           
        }        
        catch(Exception e)
        {
            System.out.println("Problemas con la carga de municipios: " + e.getMessage());
        }        
        finally
        {
            desconectarBD();
        }        
        
        return listado;
        
    }
    
}
