/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import VO.RegionVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;

/**
 *
 * @author maximiliano
 */
public class RegionDAO {

    public RegionVO Buscar_RegionVO(int id) {
        RegionVO vo = new RegionVO();
        Conectar conec = new Conectar();
        String sql = "select * from REGION where Id_Region = ?;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                vo.setNombre(rs.getString(2));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return vo;
    }
    
    public void Consultar_Region(JComboBox jcbRegion) {
        Conectar conec = new Conectar();
       // String sql = "SELECT Nombre FROM REGION ORDER BY Nombre ASC;"; para mostrar ordenado
       String sql = "SELECT Nombre FROM REGION;"; //pero como quiero obtener la posicion que me indica el indice
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
                        
            rs = ps.executeQuery();

            jcbRegion.addItem("Seleccion una Region");
            
            while(rs.next()){
            jcbRegion.addItem(rs.getString("Nombre"));
            }
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }  finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }

        }
    }

}
