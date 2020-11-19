
package DAO;


import VO.MedicamentosVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MedicamentosDAO {
    public void AgregarMedicamento (MedicamentosVO md){
        Conectar cnt = new Conectar();
        String sql= "INSERT INTO MEDICAMENTO (Nombre, Detalle,Precio, Unidades_Disponibles, DATOS_LABORATORIO_Id_Laboratorio, MOTIVO_Id_Motivo, ESTADO_Id_Estado) VALUES (?,?,?,?,?,?,?);";
        PreparedStatement ps= null;
        
        try {
            ps= cnt.getConnection().prepareStatement(sql);
            ps.setString(1, md.getNombre());
            ps.setString(2, md.getDetalle());
            ps.setFloat(3, md.getPrecio());
            ps.setInt(4, md.getUnidades_Disponibles());
            ps.setInt(5, md.getId_Laboratorio());
            ps.setInt(6, md.getId_Motivo());
            ps.setInt(7, md.getId_Estado());
            
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
    
    
    
    
}
