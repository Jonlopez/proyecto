
package uml;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jon
 */
public class Solicitud {
    private int idSolicitud;
    private int pSorteo;
    private Date fElc;
    private Calendar hElc;
    private ArrayList<Inscripcion>inscripciones;

    public Solicitud() {
    }

    public Solicitud(int idSolicitud, int pSorteo, Date fElc, Calendar hElc, ArrayList<Inscripcion> inscripciones) {
        this.idSolicitud = idSolicitud;
        this.pSorteo = pSorteo;
        this.fElc = fElc;
        this.hElc = hElc;
        this.inscripciones = inscripciones;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getpSorteo() {
        return pSorteo;
    }

    public void setpSorteo(int pSorteo) {
        this.pSorteo = pSorteo;
    }

    public Date getfElc() {
        return fElc;
    }

    public void setfElc(Date fElc) {
        this.fElc = fElc;
    }

    public Calendar gethElc() {
        return hElc;
    }

    public void sethElc(Calendar hElc) {
        this.hElc = hElc;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(ArrayList<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }
    
    
}
