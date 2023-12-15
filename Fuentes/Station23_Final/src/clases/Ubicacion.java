
package clases;

public class Ubicacion {
    private String id_ubicacion;
    private int id_tipo_vehiculo;
    private String estado;

    public Ubicacion() {
    }

    public Ubicacion(String id_ubicacion, int id_tipo_vehiculo, String estado) {
        this.id_ubicacion = id_ubicacion;
        this.id_tipo_vehiculo = id_tipo_vehiculo;
        this.estado = estado;
    }

    public String getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(String id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public int getId_tipo_vehiculo() {
        return id_tipo_vehiculo;
    }

    public void setId_tipo_vehiculo(int id_tipo_vehiculo) {
        this.id_tipo_vehiculo = id_tipo_vehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    
}
