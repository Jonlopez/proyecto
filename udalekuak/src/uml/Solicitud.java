
package uml;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Solicitud {
    private int idSolicitud;
    private int pSorteo;
    private Date fElc;
    private int id_sorteo;
    private ArrayList<Inscripcion>inscripciones;

    public Solicitud() {
        inscripciones = new ArrayList();
        id_sorteo = 2015;//falta crear en control la carga del sorteo al comenzar
    }

    public Solicitud(int idSolicitud, int pSorteo, Date fElc, ArrayList<Inscripcion> inscripciones) {
        this.idSolicitud = idSolicitud;
        this.pSorteo = pSorteo;
        this.fElc = fElc;
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

    public int getIdSorteo() {
        return id_sorteo;
    }

    public void setIdSorteo(int id_sorteo) {
        this.id_sorteo = id_sorteo;
    }

    

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(ArrayList<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }
    
    /**
     * Anade una inscripcion al arraylist de inscripciones
     * @param ins incripciones
     */
    public void anadirInscripcion(Inscripcion ins)
    {
        this.inscripciones.add(ins);
    }
    
    
}
