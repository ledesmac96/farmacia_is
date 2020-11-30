package Tabla;

import DAO.MedicamentosDAO;
import VO.MedicamentosVO;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla_MedicamentosVO {
    
    MedicamentosDAO dao = null;

    public void visualizar_MedicamentosVO(JTable tabla, int id, JLabel total, int cant){
        DefaultTableModel dt = (DefaultTableModel) tabla.getModel();
        float subtot = 0;
        dao = new MedicamentosDAO();
        MedicamentosVO vo = new MedicamentosVO();
        ArrayList<MedicamentosVO> list = dao.getByID_MedicamentosVO(id);

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[5];
                vo = list.get(i);
                fila[0] = vo.getId_Medicamento();
                fila[1] = vo.getNombre();
                fila[2] = vo.getDetalle();
                fila[3] = cant;
                subtot = cant * vo.getPrecio();
                fila[4] = subtot;
                dt.addRow(fila);
              
            }
            tabla.setModel(dt);
        }
    }
    
}
