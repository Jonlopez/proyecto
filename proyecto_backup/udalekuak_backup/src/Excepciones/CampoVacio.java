
package Excepciones;

/**
 *
 * @author Jon
 */
public class CampoVacio extends Exception{
    private String campo;

    // Constructor sobrecargado
    public CampoVacio(){
        
    }

    public CampoVacio(String campo){
        this.campo = campo;
    }

    @Override
    public String getMessage(){
        // switch
        if (campo.compareTo("Dni")==0)
            return "El DNI es un campo obligatorio y debe tener formato 99.999.999-L";
        else
            if (campo.compareTo("Nombre")==0)
                return "El nombre es obligatorio";
            else
                if (campo.compareTo("Apellido")==0)
                    return "Los apellidos son obligatorios";
                else
                    if (campo.compareTo("Direccion")==0)
                        return "La dirección es un campo obligatorio";
                    else
                        if (campo.compareTo("Telefono")==0)
                           return "Al menos un telefono es obligatorio";
                        else
                            if (campo.compareTo("Sexo")==0)
                                return "Hay que indicar si el participante es hombre o mujer";
                            else
                                if (campo.compareTo("FechaN")==0)
                                    return "Hay que indicar la fecha de nacimiento del participante \n"
                                            + "y tiene que tener este formato dd-mm-aaaa";
                                else
                                    if (campo.compareTo("Discapacidad")==0)
                                        return "Es obligatorio indicar si el participante \n"
                                                + "padece alguna discapacidad";
                                    else
                                        if (campo.compareTo("Centro")==0)
                                            return "Hay que seleccionar el centro de enseñanza del participante";
                                        else                                            
                                            return "Que no se te olvide marcar el modelo del curso \n"
                                                    + " del participante en cuestion";
        }
}
