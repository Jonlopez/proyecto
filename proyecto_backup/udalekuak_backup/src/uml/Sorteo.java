
package uml;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jon
 */
public class Sorteo {
    private int idSorteo;
    private Date fIniInsc;
    private Date fFinInsc;
    private Date fSorteo;
    private ArrayList<Solicitud>solicitudes;

    public Sorteo() {
    }

    public Sorteo(int idSorteo, Date fIniInsc, Date fFinInsc, Date fSorteo, ArrayList<Solicitud> solicitudes) {
        this.idSorteo = idSorteo;
        this.fIniInsc = fIniInsc;
        this.fFinInsc = fFinInsc;
        this.fSorteo = fSorteo;
        this.solicitudes = solicitudes;
    }

    public int getIdSorteo() {
        return idSorteo;
    }

    public void setIdSorteo(int idSorteo) {
        this.idSorteo = idSorteo;
    }

    public Date getfIniInsc() {
        return fIniInsc;
    }

    public void setfIniInsc(Date fIniInsc) {
        this.fIniInsc = fIniInsc;
    }

    public Date getfFinInsc() {
        return fFinInsc;
    }

    public void setfFinInsc(Date fFinInsc) {
        this.fFinInsc = fFinInsc;
    }

    public Date getfSorteo() {
        return fSorteo;
    }

    public void setfSorteo(Date fSorteo) {
        this.fSorteo = fSorteo;
    }

    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    
}
