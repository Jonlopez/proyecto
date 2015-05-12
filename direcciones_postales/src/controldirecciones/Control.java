
package controldirecciones;

import vistadirecciones.SeleccionLoca;
import vistadirecciones.Formulario;
import vistadirecciones.SeleccionMuni;
import umldirecciones.Direccion;
import umldirecciones.Tramo;
import umldirecciones.Via;
import umldirecciones.Municipio;
import umldirecciones.Poblacion;
import umldirecciones.Provincia;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author javier_nogales
 */


public class Control {
    
    public static ArrayList<Provincia> listaProvincias;
    public static ArrayList<Municipio> listaMunicipios;
    public static ArrayList<Poblacion> listaLocalidades;
    public static ArrayList<Via>       listaVias;
    public static Formulario form;
    public static SeleccionMuni seleccMuni;
    public static SeleccionLoca seleccLoca;
    public static Direccion direccion;

    public static void main(String[] args) {
    
    direccion = new Direccion();
    form = new vistadirecciones.Formulario();
    cargaProvincias();
    form.setVisible(true);
        
    }//END MAIN
        
    public static void cargaProvincias()
    {
        //Cargo el listado de prov. en el ArrayList listaProvincias llamando al
        //metodo getProvincias().
        listaProvincias = Provincia.getProvincias();
        //Llamo al metodo setProvincias del Formulario para cargarlas en la
        //ComboBox.
        form.setProvincias(listaProvincias);
        //También se puede hacer todo a la vez -->
        //form.setProvincias(Provincia.getProvincias());
        
    }
    
    public static void setProvinciaElegida(int i)
    {
        direccion.setProvincia(listaProvincias.get(i));
        listaProvincias.clear();
    }
    
    public static void setMunicipioElegido(int i)
    {
        direccion.setMunicipio(listaMunicipios.get(i));
        listaMunicipios.clear();
    }
    
    public static void setLocalidadElejida(int i)
    {
        direccion.setLocalidad(listaLocalidades.get(i));
        listaLocalidades.clear();
    }
    
    public static void setViaElejida(int i)
    {
        direccion.setVia(listaVias.get(i));
        listaVias.clear();
    }
    
    
    
    public static ArrayList<Municipio> buscaMunicipios(String cadena)
    {
        listaMunicipios = Municipio.getMunicipios(cadena, direccion.getProvincia().getCpro());
        return listaMunicipios;
        
    }
    
    public static ArrayList<Poblacion> buscaLocalidades(String cadena)
    {
        listaLocalidades = Poblacion.getLocalidades(cadena, direccion.getMunicipio().getCmun(), direccion.getProvincia().getCpro());
        return listaLocalidades;        
    }
    
    public static ArrayList<Via> buscaVias(String cadena)
    
    {
        listaVias = Via.getVias(cadena, direccion.getMunicipio().getCmun(), direccion.getProvincia().getCpro());
        return listaVias;
    }
    
    public static Tramo buscaTramo(int portal, int cpos)
    {
        int tinum;
        if(portal%2==0)
            tinum = 2;
        else
            tinum = 1;
        
        direccion.setTramo(Tramo.getTramos
        (
                direccion.getProvincia().getCpro(),
                direccion.getMunicipio().getCmun(),
                direccion.getVia().getCvia(),
                cpos,
                tinum,
                portal                
        ));
        
        return direccion.getTramo();
    }
    
}//END CLASS
