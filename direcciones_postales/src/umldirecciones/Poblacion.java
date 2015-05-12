
package umldirecciones;

import bddirecciones.PoblacionBD;

/**
 *
 * @author javier_nogales
 */

public class Poblacion extends PoblacionBD{
    
    private Municipio muni;
    private int cun;
    private String nentco50;
    private String nentsi50;
    private String nnucle50;

    public Poblacion(Municipio muni, int cun, String nentco50, String nentsi50, String nnucle50) {
        this.muni = muni;
        this.cun = cun;
        this.nentco50 = nentco50;
        this.nentsi50 = nentsi50;
        this.nnucle50 = nnucle50;
    }   
    
    public Poblacion(Municipio muni, String nentsi50)
    {
        this.muni = muni;
        this.nentsi50 = nentsi50;
    }

    public Municipio getMuni() {
        return muni;
    }

    public void setMuni(Municipio muni) {
        this.muni = muni;
    }

    public int getCun() {
        return cun;
    }

    public void setCun(int cun) {
        this.cun = cun;
    }

    public String getNentco50() {
        return nentco50;
    }

    public void setNentco50(String nentco50) {
        this.nentco50 = nentco50;
    }

    public String getNentsi50() {
        return nentsi50;
    }

    public void setNentsi50(String nentsi50) {
        this.nentsi50 = nentsi50;
    }

    public String getNnucle50() {
        return nnucle50;
    }

    public void setNnucle50(String nnucle50) {
        this.nnucle50 = nnucle50;
    }
    
    @Override
    public String toString()
    {
        return "----- LOCALIDAD -----       \n"+
               "cun      = "+this.cun+"     \n"+
               "nentco50 = "+this.nentco50+"\n"+
               "nentsi50 = "+this.nentsi50+"\n"+
               "nnucle50 = "+this.nnucle50+"\n\n";
    }
    

}
