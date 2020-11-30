package VO;

public class MedicamentoDatosPedidoVO {
    
    private Integer MEDICAMENTO_Id_Medicamento;
    private Integer DATOS_PEDIDO_Id_Pedido;
    private Integer Cantidad_Articulo_Pendiente;

    public MedicamentoDatosPedidoVO(Integer MEDICAMENTO_Id_Medicamento, Integer DATOS_PEDIDO_Id_Pedido, Integer Cantidad_Articulo_Pendiente) {
        this.MEDICAMENTO_Id_Medicamento = MEDICAMENTO_Id_Medicamento;
        this.DATOS_PEDIDO_Id_Pedido = DATOS_PEDIDO_Id_Pedido;
        this.Cantidad_Articulo_Pendiente = Cantidad_Articulo_Pendiente;
    }

    

    public Integer getMEDICAMENTO_Id_Medicamento() {
        return MEDICAMENTO_Id_Medicamento;
    }

    public void setMEDICAMENTO_Id_Medicamento(Integer MEDICAMENTO_Id_Medicamento) {
        this.MEDICAMENTO_Id_Medicamento = MEDICAMENTO_Id_Medicamento;
    }

    public Integer getDATOS_PEDIDO_Id_Pedido() {
        return DATOS_PEDIDO_Id_Pedido;
    }

    public void setDATOS_PEDIDO_Id_Pedido(Integer DATOS_PEDIDO_Id_Pedido) {
        this.DATOS_PEDIDO_Id_Pedido = DATOS_PEDIDO_Id_Pedido;
    }

    public Integer getCantidad_Articulo_Pendiente() {
        return Cantidad_Articulo_Pendiente;
    }

    public void setCantidad_Articulo_Pendiente(Integer Cantidad_Articulo_Pendiente) {
        this.Cantidad_Articulo_Pendiente = Cantidad_Articulo_Pendiente;
    }

    
    
}
