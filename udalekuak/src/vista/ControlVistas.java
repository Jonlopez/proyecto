
package vista;

/**
 *
 * @author Jon
 */
public class ControlVistas {
    private static Vprincipal vP;
    
    public static void ventanaPrincipal(){
        vP = new Vprincipal();
        vP.setVisible(true);
    }
    
    public static void ventanaInscripcion(java.awt.Frame p, boolean modal){
        Sinscripcion frmdialog2 = new Sinscripcion(p, true);        
        frmdialog2.setVisible(true);
    }
    
    public static void ventanaResumen(java.awt.Frame p, boolean modal){
        Resumen frmdialog2 = new Resumen(p, true);        
        frmdialog2.setVisible(true);
    }
    
    public static void listadoPrevio(java.awt.Frame p, boolean modal){
        Lprevio frmdialog2 = new Lprevio(p, true);        
        frmdialog2.setVisible(true);
    }
    
    public static void listadoPosterior(java.awt.Frame p, boolean modal){
        Lposterior frmdialog2 = new Lposterior(p, true);        
        frmdialog2.setVisible(true);
    }
    
    public static void ventanaLogin(java.awt.Frame p, boolean modal){
        Admin frmdialog2 = new Admin(p, true);        
        frmdialog2.setVisible(true);
    }
}
