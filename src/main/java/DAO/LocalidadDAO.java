package DAO;

import VO.LocalidadVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LocalidadDAO {

    public LocalidadVO Buscar_LocalidadVO(int id) {
        LocalidadVO vo = new LocalidadVO();
        Conectar conec = new Conectar();
        String sql = "select * from localidad where Id_Localidad = ?;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                vo.setNombre(rs.getString(2));
                vo.setCodp(rs.getString(3));
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
