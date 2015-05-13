
package uml;

import umldirecciones.Direccion;

/**
 *
 * @author Jon
 */
public class Inscripcion {
    private int idIns;
    private String telf1;
    private String telf2;
    private String telf3;
    private String telf4;
    private Direccion direccion;
    private Tutor tutor;
    private Menor menor;
    private Solicitud solicitud;

    public Inscripcion() {
    }

    public Inscripcion(int idIns, String telf1, String telf2, String telf3, String telf4, Direccion direccion, Tutor tutor, Menor menor, Solicitud solicitud) {
        this.idIns = idIns;
        this.telf1 = telf1;
        this.telf2 = telf2;
        this.telf3 = telf3;
        this.telf4 = telf4;
        this.direccion = direccion;
        this.tutor = tutor;
        this.menor = menor;
        this.solicitud = solicitud;
    }

    public int getIdIns() {
        return idIns;
    }

    public void setIdIns(int idIns) {
        this.idIns = idIns;
    }

    public String getTelf1() {
        return telf1;
    }

    public void setTelf1(String telf1) {
        this.telf1 = telf1;
    }

    public String getTelf2() {
        return telf2;
    }

    public void setTelf2(String telf2) {
        this.telf2 = telf2;
    }

    public String getTelf3() {
        return telf3;
    }

    public void setTelf3(String telf3) {
        this.telf3 = telf3;
    }

    public String getTelf4() {
        return telf4;
    }

    public void setTelf4(String telf4) {
        this.telf4 = telf4;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Menor getMenor() {
        return menor;
    }

    public void setMenor(Menor menor) {
        this.menor = menor;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    
    
}
