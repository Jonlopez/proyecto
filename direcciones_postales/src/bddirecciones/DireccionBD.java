/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bddirecciones;

import javax.swing.JOptionPane;
import umldirecciones.Direccion;

/**
 *
 * @author javi
 */
public class DireccionBD extends GenericoBD{
    
    /**
     * busca en en la tabla direccion el ultimo id y genera uno nuevo
     * incrementandole uno.
     * retorna un entero
     * 
     * @return 
     */    
    public int generaNuevoId()
    {
        int id = 0;
        try
        {   
            conectarBD();
            
            String query = "SELECT NVL(MAX(id_dir), 0) AS id_dir FROM direccion";
            
            stmt = con.createStatement();
            rs   = stmt.executeQuery(query);
            
            if(rs.next())
                id = rs.getInt("id_dir");
            rs.close();
        }
        catch (Exception e)
        {
              JOptionPane.showMessageDialog(null, "Fallo al generar id direccion -->  " + e.getMessage());
        }
        finally
        {            
            desconectarBD();
        }        
        return id + 1;
    }
    /**
     * inserta la direccion en la tabla direccion.
     * recibe como parametro un objeto direccion
     * recibe como para
     * @param d 
     */
    public  void insertaDireccion(Direccion d)
    {      
        String query;
        query = "INSERT INTO direccion (id_dir, portal, piso, mano, cpro, cmun, cun, ctra, cvia) VALUES (?,?,?,?,?,?,?,?,?)";
        try
        { 
            conectarBD();
            
            pstmt = con.prepareStatement(query);        
            pstmt.setInt(1, d.getId_dir());       
            pstmt.setInt(2, d.getPortal());
            pstmt.setInt(3, d.getPiso());
            pstmt.setString(4, d.getMano());
            pstmt.setInt(5, d.getProvincia().getCpro());
            pstmt.setInt(6, d.getMunicipio().getCmun());
            pstmt.setInt(7, d.getLocalidad().getCun());
            pstmt.setInt(8, d.getTramo().getCtra());
            pstmt.setInt(9, d.getVia().getCvia());pstmt.executeUpdate();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Fallo al insertar direccion -->  " + e.getMessage());
        }
        finally
        {            
            desconectarBD();
        }
    }
    
}
