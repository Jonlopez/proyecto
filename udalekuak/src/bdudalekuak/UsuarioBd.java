
package bdudalekuak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import uml.Usuario;

/**
 *
 * @author Jon
 */
public class UsuarioBd extends GenericoBd{
    private static String plantilla;
    private static PreparedStatement sentenciaCon;
    private static ResultSet resultado;
    private static Usuario usuario;
/**
 * Consulta en la base de datos de la tabla usuarios
 * y retorna valor boolenao si existe o no
 * @param user
 * @param pass
 * @return
 * @throws Exception 
 */    
    public static boolean consultarUsuario(Usuario user){
        boolean existe = false;
        try{
           conectarBD();
        plantilla = "select nombre from usuario where LOWER(nombre) = ? and contrasenna = ?";
        sentenciaCon = getCon().prepareStatement(plantilla);
        sentenciaCon.setString(1, user.getNombre());
        sentenciaCon.setString(2, user.getContrasenna());
        resultado = sentenciaCon.executeQuery();
        if(resultado.next()){
            existe = true;
        }
        else
            existe = false;
        resultado.close();
        desconectarBD(); 
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
        
        return existe;
    }
}
