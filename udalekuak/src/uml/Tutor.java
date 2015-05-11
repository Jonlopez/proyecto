
package uml;

import java.util.ArrayList;

/**
 *
 * @author Jon
 */
public class Tutor {
    private int idTutor;
    private String nombre;
    private String apel1;
    private String apel2;
    private String dni;
    private ArrayList<Menor> menores;
    private ArrayList<Inscripcion> inscripciones;

    public Tutor() {
    }

    public Tutor(int idTutor, String nombre, String apel1, String apel2, String dni, ArrayList<Menor> menores, ArrayList<Inscripcion> inscripciones) {
        this.idTutor = idTutor;
        this.nombre = nombre;
        this.apel1 = apel1;
        this.apel2 = apel2;
        this.dni = dni;
        this.menores = menores;
        this.inscripciones = inscripciones;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Menor> getMenores() {
        return menores;
    }

    public void setMenores(ArrayList<Menor> menores) {
        this.menores = menores;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(ArrayList<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }
    
    
}
