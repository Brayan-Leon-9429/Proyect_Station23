
package clases;

import java.util.Date;

public class Pago {
    
    private String id_pago;
    private String modalidad;
    private Double pago_total;
    private Date hora_pago;

    public Pago() {
    }

    public String getId_pago() {
        return id_pago;
    }

    public void setId_pago(String id_pago) {
        this.id_pago = id_pago;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Double getPago_total() {
        return pago_total;
    }

    public void setPago_total(Double pago_total) {
        this.pago_total = pago_total;
    }

    public Date getHora_pago() {
        return hora_pago;
    }

    public void setHora_pago(Date hora_pago) {
        this.hora_pago = hora_pago;
    }
    
    
    
}
