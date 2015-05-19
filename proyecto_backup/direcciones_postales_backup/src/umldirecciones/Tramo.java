
package umldirecciones;

import bddirecciones.TramoBD;

/**
 *
 * @author javier_nogales
 */

public class Tramo extends TramoBD{
    
    int       ctra;
    int       distrito;
    int       seccion;
    String    subseccion;
    int       tinum;
    int       ein;
    String    cein;
    int       esn;
    String    cesn;

    public Tramo() {
    }
      
    public Tramo(int ctra, int distrito, int seccion, String subseccion, int tinum, int ein, String cein, int esn, String cesn) {
        this.ctra = ctra;
        this.distrito = distrito;
        this.seccion = seccion;
        this.subseccion = subseccion;
        this.tinum = tinum;
        this.ein = ein;
        this.cein = cein;
        this.esn = esn;
        this.cesn = cesn;
    }

    public int getCtra() {
        return ctra;
    }

    public void setCtra(int ctra) {
        this.ctra = ctra;
    }

    public int getDistrito() {
        return distrito;
    }

    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public String getSubseccion() {
        return subseccion;
    }

    public void setSubseccion(String subseccion) {
        this.subseccion = subseccion;
    }

    public int getTinum() {
        return tinum;
    }

    public void setTinum(int tinum) {
        this.tinum = tinum;
    }

    public int getEin() {
        return ein;
    }

    public void setEin(int ein) {
        this.ein = ein;
    }

    public String getCein() {
        return cein;
    }

    public void setCein(String cein) {
        this.cein = cein;
    }

    public int getEsn() {
        return esn;
    }

    public void setEsn(int esn) {
        this.esn = esn;
    }

    public String getCesn() {
        return cesn;
    }

    public void setCesn(String cesn) {
        this.cesn = cesn;
    }
    
    @Override
    public String toString()
    {
        return     "----- TRAMO -----                \n"
                  +"ctra      =   "+this.ctra+"      \n"
                  +"distrito  =   "+this.distrito+"  \n"
                  +"secc      =   "+this.seccion+"   \n"
                  +"subsc     =   "+this.subseccion+"\n"
                  +"tinum     =   "+this.tinum+"     \n"
                  +"ein       =   "+this.ein+"       \n"
                  +"cein      =   "+this.cein+"      \n"
                  +"esn       =   "+this.esn+"       \n"
                  +"cesn      =   "+this.cesn+"      \n\n";
    }
    
}
