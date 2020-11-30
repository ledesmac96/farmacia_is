package VO;

public class MedicamentoFacturaVO {
    
    private Integer MEDICAMENTO_Id_Medicamento;
    private Integer FACTURA_Id_Factura;
    private String Articulo_Vendido;
    private Integer Cantidad;

    public MedicamentoFacturaVO(Integer MEDICAMENTO_Id_Medicamento, 
            Integer FACTURA_Id_Factura, String Articulo_Vendido, Integer Cantidad) {
        this.MEDICAMENTO_Id_Medicamento = MEDICAMENTO_Id_Medicamento;
        this.FACTURA_Id_Factura = FACTURA_Id_Factura;
        this.Articulo_Vendido = Articulo_Vendido;
        this.Cantidad = Cantidad;
    }

    public Integer getMEDICAMENTO_Id_Medicamento() {
        return MEDICAMENTO_Id_Medicamento;
    }

    public void setMEDICAMENTO_Id_Medicamento(Integer MEDICAMENTO_Id_Medicamento) {
        this.MEDICAMENTO_Id_Medicamento = MEDICAMENTO_Id_Medicamento;
    }

    public Integer getFACTURA_Id_Factura() {
        return FACTURA_Id_Factura;
    }

    public void setFACTURA_Id_Factura(Integer FACTURA_Id_Factura) {
        this.FACTURA_Id_Factura = FACTURA_Id_Factura;
    }

    public String getArticulo_Vendido() {
        return Articulo_Vendido;
    }

    public void setArticulo_Vendido(String Articulo_Vendido) {
        this.Articulo_Vendido = Articulo_Vendido;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
