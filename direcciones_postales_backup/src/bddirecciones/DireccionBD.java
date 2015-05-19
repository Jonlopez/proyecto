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
    
        
    public int generaNuevoId()
    {
        int id = 0;
        try
        {   
            conectarBD();
            String query = "SELECT NVL(MAX(id_dir), 0) AS id_dir FROM direccion";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if(rs.next())
                id = rs.getInt("id_dir");
            rs.close();
            desconectarBD();
        }
        catch (Exception e)
        {
              JOptionPane.showMessageDialog(null, "Fallo al generar id direccion -->  " + e.getMessage());
        }
        
        return id + 1;
    }
    
    public  void insertaDireccion(Direccion d)
    {
        try
        {
            conectarBD();        
            String query = "INSERT INTO direccion (id_dir) VALUES (?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?)";
            
            pstmt = con.prepareStatement(query);        
            pstmt.setInt(1, d.getId_dir());       
            pstmt.setInt(2, d.getPortal());       
            pstmt.setString(3, String.valueOf(d.getLetra()));       
            pstmt.setString(4, d.getEscalera());
            pstmt.setInt(5, d.getPiso());
            pstmt.setString(6, d.getMano());
            pstmt.setInt(7, d.getProvincia().getCpro());
            pstmt.setInt(8, d.getMunicipio().getCmun());
            pstmt.setInt(9, d.getLocalidad().getCun());
            pstmt.setInt(10, d.getTramo().getCtra());
            pstmt.setInt(11, d.getVia().getCvia());
            
            pstmt.executeUpdate();             
            desconectarBD();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Fallo al insertar direccion -->  " + e.getMessage());
        }
    }
    
}
