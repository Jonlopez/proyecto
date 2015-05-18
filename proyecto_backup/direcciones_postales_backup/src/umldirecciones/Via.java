package umldirecciones;

import bddirecciones.ViaBD;

/**
 *
 * @author javier_nogales
 */

public class Via extends ViaBD{
    
    private Municipio muni;
    private int cvia;
    private String tvia;
    private int pos;
    private String nvia;

    public Via(Municipio muni, int cvia, String tvia, int pos, String nvia) {
        this.muni = muni;
        this.cvia = cvia;
        this.tvia = tvia;
        this.pos = pos;
        this.nvia = nvia;
    }

    public Municipio getMuni() {
        return muni;
    }

    public void setMuni(Municipio muni) {
        this.muni = muni;
    }

    public int getCvia() {
        return cvia;
    }

    public void setCvia(int cvia) {
        this.cvia = cvia;
    }

    public String getTvia() {
        return tvia;
    }

    public void setTvia(String tvia) {
        this.tvia = tvia;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getNvia() {
        return nvia;
    }

    public void setNvia(String nvia) {
        this.nvia = nvia;
    }
    
    @Override
    public String toString()
    {
        return "----- VIA -----          \n"+
               "cvia     = "+this.cvia+" \n"+
               "tvia     = "+this.tvia+" \n"+
               "pos      = "+this.pos+"  \n"+
               "nvia     = "+this.nvia+" \n\n";
    }
}
