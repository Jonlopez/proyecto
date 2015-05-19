
package bdudalekuak;

import javax.swing.JOptionPane;
import uml.Tutor;

/**
 *
 * @author javi&Jon
 */
public class TutorBd extends GenericoBd{
    
    
    /**
     * busca tutor por dni y devuelve su id_persona
     * @param dni
     * @return 
     */
    public static Tutor buscaDniTutor(String dni)
    {
        Tutor t = null;
        String query = "SELECT id_persona FROM tutor WHERE dni = ?";
        try
        {
            conectarBD();
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, dni);
            rs = pstmt.executeQuery();
            
            if(rs.next())
            {
                t = new Tutor(rs.getInt("id_persona"));                
            }
            desconectarBD();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error en la busqueda de tutor --->  " + e.getMessage());
        }
        return t;
    }
    
        
    public static void insertarTutor(Tutor t){
        String queryPersona = "INSERT INTO persona VALUES(?, ?, ?, ?)";
        String queryTutor   = "INSERT INTO tutor   VALUES(?, ?)";
        try
        {
            conectarBD();
            pstmt = con.prepareStatement(queryPersona);
            pstmt.setInt(1, t.getIdTutor());
            pstmt.setString(2, t.getNombre());
            pstmt.setString(3, t.getApel1());
            pstmt.setString(4, t.getApel2());
            //rs = null;
            rs = pstmt.executeQuery();
            //if(rs==null)
            //    JOptionPane.showMessageDialog(null, "Error, no se inserto la Persona");
            
            pstmt = con.prepareStatement(queryTutor);
            pstmt.setInt(1, t.getIdTutor());
            pstmt.setString(2, t.getDni());
            //rs = null;
            rs = pstmt.executeQuery();
            //if(rs=null)
            //    JOptionPane.showMessageDialog(null, "Error, no se inserto el Tutor");
            
            desconectarBD();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Fallo al insertar Tutor -->  " + e.getMessage());
        }
    }
/**
 * devuelve el id Tutor para insertarlo en tabla inscripciones
 */    
    public static void consultarPrimaria(){
        
    }
}
