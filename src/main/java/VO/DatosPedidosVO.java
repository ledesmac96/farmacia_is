package VO;

public class DatosPedidosVO {
    private Integer Id_Pedido;
    private String Fecha;
    private Float Monto_Total_Pedido;
    private String Tipo_Pedido;
    private Integer DATOS_FARMACIA_Id_Farmacia;
    private Integer ESTADO_Id_Estado;

    public DatosPedidosVO(String Fecha, 
            Float Monto_Total_Pedido, String Tipo_Pedido, 
            Integer DATOS_FARMACIA_Id_Farmacia, Integer ESTADO_Id_Estado) {
        this.Fecha = Fecha;
        this.Monto_Total_Pedido = Monto_Total_Pedido;
        this.Tipo_Pedido = Tipo_Pedido;
        this.DATOS_FARMACIA_Id_Farmacia = DATOS_FARMACIA_Id_Farmacia;
        this.ESTADO_Id_Estado = ESTADO_Id_Estado;
    }

    public Integer getId_Pedido() {
        return Id_Pedido;
    }

    public void setId_Pedido(Integer Id_Pedido) {
        this.Id_Pedido = Id_Pedido;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Float getMonto_Total_Pedido() {
        return Monto_Total_Pedido;
    }

    public void setMonto_Total_Pedido(Float Monto_Total_Pedido) {
        this.Monto_Total_Pedido = Monto_Total_Pedido;
    }

    public String getTipo_Pedido() {
        return Tipo_Pedido;
    }

    public void setTipo_Pedido(String Tipo_Pedido) {
        this.Tipo_Pedido = Tipo_Pedido;
    }

    public Integer getDATOS_FARMACIA_Id_Farmacia() {
        return DATOS_FARMACIA_Id_Farmacia;
    }

    public void setDATOS_FARMACIA_Id_Farmacia(Integer DATOS_FARMACIA_Id_Farmacia) {
        this.DATOS_FARMACIA_Id_Farmacia = DATOS_FARMACIA_Id_Farmacia;
    }

    public Integer getESTADO_Id_Estado() {
        return ESTADO_Id_Estado;
    }

    public void setESTADO_Id_Estado(Integer ESTADO_Id_Estado) {
        this.ESTADO_Id_Estado = ESTADO_Id_Estado;
    }
    
    
    
    
}
