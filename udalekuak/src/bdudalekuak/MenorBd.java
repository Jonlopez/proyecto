
package bdudalekuak;

import static bdudalekuak.GenericoBd.conectarBD;
import static bdudalekuak.GenericoBd.pstmt;
import javax.swing.JOptionPane;
import uml.Menor;
import uml.Tutor;

/**
 *
 * @author javi&Jon
 */
public class MenorBd extends GenericoBd{
/**
 * Inserta los datos del menor 
 */    
    public static void insertarMenor(Menor m){
        String queryPersona = "INSERT INTO persona VALUES(?, ?, ?, ?)";
        String queryMenor   = "INSERT INTO Menor   VALUES(?, ?, ?, ?, ?, ?)";
        try
        {
            conectarBD();
            //primero hacemos insert en persona
            pstmt = con.prepareStatement(queryPersona);
            pstmt.setInt(1, m.getIdMenor());
            pstmt.setString(2, m.getNombre());
            pstmt.setString(3, m.getApel1());
            pstmt.setString(4, m.getApel2());
            //rs = null;
            rs = pstmt.executeQuery();
            //if(rs==null)
            //    JOptionPane.showMessageDialog(null, "Error, no se inserto la Persona");
            
            //commitamos para que exista persona y no de error la fk de menor
            stmt.execute("COMMIT");
            
            //segundo hacemos insert en menor
            pstmt = con.prepareStatement(queryMenor);
            pstmt.setInt(1, m.getIdMenor());
            pstmt.setString(2, m.getDni());
            pstmt.setString(3, String.valueOf(m.getSexo()));
            pstmt.setDate(4, new java.sql.Date(m.getfNac().getTime()));
            //Seria mas logico que discap fuese String, pero se hace asi por mantener el tipo de dato con SQL (1)
            char discap;
                if(m.getDiscapacidad())
                    discap = 'S';
                else 
                    discap = 'N';
            pstmt.setString(5, String.valueOf(discap));//(1) a esto me referia antes
            pstmt.setInt(6, m.getCentro().getIdCentro());            
            //rs = null;
            rs = pstmt.executeQuery();
            //if(rs=null)
            //    JOptionPane.showMessageDialog(null, "Error, no se inserto el Menor");
            
            //ya esta dado de alta el menor en las tablas persona y menor
            desconectarBD();
            //aqui el commit va implicito en el cierre de la conexion
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Fallo al insertar Menor -->  " + e.getMessage());
        }
    }
 
    
    public static Menor buscaMenor(String nombre, String apel1, String apel2, char sexo, java.util.Date fnac){
        Menor m = null;
        //de persona no se selecciona el id_persona para que no se repita la columna en el resultset
        String query = "SELECT persona.nombre, persona.apel1, persona.apel2, menor.* "
                     + "FROM menor, persona "
                     + "WHERE menor.id_persona = persona.id_persona "//join para unir las tablas persona y menor
                      + "AND nombre = ? AND aple1 = ? AND apel2 = ? AND sexo = ? AND fnac = ?";
        try
        {
            conectarBD();
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, nombre);
            pstmt.setString(2, apel1);
            pstmt.setString(3, apel2);
            pstmt.setString(4, String.valueOf(sexo));
            pstmt.setDate(5, new java.sql.Date(fnac.getTime()));
            rs = pstmt.executeQuery(); 
            
            if(rs.next())
            {
                //boolean discap;
                //if(rs.getString("discapacidad").compareToIgnoreCase("S")==0)
                //    discap = true;
                //else 
                //    discap = false;
                m = new Menor
                (
                        rs.getInt("persona.id_persona")
                        //rs.getString("nombre"),
                        //rs.getString("apel1"),
                        //rs.getString("apel2"),
                        //rs.getString("dni"),
                        //rs.getString("sexo").charAt(0),
                        //new java.util.Date(rs.getDate("fnac").getTime()),
                        //discap,
                        //rs.getString("modelo").charAt(0)
                );                
            }
            desconectarBD();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error en la busqueda de tutor --->  " + e.getMessage());
        }
        
        return m;
    }
}
