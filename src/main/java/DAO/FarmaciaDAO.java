package DAO;

import VO.FarmaciaVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FarmaciaDAO {

    public void Agregar_FarmaciaVO(FarmaciaVO vo) {
        Conectar conec = new Conectar();
        String sql = "INSERT INTO DATOS_FARMACIA (Nombre, Direccion, E_Mail, Telefono, LOCALIDAD_Id_Localidad, MOTIVO_Id_Motivo, ESTADO_Id_Estado) VALUES( ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombre());
            ps.setString(2, vo.getDireccion());
            ps.setString(3, vo.getEMail());
            ps.setInt(4, vo.getTelefono());
            ps.setInt(5, vo.getId_Localidad());
            ps.setInt(6, vo.getId_Motivo());
            ps.setInt(7, vo.getId_Estado());

            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public FarmaciaVO Buscar_FarmaciaVO(int id) {
        //busca la farmacia por el id de la farmacia
        FarmaciaVO vo = new FarmaciaVO();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM datos_farmacia WHERE Id_Farmacia = ?;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {

                vo.setNombre(rs.getString(2));
                vo.setDireccion(rs.getString(3));
                vo.setEMail(rs.getString(4));
                vo.setTelefono(rs.getInt(5));
                vo.setId_Localidad(rs.getInt(6));
                vo.setId_Motivo(rs.getInt(7));
                vo.setId_Estado(rs.getInt(8));
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

    /*public FarmaciaVO Buscar_FarmaciaVO_Ingreso_Texto(String texto){
    Conectar conec = new Conectar();
    FarmaciaVO Fvo = new FarmaciaVO();
        
    String filtro = ""+texto+"_%";
    String SQL = " SELECT * FROM DATOS_FARMACIA WHERE Nombre LIKE "+'"'+filtro+'"';
    System.out.println(SQL);
    
    ResultSet rs = null;
    PreparedStatement ps = null;
    
        try {
            ps = conec.getConnection().prepareStatement(SQL);
            rs = ps.executeQuery();
            
            while(rs.next()){
            
            Fvo.setNombre(rs.getString(2));
            Fvo.setDireccion(rs.getString(3));
            Fvo.setEMail(rs.getString(4));
            Fvo.setTelefono(rs.getInt(5));
            Fvo.setId_Localidad(rs.getInt(6));
            Fvo.setId_Motivo(rs.getInt(7));
            Fvo.setId_Motivo(rs.getInt(8));
            }
            
            rs.close();
            ps.close();
            conec.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(FarmaciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Fvo;
    }*/
    public void Modificar_FarmaciaVO(FarmaciaVO vo) {
        Integer id = vo.getId_Farmacia();
        Conectar conec = new Conectar();
        //String sql = "UPDATE datos_farmacia SET Nombre = ?, Direccion = ?, E_Mail = ?, Telefono = ?, LOCALIDAD_Id_Localidad = ?, MOTIVO_Id_Motivo = ?, ESTADO_Id_Estado = ? WHERE Id_Farmacia = ?;";
        String sql = "UPDATE datos_farmacia SET Nombre = ?, Direccion = ?, E_Mail = ?, Telefono = ? WHERE Id_Farmacia =" + id + ";";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);

            ps.setString(1, vo.getNombre());
            ps.setString(2, vo.getDireccion());
            ps.setString(3, vo.getEMail());
            ps.setInt(4, vo.getTelefono());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                JOptionPane.showMessageDialog(null, "Se ha modificado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void Eliminar_FarmaciaVO(FarmaciaVO vo) {
        Integer id = vo.getId_Farmacia();
        Conectar conec = new Conectar();
        String sql = "UPDATE datos_farmacia SET MOTIVO_Id_Motivo = ?,ESTADO_Id_Estado = ? WHERE Id_Farmacia =" + id + ";";

        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getId_Motivo());
            ps.setInt(2, vo.getId_Estado());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                JOptionPane.showMessageDialog(null, "Se ha Eliminado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                ps.close();
                conec.desconectar();
                System.exit(0);
            } catch (Exception ex) {
            }
        }
    }

}
