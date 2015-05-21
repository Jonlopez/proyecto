
package udalekuak;

import bdudalekuak.InscripcionBd;
import bdudalekuak.MenorBd;
import bdudalekuak.PersonaBd;
import bdudalekuak.TutorBd;
import bdudalekuak.UsuarioBd;
import java.util.Date;
import vista.ControlVistas;
import javax.swing.JDialog;
import uml.Sorteo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import uml.Inscripcion;
import uml.Menor;
import uml.Solicitud;
import uml.Tutor;
import uml.Usuario;
import bddirecciones.DireccionBD;
import bdudalekuak.CentroEdBd;
import bdudalekuak.SorteoBd;
import uml.CentroEd;

/**
 *
 * @author javi&Jon 
 */
public class Control {

    public static Sorteo sorteo;
    private static ArrayList<Solicitud>solicitudes;
    private static ArrayList<Inscripcion>inscripciones;
    private static Solicitud solicitud;
    public static Inscripcion inscripcion;
    private static Usuario usuario;
    private static ArrayList<CentroEd>listadoCentros;
    
    public static void main(String[] args) {
        //ordena a control vistas que inicie la parte grafica
        vista.ControlVistas.inicializa();
        
    }
/**
 * Validación del usuario administrador
 * @param user
 * @param pass
 * @param d 
 */    
    public static void logIn(String user, String pass, JDialog d){        
        usuario = new Usuario(user, pass);
        if(UsuarioBd.consultarUsuario(usuario))       
            ControlVistas.habilitarAdmin(usuario,d);
        else 
            JOptionPane.showMessageDialog(d, "combinacion usuario, contraseña no valida");
    }
/**
 * Devuelve las fechas de la configuración de la aplicación
 */
    public static Sorteo cargarParametros(){        
        sorteo = new Sorteo();
        return sorteo;
    }
/**
 * Modifica las fechas de configuración de la aplicación
 * @param fIni
 * @param fFin
 * @param fsor
 * @param d 
 */    
    public static void guardarparametros(Date fIni, Date fFin, Date fsor,JDialog d){
        ControlVistas.cerrarDialogo(d);
    }
/**
 * Ejecuta el paquete Pl-Sql que realiza la mecanica 
 * del sorteo
 */  
    public static void ejecutarSorteo(){
        
        SorteoBd.ejecutaSorteo();
        
    }
/**
 * Borra el resultado del Pl-Sql que realiza el sorteo
 */    
    public static void borrarSorteo()
    {
        SorteoBd.borraSorteo();
    }
/**
 * Retorna valor true para los centros que se encuentren 
 * en Álava o false para los que esten fuera de esta
 * @return 
 */    
    public static ArrayList<CentroEd> buscarCentrosCB(boolean alava)
    {        
        return CentroEdBd.consultarCentros(alava);
    }
   
 /**
 * Creamos un objeto solicitud al que le asignamos un nº
 * identificador 
 */    
    public static Solicitud creaSolicitud(){ 
      Solicitud sol = new Solicitud();
      try
      {          
          int id = bdudalekuak.SolicitudBd.consultaUltimoId();          
          sol.setIdSolicitud(id+1);
      }
      catch (Exception e)
      {
            ControlVistas.enviarMensaje("Fallo al consultar id de solicitud" + e.getMessage());
      }
      return sol;
    }

/**
 * Guarda los datos de la solicitud y muestra mensaje 
 * 
 * Guarda todos los datos por orden parqa que no den error la pk de las tablas
 * Partimos de que no existe ningun menor en la bd como los que vamos a insertar
 *  esto ya ha sido validado al rellenar la inscripcion.
 * 
 * de información
     * @param sol
 *  
 */    
    public static void finalizarSolicitud(Solicitud sol) throws Exception{
        //antes de empezar, recordar que aqui ya tenemos el objeto solicitud creado y 
        //  completo con su(s) inscripcion(es) y tutores y menores y direcciones. Es el
        //  objeto que nos pasan en el parametro.
        
        //PROCEDEMOS:
        //confirma los datos(JConfirm) de la solicitud que se van a insertar
        if (JOptionPane.showConfirmDialog(ControlVistas.vSi, "Vas a dar de alta una solicitud con los siguientes datos:\n" + sol.toString()) == JOptionPane.YES_OPTION){
        //si se aceptan los datos:
            
            //IMPORTANTE!! la repeticion de menores ya ha sido compobada y controlada en la ventana de inscripcion
            
            //inserta solicitud
            bdudalekuak.SolicitudBd.insertarSolicitud(sol);
            
            //ahora crea un bucle para insertar los datos de las (de 1 a 3) inscripciones
            //recorre las inscripciones de la solicitud
            for(int i=0;i<sol.getInscripciones().size();i++)
            {
                //crea variable inscripcion para ahorrar codigo (se la llama muchas veces en cada ciclo del for)
                Inscripcion ins = sol.getInscripciones().get(i);
                
                //declara idTutor e idMenor
                int idTutor;
                int idMenor;
                
                
                
                //comprueba si el dni tutor existe en la tabla
                if(TutorBd.buscaDniTutor(ins.getTutor().getDni())==null)
                {
                    //no existe el tutor
                    //busca el ultimo id de persona y lo guarda en la variable
                    idTutor = PersonaBd.consultaUltimoId() + 1;
                    //anade su nuevo ide al tutor
                    ins.getTutor().setIdTutor(idTutor);
                    //ya tiene tutor su nuevo id y ahora inserta tutor en la BD
                    TutorBd.insertarTutor(ins.getTutor());                    
                }else
                {
                    //esta hecho en dos pasos para que se vea mas claro pero no tiene sentido, habria que hacerlo en uno
                    //si existe el tutor
                    //busca su idTutor y lo guarda en la variable
                    idTutor = TutorBd.buscaDniTutor(ins.getTutor().getDni()).getIdTutor();
                    //anade el id buscado al tutor, y como es logico, no lo inserta
                    ins.getTutor().setIdTutor(idTutor);
                    //este dato nos servir para insertar el id de tutor en la inscripcion mas adelante                    
                }
                
                //NO comprueba si menor existe, porque ya esta comprobado
                //partimos sabiendo que menor no existe
                
                //busca el ultimo id de persona y lo guarda en la variable
                idMenor = PersonaBd.consultaUltimoId() + 1;
                //anade su nuevo id al menor
                ins.getMenor().setIdMenor(idMenor);
                //ya tiene menor su nuevo id y ahora inserta menor en la BD
                MenorBd.insertarMenor(ins.getMenor());//inserta menor y guarda su nuevo id               
                
                //insertar la direccion
                //genera un nuevo ide de direccion para la direccion que tenemos en esta inscripcion
                ins.getDireccion().setId_dir(ins.getDireccion().generaNuevoId());
                ins.getDireccion().insertaDireccion(ins.getDireccion());
                //aqui podemos apreciar la diferencia de uso entre hacer la claseBD abstracta y con herencia o hacerla static
                //la libreria direcciones_postales esta hecha con clasesBD abstractas y heredadas.
                //sin embargo udalekuak esta hecho con clasesBD static.
                
                //ahora ya tenemos todas las pk necesarias para que no de error la insercion de inscripcion
                
                //inserta inscripcion con los id's verificados y correctos
                //ademas de sus telefonos direccion y solicitud
                InscripcionBd.insertarInscripcion(ins);
                
            }//END for -- fin recorre inscripciones solicitud
            
            JOptionPane.showMessageDialog(null, "Vas por aqui :) alegra esa cara ");//mensaje para motivador para buscar errores
            //AQUI YA HEMOS INSERTADO LAS 3 INSCRIPCIONES EN LA BD
            
        }//END IF confirmacion datos
        
        //ya ha acabado de recorred la(s) inscripcion(es) y de insertarlas en la BD
        //el proceso de alta se da por concluido
        //si no confirma los datos
        else{
            //descarta todos los datos introducidos
            //vuelve a la vista principal
            ControlVistas.vuelveVprincipal();
        }
    
    }//END finalizarSolicitud()
    
    /**
     * comprueba si existe un menor o no, retorna true o fale
     * @param m
     * @return 
     */
    public static boolean existeMenor(Menor m)
    {
        boolean existe = false;
            if(MenorBd.buscaMenor
                    (
                        m.getNombre(),
                        m.getApel1(),
                        m.getApel2(),
                        m.getSexo(),
                        m.getfNac()
                    ) != null)
            {
                existe = true;
            }
        return existe;
    }
/**
 * Devuelve los datos de una solicitud
 * @param dni
 * @param fecha
 */    
    public static void obtenerSolicitud(String dni, Date fecha){
        solicitud = new Solicitud();
        bdudalekuak.SolicitudBd.consultaSolicitud();
        ControlVistas.muestraDetalleSolicitud(solicitud);
    }
/**
 * Devuelve el listado previo al sorteo
 * @return 
 */    
    public static ArrayList<Solicitud> obtenerListSorteo(){
        solicitudes = new ArrayList();
        bdudalekuak.SolicitudBd.consultaListSolicitud();
        return solicitudes;
    }
/**
 * Devuelve el listado posterior al sorteo ordenado
 * por el orden que espicifica el sorteo
 * @return 
 */    
    public static ArrayList<Solicitud>obtenerListPosterior(){
        solicitudes = new ArrayList();
        bdudalekuak.SolicitudBd.consultaListSolicitudBySorteo();
        return solicitudes;
    }   

   
    public static Inscripcion creaInscripcion()
    {
        return new Inscripcion();
    }
    
    public static Tutor buscaTutor(String dni)
    {       
        //consulta el ide tutor con el dni
        return TutorBd.buscaDniTutor(dni);       
    }
    
}
