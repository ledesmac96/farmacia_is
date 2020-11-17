package DAO;

import VO.FarmaciaVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
