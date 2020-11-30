package VO;

public class FacturaVO {
    
    private Integer Id_Factura;
    private Float Monto_Total;
    private Integer DATOS_FARMACIA_Id_Farmacia;

    public FacturaVO(Integer Id_Factura, Float Monto_Total, Integer DATOS_FARMACIA_Id_Farmacia) {
        this.Id_Factura = Id_Factura;
        this.Monto_Total = Monto_Total;
        this.DATOS_FARMACIA_Id_Farmacia = DATOS_FARMACIA_Id_Farmacia;
    }

    public Integer getId_Factura() {
        return Id_Factura;
    }

    public void setId_Factura(Integer Id_Factura) {
        this.Id_Factura = Id_Factura;
    }

    public Float getMonto_Total() {
        return Monto_Total;
    }

    public void setMonto_Total(Float Monto_Total) {
        this.Monto_Total = Monto_Total;
    }

    public Integer getDATOS_FARMACIA_Id_Farmacia() {
        return DATOS_FARMACIA_Id_Farmacia;
    }

    public void setDATOS_FARMACIA_Id_Farmacia(Integer DATOS_FARMACIA_Id_Farmacia) {
        this.DATOS_FARMACIA_Id_Farmacia = DATOS_FARMACIA_Id_Farmacia;
    }

    
    
}
