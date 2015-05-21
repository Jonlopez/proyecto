
package bddirecciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public abstract class GenericoBD {
    
    private static final String BD       = "orcl";
    private static final String URL      = "jdbc:oracle:thin:@192.168.56.102:1521:" + BD;
    //private static final String URL      = "jdbc:oracle:thin:@192.168.2.2:1521:" + BD;
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
            //    JOptionPane.showMessageDialog(null, "Conexion exitosa!");
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
        
    
}//END CLASS GenericoBD