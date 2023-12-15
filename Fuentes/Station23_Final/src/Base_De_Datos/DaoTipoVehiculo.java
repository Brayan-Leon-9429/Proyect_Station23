package Base_De_Datos;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoTipoVehiculo {

    private final ConexionBD conexionBD = new ConexionBD();
    private String mensaje;

    public int obtenerID(String tipo_vehiculo) {
        int idVehiculo = 0;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_tipo_vehiculo ")
                .append(" FROM tipo_vehiculo")
                .append(" WHERE nombre = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehiculo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idVehiculo = rs.getInt(1);
            } else {
                mensaje = "Sin datos";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return idVehiculo;
    }

    public String obtenerTipo(int tipo_vehiculo) {
        String tipoVehiculo = "";
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("nombre ")
                .append(" FROM tipo_vehiculo")
                .append(" WHERE id_tipo_vehiculo = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, tipo_vehiculo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipoVehiculo = rs.getString(1);
            } else {
                mensaje = "Sin datos";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return tipoVehiculo;
    }

}
