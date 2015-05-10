
package uml.direcciones;

import bddirecciones.MunicipioBD;

/**
 *
 * @author javier_nogales
 */
public class Municipio extends MunicipioBD{
 
    private Provincia prov;
    private int cmun;
    private String nmun;

    public Municipio(Provincia prov, int cmun, String nmun) {
        this.prov = prov;
        this.cmun = cmun;
        this.nmun = nmun;
    }

    public Provincia getProv() {
        return prov;
    }

    public void setProv(Provincia prov) {
        this.prov = prov;
    }

    public int getCmun() {
        return cmun;
    }

    public void setCmun(int cmun) {
        this.cmun = cmun;
    }

    public String getNmun() {
        return nmun;
    }

    public void setNmun(String nmun) {
        this.nmun = nmun;
    }

    @Override
    public String toString()
    {
        return "----- MUNICIPIO -----    \n"+
               "cmun     = "+this.cmun+" \n"+
               "nmun     = "+this.nmun+" \n\n";
    }
    
    
    
}
