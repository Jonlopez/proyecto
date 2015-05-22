
package uml;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Menor {
    private int idMenor;
    private String nombre;
    private String apel1;
    private String apel2;
    private String dni;
    private char sexo;
    private Date fNac;
    private boolean discapacidad;
    private char modelo;
    private CentroEd centro;

    public Menor() {
    }
    
    public Menor(int idMenor)
    {
        this.idMenor = idMenor;
    }

    public Menor(int idMenor, String nombre, String apel1, String apel2, String dni, char sexo, Date fNac, boolean discapacidad, char modelo) {
        this.idMenor = idMenor;
        this.nombre = nombre;
        this.apel1 = apel1;
        this.apel2 = apel2;
        this.dni = dni;
        this.sexo = sexo;
        this.fNac = fNac;
        this.discapacidad = discapacidad;
        this.modelo = modelo;
        this.centro = centro;
    }

    public int getIdMenor() {
        return idMenor;
    }

    public void setIdMenor(int idMenor) {
        this.idMenor = idMenor;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getfNac() {
        return fNac;
    }

    public void setfNac(String fNac) {
        try
        {
            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            Date fecha = df.parse(fNac);
            this.fNac = fecha;
        }
        catch (ParseException e)
        {
            JOptionPane.showMessageDialog(null, "error fecha: " + e.getMessage());
        }
    }

    public boolean getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public char getModelo() {
        return modelo;
    }

    public void setModelo(char modelo) {
        this.modelo = modelo;
    }

    
    public CentroEd getCentro() {
        return centro;
    }

    public void setCentro(CentroEd centro) {
        this.centro = centro;
    }
    
    
}
