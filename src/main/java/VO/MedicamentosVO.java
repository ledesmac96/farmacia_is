package VO;

public class MedicamentosVO {

    public Integer Id_Medicamento;
    public String Nombre;
    public String Detalle;
    public Float Precio;
    public Integer Unidades_Disponibles;
    public Integer Id_Laboratorio;
    public Integer Id_Motivo;
    public Integer Id_Estado;

    /**
     * @return the Id_Medicamento
     */
    public Integer getId_Medicamento() {
        return Id_Medicamento;
    }

    /**
     * @param Id_Medicamento the Id_Medicamento to set
     */
    public void setId_Medicamento(Integer Id_Medicamento) {
        this.Id_Medicamento = Id_Medicamento;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Detalle
     */
    public String getDetalle() {
        return Detalle;
    }

    /**
     * @param Detalle the Detalle to set
     */
    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    /**
     * @return the Precio
     */
    public Float getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(Float Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the Unidades_Disponibles
     */
    public Integer getUnidades_Disponibles() {
        return Unidades_Disponibles;
    }

    /**
     * @param Unidades_Disponibles the Unidades_Disponibles to set
     */
    public void setUnidades_Disponibles(Integer Unidades_Disponibles) {
        this.Unidades_Disponibles = Unidades_Disponibles;
    }

    /**
     * @return the Id_Laboratorio
     */
    public Integer getId_Laboratorio() {
        return Id_Laboratorio;
    }

    /**
     * @param Id_Laboratorio the Id_Laboratorio to set
     */
    public void setId_Laboratorio(Integer Id_Laboratorio) {
        this.Id_Laboratorio = Id_Laboratorio;
    }

    /**
     * @return the Id_Motivo
     */
    public Integer getId_Motivo() {
        return Id_Motivo;
    }

    /**
     * @param Id_Motivo the Id_Motivo to set
     */
    public void setId_Motivo(Integer Id_Motivo) {
        this.Id_Motivo = Id_Motivo;
    }

    /**
     * @return the Id_Estado
     */
    public Integer getId_Estado() {
        return Id_Estado;
    }

    /**
     * @param Id_Estado the Id_Estado to set
     */
    public void setId_Estado(Integer Id_Estado) {
        this.Id_Estado = Id_Estado;
    }

}
