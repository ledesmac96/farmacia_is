
package DAO;



import VO.MedicamentosVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class MedicamentosDAO {
    
    public void AgregarMedicamento (MedicamentosVO md){
        Conectar cnt = new Conectar();
        String sql= "INSERT INTO MEDICAMENTO (Nombre, Detalle,Precio, Unidades_Disponibles, DATOS_LABORATORIO_Id_Laboratorio, ESTADO_Id_Estado) VALUES (?,?,?,?,?,?);";
        PreparedStatement ps= null;
        
        try {
            ps= cnt.getConnection().prepareStatement(sql);
            ps.setString(1, md.getNombre());
            ps.setString(2, md.getDetalle());
            ps.setFloat(3, md.getPrecio());
            ps.setInt(4, md.getUnidades_Disponibles());
            ps.setInt(5, md.getId_Laboratorio());
            ps.setInt(6, md.getId_Estado());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(MedicamentosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
                ps.close();
                cnt.desconectar();
            }catch(Exception ex){}
        }
        
        
    }

public MedicamentosVO Buscar_MedicamentoVO(Integer id_med) {
        //busca la farmacia por el id de la farmacia
        MedicamentosVO vo = new MedicamentosVO();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM medicamento WHERE Id_Medicamento = ?;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, id_med);
            rs = ps.executeQuery();

            if (rs.next()) {

                vo.setNombre(rs.getString(2));
                vo.setDetalle(rs.getString(3));
                vo.setPrecio(rs.getFloat(4));
                vo.setUnidades_Disponibles(rs.getInt(5));
                vo.setId_Laboratorio(rs.getInt(6));
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

public void Consultar_Medicamento(JComboBox<String> jComboBoxMedicamento) {
        Conectar conec = new Conectar();
       // String sql = "SELECT Nombre FROM REGION ORDER BY Nombre ASC;"; para mostrar ordenado
        String sql = "SELECT Nombre FROM Medicamento;"; //pero como quiero obtener la posicion que me indica el indice
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
                        
            rs = ps.executeQuery();

            jComboBoxMedicamento.addItem("Seleccion un Medicamento");
            
            while(rs.next()){
            jComboBoxMedicamento.addItem(rs.getString("Nombre"));
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

    public void Modificar_MedicamentoVO(MedicamentosVO MedVO) {
        Integer id = MedVO.getId_Medicamento();
        Conectar conec = new Conectar();
        //String sql = "UPDATE datos_farmacia SET Nombre = ?, Direccion = ?, E_Mail = ?, Telefono = ?, LOCALIDAD_Id_Localidad = ?, MOTIVO_Id_Motivo = ?, ESTADO_Id_Estado = ? WHERE Id_Farmacia = ?;";
        String sql = "UPDATE medicamento SET Nombre = ?, Detalle = ?, Precio = ?, Unidades_Disponibles = ? WHERE Id_Medicamento =" + id + ";";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);

            ps.setString(1, MedVO.getNombre());
            ps.setString(2, MedVO.getDetalle());
            ps.setFloat(3, MedVO.getPrecio());
            ps.setInt(4, MedVO.getUnidades_Disponibles());
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

    public void Eliminar_LaboratorioVO(MedicamentosVO MedVO) {
        Integer id = MedVO.getId_Medicamento();
        Conectar conec = new Conectar();
        String sql = "UPDATE medicamento SET MOTIVO_Id_Motivo = ?,ESTADO_Id_Estado = ? WHERE Id_Medicamento =" + id + ";";

        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, MedVO.getId_Motivo());
            ps.setInt(2, MedVO.getId_Estado());
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

    

