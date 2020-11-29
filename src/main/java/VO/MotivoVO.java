/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author maximiliano
 */
public class MotivoVO {
    public Integer Id_Motivo;
    public String Motivo;

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
     * @return the Motivo
     */
    public String getMotivo() {
        return Motivo;
    }

    /**
     * @param Motivo the Motivo to set
     */
    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }
}
