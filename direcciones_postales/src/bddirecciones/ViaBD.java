package bd;


import controldirecciones.Control;
import java.util.ArrayList;
import uml.Poblacion;
import uml.Via;


public abstract class ViaBD extends GenericoBD{
    
    public static ArrayList<Via> getVias(String via, int cmun, int cpro)
    {        
        ArrayList<Via> listado = new ArrayList();
        String query = "SELECT cvia, tvia, pos, nvia "
                     + "FROM ine_vias "
                     + "WHERE cpro = ? AND cmun = ? AND upper(nvia) LIKE '%"+via.toUpperCase()+"%' "
                     + "ORDER BY nvia";
        try
        {
           conectarBD();
           pstmt = con.prepareStatement(query);
           pstmt.setInt(1, cpro);
           pstmt.setInt(2, cmun);
           //pstmt.setString(3, via);
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
               }//END WHILE
               
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

