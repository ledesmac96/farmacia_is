package DAO;

import VO.DatosPedidosVO;
import VO.MedicamentoDatosPedidoVO;
import VO.MedicamentosVO;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MedicamentosDAO {

     //----------------------------------AGREGAR MEDICAMENTO---------------------------------------------------------------
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
   //-------------------------------------MODIFICAR MEDICAMENTO------------------------------------------------------------------------- 
    public void Modificar_MedicamentoVO (MedicamentosVO VO) {
        
            Integer ID = VO.getId_Medicamento();
            Conectar cnt= new Conectar();
            String sql="UPDATE medicamento SET Nombre= ?, Detalle= ?, Precio=? , Unidades_Disponibles= ? WHERE Id_Medicamento="+ID+";";
            //solo esos datos se deberían poder modificar creo
            PreparedStatement ps= null;
          
        
        try {
            ps= cnt.getConnection().prepareStatement(sql);
        
            ps.setString(1, VO.getNombre());
            ps.setString(2, VO.getDetalle());
            ps.setFloat(3, VO.getPrecio());
            ps.setInt(4, VO.getUnidades_Disponibles());
            
        } catch (SQLException ex) {
            Logger.getLogger(MedicamentosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                JOptionPane.showMessageDialog(null, "Se ha modificado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
                ps.close();
                cnt.desconectar();
            }catch(Exception ex){}
        }
       
    }
    
    //-----------------------ELIMINAR MEDICAMENTO--------------------------------------------------------------------------  
    public void Eliminar_Medicamento (MedicamentosVO VO){
        Conectar cnt = new Conectar();
        String sql = "DELETE FROM medicamento WHERE Id_Medicamento = ?;";
        PreparedStatement ps = null;
        try{
            ps = cnt.getConnection().prepareStatement(sql);
            ps.setInt(1, VO.getId_Estado());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                cnt.desconectar();
            }catch(Exception ex){}
        }
    }
    
    
 //-------------------LISTAR MEDICAMENTOS (POR LAS DUDAS)----------------------------------------------------
    public ArrayList<MedicamentosVO> Listar_MedicamentosVO(){
        ArrayList<MedicamentosVO> list = new ArrayList<MedicamentosVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM medicamento;";
        ResultSet rs = null;
         System.out.println("dssa");
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                MedicamentosVO vo = new MedicamentosVO();
                vo.setNombre(rs.getString(1));
                vo.setDetalle(rs.getString(2));
                vo.setPrecio(rs.getFloat(3));
                vo.setUnidades_Disponibles(rs.getInt(4));
                vo.setId_Laboratorio(rs.getInt(5));
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

    public ArrayList<MedicamentosVO> getAll_MedicamentosVO() {
        ArrayList<MedicamentosVO> list = new ArrayList<>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM medicamento;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MedicamentosVO vo = new MedicamentosVO();

                vo.setId_Medicamento(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setDetalle(rs.getString(3));
                vo.setPrecio(rs.getFloat(4));
                vo.setUnidades_Disponibles(rs.getInt(5));
                vo.setId_Laboratorio(rs.getInt(6));
                vo.setId_Motivo(rs.getInt(7));
                vo.setId_Estado(rs.getInt(8));

                list.add(vo);
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
        return list;
    }

    public ArrayList<MedicamentosVO> getByID_MedicamentosVO(int id) {
        ArrayList<MedicamentosVO> list = new ArrayList<>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM medicamento WHERE Id_Medicamento = ?;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                MedicamentosVO vo = new MedicamentosVO();

                vo.setId_Medicamento(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setDetalle(rs.getString(3));
                vo.setPrecio(rs.getFloat(4));
                vo.setUnidades_Disponibles(rs.getInt(5));
                vo.setId_Laboratorio(rs.getInt(6));
                vo.setId_Motivo(rs.getInt(7));
                vo.setId_Estado(rs.getInt(8));

                list.add(vo);
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
        return list;
    }

    public void registerPedido_MedicamentosVO(DatosPedidosVO pe, ArrayList<MedicamentoDatosPedidoVO> me) {
        Conectar cnt = new Conectar();
        String sql = "INSERT INTO datos_pedido (Fecha, Monto_Total_Pedido, Tipo_Pedido, DATOS_FARMACIA_Id_Farmacia, ESTADO_Id_Estado) VALUES (?,?,?,?,?);";
        PreparedStatement ps = null;
        String sql2 = "INSERT INTO medicamento_datos_pedido (MEDICAMENTO_Id_Medicamento, DATOS_PEDIDO_Id_Pedido, Cantidad_Articulo_Pendiente) VALUES (?,?,?);";
        PreparedStatement ps2 = null;

        try {
            ps = cnt.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pe.getFecha());
            ps.setFloat(2, pe.getMonto_Total_Pedido());
            ps.setString(3, pe.getTipo_Pedido());
            ps.setInt(4, pe.getDATOS_FARMACIA_Id_Farmacia());
            ps.setInt(5, pe.getESTADO_Id_Estado());

            ps.executeUpdate(); //PROBAR ESTO
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            int key = keys.getInt(1);

            ps2 = cnt.getConnection().prepareStatement(sql2);
            
            for (int i = 0; i < me.size(); i++) {
                ps2.setInt(1, me.get(i).getMEDICAMENTO_Id_Medicamento());
                ps2.setInt(2, key);
                ps2.setInt(3, me.get(i).getCantidad_Articulo_Pendiente());
                
                ps2.addBatch();
            }
            ps2.executeBatch();  
            
        } catch (SQLException ex) {
            Logger.getLogger(MedicamentosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                ps.close();
                ps2.close();
                cnt.desconectar();
            } catch (Exception ex) {
            }
        }

    }

}
