
package uml;

/**
 *
 * @author Jon
 */
public class Usuario {
    private String nombre;
    private String contrasenna;

    public Usuario() {
    }

    public Usuario(String nombre, String contrasenna) {
        this.nombre = nombre;
        this.contrasenna = contrasenna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    
    
}
