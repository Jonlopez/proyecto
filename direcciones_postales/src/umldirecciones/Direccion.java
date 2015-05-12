
package umldirecciones;

/**
 *
 * @author javier_nogales
 */

public class Direccion {
    
    private Provincia provincia;
    private Municipio municipio;
    private Poblacion localidad;
    private int       cp;
    private Via       via;
    private Tramo     tramo;
    
    public Direccion(){}

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Poblacion getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Poblacion localidad) {
        this.localidad = localidad;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
        
    public Via getVia() {
        return via;
    }

    public void setVia(Via via) {
        this.via = via;
    }

    public Tramo getTramo() {
        return tramo;
    }

    public void setTramo(Tramo tramo) {
        this.tramo = tramo;
    }
    
    @Override
    public String toString()
    {
        return "La dirección seleccionada es: \n\n" +
               this.provincia.toString() + 
               this.municipio.toString() +
               this.localidad.toString() + 
               "----- CODIGO POSTAL -----\n" +
               this.cp + "\n\n" +
               this.via.toString()       +
               this.tramo.toString();
    }
    
    
    
}
