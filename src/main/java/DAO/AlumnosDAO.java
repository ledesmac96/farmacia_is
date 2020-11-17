package DAO;

import VO.AlumnosVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlumnosDAO {

/*Metodo listar*/
    public ArrayList<AlumnosVO> Listar_AlumnosVO(){
        ArrayList<AlumnosVO> list = new ArrayList<AlumnosVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM alumnos;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                AlumnosVO vo = new AlumnosVO();
                vo.setIdalumnos(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setNota(rs.getDouble(3));
                list.add(vo);
            }
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
        return list;
    }


/*Metodo agregar*/
    public void Agregar_AlumnosVO(AlumnosVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO alumnos (nombre, nota) VALUES( ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
           // ps.setInt(1, vo.getIdalumnos());
            ps.setString(1, vo.getNombre());
            ps.setDouble(2, vo.getNota());
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


/*Metodo Modificar*/
    public void Modificar_AlumnosVO(AlumnosVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE alumnos SET nombre = ?, nota = ? WHERE idalumnos = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdalumnos());
            ps.setString(2, vo.getNombre());
            ps.setDouble(3, vo.getNota());
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


/*Metodo Eliminar*/
    public void Eliminar_AlumnosVO(AlumnosVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM alumnos WHERE idalumnos = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdalumnos());
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


}
