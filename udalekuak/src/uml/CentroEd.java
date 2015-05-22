
package uml;

import umldirecciones.Provincia;


public class CentroEd {
    private int idCentro;
    private String nombreCtr;
    private Provincia provincia;

    public CentroEd() {
    }

    public CentroEd(int idCentro, String nombreCtr, Provincia provincia) {
        this.idCentro = idCentro;
        this.nombreCtr = nombreCtr;
        this.provincia = provincia;
    }

    public int getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }

    public String getNombreCtr() {
        return nombreCtr;
    }

    public void setNombreCtr(String nombreCtr) {
        this.nombreCtr = nombreCtr;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    
}
