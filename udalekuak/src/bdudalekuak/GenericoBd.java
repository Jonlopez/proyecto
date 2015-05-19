
package bdudalekuak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author javi&Jon
 */
public class GenericoBd {
    private static final String BD       = "orcl";
    //private static final String URL      = "jdbc:oracle:thin:@192.168.56.102:1521:" + BD; //maquina de Javi
    private static final String URL      = "jdbc:oracle:thin:@192.168.2.2:1521:" + BD; //maquina de Jon
    private static final String USER     = "JAVI";
    private static final String PASSWORD = "javi";    
    
    protected static Connection con = null;
    
    protected static Statement         stmt;
    protected static PreparedStatement pstmt;
    protected static ResultSet         rs;
    
    public static void conectarBD()
    {   
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            //if(con!=null)
              // JOptionPane.showMessageDialog(null, "Conexion exitosa!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error en la conexion: " + e.getMessage());
        }
        
    }
    
    public static void desconectarBD(){
        try
        {
            con.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error en la DES-conexion: " + e.getMessage());
        }
    }
   public static Connection getCon(){
        return con;
    }
   /*ESTE METODO ESTA PARAMETRIZADO PARA QUITAR EL QUE TIENE CADA CLASE *BD, PERO TODAVIA NO ESTA IMPLEMENTADO EN LAS LLAMADAS
   public static int consultaUltimoId(String campo, String tabla)
    {
        int id = 0;
        try
        {   
            conectarBD();
            String query = "SELECT NVL(MAX(" + campo + "), 0) AS id_persona FROM " + tabla;
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if(rs.next())
                id = rs.getInt("id_persona");
            rs.close();
            desconectarBD();
        }
        catch (Exception e)
        {
              JOptionPane.showMessageDialog(null, "Fallo al consultar id de persona -->  " + e.getMessage());
        }
        return id;
    }
   */
   
}//END CLASS GenericoBD
