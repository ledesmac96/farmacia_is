package DAO;

import VO.FarmaciaVO;
import conexion.Conectar;
import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FarmaciaDAO {
    
    public void Agregar_FarmaciaVO(FarmaciaVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO DATOS_FARMACIA (Nombre, Direccion, E_Mail, Telefono, LOCALIDAD_Id_Localidad, MOTIVO_Id_Motivo, ESTADO_Id_Estado) VALUES( ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
           // ps.setInt(1, vo.getIdalumnos());
            ps.setString(1, vo.getNombre());
            ps.setString(2, vo.getDireccion());
            ps.setString(3, vo.getEMail());
            ps.setInt(4, vo.getTelefono());
            ps.setInt(5, vo.getId_Localidad());
            ps.setInt(6, vo.getId_Motivo());
            ps.setInt(7, vo.getId_Estado());
            
            ps.executeUpdate();
            
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }
    
     public FarmaciaVO Buscar_FarmaciaVO(int id){
        FarmaciaVO vo = new FarmaciaVO();
        Conectar conec = new Conectar();
        String sql = "select * from datos_farmacia where Id_Farmacia = ?;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
         
            //FarmaciaVO vo = new FarmaciaVO();
            vo.setNombre(rs.getString(1));
            vo.setDireccion(rs.getString(2));
            vo.setEMail(rs.getString(3));
            vo.setTelefono(rs.getInt(4));
            vo.setId_Localidad(rs.getInt(5));
            vo.setId_Motivo(rs.getInt(6));
            vo.setId_Estado(rs.getInt(7));
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return vo;
    }
     
}
