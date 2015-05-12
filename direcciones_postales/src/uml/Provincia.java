
package uml;

import bd.ProvinciaBD;


public class Provincia extends ProvinciaBD{
    
    private int cpro;
    private String npro;

    public Provincia(int cpro, String npro) {
        this.cpro = cpro;
        this.npro = npro;
    }

    public int getCpro() {
        return cpro;
    }

    public void setCpro(int cpro) {
        this.cpro = cpro;
    }

    public String getNpro() {
        return npro;
    }

    public void setNpro(String npro) {
        this.npro = npro;
    }

        
    @Override
    public String toString()
    {
        return "----- PROVINCIA -----    \n"+
               "cpro     = "+this.cpro+" \n"+
               "npro     = "+this.npro+" \n\n";
    }
    
}
