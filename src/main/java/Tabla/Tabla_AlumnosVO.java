package Tabla;

import DAO.AlumnosDAO;
import VO.AlumnosVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_AlumnosVO{

   AlumnosDAO dao = null;


    public void visualizar_AlumnosVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idalumnos");
        dt.addColumn("nombre");
        dt.addColumn("nota");

        dao = new AlumnosDAO();
        AlumnosVO vo = new AlumnosVO();
        ArrayList<AlumnosVO> list = dao.Listar_AlumnosVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getIdalumnos();
                fila[1] = vo.getNombre();
                fila[2] = vo.getNota();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


