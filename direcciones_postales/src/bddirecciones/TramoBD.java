package bddirecciones;


import controldirecciones.Control;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import umldirecciones.Tramo;
import umldirecciones.Via;


public abstract class TramoBD extends GenericoBD{
    //private static Object ResultSupport;
    public static Tramo tramo;
    
    public static Tramo getTramos(int cpro, int cmun, int cvia, int cpos ,int tinum, int portal)
    {        
        
        String query = "SELECT * "
                     + "FROM ine_tramos "
                     + "WHERE (cpro = ? AND cmun = ? AND cvia = ? AND cpos = ? AND tinum = ?) AND ( ? BETWEEN ein AND esn) ";
        try
        {
           conectarBD();
           pstmt = con.prepareStatement(query);
           pstmt.setInt(1, cpro);
           pstmt.setInt(2, cmun);
           pstmt.setInt(3, cvia);
           pstmt.setInt(4, cpos);
           pstmt.setInt(5, tinum);
           pstmt.setInt(6, portal);
           rs = pstmt.executeQuery();
           
                        
               if(rs.next())
               {   
                    int       cun;
                     int       ctra;
                     int       distrito;
                     int       seccion;
                     String    subseccion;
                     int       tinum2;
                     int       ein;
                     String    cein;
                     int       esn;
                     String    cesn;
                   
                   Control.direccion.getLocalidad().setCun(rs.getInt("cun"));
                   ctra = rs.getInt("ctra");
                   distrito = rs.getInt("dist");
                   seccion  = rs.getInt("secc");
                   subseccion = rs.getString("subsecc").trim();
                   tinum2 = rs.getInt("tinum");
                   ein = rs.getInt("ein");
                   cein = rs.getString("cein");
                   esn = rs.getInt("esn");
                   cesn = rs.getString("cesn");
                                      
                   tramo = new Tramo(ctra, distrito, seccion, subseccion, tinum2, ein, cein, esn, cesn);                   
               }
               else
               {
                   System.out.println("ERROR!! la tabla tramos no da resultados");
               }
               if(rs.next())
                   JOptionPane.showMessageDialog(null, "ERROR!! la consulta de tramo devuelve mas de una fila");
               
           
           
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
        return tramo;
    }
    
    
    
    
    
    
    
}//END PoblacionBD

