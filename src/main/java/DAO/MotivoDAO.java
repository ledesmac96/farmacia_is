/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.MotivoVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author maximiliano
 */
public class MotivoDAO {

    public Integer id_M; //sirve para obtener la clave generada

    public void Agregar_MotivoVO(MotivoVO vo) {
        Conectar conec = new Conectar();
        String sql = "INSERT INTO motivo (Motivo) VALUES(?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //el Statement.RETURN_GENERATED_KEYS sirve para recuperar el id generado
            ps.setString(1, vo.getMotivo());
            ps.executeUpdate();

            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                id_M = generatedKeys.getInt(1);//asigna a la variable global Id_M la clave generada
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }

        }
    }

}
