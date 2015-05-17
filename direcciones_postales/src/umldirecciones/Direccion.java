
package umldirecciones;

/**
 *
 * @author javier_nogales
 */

public class Direccion {
    
    private Provincia   provincia;
    private Municipio   municipio;
    private Poblacion   localidad;
    private int         cp;
    private Via         via;
    private Tramo       tramo;
    private int         portal;
    private char        letra;
    private String      escalera;
    private int         piso;
    private String      mano;
    
    
    
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

    public int getPortal() {
        return portal;
    }

    public void setPortal(int portal) {
        this.portal = portal;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getMano() {
        return mano;
    }

    public void setMano(String mano) {
        this.mano = mano;
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
