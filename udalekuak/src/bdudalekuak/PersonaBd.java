/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdudalekuak;

/**
 *
 * @author javi
 */
public class PersonaBd extends GenericoBd{
    
    private int id;
    private String nombre;
    private String apel1;
    private String apel2;
    
    public PersonaBd(){}
    
    public PersonaBd(int id)
    {
        this.id = id;
    }
           

    public PersonaBd(int id, String nombre, String apel1, String apel2) {
        this.id = id;
        this.nombre = nombre;
        this.apel1 = apel1;
        this.apel2 = apel2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    /**
     * busca el ultimo id que existe en la tabla personas de la base de datos
     * @return 
     */
    public static int buscaUltimoId()
    {
        int id = 0;
            //falta crear el codigo para buscar el id
        return id;
    }
    
}
