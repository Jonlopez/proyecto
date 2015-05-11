
package bddirecciones;

import java.util.ArrayList;
import uml.direcciones.Provincia;


public abstract class ProvinciaBD extends GenericoBD{
    
    public static ArrayList<Provincia> getProvincias()
    {
        ArrayList<Provincia> listado = new ArrayList();
        String query = "SELECT cprov, nprov FROM ine_provincias";
        try
        {
           conectarBD();
           stmt = con.createStatement();
           rs = stmt.executeQuery(query);
           if (rs!=null)
           {
               Provincia p;
               int cprov;
               String nprov;
               while(rs.next())
               {
                   cprov = rs.getInt("cprov");
                   nprov = rs.getString("nprov");
                   p = new Provincia(cprov, nprov);
                   listado.add(p);
               }//END WHILE
               
           }else{System.out.println("la tabla provincias esta bacía o no da resultados");}
           
           rs.close();
           
        }//END TRY
        
        catch(Exception e)
        {
            System.out.println("Problemas con la carga de PROVINCIAS" +
                                e.getMessage());
        }
        
        finally
        {
            desconectarBD();
        }        
        
        return listado;
        
    }
    
    
    
}//END ProvinciaBD
