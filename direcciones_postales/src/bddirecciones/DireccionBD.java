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
        String query;
        query = "INSERT INTO direccion (id_dir, portal, piso, mano, cpro, cmun, cun, ctra, cvia) VALUES (?,?,?,?,?,?,?,?,?)";
        //String query2 = "Insert into DIRECCION (ID_DIR,PORTAL,LETRA,ESCALERA,PISO,MANO,CPRO,CMUN,CUN,CTRA,CVIA) values ('22','6',null,null,'1','A','1','59','63501','5202','4717')";
        try
        { 
            conectarBD();
            //stmt = con.createStatement();
            //stmt.executeUpdate(query);
            pstmt = con.prepareStatement(query);        
            pstmt.setInt(1, d.getId_dir());       
            pstmt.setInt(2, d.getPortal());
            pstmt.setInt(3, d.getPiso());
            pstmt.setString(4, d.getMano());
            pstmt.setInt(5, d.getProvincia().getCpro());
            pstmt.setInt(6, d.getMunicipio().getCmun());
            pstmt.setInt(7, d.getLocalidad().getCun());
            pstmt.setInt(8, d.getTramo().getCtra());
            pstmt.setInt(9, d.getVia().getCvia());
            int retorno = pstmt.executeUpdate();
            desconectarBD();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Fallo al insertar direccion -->  " + e.getMessage());
        }
    }
    
}
