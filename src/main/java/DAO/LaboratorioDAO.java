/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.LaboratorioVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author maximiliano
 */
public class LaboratorioDAO {

    public void Agregar_LaboratorioVO(LaboratorioVO LabVO) {
        
        Conectar conec = new Conectar();
        String sql = "INSERT INTO DATOS_LABORATORIO (Nombre, Direccion, E_Mail, Telefono, LOCALIDAD_Id_Localidad, ESTADO_Id_Estado) VALUES( ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, LabVO.getNombre());
            ps.setString(2, LabVO.getDireccion());
            ps.setString(3, LabVO.getE_mail());
            ps.setInt(4, LabVO.getTelefono());
            ps.setInt(5, LabVO.getId_Localidad());
            ps.setInt(6, LabVO.getId_Estado());

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

    public void Consultar_Laboratorio(JComboBox<String> jComboBoxLaboratorio) {
        Conectar conec = new Conectar();
       // String sql = "SELECT Nombre FROM REGION ORDER BY Nombre ASC;"; para mostrar ordenado
        String sql = "SELECT Nombre FROM DATOS_LABORATORIO;"; //pero como quiero obtener la posicion que me indica el indice
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
                        
            rs = ps.executeQuery();

            jComboBoxLaboratorio.addItem("Seleccion un Laborattorio");
            
            while(rs.next()){
            jComboBoxLaboratorio.addItem(rs.getString("Nombre"));
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

    public LaboratorioVO Buscar_LaboratorioVO(Integer id_lab) {
        //busca la farmacia por el id de la farmacia
        LaboratorioVO vo = new LaboratorioVO();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM datos_laboratorio WHERE Id_Laboratorio = ?;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, id_lab);
            rs = ps.executeQuery();

            if (rs.next()) {

                vo.setNombre(rs.getString(2));
                vo.setDireccion(rs.getString(3));
                vo.setE_mail(rs.getString(4));
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

    public void Modificar_LaboratorioVO(LaboratorioVO LabVO) {
        Integer id = LabVO.getId_Laboratorio();
        Conectar conec = new Conectar();
        //String sql = "UPDATE datos_farmacia SET Nombre = ?, Direccion = ?, E_Mail = ?, Telefono = ?, LOCALIDAD_Id_Localidad = ?, MOTIVO_Id_Motivo = ?, ESTADO_Id_Estado = ? WHERE Id_Farmacia = ?;";
        String sql = "UPDATE datos_laboratorio SET Nombre = ?, Direccion = ?, E_Mail = ?, Telefono = ? WHERE Id_Laboratorio =" + id + ";";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);

            ps.setString(1, LabVO.getNombre());
            ps.setString(2, LabVO.getDireccion());
            ps.setString(3, LabVO.getE_mail());
            ps.setInt(4, LabVO.getTelefono());
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

    public void Eliminar_LaboratorioVO(LaboratorioVO LabVO) {
       Integer id = LabVO.getId_Laboratorio();
        Conectar conec = new Conectar();
        String sql = "UPDATE datos_laboratorio SET MOTIVO_Id_Motivo = ?,ESTADO_Id_Estado = ? WHERE Id_Laboratorio =" + id + ";";

        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, LabVO.getId_Motivo());
            ps.setInt(2, LabVO.getId_Estado());
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
            } catch (Exception ex) {
            }
        }
    }
    
   
}
