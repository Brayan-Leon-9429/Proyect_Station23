/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author Braya
 */
public class Ingresos {
    
    private String tipo_vehiculo;
    private Double monto;
    private Date hora_pago;

    public Ingresos() {
    }

    public Ingresos(String tipo_vehiculo, Double monto) {
        this.tipo_vehiculo = tipo_vehiculo;
        this.monto = monto;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Date getHora_pago() {
        return hora_pago;
    }

    public void setHora_pago(Date hora_pago) {
        this.hora_pago = hora_pago;
    }

    
    
}
