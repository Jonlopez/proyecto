
package bdudalekuak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jon
 */
public class UsuarioBd extends GenericoBd{
    private static String plantilla;
    private static PreparedStatement sentenciaCon;
    private static ResultSet resultado;
/**
 * Consulta en la base de datos de la tabla usuarios
 * y retorna valor boolenao si existe o no
 * @param user
 * @param pass
 * @return
 * @throws Exception 
 */    
    public static boolean consultarUsuario(String user, String pass)throws Exception{
        boolean valido = false;        
        conectarBD();
            plantilla = "select nombre, contrasenna from usuarios where nombre = ?"
                    + "and contrasenna = ?";
            sentenciaCon = getCon().prepareStatement(plantilla);
             sentenciaCon.setString(1, user);
             sentenciaCon.setString(2, pass);
            resultado = sentenciaCon.executeQuery();            
            if(resultado!=null){
                valido = true;
            }
            resultado.close();
            desconectarBD();
        return valido;
    }
}
