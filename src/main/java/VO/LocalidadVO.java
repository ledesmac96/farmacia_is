package VO;

public class LocalidadVO {

    public Integer Id_Localidad;
    public String Nombre;
    public String Codp;
    public Integer Id_Region;

    public Integer getId_Localidad() {
        return Id_Localidad;
    }

    public void setId_Localidad(Integer Id_Localidad) {
        this.Id_Localidad = Id_Localidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodp() {
        return Codp;
    }

    public void setCodp(String Codp) {
        this.Codp = Codp;
    }

    /**
     * @return the Id_Region
     */
    public Integer getId_Region() {
        return Id_Region;
    }

    /**
     * @param Id_Region the Id_Region to set
     */
    public void setId_Region(Integer Id_Region) {
        this.Id_Region = Id_Region;
    }

}
