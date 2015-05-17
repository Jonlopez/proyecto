
package umldirecciones;

/**
 *
 * @author javier_nogales
 */

public class Direccion extends bddirecciones.DireccionBD{
    
    private int         id_dir;
    private int         portal;
    private char        letra;
    private String      escalera;
    private int         piso;
    private String      mano;
    private Provincia   provincia;    
    private Municipio   municipio;
    private Poblacion   localidad;
    private Tramo       tramo;
    private Via         via;    
    private int         cp;
    
    
    
    /*CAMPOS DE LA TABLA DIRECCIONES
      ------------------------------
    
        id_dir			NUMBER(4) ,
	portal			NUMBER(4) NOT NULL,
	letra			CHAR,
	escalera		VARCHAR2(10),
	piso			NUMBER(3),
	mano			VARCHAR2(10),
	cpro 			NUMBER(2),
	cmun 			NUMBER(3),
	cun 			NUMBER(7),
	ctra 			NUMBER(4),
	cvia 			NUMBER(5),
    */
    
    
    
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

    public int getId_dir() {
        return id_dir;
    }

    public void setId_dir(int id_dir) {
        this.id_dir = id_dir;
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
