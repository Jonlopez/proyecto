
package bdudalekuak;



import javax.swing.JOptionPane;
import uml.Inscripcion;

/**
 *
 * @author javi&Jon
 */
public class InscripcionBd extends GenericoBd{

 /**
 * Inserta el id tutor y el id menor en la tabla inscripciones
     * @param i inscripcion
 */    
    public static void insertarInscripcion(Inscripcion i){
        
        String query = "INSERT INTO inscripcion VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try
        {
            conectarBD();
            
            pstmt = con.prepareStatement(query);        
            pstmt.setInt(1, i.getIdIns());       
            pstmt.setInt(2, i.getTutor().getIdTutor());       
            pstmt.setInt(3, i.getMenor().getIdMenor());       
            pstmt.setInt(4, i.getSolicitud().getIdSolicitud());
            pstmt.setInt(5, i.getDireccion().getId_dir());
            pstmt.setString(6, i.getTelf1());
            pstmt.setString(7, i.getTelf2());
            pstmt.setString(8, i.getTelf3());
            pstmt.setString(9, i.getTelf4());         
            pstmt.executeUpdate();             
            desconectarBD();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Fallo al insertar inscripcion -->  " + e.getMessage());
        }
    }
}
