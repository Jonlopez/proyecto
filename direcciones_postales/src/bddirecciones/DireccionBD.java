/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bddirecciones;

import umldirecciones.Direccion;

/**
 *
 * @author javi
 */
public class DireccionBD {
    
        
    public int generaNuevoId()
    {
        int id = 0;
        //select para buscar ultimo id
        return id + 1;
    }
    
    public  void insertaDireccion(Direccion d)
    {
        //insert en direcciones
    }
    
}
