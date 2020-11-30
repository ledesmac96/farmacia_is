package DAO;

import VO.LocalidadVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class LocalidadDAO {

    public LocalidadVO Buscar_LocalidadVO(int id) {
        LocalidadVO vo = new LocalidadVO();
        Conectar conec = new Conectar();
        String sql = "select * from LOCALIDAD where Id_Localidad = ?;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                vo.setNombre(rs.getString(2));
                vo.setCodp(rs.getString(3));
                vo.setId_Region(rs.getInt(4));
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
    
    public void Consultar_Localidad(JComboBox jcbRegion) {
        Conectar conec = new Conectar();
       // String sql = "SELECT Nombre FROM REGION ORDER BY Nombre ASC;"; para mostrar ordenado
       String sql = "SELECT Nombre FROM Localidad;"; //pero como quiero obtener la posicion que me indica el indice
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
                        
            rs = ps.executeQuery();

            jcbRegion.addItem("Seleccion una Localidad");
            
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
