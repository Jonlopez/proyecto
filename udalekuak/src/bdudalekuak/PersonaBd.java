
package bdudalekuak;

import static bdudalekuak.GenericoBd.conectarBD;
import static bdudalekuak.GenericoBd.stmt;
import javax.swing.JOptionPane;


public class PersonaBd extends GenericoBd{
    
    private int id;
    private String nombre;
    private String apel1;
    private String apel2;
    
    public PersonaBd(){}
    
    public PersonaBd(int id)
    {
        this.id = id;
    }
           

    public PersonaBd(int id, String nombre, String apel1, String apel2) {
        this.id = id;
        this.nombre = nombre;
        this.apel1 = apel1;
        this.apel2 = apel2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApel1() {
        return apel1;
    }

    public void setApel1(String apel1) {
        this.apel1 = apel1;
    }

    public String getApel2() {
        return apel2;
    }

    public void setApel2(String apel2) {
        this.apel2 = apel2;
    }
    
    /**
     * busca el ultimo id que existe en la tabla personas de la base de datos
     * @return devuelve numerico
     */
    public static int consultaUltimoId()
    {
        int id = 0;
        try
        {   
            conectarBD();
            String query = "SELECT NVL(MAX(id_persona), 0) AS id_persona FROM persona";
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
    
}
