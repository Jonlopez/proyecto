package bddirecciones;


import controldirecciones.Control;
import java.util.ArrayList;
import umldirecciones.Poblacion;
import umldirecciones.Via;


public abstract class ViaBD extends GenericoBD{
    /**
     * busca las calles en la tabla.
     * busca si algun nombre de calle contiene los caracteres de busqueda
     * 
     * @param via
     * @param cmun
     * @param cpro
     * @return 
     */
    public static ArrayList<Via> getVias(String via, int cmun, int cpro)
    {     
        //hace una seleccion de las calles por municipio (cpro y cmun el la pk de ine_vias)
        ArrayList<Via> listado = new ArrayList();
        String query = "SELECT cvia, tvia, pos, nvia "
                     + "FROM ine_vias "
                     + "WHERE cpro = ? AND cmun = ? AND upper(nvia) LIKE '%"+via.toUpperCase()+"%' "//en otras esta con el lower de SQL
                     + "ORDER BY nvia";
        try
        {
           conectarBD();
           pstmt = con.prepareStatement(query);
           pstmt.setInt(1, cpro);
           pstmt.setInt(2, cmun);
           rs = pstmt.executeQuery();
           if (rs!=null)
           {
               Via v;
               int    cvia;
               String tvia;
               int    pos;
               String nvia;
               while(rs.next())
               {                   
                   cvia = rs.getInt("cvia");
                   tvia = rs.getString("tvia").trim();
                   pos  = rs.getInt("pos");
                   nvia = rs.getString("nvia").trim();
                   v = new Via(Control.direccion.getMunicipio(), cvia, tvia, pos, nvia);
                   listado.add(v);
               }
               
           }else{System.out.println("la tabla provincias esta bacía o no da resultados");}
           
           con.close();
           
        }//end try
        
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

