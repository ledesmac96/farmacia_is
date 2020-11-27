/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.EstadoVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author maximiliano
 */
public class EstadoDAO {
    
    public void Modificar_EstadoVO(EstadoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE ESTADO SET Estado = ? WHERE Id_Estado = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId_Estado());
            ps.setBoolean(2, vo.isEstado());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }
    
    public EstadoVO Buscar_EstadoVO(int id) {
        EstadoVO vo = new EstadoVO();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM ESTADO WHERE Id_Estado = ?;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()){
                //FarmaciaVO vo = new FarmaciaVO();
                vo.setEstado(rs.getBoolean(2));
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
    
    
}
