package bddirecciones;


import controldirecciones.Control;
import java.util.ArrayList;
import umldirecciones.Poblacion;

/**
 * 
 * @author javi
 */
public abstract class PoblacionBD extends GenericoBD{
    /**
     * busca las localidades por provincia.
     * retorna un arraylist de poblaciones
     * 
     * @param localidad
     * @param cmun
     * @param cpro
     * @return 
     */
    public static ArrayList<Poblacion> getLocalidades(String localidad, int cmun, int cpro)
    {        
        ArrayList<Poblacion> listado = new ArrayList();
        
        // PARA BLANCA => la razon de usar DISTINCT es porque en la tabla ine_poblaciones
        //                la unidad es el campo nnucle50 y puede haber varios nucleos con la misma poblacion.
        //                osea que hay mas de una fila con el mismo campo nentsi50.
        String query = "SELECT DISTINCT nentsi50 "
                     + "FROM ine_poblaciones "
                     + "WHERE cpro = ? AND cmun = ? AND upper(nnucle50) LIKE '%"+ localidad.toUpperCase() + "%' "
                     + "ORDER BY nentsi50";
        try
        {
           conectarBD();
           pstmt = con.prepareStatement(query);
           pstmt.setInt(1, cpro);
           pstmt.setInt(2, cmun);
           rs = pstmt.executeQuery();
           if (rs!=null)
           {
               Poblacion p;
               String nentsi50;
               while(rs.next())
               {                   
                   nentsi50 = rs.getString("nentsi50").trim();
                   p = new Poblacion(Control.direccion.getMunicipio(), nentsi50);
                   listado.add(p);
               }
               
           }else{System.out.println("la tabla provincias esta bacía o no da resultados");}
           
           con.close();
           
        }//END TRY//END TRY
        
        catch(Exception e)
        {
            System.out.println("Problemas con la carga de POBLACIONES " +
                                e.getMessage() + e.getLocalizedMessage());
        }
        
        finally
        {
            desconectarBD();
        }        
        
        return listado;
        
    }
    
    
    
    
    
    
    
}//END PoblacionBD

