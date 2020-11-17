package Tabla;

import DAO.ProfesoresDAO;
import VO.ProfesoresVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ProfesoresVO{

   ProfesoresDAO dao = null;


    public void visualizar_ProfesoresVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id");
        dt.addColumn("nombre");

        dao = new ProfesoresDAO();
        ProfesoresVO vo = new ProfesoresVO();
        ArrayList<ProfesoresVO> list = dao.Listar_ProfesoresVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[2];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


